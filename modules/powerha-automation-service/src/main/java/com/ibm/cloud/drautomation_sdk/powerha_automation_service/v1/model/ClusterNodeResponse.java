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
 * Response schema for retrieving cluster node information.
 */
public class ClusterNodeResponse extends GenericModel {

  protected String id;
  @SerializedName("primary_node_details")
  protected List<NodeDetail> primaryNodeDetails;
  @SerializedName("secondary_node_details")
  protected List<NodeDetail> secondaryNodeDetails;

  protected ClusterNodeResponse() { }

  /**
   * Gets the id.
   *
   * Identifier for this cluster node response.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the primaryNodeDetails.
   *
   * Details of the primary cluster nodes.
   *
   * @return the primaryNodeDetails
   */
  public List<NodeDetail> getPrimaryNodeDetails() {
    return primaryNodeDetails;
  }

  /**
   * Gets the secondaryNodeDetails.
   *
   * Details of the secondary cluster nodes.
   *
   * @return the secondaryNodeDetails
   */
  public List<NodeDetail> getSecondaryNodeDetails() {
    return secondaryNodeDetails;
  }
}

