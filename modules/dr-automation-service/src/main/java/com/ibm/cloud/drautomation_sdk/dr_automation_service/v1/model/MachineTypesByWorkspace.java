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

import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The Response body containing machine types supported by power virtual server workspace.
 */
public class MachineTypesByWorkspace extends GenericModel {

  protected Map<String, List<String>> workspaces;

  protected MachineTypesByWorkspace() { }

  /**
   * Gets the workspaces.
   *
   * The Map of workspace IDs to lists of machine types.
   *
   * @return the workspaces
   */
  public Map<String, List<String>> getWorkspaces() {
    return workspaces;
  }
}

