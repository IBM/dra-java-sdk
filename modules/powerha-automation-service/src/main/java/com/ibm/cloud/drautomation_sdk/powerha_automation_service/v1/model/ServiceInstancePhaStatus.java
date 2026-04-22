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
 * Current status information for a PHA service instance.
 */
public class ServiceInstancePhaStatus extends GenericModel {

  @SerializedName("deployment_name")
  protected String deploymentName;
  @SerializedName("provision_id")
  protected String provisionId;
  @SerializedName("resource_group")
  protected String resourceGroup;
  protected String status;

  protected ServiceInstancePhaStatus() { }

  /**
   * Gets the deploymentName.
   *
   * Name of the deployment associated with the service instance.
   *
   * @return the deploymentName
   */
  public String getDeploymentName() {
    return deploymentName;
  }

  /**
   * Gets the provisionId.
   *
   * Unique identifier for the provisioning operation.
   *
   * @return the provisionId
   */
  public String getProvisionId() {
    return provisionId;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource Group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the status.
   *
   * Current operational status of the service instance.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

