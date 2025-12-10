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
public class DrAutomationServiceExamples {
  private static final Logger logger = LoggerFactory.getLogger(DrAutomationServiceExamples.class);
  protected DrAutomationServiceExamples() { }

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

    try {
      System.out.println("updateApikey() result:");
      // begin-update_apikey
      UpdateApikeyOptions updateApikeyOptions = new UpdateApikeyOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .apiKey("adfadfdsafsdfdsf")
        .build();

      Response<ValidationKeyResponse> response = drAutomationServiceService.updateApikey(updateApikeyOptions).execute();
      ValidationKeyResponse validationKeyResponse = response.getResult();

      System.out.println(validationKeyResponse);
      // end-update_apikey
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDrGrsLocationPair() result:");
      // begin-get_dr_grs_location_pair
      GetDrGrsLocationPairOptions getDrGrsLocationPairOptions = new GetDrGrsLocationPairOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .build();

      Response<GetGRSLocationPairResponse> response = drAutomationServiceService.getDrGrsLocationPair(getDrGrsLocationPairOptions).execute();
      GetGRSLocationPairResponse getGrsLocationPairResponse = response.getResult();

      System.out.println(getGrsLocationPairResponse);
      // end-get_dr_grs_location_pair
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDrLocations() result:");
      // begin-get_dr_locations
      GetDrLocationsOptions getDrLocationsOptions = new GetDrLocationsOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .build();

      Response<GetDrLocationsResponse> response = drAutomationServiceService.getDrLocations(getDrLocationsOptions).execute();
      GetDrLocationsResponse getDrLocationsResponse = response.getResult();

      System.out.println(getDrLocationsResponse);
      // end-get_dr_locations
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDrManagedVm() result:");
      // begin-get_dr_managed_vm
      GetDrManagedVmOptions getDrManagedVmOptions = new GetDrManagedVmOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .build();

      Response<ManagedVmMapResponse> response = drAutomationServiceService.getDrManagedVm(getDrManagedVmOptions).execute();
      ManagedVmMapResponse managedVmMapResponse = response.getResult();

      System.out.println(managedVmMapResponse);
      // end-get_dr_managed_vm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDrSummary() result:");
      // begin-get_dr_summary
      GetDrSummaryOptions getDrSummaryOptions = new GetDrSummaryOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .build();

      Response<DrAutomationGetSummaryResponse> response = drAutomationServiceService.getDrSummary(getDrSummaryOptions).execute();
      DrAutomationGetSummaryResponse drAutomationGetSummaryResponse = response.getResult();

      System.out.println(drAutomationGetSummaryResponse);
      // end-get_dr_summary
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getMachineType() result:");
      // begin-get_machine_type
      GetMachineTypeOptions getMachineTypeOptions = new GetMachineTypeOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .primaryWorkspaceName("Test-workspace-wdc06")
        .standbyWorkspaceName("Test-workspace-wdc07")
        .build();

      Response<MachineTypesByWorkspace> response = drAutomationServiceService.getMachineType(getMachineTypeOptions).execute();
      MachineTypesByWorkspace machineTypesByWorkspace = response.getResult();

      System.out.println(machineTypesByWorkspace);
      // end-get_machine_type
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPowervsWorkspaces() result:");
      // begin-get_powervs_workspaces
      GetPowervsWorkspacesOptions getPowervsWorkspacesOptions = new GetPowervsWorkspacesOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .locationId("testString")
        .build();

      Response<DrData> response = drAutomationServiceService.getPowervsWorkspaces(getPowervsWorkspacesOptions).execute();
      DrData drData = response.getResult();

      System.out.println(drData);
      // end-get_powervs_workspaces
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createManageDr() result:");
      // begin-create_manage_dr
      CreateManageDrOptions createManageDrOptions = new CreateManageDrOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .locationId("dal10")
        .machineType("bx2-4x16")
        .orchestratorLocationType("off-premises")
        .orchestratorName("drautomationprimaryjavah1")
        .orchestratorPassword("EverytimeNewPassword@1")
        .orchestratorWorkspaceId("75cbf05b-78f6-406e-afe7-a904f646d798")

        // OPTIONAL FIELDS (from the example and field documentation)
        .tier("tier1")
        .sshKeyName("vijaykey")
        .apiKey("apikey should be passed")

        // Standby optional fields
        .standbyOrchestratorName("drautomationstandbyjavah1")
        .standbyOrchestratorWorkspaceId("71027b79-0e31-44f6-a499-63eca1a66feb")
        .standbyMachineType("s922")
        .standbyTier("tier1")

        // MFA optional fields
        .clientId("123abcd-97d2-4b14-bf62-8eaecc67a122")
        .clientSecret("abcdefgT5rS8wK6qR9dD7vF1hU4sA3bE2jG0pL9oX7yC")
        .tenantName("xxx.ibm.com")

        // ADDITIONAL OPTIONAL FIELDS
        // .orchestratorHa(true)
        // .proxyIp("192.168.1.1")
        // .regionId("us-south")
        // .resourceInstance("my-resource-instance")
        // .secret("my-secret")
        // .secretGroup("my-secret-group")
        // .guid("guid-value")
        // .standByRedeploy("false")
        // .acceptLanguage("en")
        // .acceptsIncomplete(true)
        .build();

      Response<ServiceInstanceManageDR> response = drAutomationServiceService.createManageDr(createManageDrOptions).execute();
      ServiceInstanceManageDR serviceInstanceManageDr = response.getResult();

      System.out.println(serviceInstanceManageDr);
      // end-create_manage_dr
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLastOperation() result:");
      // begin-get_last_operation
      GetLastOperationOptions getLastOperationOptions = new GetLastOperationOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .build();

      Response<ServiceInstanceStatus> response = drAutomationServiceService.getLastOperation(getLastOperationOptions).execute();
      ServiceInstanceStatus serviceInstanceStatus = response.getResult();

      System.out.println(serviceInstanceStatus);
      // end-get_last_operation
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listEvents() result:");
      // begin-list_events
      ListEventsOptions listEventsOptions = new ListEventsOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .time("2025-06-19T23:59:59Z")
        .fromTime("2025-06-19T00:00:00Z")
        .toTime("2025-06-19T23:59:59Z")
        .build();

      Response<EventCollection> response = drAutomationServiceService.listEvents(listEventsOptions).execute();
      EventCollection eventCollection = response.getResult();

      System.out.println(eventCollection);
      // end-list_events
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getEvent() result:");
      // begin-get_event
      GetEventOptions getEventOptions = new GetEventOptions.Builder()
        .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
        .eventId("00116b2a-9326-4024-839e-fb5364b76898")
        .build();

      Response<Event> response = drAutomationServiceService.getEvent(getEventOptions).execute();
      Event event = response.getResult();

      System.out.println(event);
      // end-get_event
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
