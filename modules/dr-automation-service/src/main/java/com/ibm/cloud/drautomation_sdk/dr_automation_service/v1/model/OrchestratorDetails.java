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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains details about the orchestrator configuration.
 */
public class OrchestratorDetails extends GenericModel {

  @SerializedName("last_updated_orchestrator_deployment_time")
  protected Date lastUpdatedOrchestratorDeploymentTime;
  @SerializedName("last_updated_standby_orchestrator_deployment_time")
  protected Date lastUpdatedStandbyOrchestratorDeploymentTime;
  @SerializedName("latest_orchestrator_time")
  protected Date latestOrchestratorTime;
  @SerializedName("location_id")
  protected String locationId;
  @SerializedName("mfa_enabled")
  protected String mfaEnabled;
  @SerializedName("orch_ext_connectivity_status")
  protected String orchExtConnectivityStatus;
  @SerializedName("orch_standby_node_addition_status")
  protected String orchStandbyNodeAdditionStatus;
  @SerializedName("orchestrator_cluster_message")
  protected String orchestratorClusterMessage;
  @SerializedName("orchestrator_config_status")
  protected String orchestratorConfigStatus;
  @SerializedName("orchestrator_group_leader")
  protected String orchestratorGroupLeader;
  @SerializedName("orchestrator_location_type")
  protected String orchestratorLocationType;
  @SerializedName("orchestrator_name")
  protected String orchestratorName;
  @SerializedName("orchestrator_status")
  protected String orchestratorStatus;
  @SerializedName("orchestrator_workspace_name")
  protected String orchestratorWorkspaceName;
  @SerializedName("proxy_ip")
  protected String proxyIp;
  @SerializedName("schematic_workspace_name")
  protected String schematicWorkspaceName;
  @SerializedName("schematic_workspace_status")
  protected String schematicWorkspaceStatus;
  @SerializedName("ssh_key_name")
  protected String sshKeyName;
  @SerializedName("standby_orchestrator_name")
  protected String standbyOrchestratorName;
  @SerializedName("standby_orchestrator_status")
  protected String standbyOrchestratorStatus;
  @SerializedName("standby_orchestrator_workspace_name")
  protected String standbyOrchestratorWorkspaceName;
  @SerializedName("transit_gateway_name")
  protected String transitGatewayName;
  @SerializedName("vpc_name")
  protected String vpcName;

  protected OrchestratorDetails() { }

  /**
   * Gets the lastUpdatedOrchestratorDeploymentTime.
   *
   * The deployment time of primary orchestrator VM.
   *
   * @return the lastUpdatedOrchestratorDeploymentTime
   */
  public Date getLastUpdatedOrchestratorDeploymentTime() {
    return lastUpdatedOrchestratorDeploymentTime;
  }

  /**
   * Gets the lastUpdatedStandbyOrchestratorDeploymentTime.
   *
   * The deployment time of StandBy orchestrator VM.
   *
   * @return the lastUpdatedStandbyOrchestratorDeploymentTime
   */
  public Date getLastUpdatedStandbyOrchestratorDeploymentTime() {
    return lastUpdatedStandbyOrchestratorDeploymentTime;
  }

  /**
   * Gets the latestOrchestratorTime.
   *
   * Latest Orchestrator Time in COS.
   *
   * @return the latestOrchestratorTime
   */
  public Date getLatestOrchestratorTime() {
    return latestOrchestratorTime;
  }

  /**
   * Gets the locationId.
   *
   * The unique identifier of location.
   *
   * @return the locationId
   */
  public String getLocationId() {
    return locationId;
  }

  /**
   * Gets the mfaEnabled.
   *
   * indicates if Multi Factor Authentication is enabled or not.
   *
   * @return the mfaEnabled
   */
  public String getMfaEnabled() {
    return mfaEnabled;
  }

  /**
   * Gets the orchExtConnectivityStatus.
   *
   * The external connectivity status of the orchestrator.
   *
   * @return the orchExtConnectivityStatus
   */
  public String getOrchExtConnectivityStatus() {
    return orchExtConnectivityStatus;
  }

