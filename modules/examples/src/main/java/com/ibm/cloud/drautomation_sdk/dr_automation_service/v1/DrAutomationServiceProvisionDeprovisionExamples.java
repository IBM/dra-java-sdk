
/*
 * (C) Copyright IBM Corp. 2025.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.drautomation_sdk.dr_automation_service.v1;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ibm.cloud.platform_services.global_catalog.v1.GlobalCatalog;
import com.ibm.cloud.platform_services.global_catalog.v1.model.CatalogEntry;
import com.ibm.cloud.platform_services.global_catalog.v1.model.EntrySearchResult;
import com.ibm.cloud.platform_services.global_catalog.v1.model.GetChildObjectsOptions;
import com.ibm.cloud.platform_services.global_catalog.v1.model.ListCatalogEntriesOptions;
import com.ibm.cloud.platform_services.resource_controller.v2.ResourceController;
import com.ibm.cloud.platform_services.resource_controller.v2.model.CreateResourceInstanceOptions;
import com.ibm.cloud.platform_services.resource_controller.v2.model.DeleteResourceInstanceOptions;
import com.ibm.cloud.platform_services.resource_controller.v2.model.GetResourceInstanceOptions;
import com.ibm.cloud.platform_services.resource_controller.v2.model.ResourceInstance;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;

/**
 * This class contains examples of how to use the DrAutomation Service service.
 *
 * The following configuration properties are assumed to be defined:
 * DR_AUTOMATION_SERVICE_URL=&lt;service base url&gt;
 * DR_AUTOMATION_SERVICE_AUTH_TYPE=iam
 * DR_AUTOMATION_SERVICE_APIKEY=&lt;IAM apikey&gt;
 * DR_AUTOMATION_SERVICE_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class DrAutomationServiceProvisionDeprovisionExamples {
  private static final Logger logger = LoggerFactory.getLogger(DrAutomationServiceProvisionDeprovisionExamples.class);
  private static final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
  protected DrAutomationServiceProvisionDeprovisionExamples() { }

  // Replace these placeholders with valid values
  private static final String RESOURCE_GROUP_ID = "9d445dfd58484a489220751d0077f906";
  private static final String SERVICE_NAME = "power-dr-automation";
  private static final String PLAN_NAME = "power-virtual-server-dr-automation";
  private static final String INSTANCE_NAME = "javasdktest";
  private static final String REGION = "global";
  private static final String IAM_APIKEY = "API should pass"; // Replace with valid API key

  // Service names for SDK clients
  private static final String RESOURCE_CONTROLLER_SERVICE_NAME = "resource_controller";
  private static final String GLOBAL_CATALOG_SERVICE_NAME = "global_catalog";

  // /**
  //  * Private constructor to prevent instantiation.
  //  */
  // private DrAutomationServiceProvisionDeprovisionExamples() {
  //   throw new IllegalStateException("Utility class");
  // }

  /**
   * Main method to run the example.
   *
   * @param args command line arguments
   */  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {

    String resourcePlanID = null;
    String instanceGUID = null;

    // ---------------------------------------------------------------------------
    // STEP 1: Initialize SDK Clients
    // ---------------------------------------------------------------------------
    try {
      System.out.println("\nInitializing SDK Clients...");
      IamAuthenticator authenticator = new IamAuthenticator(IAM_APIKEY);

      ResourceController resourceController = new ResourceController(RESOURCE_CONTROLLER_SERVICE_NAME, authenticator);
      GlobalCatalog catalogClient = new GlobalCatalog(GLOBAL_CATALOG_SERVICE_NAME, authenticator);

      System.out.println("Clients initialized successfully!");
    } catch (ServiceResponseException e) {
      logger.error(String.format("Failed during SDK initialization - %s: %s%nDebug: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
      return;
    }

    // ---------------------------------------------------------------------------
    // STEP 2: Fetch the Plan ID dynamically
    // ---------------------------------------------------------------------------
    try {
      System.out.println("\nFetching Plan ID for service: " + SERVICE_NAME);

      IamAuthenticator authenticator = new IamAuthenticator(IAM_APIKEY);
      GlobalCatalog catalogClient = new GlobalCatalog(GLOBAL_CATALOG_SERVICE_NAME, authenticator);

      ListCatalogEntriesOptions listOptions = new ListCatalogEntriesOptions.Builder()
        .q("name:" + SERVICE_NAME)
        .account("global")
        .complete(true)
        .build();

      Response<EntrySearchResult> searchResponse = catalogClient.listCatalogEntries(listOptions).execute();
      List<CatalogEntry> entries = searchResponse.getResult().getResources();

      if (entries.isEmpty()) {
        throw new RuntimeException("Service " + SERVICE_NAME + " not found in Global Catalog.");
      }

      String serviceEntryID = entries.get(0).getId();
      System.out.println("Service Entry ID: " + serviceEntryID);

      GetChildObjectsOptions getChildOptions = new GetChildObjectsOptions.Builder(serviceEntryID, "*")
        .complete(true)
        .build();

      Response<EntrySearchResult> childResponse = catalogClient.getChildObjects(getChildOptions).execute();
      List<CatalogEntry> plans = childResponse.getResult().getResources();

      for (CatalogEntry plan : plans) {
        if (plan.getName() != null && plan.getName().equals(PLAN_NAME)) {
          resourcePlanID = plan.getId();
          break;
        }
      }

      if (resourcePlanID == null) {
        throw new RuntimeException("Plan '" + PLAN_NAME + "' not found under service '" + SERVICE_NAME + "'.");
      }

      System.out.println("Found Plan ID: " + resourcePlanID);
    } catch (ServiceResponseException e) {
      logger.error(String.format("Failed during Plan ID fetch - %s: %s%nDebug: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
      return;
    } catch (Exception e) {
      logger.error("Unexpected error during Plan ID fetch", e);
      return;
    }

    // ---------------------------------------------------------------------------
    // STEP 3: Create Resource Instance
    // ---------------------------------------------------------------------------
    try {
      System.out.println("\nCreating Resource Instance...");

      IamAuthenticator authenticator = new IamAuthenticator(IAM_APIKEY);
      ResourceController resourceController = new ResourceController(RESOURCE_CONTROLLER_SERVICE_NAME, authenticator);

      CreateResourceInstanceOptions createOptions = new CreateResourceInstanceOptions.Builder()
        .name(INSTANCE_NAME)
        .target(REGION)
        .resourceGroup(RESOURCE_GROUP_ID)
        .resourcePlanId(resourcePlanID)
        .build();

      Response<ResourceInstance> createResponse = resourceController.createResourceInstance(createOptions).execute();
      ResourceInstance instance = createResponse.getResult();

      System.out.println("Resource Instance Created (HTTP " + createResponse.getStatusCode() + ")");
      System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(instance));

      instanceGUID = instance.getGuid();
      Thread.sleep(10000);

    } catch (ServiceResponseException e) {
      logger.error(String.format("Failed during instance creation - %s: %s%nDebug: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
      return;
    }

    // ---------------------------------------------------------------------------
    // STEP 4: Retrieve Resource Instance
    // ---------------------------------------------------------------------------
    try {
      System.out.println("\nFetching Resource Instance Details...");

      IamAuthenticator authenticator = new IamAuthenticator(IAM_APIKEY);
      ResourceController resourceController = new ResourceController(RESOURCE_CONTROLLER_SERVICE_NAME, authenticator);

      GetResourceInstanceOptions getOptions = new GetResourceInstanceOptions.Builder(instanceGUID).build();
      Response<ResourceInstance> getResponse = resourceController.getResourceInstance(getOptions).execute();

      System.out.println("Instance Retrieved (HTTP " + getResponse.getStatusCode() + ")");
      System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getResponse.getResult()));

    } catch (ServiceResponseException e) {
      logger.error(String.format("Failed during instance retrieval - %s: %s%nDebug: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
    // ---------------------------------------------------------------------------
    // STEP 5: Delete Resource Instance
    // ---------------------------------------------------------------------------
    try {
      System.out.println("\nDeleting Resource Instance...");

      IamAuthenticator authenticator = new IamAuthenticator(IAM_APIKEY);
      ResourceController resourceController = new ResourceController(RESOURCE_CONTROLLER_SERVICE_NAME, authenticator);

      DeleteResourceInstanceOptions deleteOptions = new DeleteResourceInstanceOptions.Builder(instanceGUID)
        .recursive(false)
        .build();

      Response<Void> deleteResponse = resourceController.deleteResourceInstance(deleteOptions).execute();
      System.out.println("Deletion initiated (HTTP " + deleteResponse.getStatusCode() + ")");
      Thread.sleep(15000);
      System.out.println("Instance deletion process completed successfully.");

    } catch (ServiceResponseException e) {
      logger.error(String.format("Failed during instance deletion - %s: %s%nDebug: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    } catch (Exception e) {
      logger.error("Unexpected error during instance deletion", e);
    }
  }
}
