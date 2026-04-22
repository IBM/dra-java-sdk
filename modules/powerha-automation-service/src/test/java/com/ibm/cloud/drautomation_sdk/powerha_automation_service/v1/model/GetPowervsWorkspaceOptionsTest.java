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

import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.GetPowervsWorkspaceOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetPowervsWorkspaceOptions model.
 */
public class GetPowervsWorkspaceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetPowervsWorkspaceOptions() throws Throwable {
    GetPowervsWorkspaceOptions getPowervsWorkspaceOptionsModel = new GetPowervsWorkspaceOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .locationId("us-south")
      .acceptLanguage("en-US")
      .ifNoneMatch("abcdef")
      .build();
    assertEquals(getPowervsWorkspaceOptionsModel.phaInstanceId(), "8eefautr-4c02-0009-0086-8bd4d8cf61b6");
    assertEquals(getPowervsWorkspaceOptionsModel.locationId(), "us-south");
    assertEquals(getPowervsWorkspaceOptionsModel.acceptLanguage(), "en-US");
    assertEquals(getPowervsWorkspaceOptionsModel.ifNoneMatch(), "abcdef");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPowervsWorkspaceOptionsError() throws Throwable {
    new GetPowervsWorkspaceOptions.Builder().build();
  }

}