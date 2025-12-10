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

package com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;

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
    assertEquals(createManageDrOptionsModel.instanceId(), "123456d3-1122-3344-b67d-4389b44b7bf9");
    assertEquals(createManageDrOptionsModel.locationId(), "dal10");
    assertEquals(createManageDrOptionsModel.machineType(), "bx2-4x16");
    assertEquals(createManageDrOptionsModel.orchestratorLocationType(), "off-premises");
    assertEquals(createManageDrOptionsModel.orchestratorName(), "adminUser");
    assertEquals(createManageDrOptionsModel.orchestratorPassword(), "testString");
    assertEquals(createManageDrOptionsModel.orchestratorWorkspaceId(), "orch-workspace-01");
    assertEquals(createManageDrOptionsModel.apiKey(), "testString");
    assertEquals(createManageDrOptionsModel.clientId(), "abcd-97d2-1234-bf62-8eaecc67a1234");
    assertEquals(createManageDrOptionsModel.clientSecret(), "abcd1234xM1y123wK6qR9123456789bE2jG0pabcdefgh");
    assertEquals(createManageDrOptionsModel.guid(), "123e4567-e89b-12d3-a456-426614174000");
    assertEquals(createManageDrOptionsModel.orchestratorHa(), Boolean.valueOf(true));
    assertEquals(createManageDrOptionsModel.proxyIp(), "10.40.30.10:8888");
    assertEquals(createManageDrOptionsModel.regionId(), "us-south");
    assertEquals(createManageDrOptionsModel.resourceInstance(), "crn:v1:bluemix:public:resource-controller::res123");
    assertEquals(createManageDrOptionsModel.secret(), "testString");
    assertEquals(createManageDrOptionsModel.secretGroup(), "default-secret-group");
    assertEquals(createManageDrOptionsModel.sshKeyName(), "my-ssh-key");
    assertEquals(createManageDrOptionsModel.standbyMachineType(), "bx2-8x32");
    assertEquals(createManageDrOptionsModel.standbyOrchestratorName(), "standbyAdmin");
    assertEquals(createManageDrOptionsModel.standbyOrchestratorWorkspaceId(), "orch-standby-02");
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