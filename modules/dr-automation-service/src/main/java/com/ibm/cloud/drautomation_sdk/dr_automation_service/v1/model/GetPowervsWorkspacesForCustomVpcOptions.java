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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getPowervsWorkspacesForCustomVpc options.
 */
public class GetPowervsWorkspacesForCustomVpcOptions extends GenericModel {

  protected String instanceId;
  protected String locationId;
  protected String vpcId;
  protected String tgId;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String locationId;
    private String vpcId;
    private String tgId;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing GetPowervsWorkspacesForCustomVpcOptions instance.
     *
     * @param getPowervsWorkspacesForCustomVpcOptions the instance to initialize the Builder with
     */
    private Builder(GetPowervsWorkspacesForCustomVpcOptions getPowervsWorkspacesForCustomVpcOptions) {
      this.instanceId = getPowervsWorkspacesForCustomVpcOptions.instanceId;
      this.locationId = getPowervsWorkspacesForCustomVpcOptions.locationId;
      this.vpcId = getPowervsWorkspacesForCustomVpcOptions.vpcId;
      this.tgId = getPowervsWorkspacesForCustomVpcOptions.tgId;
      this.ifNoneMatch = getPowervsWorkspacesForCustomVpcOptions.ifNoneMatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param locationId the locationId
     * @param vpcId the vpcId
     * @param tgId the tgId
     */
    public Builder(String instanceId, String locationId, String vpcId, String tgId) {
      this.instanceId = instanceId;
      this.locationId = locationId;
      this.vpcId = vpcId;
      this.tgId = tgId;
    }

    /**
     * Builds a GetPowervsWorkspacesForCustomVpcOptions.
     *
     * @return the new GetPowervsWorkspacesForCustomVpcOptions instance
     */
    public GetPowervsWorkspacesForCustomVpcOptions build() {
      return new GetPowervsWorkspacesForCustomVpcOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetPowervsWorkspacesForCustomVpcOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the locationId.
     *
     * @param locationId the locationId
     * @return the GetPowervsWorkspacesForCustomVpcOptions builder
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the GetPowervsWorkspacesForCustomVpcOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the tgId.
     *
     * @param tgId the tgId
     * @return the GetPowervsWorkspacesForCustomVpcOptions builder
     */
    public Builder tgId(String tgId) {
      this.tgId = tgId;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the GetPowervsWorkspacesForCustomVpcOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected GetPowervsWorkspacesForCustomVpcOptions() { }

  protected GetPowervsWorkspacesForCustomVpcOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locationId,
      "locationId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpcId,
      "vpcId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tgId,
      "tgId cannot be null");
    instanceId = builder.instanceId;
    locationId = builder.locationId;
    vpcId = builder.vpcId;
    tgId = builder.tgId;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a GetPowervsWorkspacesForCustomVpcOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * instance id of instance to provision.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the locationId.
   *
   * Location ID value.
   *
   * @return the locationId
   */
  public String locationId() {
    return locationId;
  }

  /**
   * Gets the vpcId.
   *
   * vpc id value.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the tgId.
   *
   * transit gateway id value.
   *
   * @return the tgId
   */
  public String tgId() {
    return tgId;
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

