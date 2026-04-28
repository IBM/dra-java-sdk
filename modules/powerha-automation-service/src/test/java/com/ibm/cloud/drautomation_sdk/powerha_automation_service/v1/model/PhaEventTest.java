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

import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaEvent;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.PhaEventUser;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PhaEvent model.
 */
public class PhaEventTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPhaEvent() throws Throwable {
    PhaEvent phaEventModel = new PhaEvent();
    assertNull(phaEventModel.getAction());
    assertNull(phaEventModel.getApiSource());
    assertNull(phaEventModel.getEventId());
    assertNull(phaEventModel.getLevel());
    assertNull(phaEventModel.getMessage());
    assertNull(phaEventModel.getMessageData());
    assertNull(phaEventModel.getMetaData());
    assertNull(phaEventModel.getResource());
    assertNull(phaEventModel.getTime());
    assertNull(phaEventModel.getTimeStamp());
    assertNull(phaEventModel.getUser());
  }
}