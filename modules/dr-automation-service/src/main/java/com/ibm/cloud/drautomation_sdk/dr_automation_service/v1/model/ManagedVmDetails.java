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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The detailed information of a disaster recovery enabled virtual machines for the service.
 */
public class ManagedVmDetails extends GenericModel {

  protected String core;
  @SerializedName("dr_average_time")
  protected String drAverageTime;
  @SerializedName("dr_region")
  protected String drRegion;
  protected String memory;
  protected String region;
  @SerializedName("vm_name")
  protected String vmName;
  @SerializedName("workgroup_name")
  protected String workgroupName;
  @SerializedName("workspace_name")
  protected String workspaceName;

  protected ManagedVmDetails() { }

  /**
   * Gets the core.
   *
   * The Number of cores assigned to the managed vitual machine.
   *
   * @return the core
   */
  public String getCore() {
    return core;
  }

  /**
   * Gets the drAverageTime.
   *
   * The DR operation average time(in minutes) for the managed virtual machine.
   *
   * @return the drAverageTime
   */
  public String getDrAverageTime() {
    return drAverageTime;
  }

  /**
   * Gets the drRegion.
   *
   * The name of the region where the virtual machine is recovered.
   *
   * @return the drRegion
   */
  public String getDrRegion() {
    return drRegion;
  }

  /**
   * Gets the memory.
   *
   * The amount of memory (in GB) assigned to the managed virtual machine.
   *
   * @return the memory
   */
  public String getMemory() {
    return memory;
  }

  /**
   * Gets the region.
   *
   * The source region where the managed virtual machine is deployed.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the vmName.
   *
   * The name of the managed virtual machine.
   *
   * @return the vmName
   */
  public String getVmName() {
    return vmName;
  }

  /**
   * Gets the workgroupName.
   *
   * The name of the workgroup where the managed virtual machine is added for disaster recovery.
   *
   * @return the workgroupName
   */
  public String getWorkgroupName() {
    return workgroupName;
  }

  /**
   * Gets the workspaceName.
   *
   * The Name of the power virtual server workspace.
   *
   * @return the workspaceName
   */
  public String getWorkspaceName() {
    return workspaceName;
  }
}

