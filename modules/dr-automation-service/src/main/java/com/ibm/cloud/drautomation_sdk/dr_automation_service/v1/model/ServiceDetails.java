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
 * Contains details about the DR automation service.
 */
public class ServiceDetails extends GenericModel {

  protected String crn;
  @SerializedName("deployment_name")
  protected String deploymentName;
  protected String description;
  @SerializedName("orchestrator_ha")
  protected Boolean orchestratorHa;
  @SerializedName("plan_name")
  protected String planName;
  @SerializedName("primary_ip_address")
  protected String primaryIpAddress;
  @SerializedName("primary_orchestrator_dashboard_url")
  protected String primaryOrchestratorDashboardUrl;
  @SerializedName("recovery_location")
  protected String recoveryLocation;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("standby_description")
  protected String standbyDescription;
  @SerializedName("standby_ip_address")
  protected String standbyIpAddress;
  @SerializedName("standby_orchestrator_dashboard_url")
  protected String standbyOrchestratorDashboardUrl;
  @SerializedName("standby_status")
  protected String standbyStatus;
  protected String status;

  protected ServiceDetails() { }

  /**
   * Gets the crn.
   *
   * The deployment crn.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the deploymentName.
   *
   * The name of the deployment.
   *
   * @return the deploymentName
   */
  public String getDeploymentName() {
    return deploymentName;
  }

  /**
   * Gets the description.
   *
   * The Service description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the orchestratorHa.
   *
   * The flag indicating whether orchestartor HA is enabled.
   *
   * @return the orchestratorHa
   */
  public Boolean isOrchestratorHa() {
    return orchestratorHa;
  }

  /**
   * Gets the planName.
   *
   * The plan name.
   *
   * @return the planName
   */
  public String getPlanName() {
    return planName;
  }

  /**
   * Gets the primaryIpAddress.
   *
   * The service Orchestator primary IP address.
   *
   * @return the primaryIpAddress
   */
  public String getPrimaryIpAddress() {
    return primaryIpAddress;
  }

  /**
   * Gets the primaryOrchestratorDashboardUrl.
   *
   * The Primary Orchestrator Dashboard URL.
   *
   * @return the primaryOrchestratorDashboardUrl
   */
  public String getPrimaryOrchestratorDashboardUrl() {
    return primaryOrchestratorDashboardUrl;
  }

  /**
   * Gets the recoveryLocation.
   *
   * The disaster recovery location.
   *
   * @return the recoveryLocation
   */
  public String getRecoveryLocation() {
    return recoveryLocation;
  }

  /**
   * Gets the resourceGroup.
   *
   * The Resource group name.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the standbyDescription.
   *
   * The standby orchestrator current status details.
   *
   * @return the standbyDescription
   */
  public String getStandbyDescription() {
    return standbyDescription;
  }

  /**
   * Gets the standbyIpAddress.
   *
   * The service Orchestator standby IP address.
   *
   * @return the standbyIpAddress
   */
  public String getStandbyIpAddress() {
    return standbyIpAddress;
  }

  /**
   * Gets the standbyOrchestratorDashboardUrl.
   *
   * The Standby Orchestrator Dashboard URL.
   *
   * @return the standbyOrchestratorDashboardUrl
   */
  public String getStandbyOrchestratorDashboardUrl() {
    return standbyOrchestratorDashboardUrl;
  }

  /**
   * Gets the standbyStatus.
   *
   * The standby orchestrator current status.
   *
   * @return the standbyStatus
   */
  public String getStandbyStatus() {
    return standbyStatus;
  }

  /**
   * Gets the status.
   *
   * The Status of the service.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

