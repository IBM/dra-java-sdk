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

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetEventOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetEventOptions model.
 */
public class GetEventOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetEventOptions() throws Throwable {
    GetEventOptions getEventOptionsModel = new GetEventOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .eventId("00116b2a-9326-4024-839e-fb5364b76898")
      .acceptLanguage("testString")
      .build();
    assertEquals(getEventOptionsModel.instanceId(), "123456d3-1122-3344-b67d-4389b44b7bf9");
    assertEquals(getEventOptionsModel.eventId(), "00116b2a-9326-4024-839e-fb5364b76898");
    assertEquals(getEventOptionsModel.acceptLanguage(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetEventOptionsError() throws Throwable {
    new GetEventOptions.Builder().build();
  }

}