  /**
   * Gets the orchStandbyNodeAdditionStatus.
   *
   * The status of standby node addition.
   *
   * @return the orchStandbyNodeAdditionStatus
   */
  public String getOrchStandbyNodeAdditionStatus() {
    return orchStandbyNodeAdditionStatus;
  }

  /**
   * Gets the orchestratorClusterMessage.
   *
   * The message regarding orchestrator cluster status.
   *
   * @return the orchestratorClusterMessage
   */
  public String getOrchestratorClusterMessage() {
    return orchestratorClusterMessage;
  }

  /**
   * Gets the orchestratorConfigStatus.
   *
   * The configuration status of the orchestrator.
   *
   * @return the orchestratorConfigStatus
   */
  public String getOrchestratorConfigStatus() {
    return orchestratorConfigStatus;
  }

  /**
   * Gets the orchestratorGroupLeader.
   *
   * The leader node of the orchestrator group.
   *
   * @return the orchestratorGroupLeader
   */
  public String getOrchestratorGroupLeader() {
    return orchestratorGroupLeader;
  }

  /**
   * Gets the orchestratorLocationType.
   *
   * The type of orchestrator Location.
   *
   * @return the orchestratorLocationType
   */
  public String getOrchestratorLocationType() {
    return orchestratorLocationType;
  }

  /**
   * Gets the orchestratorName.
   *
   * The name of the primary orchestrator.
   *
   * @return the orchestratorName
   */
  public String getOrchestratorName() {
    return orchestratorName;
  }

  /**
   * Gets the orchestratorStatus.
   *
   * The status of the primary orchestrator.
   *
   * @return the orchestratorStatus
   */
  public String getOrchestratorStatus() {
    return orchestratorStatus;
  }

  /**
   * Gets the orchestratorWorkspaceName.
   *
   * The name of the orchestrator workspace.
   *
   * @return the orchestratorWorkspaceName
   */
  public String getOrchestratorWorkspaceName() {
    return orchestratorWorkspaceName;
  }

  /**
   * Gets the proxyIp.
   *
   * The IP address of the proxy.
   *
   * @return the proxyIp
   */
  public String getProxyIp() {
    return proxyIp;
  }

  /**
   * Gets the schematicWorkspaceName.
   *
   * The name of the schematic workspace.
   *
   * @return the schematicWorkspaceName
   */
  public String getSchematicWorkspaceName() {
    return schematicWorkspaceName;
  }

  /**
   * Gets the schematicWorkspaceStatus.
   *
   * The status of the schematic workspace.
   *
   * @return the schematicWorkspaceStatus
   */
  public String getSchematicWorkspaceStatus() {
    return schematicWorkspaceStatus;
  }

  /**
   * Gets the sshKeyName.
   *
   * SSH key name used for the orchestrator.
   *
   * @return the sshKeyName
   */
  public String getSshKeyName() {
    return sshKeyName;
  }

  /**
   * Gets the standbyOrchestratorName.
   *
   * The name of the standby orchestrator.
   *
   * @return the standbyOrchestratorName
   */
  public String getStandbyOrchestratorName() {
    return standbyOrchestratorName;
  }

  /**
   * Gets the standbyOrchestratorStatus.
   *
   * The status of the standby orchestrator.
   *
   * @return the standbyOrchestratorStatus
   */
  public String getStandbyOrchestratorStatus() {
    return standbyOrchestratorStatus;
  }

  /**
   * Gets the standbyOrchestratorWorkspaceName.
   *
   * The name of the standby orchestrator workspace.
   *
   * @return the standbyOrchestratorWorkspaceName
   */
  public String getStandbyOrchestratorWorkspaceName() {
    return standbyOrchestratorWorkspaceName;
  }

  /**
   * Gets the transitGatewayName.
   *
   * The name of the transit gateway.
   *
   * @return the transitGatewayName
   */
  public String getTransitGatewayName() {
    return transitGatewayName;
  }

  /**
   * Gets the vpcName.
   *
   * The name of the VPC.
   *
   * @return the vpcName
   */
  public String getVpcName() {
    return vpcName;
  }
}

