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

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
import com.ibm.cloud.drautomation_sdk.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

/**
 * Integration test class for the DrAutomationService service.
 */
public class DrAutomationServiceIT extends SdkIntegrationTestBase {
  public DrAutomationService service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../dr_automation_service_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = DrAutomationService.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(DrAutomationService.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testUpdateApikey() throws Exception {
    try {
      UpdateApikeyOptions updateApikeyOptions = new UpdateApikeyOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .apiKey("adfadfdsafsdfdsf")
        .acceptLanguage("testString")
        .build();

      // Invoke operation
      Response<ValidationKeyResponse> response = service.updateApikey(updateApikeyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ValidationKeyResponse validationKeyResponseResult = response.getResult();
      assertNotNull(validationKeyResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateApikey" })
  public void testGetDrGrsLocationPair() throws Exception {
    try {
      GetDrGrsLocationPairOptions getDrGrsLocationPairOptions = new GetDrGrsLocationPairOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .acceptLanguage("testString")
        .build();

      // Invoke operation
      Response<GetGRSLocationPairResponse> response = service.getDrGrsLocationPair(getDrGrsLocationPairOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetGRSLocationPairResponse getGrsLocationPairResponseResult = response.getResult();
      assertNotNull(getGrsLocationPairResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDrGrsLocationPair" })
  public void testGetDrLocations() throws Exception {
    try {
      GetDrLocationsOptions getDrLocationsOptions = new GetDrLocationsOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .acceptLanguage("testString")
        .build();

      // Invoke operation
      Response<GetDrLocationsResponse> response = service.getDrLocations(getDrLocationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetDrLocationsResponse getDrLocationsResponseResult = response.getResult();
      assertNotNull(getDrLocationsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDrLocations" })
  public void testGetDrManagedVm() throws Exception {
    try {
      GetDrManagedVmOptions getDrManagedVmOptions = new GetDrManagedVmOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .acceptLanguage("testString")
        .build();

      // Invoke operation
      Response<ManagedVmMapResponse> response = service.getDrManagedVm(getDrManagedVmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ManagedVmMapResponse managedVmMapResponseResult = response.getResult();
      assertNotNull(managedVmMapResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDrManagedVm" })
  public void testGetDrSummary() throws Exception {
    try {
      GetDrSummaryOptions getDrSummaryOptions = new GetDrSummaryOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .acceptLanguage("testString")
        .build();

      // Invoke operation
      Response<DrAutomationGetSummaryResponse> response = service.getDrSummary(getDrSummaryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DrAutomationGetSummaryResponse drAutomationGetSummaryResponseResult = response.getResult();
      assertNotNull(drAutomationGetSummaryResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDrSummary" })
  public void testGetMachineType() throws Exception {
    try {
      GetMachineTypeOptions getMachineTypeOptions = new GetMachineTypeOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .primaryWorkspaceName("Test-workspace-wdc06")
        .acceptLanguage("testString")
        .standbyWorkspaceName("Test-workspace-wdc07")
        .build();

      // Invoke operation
      Response<MachineTypesByWorkspace> response = service.getMachineType(getMachineTypeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MachineTypesByWorkspace machineTypesByWorkspaceResult = response.getResult();
      assertNotNull(machineTypesByWorkspaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMachineType" })
  public void testGetPowervsWorkspaces() throws Exception {
    try {
      GetPowervsWorkspacesOptions getPowervsWorkspacesOptions = new GetPowervsWorkspacesOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .locationId("testString")
        .build();

      // Invoke operation
      Response<DrData> response = service.getPowervsWorkspaces(getPowervsWorkspacesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DrData drDataResult = response.getResult();
      assertNotNull(drDataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPowervsWorkspaces" })
  public void testCreateManageDr() throws Exception {
    try {
      CreateManageDrOptions createManageDrOptions = new CreateManageDrOptions.Builder()
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

      // Invoke operation
      Response<ServiceInstanceManageDR> response = service.createManageDr(createManageDrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServiceInstanceManageDR serviceInstanceManageDrResult = response.getResult();
      assertNotNull(serviceInstanceManageDrResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateManageDr" })
  public void testGetLastOperation() throws Exception {
    try {
      GetLastOperationOptions getLastOperationOptions = new GetLastOperationOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .acceptLanguage("testString")
        .build();

      // Invoke operation
      Response<ServiceInstanceStatus> response = service.getLastOperation(getLastOperationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServiceInstanceStatus serviceInstanceStatusResult = response.getResult();
      assertNotNull(serviceInstanceStatusResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLastOperation" })
  public void testListEvents() throws Exception {
    try {
      ListEventsOptions listEventsOptions = new ListEventsOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .time("2025-06-19T23:59:59Z")
        .fromTime("2025-06-19T00:00:00Z")
        .toTime("2025-06-19T23:59:59Z")
        .acceptLanguage("testString")
        .build();

      // Invoke operation
      Response<EventCollection> response = service.listEvents(listEventsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EventCollection eventCollectionResult = response.getResult();
      assertNotNull(eventCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListEvents" })
  public void testGetEvent() throws Exception {
    try {
      GetEventOptions getEventOptions = new GetEventOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .eventId("00116b2a-9326-4024-839e-fb5364b76898")
        .acceptLanguage("testString")
        .build();

      // Invoke operation
      Response<Event> response = service.getEvent(getEventOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Event eventResult = response.getResult();
      assertNotNull(eventResult);

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
