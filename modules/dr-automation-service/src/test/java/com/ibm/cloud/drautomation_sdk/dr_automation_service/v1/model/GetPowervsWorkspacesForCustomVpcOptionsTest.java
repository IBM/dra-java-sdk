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

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetPowervsWorkspacesForCustomVpcOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetPowervsWorkspacesForCustomVpcOptions model.
 */
public class GetPowervsWorkspacesForCustomVpcOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetPowervsWorkspacesForCustomVpcOptions() throws Throwable {
    GetPowervsWorkspacesForCustomVpcOptions getPowervsWorkspacesForCustomVpcOptionsModel = new GetPowervsWorkspacesForCustomVpcOptions.Builder()
      .instanceId("crn:v1:staging:public:power-dr-automation:global:a/a123456fb04ceebfb4a9fd38c22334455:123456d3-1122-3344-b67d-4389b44b7bf9::")
      .locationId("testString")
      .vpcId("r006-2f3b3ab9-2149-49cc-83a1-30a5d93d59b2")
      .tgId("925a7b81-a826-4d0a-8ef9-7496e9dc58bc")
      .ifNoneMatch("testString")
      .build();
    assertEquals(getPowervsWorkspacesForCustomVpcOptionsModel.instanceId(), "crn:v1:staging:public:power-dr-automation:global:a/a123456fb04ceebfb4a9fd38c22334455:123456d3-1122-3344-b67d-4389b44b7bf9::");
    assertEquals(getPowervsWorkspacesForCustomVpcOptionsModel.locationId(), "testString");
    assertEquals(getPowervsWorkspacesForCustomVpcOptionsModel.vpcId(), "r006-2f3b3ab9-2149-49cc-83a1-30a5d93d59b2");
    assertEquals(getPowervsWorkspacesForCustomVpcOptionsModel.tgId(), "925a7b81-a826-4d0a-8ef9-7496e9dc58bc");
    assertEquals(getPowervsWorkspacesForCustomVpcOptionsModel.ifNoneMatch(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPowervsWorkspacesForCustomVpcOptionsError() throws Throwable {
    new GetPowervsWorkspacesForCustomVpcOptions.Builder().build();
  }

}