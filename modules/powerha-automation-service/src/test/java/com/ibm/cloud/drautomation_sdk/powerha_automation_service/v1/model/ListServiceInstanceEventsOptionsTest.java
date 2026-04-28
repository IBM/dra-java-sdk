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

import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.ListServiceInstanceEventsOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListServiceInstanceEventsOptions model.
 */
public class ListServiceInstanceEventsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListServiceInstanceEventsOptions() throws Throwable {
    ListServiceInstanceEventsOptions listServiceInstanceEventsOptionsModel = new ListServiceInstanceEventsOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .time("2025-06-19T23:59:59Z")
      .fromTime("2025-06-19T00:00:00Z")
      .toTime("2025-06-19T23:59:59Z")
      .acceptLanguage("en-US")
      .ifNoneMatch("abcdef")
      .build();
    assertEquals(listServiceInstanceEventsOptionsModel.phaInstanceId(), "8eefautr-4c02-0009-0086-8bd4d8cf61b6");
    assertEquals(listServiceInstanceEventsOptionsModel.time(), "2025-06-19T23:59:59Z");
    assertEquals(listServiceInstanceEventsOptionsModel.fromTime(), "2025-06-19T00:00:00Z");
    assertEquals(listServiceInstanceEventsOptionsModel.toTime(), "2025-06-19T23:59:59Z");
    assertEquals(listServiceInstanceEventsOptionsModel.acceptLanguage(), "en-US");
    assertEquals(listServiceInstanceEventsOptionsModel.ifNoneMatch(), "abcdef");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListServiceInstanceEventsOptionsError() throws Throwable {
    new ListServiceInstanceEventsOptions.Builder().build();
  }

}