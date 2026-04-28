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
 * Details of a PowerHA deployment including cluster information, provisioning status, network configuration, and
 * associated resources.
 */
public class PhaDeploymentResponse extends GenericModel {

  @SerializedName("cloud_account_id")
  protected String cloudAccountId;
  @SerializedName("connectivity_type")
  protected String connectivityType;
  @SerializedName("creation_time")
  protected String creationTime;
  @SerializedName("custom_network")
  protected List<String> customNetwork;
  @SerializedName("deprovision_time")
  protected String deprovisionTime;
  protected String guid;
  @SerializedName("is_duplicate")
  protected Boolean isDuplicate;
  @SerializedName("plan_id")
  protected String planId;
  @SerializedName("plan_name")
  protected String planName;
  @SerializedName("powerha_cluster_name")
  protected String powerhaClusterName;
  @SerializedName("powerha_cluster_type")
  protected String powerhaClusterType;
  @SerializedName("powerha_level")
  protected String powerhaLevel;
  @SerializedName("primary_cluster_nodes_details")
  protected List<ClusterNodeInfo> primaryClusterNodesDetails;
  @SerializedName("primary_location")
  protected String primaryLocation;
  @SerializedName("primary_region_name")
  protected String primaryRegionName;
  @SerializedName("primary_workspace")
  protected String primaryWorkspace;
  @SerializedName("primary_workspace_name")
  protected String primaryWorkspaceName;
  @SerializedName("provision_end_time")
  protected String provisionEndTime;
  protected String id;
  @SerializedName("provision_start_time")
  protected String provisionStartTime;
  @SerializedName("provision_status")
  protected String provisionStatus;
  @SerializedName("region_id")
  protected String regionId;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("resource_group_crn")
  protected String resourceGroupCrn;
  @SerializedName("resource_instance")
  protected String resourceInstance;
  @SerializedName("secondary_cluster_nodes")
  protected List<ClusterNodeInfo> secondaryClusterNodes;
  @SerializedName("secondary_location")
  protected String secondaryLocation;
  @SerializedName("secondary_workspace")
  protected String secondaryWorkspace;
  @SerializedName("service_description")
  protected String serviceDescription;
  @SerializedName("service_id")
  protected String serviceId;
  @SerializedName("service_name")
  protected String serviceName;
  @SerializedName("standby_region_name")
  protected String standbyRegionName;
  @SerializedName("standby_workspace_name")
  protected String standbyWorkspaceName;
  @SerializedName("user_tags")
  protected String userTags;

  protected PhaDeploymentResponse() { }

  /**
   * Gets the cloudAccountId.
   *
   * Cloud account identifier.
   *
   * @return the cloudAccountId
   */
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  /**
   * Gets the connectivityType.
   *
   * Type of network connectivity.
   *
   * @return the connectivityType
   */
  public String getConnectivityType() {
    return connectivityType;
  }

  /**
   * Gets the creationTime.
   *
   * Timestamp expressing creation time.
   *
   * @return the creationTime
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Gets the customNetwork.
   *
   * List of custom network CIDRs.
   *
   * @return the customNetwork
   */
  public List<String> getCustomNetwork() {
    return customNetwork;
  }

  /**
   * Gets the deprovisionTime.
   *
   * Timestamp expressing deprovision time.
   *
   * @return the deprovisionTime
   */
  public String getDeprovisionTime() {
    return deprovisionTime;
  }

  /**
   * Gets the guid.
   *
   * Global unique identifier.
   *
   * @return the guid
   */
  public String getGuid() {
    return guid;
  }

  /**
   * Gets the isDuplicate.
   *
   * Indicates whether deployment is duplicate.
   *
   * @return the isDuplicate
   */
  public Boolean isIsDuplicate() {
    return isDuplicate;
  }

  /**
   * Gets the planId.
   *
   * Identifier for the service plan.
   *
   * @return the planId
   */
  public String getPlanId() {
    return planId;
  }

  /**
   * Gets the planName.
   *
   * Name of service plan.
   *
   * @return the planName
   */
  public String getPlanName() {
    return planName;
  }

  /**
   * Gets the powerhaClusterName.
   *
   * Name of the PowerHA cluster.
   *
   * @return the powerhaClusterName
   */
  public String getPowerhaClusterName() {
    return powerhaClusterName;
  }

  /**
   * Gets the powerhaClusterType.
   *
   * Type of PowerHA cluster.
   *
   * @return the powerhaClusterType
   */
  public String getPowerhaClusterType() {
    return powerhaClusterType;
  }

