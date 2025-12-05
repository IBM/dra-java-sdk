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

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.OrchestratorDetails;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the OrchestratorDetails model.
 */
public class OrchestratorDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOrchestratorDetails() throws Throwable {
    OrchestratorDetails orchestratorDetailsModel = new OrchestratorDetails();
    assertNull(orchestratorDetailsModel.getLastUpdatedOrchestratorDeploymentTime());
    assertNull(orchestratorDetailsModel.getLastUpdatedStandbyOrchestratorDeploymentTime());
    assertNull(orchestratorDetailsModel.getLatestOrchestratorTime());
    assertNull(orchestratorDetailsModel.getLocationId());
    assertNull(orchestratorDetailsModel.getMfaEnabled());
    assertNull(orchestratorDetailsModel.getOrchExtConnectivityStatus());
    assertNull(orchestratorDetailsModel.getOrchStandbyNodeAdditionStatus());
    assertNull(orchestratorDetailsModel.getOrchestratorClusterMessage());
    assertNull(orchestratorDetailsModel.getOrchestratorConfigStatus());
    assertNull(orchestratorDetailsModel.getOrchestratorGroupLeader());
    assertNull(orchestratorDetailsModel.getOrchestratorLocationType());
    assertNull(orchestratorDetailsModel.getOrchestratorName());
    assertNull(orchestratorDetailsModel.getOrchestratorStatus());
    assertNull(orchestratorDetailsModel.getOrchestratorWorkspaceName());
    assertNull(orchestratorDetailsModel.getProxyIp());
    assertNull(orchestratorDetailsModel.getSchematicWorkspaceName());
    assertNull(orchestratorDetailsModel.getSchematicWorkspaceStatus());
    assertNull(orchestratorDetailsModel.getSshKeyName());
    assertNull(orchestratorDetailsModel.getStandbyOrchestratorName());
    assertNull(orchestratorDetailsModel.getStandbyOrchestratorStatus());
    assertNull(orchestratorDetailsModel.getStandbyOrchestratorWorkspaceName());
    assertNull(orchestratorDetailsModel.getTransitGatewayName());
    assertNull(orchestratorDetailsModel.getVpcName());
  }
}