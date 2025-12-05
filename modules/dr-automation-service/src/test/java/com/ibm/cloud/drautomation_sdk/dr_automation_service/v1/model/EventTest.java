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

import static org.testng.Assert.assertNull;
import org.testng.annotations.Test;

import com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;

/**
 * Unit test class for the Event model.
 */
public class EventTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEvent() throws Throwable {
    Event eventModel = new Event();
    assertNull(eventModel.getAction());
    assertNull(eventModel.getApiSource());
    assertNull(eventModel.getEventId());
    assertNull(eventModel.getLevel());
    assertNull(eventModel.getMessage());
    assertNull(eventModel.getMessageData());
    assertNull(eventModel.getMetadata());
    assertNull(eventModel.getResource());
    assertNull(eventModel.getTime());
    assertNull(eventModel.getTimestamp());
    assertNull(eventModel.getUser());
  }
}