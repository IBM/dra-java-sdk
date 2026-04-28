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

import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.PowerhaAutomationService;
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
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PowerhaAutomationService service.
 */
public class PowerhaAutomationServiceTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected PowerhaAutomationService powerhaAutomationServiceService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new PowerhaAutomationService(serviceName, null);
  }

  // Test the createApiKey operation with a valid options model parameter
  @Test
  public void testCreateApiKeyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": \"Success\", \"id\": \"9676767890\"}";
    String createApiKeyPath = "/powerha_automation/v1/api_key/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateApiKeyOptions model
    CreateApiKeyOptions createApiKeyOptionsModel = new CreateApiKeyOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .apiKey("adfadfdsafsdfdsf")
      .acceptLanguage("en-US")
      .build();

    // Invoke createApiKey() with a valid options model and verify the result
    Response<ApiKeyResponse> response = powerhaAutomationServiceService.createApiKey(createApiKeyOptionsModel).execute();
    assertNotNull(response);
    ApiKeyResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createApiKeyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createApiKey operation with and without retries enabled
  @Test
  public void testCreateApiKeyWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testCreateApiKeyWOptions();

    powerhaAutomationServiceService.disableRetries();
    testCreateApiKeyWOptions();
  }

  // Test the createApiKey operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateApiKeyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.createApiKey(null).execute();
  }

  // Test the getClusterNode operation with a valid options model parameter
  @Test
  public void testGetClusterNodeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"cluster-response-01\", \"primary_node_details\": [{\"agent_status\": \"running\", \"cores\": 8.0, \"ip_addresses\": [\"ipAddresses\"], \"memory\": 64.0, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-9b7c2d11\", \"vm_name\": \"pha-node-primary-1\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-primary-001\"}], \"secondary_node_details\": [{\"agent_status\": \"running\", \"cores\": 8.0, \"ip_addresses\": [\"ipAddresses\"], \"memory\": 64.0, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-9b7c2d11\", \"vm_name\": \"pha-node-primary-1\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-primary-001\"}]}";
    String getClusterNodePath = "/powerha_automation/v1/cluster_nodes/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetClusterNodeOptions model
    GetClusterNodeOptions getClusterNodeOptionsModel = new GetClusterNodeOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .ifNoneMatch("abcdef")
      .build();

    // Invoke getClusterNode() with a valid options model and verify the result
    Response<ClusterNodeResponse> response = powerhaAutomationServiceService.getClusterNode(getClusterNodeOptionsModel).execute();
    assertNotNull(response);
    ClusterNodeResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getClusterNodePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getClusterNode operation with and without retries enabled
  @Test
  public void testGetClusterNodeWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testGetClusterNodeWOptions();

    powerhaAutomationServiceService.disableRetries();
    testGetClusterNodeWOptions();
  }

  // Test the getClusterNode operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetClusterNodeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.getClusterNode(null).execute();
  }

  // Test the createClusterNode operation with a valid options model parameter
  @Test
  public void testCreateClusterNodeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"cluster-response-01\", \"primary_node_details\": [{\"agent_status\": \"running\", \"cores\": 8.0, \"ip_addresses\": [\"ipAddresses\"], \"memory\": 64.0, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-9b7c2d11\", \"vm_name\": \"pha-node-primary-1\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-primary-001\"}], \"secondary_node_details\": [{\"agent_status\": \"running\", \"cores\": 8.0, \"ip_addresses\": [\"ipAddresses\"], \"memory\": 64.0, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-9b7c2d11\", \"vm_name\": \"pha-node-primary-1\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-primary-001\"}]}";
    String createClusterNodePath = "/powerha_automation/v1/cluster_nodes/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateClusterNodeOptions model
    CreateClusterNodeOptions createClusterNodeOptionsModel = new CreateClusterNodeOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .primaryClusterNodes(java.util.Arrays.asList("ede4c36e-002c-48da-992e-6039d230c478"))
      .secondaryClusterNodes(java.util.Arrays.asList("ede4c36e-1234-48da-992e-6039d230c478"))
      .acceptLanguage("en-US")
      .ifNoneMatch("abcdef")
      .build();

    // Invoke createClusterNode() with a valid options model and verify the result
    Response<ClusterNodeResponse> response = powerhaAutomationServiceService.createClusterNode(createClusterNodeOptionsModel).execute();
    assertNotNull(response);
    ClusterNodeResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createClusterNodePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createClusterNode operation with and without retries enabled
  @Test
  public void testCreateClusterNodeWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testCreateClusterNodeWOptions();

    powerhaAutomationServiceService.disableRetries();
    testCreateClusterNodeWOptions();
  }

  // Test the createClusterNode operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateClusterNodeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.createClusterNode(null).execute();
  }

  // Test the deleteClusterNode operation with a valid options model parameter
  @Test
  public void testDeleteClusterNodeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"cluster-response-01\", \"primary_node_details\": [{\"agent_status\": \"running\", \"cores\": 8.0, \"ip_addresses\": [\"ipAddresses\"], \"memory\": 64.0, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-9b7c2d11\", \"vm_name\": \"pha-node-primary-1\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-primary-001\"}], \"secondary_node_details\": [{\"agent_status\": \"running\", \"cores\": 8.0, \"ip_addresses\": [\"ipAddresses\"], \"memory\": 64.0, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-9b7c2d11\", \"vm_name\": \"pha-node-primary-1\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-primary-001\"}]}";
    String deleteClusterNodePath = "/powerha_automation/v1/cluster_nodes/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteClusterNodeOptions model
    DeleteClusterNodeOptions deleteClusterNodeOptionsModel = new DeleteClusterNodeOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .vmId("r006-2f3b3ab9-2149-49cc-83a1-30a5d93d59b2")
      .ifNoneMatch("abcdef")
      .build();

    // Invoke deleteClusterNode() with a valid options model and verify the result
    Response<ClusterNodeResponse> response = powerhaAutomationServiceService.deleteClusterNode(deleteClusterNodeOptionsModel).execute();
    assertNotNull(response);
    ClusterNodeResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteClusterNodePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("vm_id"), "r006-2f3b3ab9-2149-49cc-83a1-30a5d93d59b2");
  }

  // Test the deleteClusterNode operation with and without retries enabled
  @Test
  public void testDeleteClusterNodeWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testDeleteClusterNodeWOptions();

    powerhaAutomationServiceService.disableRetries();
    testDeleteClusterNodeWOptions();
  }

  // Test the deleteClusterNode operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteClusterNodeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.deleteClusterNode(null).execute();
  }

  // Test the getPowervsWorkspace operation with a valid options model parameter
  @Test
  public void testGetPowervsWorkspaceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"workspaces\": [{\"id\": \"ws-001\", \"name\": \"primary-workspace\"}]}";
    String getPowervsWorkspacePath = "/powerha_automation/v1/powervs_workspaces/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPowervsWorkspaceOptions model
    GetPowervsWorkspaceOptions getPowervsWorkspaceOptionsModel = new GetPowervsWorkspaceOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .locationId("us-south")
      .acceptLanguage("en-US")
      .ifNoneMatch("abcdef")
      .build();

    // Invoke getPowervsWorkspace() with a valid options model and verify the result
    Response<PhaWorkspacesRegionResponse> response = powerhaAutomationServiceService.getPowervsWorkspace(getPowervsWorkspaceOptionsModel).execute();
    assertNotNull(response);
    PhaWorkspacesRegionResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPowervsWorkspacePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("location_id"), "us-south");
  }

  // Test the getPowervsWorkspace operation with and without retries enabled
  @Test
  public void testGetPowervsWorkspaceWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testGetPowervsWorkspaceWOptions();

    powerhaAutomationServiceService.disableRetries();
    testGetPowervsWorkspaceWOptions();
  }

  // Test the getPowervsWorkspace operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPowervsWorkspaceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.getPowervsWorkspace(null).execute();
  }

  // Test the getPhaLastOperation operation with a valid options model parameter
  @Test
  public void testGetPhaLastOperationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"deployment_name\": \"pha-deployment-prod-01\", \"provision_id\": \"8eefautr-4c02-0009-0086-8bd4d8cf61b6\", \"resource_group\": \"resourceGroup\", \"status\": \"ACTIVE\"}";
    String getPhaLastOperationPath = "/powerha_automation/v1/last_operation/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPhaLastOperationOptions model
    GetPhaLastOperationOptions getPhaLastOperationOptionsModel = new GetPhaLastOperationOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .acceptLanguage("en-US")
      .ifNoneMatch("abcdef")
      .build();

    // Invoke getPhaLastOperation() with a valid options model and verify the result
    Response<ServiceInstancePhaStatus> response = powerhaAutomationServiceService.getPhaLastOperation(getPhaLastOperationOptionsModel).execute();
    assertNotNull(response);
    ServiceInstancePhaStatus responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPhaLastOperationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPhaLastOperation operation with and without retries enabled
  @Test
  public void testGetPhaLastOperationWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testGetPhaLastOperationWOptions();

    powerhaAutomationServiceService.disableRetries();
    testGetPhaLastOperationWOptions();
  }

  // Test the getPhaLastOperation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPhaLastOperationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.getPhaLastOperation(null).execute();
  }

  // Test the getPhaDeployment operation with a valid options model parameter
  @Test
  public void testGetPhaDeploymentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"cloud_account_id\": \"adfadfdsafsdfdsf\", \"connectivity_type\": \"private\", \"creation_time\": \"2026-01-10T08:15:30Z\", \"custom_network\": [\"customNetwork\"], \"deprovision_time\": \"2026-01-20T12:45:00Z\", \"guid\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"is_duplicate\": false, \"plan_id\": \"powerha-standard\", \"plan_name\": \"PowerHA Standard\", \"powerha_cluster_name\": \"pha-cluster-prod\", \"powerha_cluster_type\": \"standard\", \"powerha_level\": \"7.2.1\", \"primary_cluster_nodes_details\": [{\"agent_status\": \"RUNNING\", \"cores\": 8.0, \"ip_address\": \"10.0.2.45\", \"memory\": 32, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-3c91af27\", \"vm_name\": \"pha-node-01\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-pha-prod\"}], \"primary_location\": \"us-south\", \"primary_region_name\": \"Dallas\", \"primary_workspace\": \"ws-primary-001\", \"primary_workspace_name\": \"primary-ws-01\", \"provision_end_time\": \"2026-01-10T08:30:00Z\", \"id\": \"prov-9f8a7b6c\", \"provision_start_time\": \"2026-01-10T08:16:00Z\", \"provision_status\": \"SUCCEEDED\", \"region_id\": \"us-south\", \"resource_group\": \"rg-pha-prod\", \"resource_group_crn\": \"crn:v1:bluemix:public:resource-group:us-south:a/123456::rg:abcd1234\", \"resource_instance\": \"resource-instance-01\", \"secondary_cluster_nodes\": [{\"agent_status\": \"RUNNING\", \"cores\": 8.0, \"ip_address\": \"10.0.2.45\", \"memory\": 32, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-3c91af27\", \"vm_name\": \"pha-node-01\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-pha-prod\"}], \"secondary_location\": \"us-east\", \"secondary_workspace\": \"ws-secondary-001\", \"service_description\": \"PowerHA disaster recovery deployment\", \"service_id\": \"powerha\", \"service_name\": \"IBM PowerHA\", \"standby_region_name\": \"Washington\", \"standby_workspace_name\": \"standby-ws-01\", \"user_tags\": \"env:prod,team:dr\"}";
    String getPhaDeploymentPath = "/powerha_automation/v1/pha_deployment/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPhaDeploymentOptions model
    GetPhaDeploymentOptions getPhaDeploymentOptionsModel = new GetPhaDeploymentOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .ifNoneMatch("abcdef")
      .build();

    // Invoke getPhaDeployment() with a valid options model and verify the result
    Response<PhaDeploymentResponse> response = powerhaAutomationServiceService.getPhaDeployment(getPhaDeploymentOptionsModel).execute();
    assertNotNull(response);
    PhaDeploymentResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPhaDeploymentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPhaDeployment operation with and without retries enabled
  @Test
  public void testGetPhaDeploymentWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testGetPhaDeploymentWOptions();

    powerhaAutomationServiceService.disableRetries();
    testGetPhaDeploymentWOptions();
  }

  // Test the getPhaDeployment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPhaDeploymentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.getPhaDeployment(null).execute();
  }

  // Test the createPhaDeployment operation with a valid options model parameter
  @Test
  public void testCreatePhaDeploymentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"cloud_account_id\": \"adfadfdsafsdfdsf\", \"connectivity_type\": \"private\", \"creation_time\": \"2026-01-10T08:15:30Z\", \"custom_network\": [\"customNetwork\"], \"deprovision_time\": \"2026-01-20T12:45:00Z\", \"guid\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"is_duplicate\": false, \"plan_id\": \"powerha-standard\", \"plan_name\": \"PowerHA Standard\", \"powerha_cluster_name\": \"pha-cluster-prod\", \"powerha_cluster_type\": \"standard\", \"powerha_level\": \"7.2.1\", \"primary_cluster_nodes_details\": [{\"agent_status\": \"RUNNING\", \"cores\": 8.0, \"ip_address\": \"10.0.2.45\", \"memory\": 32, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-3c91af27\", \"vm_name\": \"pha-node-01\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-pha-prod\"}], \"primary_location\": \"us-south\", \"primary_region_name\": \"Dallas\", \"primary_workspace\": \"ws-primary-001\", \"primary_workspace_name\": \"primary-ws-01\", \"provision_end_time\": \"2026-01-10T08:30:00Z\", \"id\": \"prov-9f8a7b6c\", \"provision_start_time\": \"2026-01-10T08:16:00Z\", \"provision_status\": \"SUCCEEDED\", \"region_id\": \"us-south\", \"resource_group\": \"rg-pha-prod\", \"resource_group_crn\": \"crn:v1:bluemix:public:resource-group:us-south:a/123456::rg:abcd1234\", \"resource_instance\": \"resource-instance-01\", \"secondary_cluster_nodes\": [{\"agent_status\": \"RUNNING\", \"cores\": 8.0, \"ip_address\": \"10.0.2.45\", \"memory\": 32, \"pha_level\": \"7.2.1\", \"region\": \"us-south\", \"vm_id\": \"vm-3c91af27\", \"vm_name\": \"pha-node-01\", \"vm_status\": \"ACTIVE\", \"workspace_id\": \"workspace-pha-prod\"}], \"secondary_location\": \"us-east\", \"secondary_workspace\": \"ws-secondary-001\", \"service_description\": \"PowerHA disaster recovery deployment\", \"service_id\": \"powerha\", \"service_name\": \"IBM PowerHA\", \"standby_region_name\": \"Washington\", \"standby_workspace_name\": \"standby-ws-01\", \"user_tags\": \"env:prod,team:dr\"}";
    String createPhaDeploymentPath = "/powerha_automation/v1/pha_deployment/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreatePhaDeploymentOptions model
    CreatePhaDeploymentOptions createPhaDeploymentOptionsModel = new CreatePhaDeploymentOptions.Builder()
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

    // Invoke createPhaDeployment() with a valid options model and verify the result
    Response<PhaDeploymentResponse> response = powerhaAutomationServiceService.createPhaDeployment(createPhaDeploymentOptionsModel).execute();
    assertNotNull(response);
    PhaDeploymentResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPhaDeploymentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPhaDeployment operation with and without retries enabled
  @Test
  public void testCreatePhaDeploymentWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testCreatePhaDeploymentWOptions();

    powerhaAutomationServiceService.disableRetries();
    testCreatePhaDeploymentWOptions();
  }

  // Test the createPhaDeployment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePhaDeploymentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.createPhaDeployment(null).execute();
  }

  // Test the getSupportedLocation operation with a valid options model parameter
  @Test
  public void testGetSupportedLocationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"locations\": [{\"id\": \"loc-us-south-01\", \"name\": \"Dallas (us-south)\"}]}";
    String getSupportedLocationPath = "/powerha_automation/v1/supported_locations/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSupportedLocationOptions model
    GetSupportedLocationOptions getSupportedLocationOptionsModel = new GetSupportedLocationOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .ifNoneMatch("abcdef")
      .build();

    // Invoke getSupportedLocation() with a valid options model and verify the result
    Response<PhaSupportedLocationsResponse> response = powerhaAutomationServiceService.getSupportedLocation(getSupportedLocationOptionsModel).execute();
    assertNotNull(response);
    PhaSupportedLocationsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSupportedLocationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSupportedLocation operation with and without retries enabled
  @Test
  public void testGetSupportedLocationWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testGetSupportedLocationWOptions();

    powerhaAutomationServiceService.disableRetries();
    testGetSupportedLocationWOptions();
  }

  // Test the getSupportedLocation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSupportedLocationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.getSupportedLocation(null).execute();
  }

  // Test the getPhaAgentFileDownloadJobStatus operation with a valid options model parameter
  @Test
  public void testGetPhaAgentFileDownloadJobStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bytes_downloaded\": 52428800, \"creation_at\": \"2026-01-08T11:00:00.000Z\", \"file_name\": \"power_agent\", \"job_id\": \"job-98765\", \"last_updated_at\": \"2026-01-08T12:15:00.000Z\", \"service_instance_id\": \"service-12345\", \"status\": \"running\", \"total_bytes\": 104857600, \"vm_id\": \"vm-12345\"}";
    String getPhaAgentFileDownloadJobStatusPath = "/powerha_automation/v1/pha_agent/download/8eefautr-4c02-0009-0086-8bd4d8cf61b6/jobs/4235r23r5vdfdf-2323";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPhaAgentFileDownloadJobStatusOptions model
    GetPhaAgentFileDownloadJobStatusOptions getPhaAgentFileDownloadJobStatusOptionsModel = new GetPhaAgentFileDownloadJobStatusOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .phaJobId("4235r23r5vdfdf-2323")
      .acceptLanguage("en-US")
      .ifNoneMatch("abcdef")
      .build();

    // Invoke getPhaAgentFileDownloadJobStatus() with a valid options model and verify the result
    Response<PhaAgentJobStatusResponse> response = powerhaAutomationServiceService.getPhaAgentFileDownloadJobStatus(getPhaAgentFileDownloadJobStatusOptionsModel).execute();
    assertNotNull(response);
    PhaAgentJobStatusResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPhaAgentFileDownloadJobStatusPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPhaAgentFileDownloadJobStatus operation with and without retries enabled
  @Test
  public void testGetPhaAgentFileDownloadJobStatusWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testGetPhaAgentFileDownloadJobStatusWOptions();

    powerhaAutomationServiceService.disableRetries();
    testGetPhaAgentFileDownloadJobStatusWOptions();
  }

  // Test the getPhaAgentFileDownloadJobStatus operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPhaAgentFileDownloadJobStatusNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.getPhaAgentFileDownloadJobStatus(null).execute();
  }

  // Test the downloadPhaAgentFile operation with a valid options model parameter
  @Test
  public void testDownloadPhaAgentFileWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String downloadPhaAgentFilePath = "/powerha_automation/v1/pha_agent/download/8eefautr-4c02-0009-0086-8bd4d8cf61b6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/octet-stream")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DownloadPhaAgentFileOptions model
    DownloadPhaAgentFileOptions downloadPhaAgentFileOptionsModel = new DownloadPhaAgentFileOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .acceptLanguage("en-US")
      .ifNoneMatch("abcdef")
      .build();

    // Invoke downloadPhaAgentFile() with a valid options model and verify the result
    Response<InputStream> response = powerhaAutomationServiceService.downloadPhaAgentFile(downloadPhaAgentFileOptionsModel).execute();
    assertNotNull(response);
    try (InputStream responseObj = response.getResult();) {
      assertNotNull(responseObj);
    }

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, downloadPhaAgentFilePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the downloadPhaAgentFile operation with and without retries enabled
  @Test
  public void testDownloadPhaAgentFileWRetries() throws Throwable {
    powerhaAutomationServiceService.enableRetries(4, 30);
    testDownloadPhaAgentFileWOptions();

    powerhaAutomationServiceService.disableRetries();
    testDownloadPhaAgentFileWOptions();
  }

  // Test the downloadPhaAgentFile operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDownloadPhaAgentFileNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    powerhaAutomationServiceService.downloadPhaAgentFile(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    powerhaAutomationServiceService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    powerhaAutomationServiceService = PowerhaAutomationService.newInstance(serviceName);
    String url = server.url("/").toString();
    powerhaAutomationServiceService.setServiceUrl(url);
  }
}