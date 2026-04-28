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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteClusterNode options.
 */
public class DeleteClusterNodeOptions extends GenericModel {

  protected String phaInstanceId;
  protected String vmId;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String phaInstanceId;
    private String vmId;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing DeleteClusterNodeOptions instance.
     *
     * @param deleteClusterNodeOptions the instance to initialize the Builder with
     */
    private Builder(DeleteClusterNodeOptions deleteClusterNodeOptions) {
      this.phaInstanceId = deleteClusterNodeOptions.phaInstanceId;
      this.vmId = deleteClusterNodeOptions.vmId;
      this.ifNoneMatch = deleteClusterNodeOptions.ifNoneMatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param phaInstanceId the phaInstanceId
     * @param vmId the vmId
     */
    public Builder(String phaInstanceId, String vmId) {
      this.phaInstanceId = phaInstanceId;
      this.vmId = vmId;
    }

    /**
     * Builds a DeleteClusterNodeOptions.
     *
     * @return the new DeleteClusterNodeOptions instance
     */
    public DeleteClusterNodeOptions build() {
      return new DeleteClusterNodeOptions(this);
    }

    /**
     * Set the phaInstanceId.
     *
     * @param phaInstanceId the phaInstanceId
     * @return the DeleteClusterNodeOptions builder
     */
    public Builder phaInstanceId(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
      return this;
    }

    /**
     * Set the vmId.
     *
     * @param vmId the vmId
     * @return the DeleteClusterNodeOptions builder
     */
    public Builder vmId(String vmId) {
      this.vmId = vmId;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the DeleteClusterNodeOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected DeleteClusterNodeOptions() { }

  protected DeleteClusterNodeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaInstanceId,
      "phaInstanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vmId,
      "vmId cannot be null");
    phaInstanceId = builder.phaInstanceId;
    vmId = builder.vmId;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a DeleteClusterNodeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the phaInstanceId.
   *
   * Unique identifier of the provisioned instance.
   *
   * @return the phaInstanceId
   */
  public String phaInstanceId() {
    return phaInstanceId;
  }

  /**
   * Gets the vmId.
   *
   * vm ID of workspace.
   *
   * @return the vmId
   */
  public String vmId() {
    return vmId;
  }

  /**
   * Gets the ifNoneMatch.
   *
   * ETag for conditional requests (optional).
   *
   * @return the ifNoneMatch
   */
  public String ifNoneMatch() {
    return ifNoneMatch;
  }
}

