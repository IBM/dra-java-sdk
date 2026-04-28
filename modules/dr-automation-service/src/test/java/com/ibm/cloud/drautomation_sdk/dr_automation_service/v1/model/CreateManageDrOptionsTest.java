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

package com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model;

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.CreateManageDrOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateManageDrOptions model.
 */
public class CreateManageDrOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateManageDrOptions() throws Throwable {
    CreateManageDrOptions createManageDrOptionsModel = new CreateManageDrOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .locationId("dal10")
      .machineType("bx2-4x16")
      .orchestratorLocationType("off-premises")
      .orchestratorName("adminUser")
      .orchestratorPassword("testString")
      .orchestratorWorkspaceId("orch-workspace-01")
      .apiKey("testString")
      .managedApikey("testString")
      .clientId("abcd-97d2-1234-bf62-8eaecc67a1234")
      .clientSecret("abcd1234xM1y123wK6qR9123456789bE2jG0pabcdefgh")
      .guid("123e4567-e89b-12d3-a456-426614174000")
      .orchestratorHa(true)
      .orchestratorNetworkIds(java.util.Arrays.asList("d9c7f1ab-47b2-4e6f-b0a8-9d2e5d7f5678", "8ab29d71-8321-44d4-9cae-119fdc30a8ab"))
      .orchestratorWorkspaceLocation("us-south")
      .proxyIp("10.40.30.10:8888")
      .regionId("us-south")
      .resourceInstance("crn:v1:bluemix:public:resource-controller:us-south:a/123456fb04ceebfb4a9fd38c22334455:resource-instance::")
      .secondaryWorkspaceId("secondary-workspace789")
      .secret("testString")
      .secretGroup("default-secret-group")
      .sshKeyName("sshkey-name")
      .standbyMachineType("bx2-8x32")
      .standbyOrchestratorName("standbyAdmin")
      .standbyOrchestratorNetworkIds(java.util.Arrays.asList("d9c7f1ab-47b2-4e6f-b0a8-9d2e5d7f5678", "8ab29d71-8321-44d4-9cae-119fdc30a8ab"))
      .standbySshKeyName("standby-sshkey-name")
      .standbyOrchestratorWorkspaceId("orch-standby-02")
      .standbyOrchestratorWorkspaceLocation("us-east")
      .standbyTier("Premium")
      .tenantName("xxx.ibm.com")
      .tier("Standard")
      .standByRedeploy("testString")
      .acceptLanguage("testString")
      .acceptsIncomplete(true)
      .build();
    assertEquals(createManageDrOptionsModel.instanceId(), "123456d3-1122-3344-b67d-4389b44b7bf9");
    assertEquals(createManageDrOptionsModel.locationId(), "dal10");
    assertEquals(createManageDrOptionsModel.machineType(), "bx2-4x16");
    assertEquals(createManageDrOptionsModel.orchestratorLocationType(), "off-premises");
    assertEquals(createManageDrOptionsModel.orchestratorName(), "adminUser");
    assertEquals(createManageDrOptionsModel.orchestratorPassword(), "testString");
    assertEquals(createManageDrOptionsModel.orchestratorWorkspaceId(), "orch-workspace-01");
    assertEquals(createManageDrOptionsModel.apiKey(), "testString");
    assertEquals(createManageDrOptionsModel.managedApikey(), "testString");
    assertEquals(createManageDrOptionsModel.clientId(), "abcd-97d2-1234-bf62-8eaecc67a1234");
    assertEquals(createManageDrOptionsModel.clientSecret(), "abcd1234xM1y123wK6qR9123456789bE2jG0pabcdefgh");
    assertEquals(createManageDrOptionsModel.guid(), "123e4567-e89b-12d3-a456-426614174000");
    assertEquals(createManageDrOptionsModel.orchestratorHa(), Boolean.valueOf(true));
    assertEquals(createManageDrOptionsModel.orchestratorNetworkIds(), java.util.Arrays.asList("d9c7f1ab-47b2-4e6f-b0a8-9d2e5d7f5678", "8ab29d71-8321-44d4-9cae-119fdc30a8ab"));
    assertEquals(createManageDrOptionsModel.orchestratorWorkspaceLocation(), "us-south");
    assertEquals(createManageDrOptionsModel.proxyIp(), "10.40.30.10:8888");
    assertEquals(createManageDrOptionsModel.regionId(), "us-south");
    assertEquals(createManageDrOptionsModel.resourceInstance(), "crn:v1:bluemix:public:resource-controller:us-south:a/123456fb04ceebfb4a9fd38c22334455:resource-instance::");
    assertEquals(createManageDrOptionsModel.secondaryWorkspaceId(), "secondary-workspace789");
    assertEquals(createManageDrOptionsModel.secret(), "testString");
    assertEquals(createManageDrOptionsModel.secretGroup(), "default-secret-group");
    assertEquals(createManageDrOptionsModel.sshKeyName(), "sshkey-name");
    assertEquals(createManageDrOptionsModel.standbyMachineType(), "bx2-8x32");
    assertEquals(createManageDrOptionsModel.standbyOrchestratorName(), "standbyAdmin");
    assertEquals(createManageDrOptionsModel.standbyOrchestratorNetworkIds(), java.util.Arrays.asList("d9c7f1ab-47b2-4e6f-b0a8-9d2e5d7f5678", "8ab29d71-8321-44d4-9cae-119fdc30a8ab"));
    assertEquals(createManageDrOptionsModel.standbySshKeyName(), "standby-sshkey-name");
    assertEquals(createManageDrOptionsModel.standbyOrchestratorWorkspaceId(), "orch-standby-02");
    assertEquals(createManageDrOptionsModel.standbyOrchestratorWorkspaceLocation(), "us-east");
    assertEquals(createManageDrOptionsModel.standbyTier(), "Premium");
    assertEquals(createManageDrOptionsModel.tenantName(), "xxx.ibm.com");
    assertEquals(createManageDrOptionsModel.tier(), "Standard");
    assertEquals(createManageDrOptionsModel.standByRedeploy(), "testString");
    assertEquals(createManageDrOptionsModel.acceptLanguage(), "testString");
    assertEquals(createManageDrOptionsModel.acceptsIncomplete(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateManageDrOptionsError() throws Throwable {
    new CreateManageDrOptions.Builder().build();
  }

}