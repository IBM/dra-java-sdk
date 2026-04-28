/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1;

import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.ApiKeyResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.ClusterNodeResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.CreateApiKeyOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.CreateClusterNodeOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.CreatePhaDeploymentOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.DeleteClusterNodeOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.DownloadPhaAgentFileOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.GetClusterNodeOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.GetPhaAgentFileDownloadJobStatusOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.GetPhaDeploymentOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.GetPhaLastOperationOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.GetPowervsWorkspaceOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.GetSupportedLocationOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaAgentJobStatusResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaDeploymentResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaSupportedLocationsResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaWorkspacesRegionResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.ServiceInstancePhaStatus;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains examples of how to use the PowerhaAutomation Service service.
 *
 * The following configuration properties are assumed to be defined:
 * POWERHA_AUTOMATION_SERVICE_URL=&lt;service base url&gt;
 * POWERHA_AUTOMATION_SERVICE_AUTH_TYPE=iam
 * POWERHA_AUTOMATION_SERVICE_APIKEY=&lt;IAM apikey&gt;
 * POWERHA_AUTOMATION_SERVICE_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class PowerhaAutomationServiceExamples {
  private static final Logger logger = LoggerFactory.getLogger(PowerhaAutomationServiceExamples.class);
  protected PowerhaAutomationServiceExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../powerha_automation_service_v1.env");
  }

  /**
   * The main() function invokes operations of the PowerhaAutomation Service service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    PowerhaAutomationService powerhaAutomationServiceService = PowerhaAutomationService.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(PowerhaAutomationService.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("createApiKey() result:");
      // begin-create_api_key
      CreateApiKeyOptions createApiKeyOptions = new CreateApiKeyOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .acceptLanguage("en-US")
        .build();

      Response<ApiKeyResponse> response = powerhaAutomationServiceService.createApiKey(createApiKeyOptions).execute();
      ApiKeyResponse apiKeyResponse = response.getResult();

      System.out.println(apiKeyResponse);
      // end-create_api_key
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getClusterNode() result:");
      // begin-get_cluster_node
      GetClusterNodeOptions getClusterNodeOptions = new GetClusterNodeOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .ifNoneMatch("abcdef")
        .build();

      Response<ClusterNodeResponse> response = powerhaAutomationServiceService.getClusterNode(getClusterNodeOptions).execute();
      ClusterNodeResponse clusterNodeResponse = response.getResult();

      System.out.println(clusterNodeResponse);
      // end-get_cluster_node
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createClusterNode() result:");
      // begin-create_cluster_node
      CreateClusterNodeOptions createClusterNodeOptions = new CreateClusterNodeOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .primaryClusterNodes(java.util.Arrays.asList("ede4c36e-002c-48da-992e-6039d230c478"))
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      Response<ClusterNodeResponse> response = powerhaAutomationServiceService.createClusterNode(createClusterNodeOptions).execute();
      ClusterNodeResponse clusterNodeResponse = response.getResult();

      System.out.println(clusterNodeResponse);
      // end-create_cluster_node
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPowervsWorkspace() result:");
      // begin-get_powervs_workspace
      GetPowervsWorkspaceOptions getPowervsWorkspaceOptions = new GetPowervsWorkspaceOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .locationId("us-south")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      Response<PhaWorkspacesRegionResponse> response = powerhaAutomationServiceService.getPowervsWorkspace(getPowervsWorkspaceOptions).execute();
      PhaWorkspacesRegionResponse phaWorkspacesRegionResponse = response.getResult();

      System.out.println(phaWorkspacesRegionResponse);
      // end-get_powervs_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPhaLastOperation() result:");
      // begin-get_pha_last_operation
      GetPhaLastOperationOptions getPhaLastOperationOptions = new GetPhaLastOperationOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      Response<ServiceInstancePhaStatus> response = powerhaAutomationServiceService.getPhaLastOperation(getPhaLastOperationOptions).execute();
      ServiceInstancePhaStatus serviceInstancePhaStatus = response.getResult();

      System.out.println(serviceInstancePhaStatus);
      // end-get_pha_last_operation
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPhaDeployment() result:");
      // begin-get_pha_deployment
      GetPhaDeploymentOptions getPhaDeploymentOptions = new GetPhaDeploymentOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .ifNoneMatch("abcdef")
        .build();

      Response<PhaDeploymentResponse> response = powerhaAutomationServiceService.getPhaDeployment(getPhaDeploymentOptions).execute();
      PhaDeploymentResponse phaDeploymentResponse = response.getResult();

      System.out.println(phaDeploymentResponse);
      // end-get_pha_deployment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPhaDeployment() result:");
      // begin-create_pha_deployment
      CreatePhaDeploymentOptions createPhaDeploymentOptions = new CreatePhaDeploymentOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .locationId("loc-us-south-01")
        .primaryWorkspace("workspace-primary")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      Response<PhaDeploymentResponse> response = powerhaAutomationServiceService.createPhaDeployment(createPhaDeploymentOptions).execute();
      PhaDeploymentResponse phaDeploymentResponse = response.getResult();

      System.out.println(phaDeploymentResponse);
      // end-create_pha_deployment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSupportedLocation() result:");
      // begin-get_supported_location
      GetSupportedLocationOptions getSupportedLocationOptions = new GetSupportedLocationOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .ifNoneMatch("abcdef")
        .build();

      Response<PhaSupportedLocationsResponse> response = powerhaAutomationServiceService.getSupportedLocation(getSupportedLocationOptions).execute();
      PhaSupportedLocationsResponse phaSupportedLocationsResponse = response.getResult();

      System.out.println(phaSupportedLocationsResponse);
      // end-get_supported_location
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPhaAgentFileDownloadJobStatus() result:");
      // begin-get_pha_agent_file_download_job_status
      GetPhaAgentFileDownloadJobStatusOptions getPhaAgentFileDownloadJobStatusOptions = new GetPhaAgentFileDownloadJobStatusOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .phaJobId("4235r23r5vdfdf-2323")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      Response<PhaAgentJobStatusResponse> response = powerhaAutomationServiceService.getPhaAgentFileDownloadJobStatus(getPhaAgentFileDownloadJobStatusOptions).execute();
      PhaAgentJobStatusResponse phaAgentJobStatusResponse = response.getResult();

      System.out.println(phaAgentJobStatusResponse);
      // end-get_pha_agent_file_download_job_status
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("downloadPhaAgentFile() result:");
      // begin-download_pha_agent_file
      DownloadPhaAgentFileOptions downloadPhaAgentFileOptions = new DownloadPhaAgentFileOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      Response<InputStream> response = powerhaAutomationServiceService.downloadPhaAgentFile(downloadPhaAgentFileOptions).execute();
      try (InputStream inputStream = response.getResult();) {
          inputStream.transferTo(new java.io.FileOutputStream("result.out"));
      }
      // end-download_pha_agent_file
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteClusterNode() result:");
      // begin-delete_cluster_node
      DeleteClusterNodeOptions deleteClusterNodeOptions = new DeleteClusterNodeOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .vmId("r006-2f3b3ab9-2149-49cc-83a1-30a5d93d59b2")
        .ifNoneMatch("abcdef")
        .build();

      Response<ClusterNodeResponse> response = powerhaAutomationServiceService.deleteClusterNode(deleteClusterNodeOptions).execute();
      ClusterNodeResponse clusterNodeResponse = response.getResult();

      System.out.println(clusterNodeResponse);
      // end-delete_cluster_node
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
