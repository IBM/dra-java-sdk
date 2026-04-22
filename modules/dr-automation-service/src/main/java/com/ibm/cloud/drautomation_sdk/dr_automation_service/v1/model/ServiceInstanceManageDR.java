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

package com.ibm.cloud.drautomation_sdk.dr_automation_service.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Represents the response details for managing a DR service instance.
 */
public class ServiceInstanceManageDR extends GenericModel {

  @SerializedName("dashboard_url")
  protected String dashboardUrl;
  protected String id;
  @SerializedName("orchestrator_location_type")
  protected String orchestratorLocationType;
  @SerializedName("location_id")
  protected String locationId;
  @SerializedName("ssh_key_name")
  protected String sshKeyName;
  @SerializedName("standby_ssh_key_name")
  protected String standbySshKeyName;
  @SerializedName("orchestrator_name")
  protected String orchestratorName;
  @SerializedName("orchestrator_workspace_id")
  protected String orchestratorWorkspaceId;
  @SerializedName("standby_orchestrator_name")
  protected String standbyOrchestratorName;
  @SerializedName("standby_orchestrator_workspace_id")
  protected String standbyOrchestratorWorkspaceId;
  @SerializedName("orchestrator_ha")
  protected Boolean orchestratorHa;
  @SerializedName("resource_instance")
  protected String resourceInstance;
  @SerializedName("secret_group")
  protected String secretGroup;
  protected String secret;
  @SerializedName("region_id")
  protected String regionId;
  protected String guid;
  @SerializedName("machine_type")
  protected String machineType;
  protected String tier;
  @SerializedName("standby_tier")
  protected String standbyTier;
  @SerializedName("standby_machine_type")
  protected String standbyMachineType;
  @SerializedName("tenant_name")
  protected String tenantName;
  @SerializedName("proxy_ip")
  protected String proxyIp;

  protected ServiceInstanceManageDR() { }

  /**
   * Gets the dashboardUrl.
   *
   * URL to the dashboard for managing the DR service instance in IBM Cloud.
   *
   * @return the dashboardUrl
   */
  public String getDashboardUrl() {
    return dashboardUrl;
  }

  /**
   * Gets the id.
   *
   * The CRN (Cloud Resource Name) of the DR service instance.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the orchestratorLocationType.
   *
   * The cloud location where your orchestator need to be created.
   *
   * @return the orchestratorLocationType
   */
  public String getOrchestratorLocationType() {
    return orchestratorLocationType;
  }

  /**
   * Gets the locationId.
   *
   * The location or data center identifier where the service instance is deployed.
   *
   * @return the locationId
   */
  public String getLocationId() {
    return locationId;
  }

  /**
   * Gets the sshKeyName.
   *
   * The name of the SSH key used for deploying the orchestator.
   *
   * @return the sshKeyName
   */
  public String getSshKeyName() {
    return sshKeyName;
  }

  /**
   * Gets the standbySshKeyName.
   *
   * The name of the SSH key used for deploying the standby orchestator.
   *
   * @return the standbySshKeyName
   */
  public String getStandbySshKeyName() {
    return standbySshKeyName;
  }

  /**
   * Gets the orchestratorName.
   *
   * The username used for the orchestrator.
   *
   * @return the orchestratorName
   */
  public String getOrchestratorName() {
    return orchestratorName;
  }

  /**
   * Gets the orchestratorWorkspaceId.
   *
   * The unique identifier orchestrator workspace.
   *
   * @return the orchestratorWorkspaceId
   */
  public String getOrchestratorWorkspaceId() {
    return orchestratorWorkspaceId;
  }

  /**
   * Gets the standbyOrchestratorName.
   *
   * The username for the standby orchestrator management interface.
   *
   * @return the standbyOrchestratorName
   */
  public String getStandbyOrchestratorName() {
    return standbyOrchestratorName;
  }

  /**
   * Gets the standbyOrchestratorWorkspaceId.
   *
   * The unique identifier of the standby orchestrator workspace.
   *
   * @return the standbyOrchestratorWorkspaceId
   */
  public String getStandbyOrchestratorWorkspaceId() {
    return standbyOrchestratorWorkspaceId;
  }

  /**
   * Gets the orchestratorHa.
   *
   * Indicates whether the orchestrator High Availability (HA) is enabled for the service instance.
   *
   * @return the orchestratorHa
   */
  public Boolean isOrchestratorHa() {
    return orchestratorHa;
  }

  /**
   * Gets the resourceInstance.
   *
   * The uniquie identifier of the associated IBM Cloud resource instance.
   *
   * @return the resourceInstance
   */
  public String getResourceInstance() {
    return resourceInstance;
  }

  /**
   * Gets the secretGroup.
   *
   * The secret group name in IBM Cloud Secrets Manager containing sensitive data for the service instance.
   *
   * @return the secretGroup
   */
  public String getSecretGroup() {
    return secretGroup;
  }

  /**
   * Gets the secret.
   *
   * The secret name or identifier used for retrieving credentials from secrets manager.
   *
   * @return the secret
   */
  public String getSecret() {
    return secret;
  }

  /**
   * Gets the regionId.
   *
   * The power virtual server region where the service instance is deployed.
   *
   * @return the regionId
   */
  public String getRegionId() {
    return regionId;
  }

  /**
   * Gets the guid.
   *
   * The global unique identifier of the service instance.
   *
   * @return the guid
   */
  public String getGuid() {
    return guid;
  }

  /**
   * Gets the machineType.
   *
   * The machine type used for deploying orchestrator.
   *
   * @return the machineType
   */
  public String getMachineType() {
    return machineType;
  }

  /**
   * Gets the tier.
   *
   * The storage tier used for deploying primary orchestrator.
   *
   * @return the tier
   */
  public String getTier() {
    return tier;
  }

  /**
   * Gets the standbyTier.
   *
   * The storage tier used for deploying standby orchestrator.
   *
   * @return the standbyTier
   */
  public String getStandbyTier() {
    return standbyTier;
  }

  /**
   * Gets the standbyMachineType.
   *
   * The machine type used for deploying standby virtual machines.
   *
   * @return the standbyMachineType
   */
  public String getStandbyMachineType() {
    return standbyMachineType;
  }

  /**
   * Gets the tenantName.
   *
   * The tenant name for MFA authentication API.
   *
   * @return the tenantName
   */
  public String getTenantName() {
    return tenantName;
  }

  /**
   * Gets the proxyIp.
   *
   * Proxy IP for the Communication between Orchestrator and Service broker.
   *
   * @return the proxyIp
   */
  public String getProxyIp() {
    return proxyIp;
  }
}

