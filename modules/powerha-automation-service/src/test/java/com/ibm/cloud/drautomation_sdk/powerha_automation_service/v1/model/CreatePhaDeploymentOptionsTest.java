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

import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.model.CreatePhaDeploymentOptions;
import com.ibm.cloud.drautomation_sdk.powerha_automation_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePhaDeploymentOptions model.
 */
public class CreatePhaDeploymentOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePhaDeploymentOptions() throws Throwable {
    CreatePhaDeploymentOptions createPhaDeploymentOptionsModel = new CreatePhaDeploymentOptions.Builder()
      .phaInstanceId("8eefautr-4c02-0009-0086-8bd4d8cf61b6")
      .locationId("loc-us-south-01")
      .primaryWorkspace("workspace-primary")
      .apiKey("123635364646fghrtfhbfdhb")
      .clusterType("standard")
      .configureType("automatic")
      .primaryClusterNodes(java.util.Arrays.asList("ede4c36e-002c-48da-992e-6039d230c478"))
      .standbyClusterNodes(java.util.Arrays.asList("843a8e1f-05bb-4164-8c73-de39e016c2b4"))
      .primaryLocation("us-south")
      .secondaryLocation("us-east")
      .secondaryWorkspace("workspace-secondary")
      .acceptLanguage("en-US")
      .ifNoneMatch("abcdef")
      .build();
    assertEquals(createPhaDeploymentOptionsModel.phaInstanceId(), "8eefautr-4c02-0009-0086-8bd4d8cf61b6");
    assertEquals(createPhaDeploymentOptionsModel.locationId(), "loc-us-south-01");
    assertEquals(createPhaDeploymentOptionsModel.primaryWorkspace(), "workspace-primary");
    assertEquals(createPhaDeploymentOptionsModel.apiKey(), "123635364646fghrtfhbfdhb");
    assertEquals(createPhaDeploymentOptionsModel.clusterType(), "standard");
    assertEquals(createPhaDeploymentOptionsModel.configureType(), "automatic");
    assertEquals(createPhaDeploymentOptionsModel.primaryClusterNodes(), java.util.Arrays.asList("ede4c36e-002c-48da-992e-6039d230c478"));
    assertEquals(createPhaDeploymentOptionsModel.standbyClusterNodes(), java.util.Arrays.asList("843a8e1f-05bb-4164-8c73-de39e016c2b4"));
    assertEquals(createPhaDeploymentOptionsModel.primaryLocation(), "us-south");
    assertEquals(createPhaDeploymentOptionsModel.secondaryLocation(), "us-east");
    assertEquals(createPhaDeploymentOptionsModel.secondaryWorkspace(), "workspace-secondary");
    assertEquals(createPhaDeploymentOptionsModel.acceptLanguage(), "en-US");
    assertEquals(createPhaDeploymentOptionsModel.ifNoneMatch(), "abcdef");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePhaDeploymentOptionsError() throws Throwable {
    new CreatePhaDeploymentOptions.Builder().build();
  }

}