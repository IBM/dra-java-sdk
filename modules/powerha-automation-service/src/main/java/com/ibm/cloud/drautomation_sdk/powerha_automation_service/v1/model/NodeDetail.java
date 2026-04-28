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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of a virtual machine (VM) participating in the cluster.
 */
public class NodeDetail extends GenericModel {

  @SerializedName("agent_status")
  protected String agentStatus;
  protected Float cores;
  @SerializedName("ip_addresses")
  protected List<String> ipAddresses;
  protected Float memory;
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

  protected NodeDetail() { }

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
   * Number of CPU cores allocated to the VM.
   *
   * @return the cores
   */
  public Float getCores() {
    return cores;
  }

  /**
   * Gets the ipAddresses.
   *
   * List of IP addresses assigned to the VM.
   *
   * @return the ipAddresses
   */
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  /**
   * Gets the memory.
   *
   * Amount of memory allocated to the VM (in GB).
   *
   * @return the memory
   */
  public Float getMemory() {
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
   * Region where the VM is deployed.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the vmId.
   *
   * Unique identifier of the VM.
   *
   * @return the vmId
   */
  public String getVmId() {
    return vmId;
  }

  /**
   * Gets the vmName.
   *
   * Name of the VM.
   *
   * @return the vmName
   */
  public String getVmName() {
    return vmName;
  }

  /**
   * Gets the vmStatus.
   *
   * Current status of the VM.
   *
   * @return the vmStatus
   */
  public String getVmStatus() {
    return vmStatus;
  }

  /**
   * Gets the workspaceId.
   *
   * ID of the workspace associated with the VM.
   *
   * @return the workspaceId
   */
  public String getWorkspaceId() {
    return workspaceId;
  }
}

