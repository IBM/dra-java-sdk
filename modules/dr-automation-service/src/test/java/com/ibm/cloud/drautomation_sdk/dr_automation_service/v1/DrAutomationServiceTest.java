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

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.fail;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.CreateManageDrOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.DrAutomationGetSummaryResponse;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.DrData;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.Event;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.EventCollection;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetDrGrsLocationPairOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetDrLocationsOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetDrLocationsResponse;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetDrManagedVmOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetDrSummaryOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetEventOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetGRSLocationPairResponse;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetLastOperationOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetMachineTypeOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetPowervsWorkspacesOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.ListEventsOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.MachineTypesByWorkspace;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.ManagedVmMapResponse;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.ServiceInstanceManageDR;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.ServiceInstanceStatus;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.UpdateApikeyOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.ValidationKeyResponse;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

/**
 * Unit test class for the DrAutomationService service.
 */
public class DrAutomationServiceTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DrAutomationService drAutomationServiceService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new DrAutomationService(serviceName, null);
  }

  // Test the updateApikey operation with a valid options model parameter
  @Test
  public void testUpdateApikeyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"description\": \"Key is valid.\", \"id\": \"crn:v1:staging:public:power-dr-automation:global:a/a123456fb04ceebfb4a9fd38c22334455:123456d3-1122-3344-b67d-4389b44b7bf9::\", \"status\": \"Active\"}";
    String updateApikeyPath = "/drautomation/v1/apikey/123456d3-1122-3344-b67d-4389b44b7bf9";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateApikeyOptions model
    UpdateApikeyOptions updateApikeyOptionsModel = new UpdateApikeyOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .apiKey("adfadfdsafsdfdsf")
      .acceptLanguage("testString")
      .build();

    // Invoke updateApikey() with a valid options model and verify the result
    Response<ValidationKeyResponse> response = drAutomationServiceService.updateApikey(updateApikeyOptionsModel).execute();
    assertNotNull(response);
    ValidationKeyResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateApikeyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateApikey operation with and without retries enabled
  @Test
  public void testUpdateApikeyWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testUpdateApikeyWOptions();

    drAutomationServiceService.disableRetries();
    testUpdateApikeyWOptions();
  }

  // Test the updateApikey operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateApikeyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.updateApikey(null).execute();
  }

  // Test the getDrGrsLocationPair operation with a valid options model parameter
  @Test
  public void testGetDrGrsLocationPairWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"location_pairs\": {\"mapKey\": \"inner\"}}";
    String getDrGrsLocationPairPath = "/drautomation/v1/dr_grs_location_pairs/123456d3-1122-3344-b67d-4389b44b7bf9";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDrGrsLocationPairOptions model
    GetDrGrsLocationPairOptions getDrGrsLocationPairOptionsModel = new GetDrGrsLocationPairOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .acceptLanguage("testString")
      .build();

    // Invoke getDrGrsLocationPair() with a valid options model and verify the result
    Response<GetGRSLocationPairResponse> response = drAutomationServiceService.getDrGrsLocationPair(getDrGrsLocationPairOptionsModel).execute();
    assertNotNull(response);
    GetGRSLocationPairResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDrGrsLocationPairPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDrGrsLocationPair operation with and without retries enabled
  @Test
  public void testGetDrGrsLocationPairWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testGetDrGrsLocationPairWOptions();

    drAutomationServiceService.disableRetries();
    testGetDrGrsLocationPairWOptions();
  }

  // Test the getDrGrsLocationPair operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDrGrsLocationPairNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.getDrGrsLocationPair(null).execute();
  }

  // Test the getDrLocations operation with a valid options model parameter
  @Test
  public void testGetDrLocationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"dr_locations\": [{\"id\": \"loc123\", \"name\": \"US-East-1\"}]}";
    String getDrLocationsPath = "/drautomation/v1/dr_locations/123456d3-1122-3344-b67d-4389b44b7bf9";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDrLocationsOptions model
    GetDrLocationsOptions getDrLocationsOptionsModel = new GetDrLocationsOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .acceptLanguage("testString")
      .build();

    // Invoke getDrLocations() with a valid options model and verify the result
    Response<GetDrLocationsResponse> response = drAutomationServiceService.getDrLocations(getDrLocationsOptionsModel).execute();
    assertNotNull(response);
    GetDrLocationsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDrLocationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDrLocations operation with and without retries enabled
  @Test
  public void testGetDrLocationsWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testGetDrLocationsWOptions();

    drAutomationServiceService.disableRetries();
    testGetDrLocationsWOptions();
  }

  // Test the getDrLocations operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDrLocationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.getDrLocations(null).execute();
  }

  // Test the getDrManagedVm operation with a valid options model parameter
  @Test
  public void testGetDrManagedVmWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"managed_vm_list\": {\"mapKey\": {\"core\": \"0.50\", \"dr_average_time\": \"10\", \"dr_region\": \"nyc02\", \"memory\": \"4\", \"region\": \"lon04\", \"vm_name\": \"example_vm\", \"workgroup_name\": \"Workgroup1\", \"workspace_name\": \"Workspace_dallas01\"}}}";
    String getDrManagedVmPath = "/drautomation/v1/dr_managed_vms/123456d3-1122-3344-b67d-4389b44b7bf9";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDrManagedVmOptions model
    GetDrManagedVmOptions getDrManagedVmOptionsModel = new GetDrManagedVmOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .acceptLanguage("testString")
      .build();

    // Invoke getDrManagedVm() with a valid options model and verify the result
    Response<ManagedVmMapResponse> response = drAutomationServiceService.getDrManagedVm(getDrManagedVmOptionsModel).execute();
    assertNotNull(response);
    ManagedVmMapResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDrManagedVmPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDrManagedVm operation with and without retries enabled
  @Test
  public void testGetDrManagedVmWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testGetDrManagedVmWOptions();

    drAutomationServiceService.disableRetries();
    testGetDrManagedVmWOptions();
  }

  // Test the getDrManagedVm operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDrManagedVmNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.getDrManagedVm(null).execute();
  }

  // Test the getDrSummary operation with a valid options model parameter
  @Test
  public void testGetDrSummaryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"managed_vm_list\": {\"anyKey\": \"anyValue\"}, \"orchestrator_details\": {\"last_updated_orchestrator_deployment_time\": \"2025-10-16T09:28:13.696Z\", \"last_updated_standby_orchestrator_deployment_time\": \"2025-10-16T09:28:13.696Z\", \"latest_orchestrator_time\": \"2025-10-16T09:28:13.696Z\", \"location_id\": \"locationId\", \"mfa_enabled\": \"mfaEnabled\", \"orch_ext_connectivity_status\": \"orchExtConnectivityStatus\", \"orch_standby_node_addition_status\": \"orchStandbyNodeAdditionStatus\", \"orchestrator_cluster_message\": \"orchestratorClusterMessage\", \"orchestrator_config_status\": \"orchestratorConfigStatus\", \"orchestrator_group_leader\": \"orchestratorGroupLeader\", \"orchestrator_location_type\": \"orchestratorLocationType\", \"orchestrator_name\": \"orchestratorName\", \"orchestrator_status\": \"orchestratorStatus\", \"orchestrator_workspace_name\": \"orchestratorWorkspaceName\", \"proxy_ip\": \"proxyIp\", \"schematic_workspace_name\": \"schematicWorkspaceName\", \"schematic_workspace_status\": \"schematicWorkspaceStatus\", \"ssh_key_name\": \"sshKeyName\", \"standby_orchestrator_name\": \"standbyOrchestratorName\", \"standby_orchestrator_status\": \"standbyOrchestratorStatus\", \"standby_orchestrator_workspace_name\": \"standbyOrchestratorWorkspaceName\", \"transit_gateway_name\": \"transitGatewayName\", \"vpc_name\": \"vpcName\"}, \"service_details\": {\"crn\": \"crn\", \"deployment_name\": \"deploymentName\", \"description\": \"description\", \"orchestrator_ha\": true, \"plan_name\": \"planName\", \"primary_ip_address\": \"primaryIpAddress\", \"primary_orchestrator_dashboard_url\": \"primaryOrchestratorDashboardUrl\", \"recovery_location\": \"recoveryLocation\", \"resource_group\": \"resourceGroup\", \"standby_description\": \"standbyDescription\", \"standby_ip_address\": \"standbyIpAddress\", \"standby_orchestrator_dashboard_url\": \"standbyOrchestratorDashboardUrl\", \"standby_status\": \"standbyStatus\", \"status\": \"status\"}}";
    String getDrSummaryPath = "/drautomation/v1/dr_summary/123456d3-1122-3344-b67d-4389b44b7bf9";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDrSummaryOptions model
    GetDrSummaryOptions getDrSummaryOptionsModel = new GetDrSummaryOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .acceptLanguage("testString")
      .build();

    // Invoke getDrSummary() with a valid options model and verify the result
    Response<DrAutomationGetSummaryResponse> response = drAutomationServiceService.getDrSummary(getDrSummaryOptionsModel).execute();
    assertNotNull(response);
    DrAutomationGetSummaryResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDrSummaryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDrSummary operation with and without retries enabled
  @Test
  public void testGetDrSummaryWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testGetDrSummaryWOptions();

    drAutomationServiceService.disableRetries();
    testGetDrSummaryWOptions();
  }

  // Test the getDrSummary operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDrSummaryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.getDrSummary(null).execute();
  }

  // Test the getMachineType operation with a valid options model parameter
  @Test
  public void testGetMachineTypeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"workspaces\": {\"mapKey\": [\"inner\"]}}";
    String getMachineTypePath = "/drautomation/v1/machinetypes/123456d3-1122-3344-b67d-4389b44b7bf9";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMachineTypeOptions model
    GetMachineTypeOptions getMachineTypeOptionsModel = new GetMachineTypeOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .primaryWorkspaceName("Test-workspace-wdc06")
      .acceptLanguage("testString")
      .standbyWorkspaceName("Test-workspace-wdc07")
      .build();

    // Invoke getMachineType() with a valid options model and verify the result
    Response<MachineTypesByWorkspace> response = drAutomationServiceService.getMachineType(getMachineTypeOptionsModel).execute();
    assertNotNull(response);
    MachineTypesByWorkspace responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMachineTypePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("primary_workspace_name"), "Test-workspace-wdc06");
    assertEquals(query.get("standby_workspace_name"), "Test-workspace-wdc07");
  }

  // Test the getMachineType operation with and without retries enabled
  @Test
  public void testGetMachineTypeWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testGetMachineTypeWOptions();

    drAutomationServiceService.disableRetries();
    testGetMachineTypeWOptions();
  }

  // Test the getMachineType operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMachineTypeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.getMachineType(null).execute();
  }

  // Test the getPowervsWorkspaces operation with a valid options model parameter
  @Test
  public void testGetPowervsWorkspacesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"dr_standby_workspace_description\": \"anyValue\", \"dr_standby_workspaces\": [{\"details\": {\"crn\": \"crn:v1:bluemix:public:power-iaas:lon06:a/094f4214c75941f991da601b001df1fe:b6297e60-d0fe-4e24-8b15-276cf0645737::\"}, \"id\": \"id\", \"location\": {\"region\": \"lon06\", \"type\": \"data-center\", \"url\": \"https://lon.power-iaas.cloud.ibm.com\"}, \"name\": \"name\", \"status\": \"status\"}], \"dr_workspace_description\": \"anyValue\", \"dr_workspaces\": [{\"default\": true, \"details\": {\"crn\": \"crn:v1:bluemix:public:power-iaas:lon06:a/094f4214c75941f991da601b001df1fe:b6297e60-d0fe-4e24-8b15-276cf0645737::\"}, \"id\": \"id\", \"location\": {\"region\": \"lon06\", \"type\": \"data-center\", \"url\": \"https://lon.power-iaas.cloud.ibm.com\"}, \"name\": \"name\", \"status\": \"active\"}]}";
    String getPowervsWorkspacesPath = "/drautomation/v1/powervs_workspaces/123456d3-1122-3344-b67d-4389b44b7bf9";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPowervsWorkspacesOptions model
    GetPowervsWorkspacesOptions getPowervsWorkspacesOptionsModel = new GetPowervsWorkspacesOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .locationId("testString")
      .build();

    // Invoke getPowervsWorkspaces() with a valid options model and verify the result
    Response<DrData> response = drAutomationServiceService.getPowervsWorkspaces(getPowervsWorkspacesOptionsModel).execute();
    assertNotNull(response);
    DrData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPowervsWorkspacesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("location_id"), "testString");
  }

  // Test the getPowervsWorkspaces operation with and without retries enabled
  @Test
  public void testGetPowervsWorkspacesWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testGetPowervsWorkspacesWOptions();

    drAutomationServiceService.disableRetries();
    testGetPowervsWorkspacesWOptions();
  }

  // Test the getPowervsWorkspaces operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPowervsWorkspacesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.getPowervsWorkspaces(null).execute();
  }

  // Test the createManageDr operation with a valid options model parameter
  @Test
  public void testCreateManageDrWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"dashboard_url\": \"https://power-dra.cloud.ibm.com/power-dra-ui?instance_id=crn:v1:bluemix:public:power-dr-automation:us-south:a/fe3c2ccd058e407c81e1dba2b5c0e0d6:e3d09875-bbf8-4d8a-b52c-abefb67a53c5::\", \"id\": \"crn:v1:staging:public:power-dr-automation:global:a/a123456fb04ceebfb4a9fd38c22334455:123456d3-1122-3344-b67d-4389b44b7bf9::\"}";
    String createManageDrPath = "/drautomation/v1/manage_dr/123456d3-1122-3344-b67d-4389b44b7bf9";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateManageDrOptions model
    CreateManageDrOptions createManageDrOptionsModel = new CreateManageDrOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .locationId("dal10")
      .machineType("bx2-4x16")
      .orchestratorLocationType("off-premises")
      .orchestratorName("adminUser")
      .orchestratorPassword("testString")
      .orchestratorWorkspaceId("orch-workspace-01")
      .apiKey("testString")
      .clientId("abcd-97d2-1234-bf62-8eaecc67a1234")
      .clientSecret("abcd1234xM1y123wK6qR9123456789bE2jG0pabcdefgh")
      .guid("123e4567-e89b-12d3-a456-426614174000")
      .orchestratorHa(true)
      .proxyIp("10.40.30.10:8888")
      .regionId("us-south")
      .resourceInstance("crn:v1:bluemix:public:resource-controller::res123")
      .secret("testString")
      .secretGroup("default-secret-group")
      .sshKeyName("my-ssh-key")
      .standbyMachineType("bx2-8x32")
      .standbyOrchestratorName("standbyAdmin")
      .standbyOrchestratorWorkspaceId("orch-standby-02")
      .standbyTier("Premium")
      .tenantName("xxx.ibm.com")
      .tier("Standard")
      .standByRedeploy("testString")
      .acceptLanguage("testString")
      .acceptsIncomplete(true)
      .build();

    // Invoke createManageDr() with a valid options model and verify the result
    Response<ServiceInstanceManageDR> response = drAutomationServiceService.createManageDr(createManageDrOptionsModel).execute();
    assertNotNull(response);
    ServiceInstanceManageDR responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createManageDrPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("stand_by_redeploy"), "testString");
    assertEquals(Boolean.valueOf(query.get("accepts_incomplete")), Boolean.valueOf(true));
  }

  // Test the createManageDr operation with and without retries enabled
  @Test
  public void testCreateManageDrWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testCreateManageDrWOptions();

    drAutomationServiceService.disableRetries();
    testCreateManageDrWOptions();
  }

  // Test the createManageDr operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateManageDrNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.createManageDr(null).execute();
  }

  // Test the getLastOperation operation with a valid options model parameter
  @Test
  public void testGetLastOperationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"crn\": \"crn:v1:staging:public:power-dr-automation:global:a/2c5d7270091f495795350e9adfa8399c:86e0c9a9-80f4-4fcf-88a0-07643de01bb8::\", \"deployment_name\": \"dr-deployment-instance-1\", \"last_updated_orchestrator_deployment_time\": \"2025-10-16T09:28:13.696Z\", \"last_updated_standby_orchestrator_deployment_time\": \"2025-10-16T09:28:13.696Z\", \"mfa_enabled\": \"true\", \"orch_ext_connectivity_status\": \"Connected\", \"orch_standby_node_addtion_status\": \"Completed\", \"orchestrator_cluster_message\": \"Cluster healthy\", \"orchestrator_config_status\": \"Configured\", \"orchestrator_ha\": true, \"plan_name\": \"DR Automation Private Plan\", \"primary_description\": \"2/5: Creating primary orchestrator VM.\", \"primary_ip_address\": \"192.168.1.10\", \"primary_orchestrator_status\": \"orchestrator-VM-creation-in-progress\", \"recovery_location\": \"us-east\", \"resource_group\": \"Default\", \"standby_description\": \"1/4: Service instance is downloading orchestrator image for standby VM creation.\", \"standby_ip_address\": \"192.168.1.11\", \"standby_status\": \"downloading-orchestrator-image\", \"status\": \"Running\"}";
    String getLastOperationPath = "/drautomation/v1/last_operation/123456d3-1122-3344-b67d-4389b44b7bf9";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetLastOperationOptions model
    GetLastOperationOptions getLastOperationOptionsModel = new GetLastOperationOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .acceptLanguage("testString")
      .build();

    // Invoke getLastOperation() with a valid options model and verify the result
    Response<ServiceInstanceStatus> response = drAutomationServiceService.getLastOperation(getLastOperationOptionsModel).execute();
    assertNotNull(response);
    ServiceInstanceStatus responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLastOperationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getLastOperation operation with and without retries enabled
  @Test
  public void testGetLastOperationWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testGetLastOperationWOptions();

    drAutomationServiceService.disableRetries();
    testGetLastOperationWOptions();
  }

  // Test the getLastOperation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLastOperationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.getLastOperation(null).execute();
  }

  // Test the listEvents operation with a valid options model parameter
  @Test
  public void testListEventsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"events\": [{\"action\": \"create\", \"api_source\": \"dr-automation-api\", \"event_id\": \"1cecfe43-43cd-4b1b-86be-30c2d3d2a25f\", \"level\": \"info\", \"message\": \"Service Instance created successfully\", \"message_data\": {\"anyKey\": \"anyValue\"}, \"metadata\": {\"anyKey\": \"anyValue\"}, \"resource\": \"ProvisionID\", \"time\": \"2025-06-23T07:12:49.840Z\", \"timestamp\": \"1750662769\", \"user\": {\"email\": \"abcuser@ibm.com\", \"name\": \"abcuser\", \"user_id\": \"IBMid-695000abc7E\"}}]}";
    String listEventsPath = "/drautomation/v1/service_instances/123456d3-1122-3344-b67d-4389b44b7bf9/events";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListEventsOptions model
    ListEventsOptions listEventsOptionsModel = new ListEventsOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .time("2025-06-19T23:59:59Z")
      .fromTime("2025-06-19T00:00:00Z")
      .toTime("2025-06-19T23:59:59Z")
      .acceptLanguage("testString")
      .build();

    // Invoke listEvents() with a valid options model and verify the result
    Response<EventCollection> response = drAutomationServiceService.listEvents(listEventsOptionsModel).execute();
    assertNotNull(response);
    EventCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listEventsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("time"), "2025-06-19T23:59:59Z");
    assertEquals(query.get("from_time"), "2025-06-19T00:00:00Z");
    assertEquals(query.get("to_time"), "2025-06-19T23:59:59Z");
  }

  // Test the listEvents operation with and without retries enabled
  @Test
  public void testListEventsWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testListEventsWOptions();

    drAutomationServiceService.disableRetries();
    testListEventsWOptions();
  }

  // Test the listEvents operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListEventsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.listEvents(null).execute();
  }

  // Test the getEvent operation with a valid options model parameter
  @Test
  public void testGetEventWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"create\", \"api_source\": \"dr-automation-api\", \"event_id\": \"1cecfe43-43cd-4b1b-86be-30c2d3d2a25f\", \"level\": \"info\", \"message\": \"Service Instance created successfully\", \"message_data\": {\"anyKey\": \"anyValue\"}, \"metadata\": {\"anyKey\": \"anyValue\"}, \"resource\": \"ProvisionID\", \"time\": \"2025-06-23T07:12:49.840Z\", \"timestamp\": \"1750662769\", \"user\": {\"email\": \"abcuser@ibm.com\", \"name\": \"abcuser\", \"user_id\": \"IBMid-695000abc7E\"}}";
    String getEventPath = "/drautomation/v1/service_instances/123456d3-1122-3344-b67d-4389b44b7bf9/events/00116b2a-9326-4024-839e-fb5364b76898";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetEventOptions model
    GetEventOptions getEventOptionsModel = new GetEventOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .eventId("00116b2a-9326-4024-839e-fb5364b76898")
      .acceptLanguage("testString")
      .build();

    // Invoke getEvent() with a valid options model and verify the result
    Response<Event> response = drAutomationServiceService.getEvent(getEventOptionsModel).execute();
    assertNotNull(response);
    Event responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEventPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getEvent operation with and without retries enabled
  @Test
  public void testGetEventWRetries() throws Throwable {
    drAutomationServiceService.enableRetries(4, 30);
    testGetEventWOptions();

    drAutomationServiceService.disableRetries();
    testGetEventWOptions();
  }

  // Test the getEvent operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetEventNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    drAutomationServiceService.getEvent(null).execute();
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
    drAutomationServiceService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    drAutomationServiceService = DrAutomationService.newInstance(serviceName);
    String url = server.url("/").toString();
    drAutomationServiceService.setServiceUrl(url);
  }
}