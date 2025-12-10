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

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model.GetDrLocationsOptions;
import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetDrLocationsOptions model.
 */
public class GetDrLocationsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetDrLocationsOptions() throws Throwable {
    GetDrLocationsOptions getDrLocationsOptionsModel = new GetDrLocationsOptions.Builder()
      .instanceId("123456d3-1122-3344-b67d-4389b44b7bf9")
      .acceptLanguage("testString")
      .build();
    assertEquals(getDrLocationsOptionsModel.instanceId(), "123456d3-1122-3344-b67d-4389b44b7bf9");
    assertEquals(getDrLocationsOptionsModel.acceptLanguage(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDrLocationsOptionsError() throws Throwable {
    new GetDrLocationsOptions.Builder().build();
  }

}