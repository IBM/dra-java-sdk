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

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.ServiceInstanceManageDR;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ServiceInstanceManageDR model.
 */
public class ServiceInstanceManageDRTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServiceInstanceManageDR() throws Throwable {
    ServiceInstanceManageDR serviceInstanceManageDrModel = new ServiceInstanceManageDR();
    assertNull(serviceInstanceManageDrModel.getDashboardUrl());
    assertNull(serviceInstanceManageDrModel.getId());
    assertNull(serviceInstanceManageDrModel.getOrchestratorLocationType());
    assertNull(serviceInstanceManageDrModel.getLocationId());
    assertNull(serviceInstanceManageDrModel.getSshKeyName());
    assertNull(serviceInstanceManageDrModel.getStandbySshKeyName());
    assertNull(serviceInstanceManageDrModel.getOrchestratorName());
    assertNull(serviceInstanceManageDrModel.getOrchestratorWorkspaceId());
    assertNull(serviceInstanceManageDrModel.getStandbyOrchestratorName());
    assertNull(serviceInstanceManageDrModel.getStandbyOrchestratorWorkspaceId());
    assertNull(serviceInstanceManageDrModel.isOrchestratorHa());
    assertNull(serviceInstanceManageDrModel.getResourceInstance());
    assertNull(serviceInstanceManageDrModel.getSecretGroup());
    assertNull(serviceInstanceManageDrModel.getSecret());
    assertNull(serviceInstanceManageDrModel.getRegionId());
    assertNull(serviceInstanceManageDrModel.getGuid());
    assertNull(serviceInstanceManageDrModel.getMachineType());
    assertNull(serviceInstanceManageDrModel.getTier());
    assertNull(serviceInstanceManageDrModel.getStandbyTier());
    assertNull(serviceInstanceManageDrModel.getStandbyMachineType());
    assertNull(serviceInstanceManageDrModel.getTenantName());
    assertNull(serviceInstanceManageDrModel.getProxyIp());
  }
}