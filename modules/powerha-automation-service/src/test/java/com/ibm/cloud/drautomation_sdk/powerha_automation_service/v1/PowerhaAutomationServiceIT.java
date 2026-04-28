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
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.ClusterNodeInfo;
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
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.NodeDetail;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaAgentJobStatusResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaDeploymentResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaLocation;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaSupportedLocationsResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaWorkspaceSummary;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaWorkspacesRegionResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.ServiceInstancePhaStatus;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.drautomation_sdk.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the PowerhaAutomationService service.
 */
public class PowerhaAutomationServiceIT extends SdkIntegrationTestBase {
  public PowerhaAutomationService service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../powerha_automation_service_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = PowerhaAutomationService.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(PowerhaAutomationService.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testCreateApiKey() throws Exception {
    try {
      CreateApiKeyOptions createApiKeyOptions = new CreateApiKeyOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .apiKey("adfadfdsafsdfdsf")
        .acceptLanguage("en-US")
        .build();

      // Invoke operation
      Response<ApiKeyResponse> response = service.createApiKey(createApiKeyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ApiKeyResponse apiKeyResponseResult = response.getResult();
      assertNotNull(apiKeyResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateApiKey" })
  public void testGetClusterNode() throws Exception {
    try {
      GetClusterNodeOptions getClusterNodeOptions = new GetClusterNodeOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<ClusterNodeResponse> response = service.getClusterNode(getClusterNodeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNodeResponse clusterNodeResponseResult = response.getResult();
      assertNotNull(clusterNodeResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetClusterNode" })
  public void testCreateClusterNode() throws Exception {
    try {
      CreateClusterNodeOptions createClusterNodeOptions = new CreateClusterNodeOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .primaryClusterNodes(java.util.Arrays.asList("ede4c36e-002c-48da-992e-6039d230c478"))
        .secondaryClusterNodes(java.util.Arrays.asList("ede4c36e-1234-48da-992e-6039d230c478"))
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<ClusterNodeResponse> response = service.createClusterNode(createClusterNodeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ClusterNodeResponse clusterNodeResponseResult = response.getResult();
      assertNotNull(clusterNodeResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateClusterNode" })
  public void testGetPowervsWorkspace() throws Exception {
    try {
      GetPowervsWorkspaceOptions getPowervsWorkspaceOptions = new GetPowervsWorkspaceOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .locationId("us-south")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<PhaWorkspacesRegionResponse> response = service.getPowervsWorkspace(getPowervsWorkspaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PhaWorkspacesRegionResponse phaWorkspacesRegionResponseResult = response.getResult();
      assertNotNull(phaWorkspacesRegionResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPowervsWorkspace" })
  public void testGetPhaLastOperation() throws Exception {
    try {
      GetPhaLastOperationOptions getPhaLastOperationOptions = new GetPhaLastOperationOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<ServiceInstancePhaStatus> response = service.getPhaLastOperation(getPhaLastOperationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServiceInstancePhaStatus serviceInstancePhaStatusResult = response.getResult();
      assertNotNull(serviceInstancePhaStatusResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPhaLastOperation" })
  public void testGetPhaDeployment() throws Exception {
    try {
      GetPhaDeploymentOptions getPhaDeploymentOptions = new GetPhaDeploymentOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<PhaDeploymentResponse> response = service.getPhaDeployment(getPhaDeploymentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PhaDeploymentResponse phaDeploymentResponseResult = response.getResult();
      assertNotNull(phaDeploymentResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPhaDeployment" })
  public void testCreatePhaDeployment() throws Exception {
    try {
      CreatePhaDeploymentOptions createPhaDeploymentOptions = new CreatePhaDeploymentOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .locationId("loc-us-south-01")
        .primaryWorkspace("workspace-primary")
        .apiKey("123635364646fghrtfhbfdhb")
        .clusterType("standard")
        .configureType("automatic")
        .primaryClusterNodes(java.util.Arrays.asList("ede4c36e-002c-48da-992e-6039d230c478"))
        .standbyClusterNodes(java.util.Arrays.asList("843a8e1f-05bb-4164-8c73-de39e016c2b4"))
        .primaryLocation("us-south")
        .secondaryLocation("us-east")
        .secondaryWorkspace("workspace-secondary")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<PhaDeploymentResponse> response = service.createPhaDeployment(createPhaDeploymentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PhaDeploymentResponse phaDeploymentResponseResult = response.getResult();
      assertNotNull(phaDeploymentResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePhaDeployment" })
  public void testGetSupportedLocation() throws Exception {
    try {
      GetSupportedLocationOptions getSupportedLocationOptions = new GetSupportedLocationOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<PhaSupportedLocationsResponse> response = service.getSupportedLocation(getSupportedLocationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PhaSupportedLocationsResponse phaSupportedLocationsResponseResult = response.getResult();
      assertNotNull(phaSupportedLocationsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSupportedLocation" })
  public void testGetPhaAgentFileDownloadJobStatus() throws Exception {
    try {
      GetPhaAgentFileDownloadJobStatusOptions getPhaAgentFileDownloadJobStatusOptions = new GetPhaAgentFileDownloadJobStatusOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .phaJobId("4235r23r5vdfdf-2323")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<PhaAgentJobStatusResponse> response = service.getPhaAgentFileDownloadJobStatus(getPhaAgentFileDownloadJobStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PhaAgentJobStatusResponse phaAgentJobStatusResponseResult = response.getResult();
      assertNotNull(phaAgentJobStatusResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPhaAgentFileDownloadJobStatus" })
  public void testDownloadPhaAgentFile() throws Exception {
    try {
      DownloadPhaAgentFileOptions downloadPhaAgentFileOptions = new DownloadPhaAgentFileOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .acceptLanguage("en-US")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<InputStream> response = service.downloadPhaAgentFile(downloadPhaAgentFileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      try (InputStream inputStreamResult = response.getResult();) {
          assertNotNull(inputStreamResult);
      }

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDownloadPhaAgentFile" })
  public void testDeleteClusterNode() throws Exception {
    try {
      DeleteClusterNodeOptions deleteClusterNodeOptions = new DeleteClusterNodeOptions.Builder()
        .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
        .vmId("r006-2f3b3ab9-2149-49cc-83a1-30a5d93d59b2")
        .ifNoneMatch("abcdef")
        .build();

      // Invoke operation
      Response<ClusterNodeResponse> response = service.deleteClusterNode(deleteClusterNodeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNodeResponse clusterNodeResponseResult = response.getResult();
      assertNotNull(clusterNodeResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
