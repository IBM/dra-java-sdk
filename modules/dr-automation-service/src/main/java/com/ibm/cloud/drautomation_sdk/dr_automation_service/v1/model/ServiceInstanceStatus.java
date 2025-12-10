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
 * Represents the current status and details of a service instance including orchestrator state, networking, and
 * recovery information.
 */
public class ServiceInstanceStatus extends GenericModel {

  protected String crn;
  @SerializedName("deployment_name")
  protected String deploymentName;
  @SerializedName("last_updated_orchestrator_deployment_time")
  protected Date lastUpdatedOrchestratorDeploymentTime;
  @SerializedName("last_updated_standby_orchestrator_deployment_time")
  protected Date lastUpdatedStandbyOrchestratorDeploymentTime;
  @SerializedName("mfa_enabled")
  protected String mfaEnabled;
  @SerializedName("orch_ext_connectivity_status")
  protected String orchExtConnectivityStatus;
  @SerializedName("orch_standby_node_addtion_status")
  protected String orchStandbyNodeAddtionStatus;
  @SerializedName("orchestrator_cluster_message")
  protected String orchestratorClusterMessage;
  @SerializedName("orchestrator_config_status")
  protected String orchestratorConfigStatus;
  @SerializedName("orchestrator_ha")
  protected Boolean orchestratorHa;
  @SerializedName("plan_name")
  protected String planName;
  @SerializedName("primary_description")
  protected String primaryDescription;
  @SerializedName("primary_ip_address")
  protected String primaryIpAddress;
  @SerializedName("primary_orchestrator_status")
  protected String primaryOrchestratorStatus;
  @SerializedName("recovery_location")
  protected String recoveryLocation;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("standby_description")
  protected String standbyDescription;
  @SerializedName("standby_ip_address")
  protected String standbyIpAddress;
  @SerializedName("standby_status")
  protected String standbyStatus;
  protected String status;

  protected ServiceInstanceStatus() { }

  /**
   * Gets the crn.
   *
   * The service instance crn.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the deploymentName.
   *
   * The name of the service instance deployment.
   *
   * @return the deploymentName
   */
  public String getDeploymentName() {
    return deploymentName;
  }

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
   * Gets the mfaEnabled.
   *
   * Indicated whether multi factor authentication is ennabled or not.
   *
   * @return the mfaEnabled
   */
  public String getMfaEnabled() {
    return mfaEnabled;
  }

  /**
   * Gets the orchExtConnectivityStatus.
   *
   * Status of standby node addition to the orchestrator cluster.
   *
   * @return the orchExtConnectivityStatus
   */
  public String getOrchExtConnectivityStatus() {
    return orchExtConnectivityStatus;
  }

  /**
   * Gets the orchStandbyNodeAddtionStatus.
   *
   * The status of standby node in the Orchestrator cluster.
   *
   * @return the orchStandbyNodeAddtionStatus
   */
  public String getOrchStandbyNodeAddtionStatus() {
    return orchStandbyNodeAddtionStatus;
  }

  /**
   * Gets the orchestratorClusterMessage.
   *
   * The current status of the primary orchestrator VM.
   *
   * @return the orchestratorClusterMessage
   */
  public String getOrchestratorClusterMessage() {
    return orchestratorClusterMessage;
  }

  /**
   * Gets the orchestratorConfigStatus.
   *
   * The configuration status of the orchestrator cluster.
   *
   * @return the orchestratorConfigStatus
   */
  public String getOrchestratorConfigStatus() {
    return orchestratorConfigStatus;
  }

  /**
   * Gets the orchestratorHa.
   *
   * Indicates whether high availability (HA) is enabled for the orchestrator.
   *
   * @return the orchestratorHa
   */
  public Boolean isOrchestratorHa() {
    return orchestratorHa;
  }

  /**
   * Gets the planName.
   *
   * The name of the DR Automation plan.
   *
   * @return the planName
   */
  public String getPlanName() {
    return planName;
  }

  /**
   * Gets the primaryDescription.
   *
   * Indicates the progress details of primary orchestrator creation.
   *
   * @return the primaryDescription
   */
  public String getPrimaryDescription() {
    return primaryDescription;
  }

  /**
   * Gets the primaryIpAddress.
   *
   * The IP address of the primary orchestrator VM.
   *
   * @return the primaryIpAddress
   */
  public String getPrimaryIpAddress() {
    return primaryIpAddress;
  }

  /**
   * Gets the primaryOrchestratorStatus.
   *
   * The configuration status of the orchestrator cluster.
   *
   * @return the primaryOrchestratorStatus
   */
  public String getPrimaryOrchestratorStatus() {
    return primaryOrchestratorStatus;
  }

  /**
   * Gets the recoveryLocation.
   *
   * The disaster recovery location associated with the instance.
   *
   * @return the recoveryLocation
   */
  public String getRecoveryLocation() {
    return recoveryLocation;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to which the service instance belongs.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the standbyDescription.
   *
   * Indicates the progress details of primary orchestrator creation.
   *
   * @return the standbyDescription
   */
  public String getStandbyDescription() {
    return standbyDescription;
  }

  /**
   * Gets the standbyIpAddress.
   *
   * The IP address of the standby orchestrator VM.
   *
   * @return the standbyIpAddress
   */
  public String getStandbyIpAddress() {
    return standbyIpAddress;
  }

  /**
   * Gets the standbyStatus.
   *
   * The current state of the standby orchestrator.
   *
   * @return the standbyStatus
   */
  public String getStandbyStatus() {
    return standbyStatus;
  }

  /**
   * Gets the status.
   *
   * The current state of the primary orchestrator.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

