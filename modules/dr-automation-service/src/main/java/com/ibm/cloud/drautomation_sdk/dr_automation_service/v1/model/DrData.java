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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The list of primary and standby disaster recovery Power virtual server workspaces.
 */
public class DrData extends GenericModel {

  @SerializedName("dr_standby_workspace_description")
  protected Object drStandbyWorkspaceDescription;
  @SerializedName("dr_standby_workspaces")
  protected List<DRStandbyWorkspace> drStandbyWorkspaces;
  @SerializedName("dr_workspace_description")
  protected Object drWorkspaceDescription;
  @SerializedName("dr_workspaces")
  protected List<DRWorkspace> drWorkspaces;

  protected DrData() { }

  /**
   * Gets the drStandbyWorkspaceDescription.
   *
   * Description of Standby Workspace.
   *
   * @return the drStandbyWorkspaceDescription
   */
  public Object getDrStandbyWorkspaceDescription() {
    return drStandbyWorkspaceDescription;
  }

  /**
   * Gets the drStandbyWorkspaces.
   *
   * The list of standby disaster recovery workspaces.
   *
   * @return the drStandbyWorkspaces
   */
  public List<DRStandbyWorkspace> getDrStandbyWorkspaces() {
    return drStandbyWorkspaces;
  }

  /**
   * Gets the drWorkspaceDescription.
   *
   * Description of Workspace.
   *
   * @return the drWorkspaceDescription
   */
  public Object getDrWorkspaceDescription() {
    return drWorkspaceDescription;
  }

  /**
   * Gets the drWorkspaces.
   *
   * The list of primary disaster recovery workspaces.
   *
   * @return the drWorkspaces
   */
  public List<DRWorkspace> getDrWorkspaces() {
    return drWorkspaces;
  }
}

