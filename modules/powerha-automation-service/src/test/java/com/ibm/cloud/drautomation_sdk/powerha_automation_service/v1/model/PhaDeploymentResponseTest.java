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

package com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model;

import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.ClusterNodeInfo;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaDeploymentResponse;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PhaDeploymentResponse model.
 */
public class PhaDeploymentResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPhaDeploymentResponse() throws Throwable {
    PhaDeploymentResponse phaDeploymentResponseModel = new PhaDeploymentResponse();
    assertNull(phaDeploymentResponseModel.getCloudAccountId());
    assertNull(phaDeploymentResponseModel.getConnectivityType());
    assertNull(phaDeploymentResponseModel.getCreationTime());
    assertNull(phaDeploymentResponseModel.getCustomNetwork());
    assertNull(phaDeploymentResponseModel.getDeprovisionTime());
    assertNull(phaDeploymentResponseModel.getGuid());
    assertNull(phaDeploymentResponseModel.isIsDuplicate());
    assertNull(phaDeploymentResponseModel.getPlanId());
    assertNull(phaDeploymentResponseModel.getPlanName());
    assertNull(phaDeploymentResponseModel.getPowerhaClusterName());
    assertNull(phaDeploymentResponseModel.getPowerhaClusterType());
    assertNull(phaDeploymentResponseModel.getPowerhaLevel());
    assertNull(phaDeploymentResponseModel.getPrimaryClusterNodesDetails());
    assertNull(phaDeploymentResponseModel.getPrimaryLocation());
    assertNull(phaDeploymentResponseModel.getPrimaryRegionName());
    assertNull(phaDeploymentResponseModel.getPrimaryWorkspace());
    assertNull(phaDeploymentResponseModel.getPrimaryWorkspaceName());
    assertNull(phaDeploymentResponseModel.getProvisionEndTime());
    assertNull(phaDeploymentResponseModel.getId());
    assertNull(phaDeploymentResponseModel.getProvisionStartTime());
    assertNull(phaDeploymentResponseModel.getProvisionStatus());
    assertNull(phaDeploymentResponseModel.getRegionId());
    assertNull(phaDeploymentResponseModel.getResourceGroup());
    assertNull(phaDeploymentResponseModel.getResourceGroupCrn());
    assertNull(phaDeploymentResponseModel.getResourceInstance());
    assertNull(phaDeploymentResponseModel.getSecondaryClusterNodes());
    assertNull(phaDeploymentResponseModel.getSecondaryLocation());
    assertNull(phaDeploymentResponseModel.getSecondaryWorkspace());
    assertNull(phaDeploymentResponseModel.getServiceDescription());
    assertNull(phaDeploymentResponseModel.getServiceId());
    assertNull(phaDeploymentResponseModel.getServiceName());
    assertNull(phaDeploymentResponseModel.getStandbyRegionName());
    assertNull(phaDeploymentResponseModel.getStandbyWorkspaceName());
    assertNull(phaDeploymentResponseModel.getUserTags());
  }
}