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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about a cluster node participating in the PHA environment.
 */
public class ClusterNodeInfo extends GenericModel {

  @SerializedName("agent_status")
  protected String agentStatus;
  protected Float cores;
  @SerializedName("ip_address")
  protected String ipAddress;
  protected Long memory;
  @SerializedName("pha_level")
  protected String phaLevel;
  protected String region;
  @SerializedName("vm_id")
  protected String vmId;
  @SerializedName("vm_name")
  protected String vmName;
  @SerializedName("vm_status")
  protected String vmStatus;
  @SerializedName("workspace_id")
  protected String workspaceId;

  protected ClusterNodeInfo() { }

  /**
   * Gets the agentStatus.
   *
   * Status of the PHA agent running on the node.
   *
   * @return the agentStatus
   */
  public String getAgentStatus() {
    return agentStatus;
  }

  /**
   * Gets the cores.
   *
   * Number of CPU cores allocated to the node.
   *
   * @return the cores
   */
  public Float getCores() {
    return cores;
  }

  /**
   * Gets the ipAddress.
   *
   * IP address assigned to the virtual machine.
   *
   * @return the ipAddress
   */
  public String getIpAddress() {
    return ipAddress;
  }

  /**
   * Gets the memory.
   *
   * Memory allocated to the virtual machine in MB or GB.
   *
   * @return the memory
   */
  public Long getMemory() {
    return memory;
  }

  /**
   * Gets the phaLevel.
   *
   * PowerHA version level installed on the node.
   *
   * @return the phaLevel
   */
  public String getPhaLevel() {
    return phaLevel;
  }

  /**
   * Gets the region.
   *
   * Region where the virtual machine is deployed.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the vmId.
   *
   * Unique identifier of the virtual machine.
   *
   * @return the vmId
   */
  public String getVmId() {
    return vmId;
  }

  /**
   * Gets the vmName.
   *
   * Name of the virtual machine.
   *
   * @return the vmName
   */
  public String getVmName() {
    return vmName;
  }

  /**
   * Gets the vmStatus.
   *
   * Current operational status of the virtual machine.
   *
   * @return the vmStatus
   */
  public String getVmStatus() {
    return vmStatus;
  }

  /**
   * Gets the workspaceId.
   *
   * Workspace identifier associated with the node.
   *
   * @return the workspaceId
   */
  public String getWorkspaceId() {
    return workspaceId;
  }
}