  /**
   * Gets the powerhaLevel.
   *
   * PowerHA version level.
   *
   * @return the powerhaLevel
   */
  public String getPowerhaLevel() {
    return powerhaLevel;
  }

  /**
   * Gets the primaryClusterNodesDetails.
   *
   * List of primary cluster nodes.
   *
   * @return the primaryClusterNodesDetails
   */
  public List<ClusterNodeInfo> getPrimaryClusterNodesDetails() {
    return primaryClusterNodesDetails;
  }

  /**
   * Gets the primaryLocation.
   *
   * Primary cluster location.
   *
   * @return the primaryLocation
   */
  public String getPrimaryLocation() {
    return primaryLocation;
  }

  /**
   * Gets the primaryRegionName.
   *
   * name of the primary workspace region.
   *
   * @return the primaryRegionName
   */
  public String getPrimaryRegionName() {
    return primaryRegionName;
  }

  /**
   * Gets the primaryWorkspace.
   *
   * Primary workspace identifier.
   *
   * @return the primaryWorkspace
   */
  public String getPrimaryWorkspace() {
    return primaryWorkspace;
  }

  /**
   * Gets the primaryWorkspaceName.
   *
   * name of the primary workspace.
   *
   * @return the primaryWorkspaceName
   */
  public String getPrimaryWorkspaceName() {
    return primaryWorkspaceName;
  }

  /**
   * Gets the provisionEndTime.
   *
   * Time stamp provisioning completed.
   *
   * @return the provisionEndTime
   */
  public String getProvisionEndTime() {
    return provisionEndTime;
  }

  /**
   * Gets the id.
   *
   * Provision request identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the provisionStartTime.
   *
   * Time stamp provisioning started.
   *
   * @return the provisionStartTime
   */
  public String getProvisionStartTime() {
    return provisionStartTime;
  }

  /**
   * Gets the provisionStatus.
   *
   * Current provision status.
   *
   * @return the provisionStatus
   */
  public String getProvisionStatus() {
    return provisionStatus;
  }

  /**
   * Gets the regionId.
   *
   * Deployment region identifier.
   *
   * @return the regionId
   */
  public String getRegionId() {
    return regionId;
  }

  /**
   * Gets the resourceGroup.
   *
   * Name of the resource group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the resourceGroupCrn.
   *
   * CRN of associated resource group.
   *
   * @return the resourceGroupCrn
   */
  public String getResourceGroupCrn() {
    return resourceGroupCrn;
  }

  /**
   * Gets the resourceInstance.
   *
   * Resource instance identifier.
   *
   * @return the resourceInstance
   */
  public String getResourceInstance() {
    return resourceInstance;
  }

  /**
   * Gets the secondaryClusterNodes.
   *
   * List of secondary cluster nodes.
   *
   * @return the secondaryClusterNodes
   */
  public List<ClusterNodeInfo> getSecondaryClusterNodes() {
    return secondaryClusterNodes;
  }

  /**
   * Gets the secondaryLocation.
   *
   * Secondary cluster location.
   *
   * @return the secondaryLocation
   */
  public String getSecondaryLocation() {
    return secondaryLocation;
  }

  /**
   * Gets the secondaryWorkspace.
   *
   * Secondary workspace identifier.
   *
   * @return the secondaryWorkspace
   */
  public String getSecondaryWorkspace() {
    return secondaryWorkspace;
  }

  /**
   * Gets the serviceDescription.
   *
   * Description of provisioned service.
   *
   * @return the serviceDescription
   */
  public String getServiceDescription() {
    return serviceDescription;
  }

  /**
   * Gets the serviceId.
   *
   * Identifier for the service.
   *
   * @return the serviceId
   */
  public String getServiceId() {
    return serviceId;
  }

  /**
   * Gets the serviceName.
   *
   * Name of service.
   *
   * @return the serviceName
   */
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Gets the standbyRegionName.
   *
   * name of the standby workspace region.
   *
   * @return the standbyRegionName
   */
  public String getStandbyRegionName() {
    return standbyRegionName;
  }

  /**
   * Gets the standbyWorkspaceName.
   *
   * name of the standby workspace.
   *
   * @return the standbyWorkspaceName
   */
  public String getStandbyWorkspaceName() {
    return standbyWorkspaceName;
  }

  /**
   * Gets the userTags.
   *
   * User defined tags.
   *
   * @return the userTags
   */
  public String getUserTags() {
    return userTags;
  }
}

