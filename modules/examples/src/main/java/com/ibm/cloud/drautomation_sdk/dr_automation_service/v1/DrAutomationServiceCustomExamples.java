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

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.CreateManageDrOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.ServiceInstanceManageDR;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

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
public class DrAutomationServiceCustomExamples {
  private static final Logger logger = LoggerFactory.getLogger(DrAutomationServiceCustomExamples.class);
  protected DrAutomationServiceCustomExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../dr_automation_service_v1.env");
  }

  /**
   * The main() function invokes operations of the DrAutomation Service service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    DrAutomationService drAutomationServiceService = DrAutomationService.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(DrAutomationService.DEFAULT_SERVICE_NAME);


    // -------- HA Cases ---------
    // 1. create_manage_dr_ha_with_sshkey
    try {
      // begin-create_manage_dr_ha_with_sshkey
      CreateManageDrOptions createManageDrOptions = new CreateManageDrOptions.Builder()
        .instanceId("050ebe3b-13f4-4db8-8ece-501a3c13be80javah1")
        .standByRedeploy("false")
        .orchestratorHa(true)
        .orchestratorLocationType("off-premises")
        .locationId("dal10")
        .orchestratorWorkspaceId("75cbf05b-78f6-406e-afe7-a904f646d798")
        .orchestratorName("drautomationprimaryjv1")
        .orchestratorPassword("EverytimeNewPassword@1")
        .machineType("s922")
        .tier("tier1")
        .sshKeyName("vijaykey")
        .apiKey("Apikey required")
        .standbyOrchestratorName("drautomationstandbyjv1")
        .standbyOrchestratorWorkspaceId("71027b79-0e31-44f6-a499-63eca1a66feb")
        .standbyMachineType("s922")
        .standbyTier("tier1")
        // Mfa
        .clientId("123abcd-97d2-4b14-bf62-8eaecc67a122")
        .clientSecret("abcdefgT5rS8wK6qR9dD7vF1hU4sA3bE2jG0pL9oX7yC")
        .tenantName("xxx.ibm.com")
        .build();

      Response<ServiceInstanceManageDR> response = drAutomationServiceService.createManageDr(createManageDrOptions).execute();
      System.out.println(response.getResult());
      // end-create_manage_dr_ha_with_sshkey
    } catch (ServiceResponseException e) {
      logger.error("create_manage_dr_ha_with_sshkey failed: " + e.getDebuggingInfo(), e);
    }

    // 2. create_manage_dr_ha_with_secrets
    try {
      // begin-create_manage_dr_ha_with_secrets
      CreateManageDrOptions createManageDrOptions = new CreateManageDrOptions.Builder()
        .instanceId("050ebe3b-13f4-4db8-8ece-501a3c13be80javah3")
        .standByRedeploy("false")
        .orchestratorHa(true)
        .orchestratorLocationType("off-premises")
        .locationId("dal10")
        .orchestratorWorkspaceId("75cbf05b-78f6-406e-afe7-a904f646d798")
        .orchestratorName("drautomationprimaryjv3")
        .orchestratorPassword("EverytimeNewPassword@1")
        .machineType("s922")
        .tier("tier1")
        .guid("397dc20d-9f66-46dc-a750-d15392872023")
        .secretGroup("123456-1234-1234-1234-1234abcd")
        .secret("123456-abcd-1234-1234-1234abcd")
        .regionId("us-south")
        .apiKey("Apikey required")
        .standbyOrchestratorName("drautomationstandbyjv3")
        .standbyOrchestratorWorkspaceId("71027b79-0e31-44f6-a499-63eca1a66feb")
        .standbyMachineType("s922")
        .standbyTier("tier1")
        // Mfa
        .clientId("123abcd-97d2-4b14-bf62-8eaecc67a122")
        .clientSecret("abcdefgT5rS8wK6qR9dD7vF1hU4sA3bE2jG0pL9oX7yC")
        .tenantName("xxx.ibm.com")
        .build();

      Response<ServiceInstanceManageDR> response = drAutomationServiceService.createManageDr(createManageDrOptions).execute();
      System.out.println(response.getResult());
      // end-create_manage_dr_ha_with_secrets
    } catch (ServiceResponseException e) {
      logger.error("HA + schematic id + secrets failed: " + e.getDebuggingInfo(), e);
    }

    // -------- Non-HA Cases ---------
    // 3. create_manage_dr_nonha_with_sshkey
    try {
      // begin-create_manage_dr_nonha_with_sshkey
      CreateManageDrOptions createManageDrOptions = new CreateManageDrOptions.Builder()
        .instanceId("050ebe3b-13f4-4db8-8ece-501a3c13be80javah5")
        .orchestratorHa(false)
        .orchestratorLocationType("off-premises")
        .locationId("dal10")
        .orchestratorWorkspaceId("75cbf05b-78f6-406e-afe7-a904f646d798")
        .orchestratorName("drautomationprimaryjv5")
        .orchestratorPassword("EverytimeNewPassword@1")
        .machineType("s922")
        .tier("tier1")
        .sshKeyName("vijaykey")
        .apiKey("Apikey required")
        // Mfa
        .clientId("123abcd-97d2-4b14-bf62-8eaecc67a122")
        .clientSecret("abcdefgT5rS8wK6qR9dD7vF1hU4sA3bE2jG0pL9oX7yC")
        .tenantName("xxx.ibm.com")
        .build();

      Response<ServiceInstanceManageDR> response = drAutomationServiceService.createManageDr(createManageDrOptions).execute();
      System.out.println(response.getResult());
      // end-create_manage_dr_nonha_with_sshkey
    } catch (ServiceResponseException e) {
      logger.error("Non-HA + schematic id + sshkey failed: " + e.getDebuggingInfo(), e);
    }

    // 4. create_manage_dr_nonha_with_secrets
    try {
      // begin-create_manage_dr_nonha_with_secrets
      CreateManageDrOptions createManageDrOptions = new CreateManageDrOptions.Builder()
        .instanceId("050ebe3b-13f4-4db8-8ece-501a3c13be80javah7")
        .orchestratorHa(false)
        .orchestratorLocationType("off-premises")
        .locationId("dal10")
        .orchestratorWorkspaceId("75cbf05b-78f6-406e-afe7-a904f646d798")
        .orchestratorName("drautomationprimaryjv7")
        .orchestratorPassword("EverytimeNewPassword@1")
        .machineType("s922")
        .tier("tier1")
        .guid("397dc20d-9f66-46dc-a750-d15392872023")
        .secretGroup("123456-1234-1234-1234-1234abcd")
        .secret("123456-abcd-1234-1234-1234abcd")
        .regionId("us-south")
        .apiKey("Apikey required")
        // Mfa
        .clientId("123abcd-97d2-4b14-bf62-8eaecc67a122")
        .clientSecret("abcdefgT5rS8wK6qR9dD7vF1hU4sA3bE2jG0pL9oX7yC")
        .tenantName("xxx.ibm.com")
        .build();

      Response<ServiceInstanceManageDR> response = drAutomationServiceService.createManageDr(createManageDrOptions).execute();
      System.out.println(response.getResult());
      // end-create_manage_dr_nonha_with_secrets
    } catch (ServiceResponseException e) {
      logger.error("Non-HA + schematic id + secrets failed: " + e.getDebuggingInfo(), e);
    }
  }
}
