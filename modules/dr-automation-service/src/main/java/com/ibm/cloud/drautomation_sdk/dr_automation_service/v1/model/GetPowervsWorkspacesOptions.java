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
 * The getPowervsWorkspaces options.
 */
public class GetPowervsWorkspacesOptions extends GenericModel {

  protected String instanceId;
  protected String locationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String locationId;

    /**
     * Instantiates a new Builder from an existing GetPowervsWorkspacesOptions instance.
     *
     * @param getPowervsWorkspacesOptions the instance to initialize the Builder with
     */
    private Builder(GetPowervsWorkspacesOptions getPowervsWorkspacesOptions) {
      this.instanceId = getPowervsWorkspacesOptions.instanceId;
      this.locationId = getPowervsWorkspacesOptions.locationId;
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
     */
    public Builder(String instanceId, String locationId) {
      this.instanceId = instanceId;
      this.locationId = locationId;
    }

    /**
     * Builds a GetPowervsWorkspacesOptions.
     *
     * @return the new GetPowervsWorkspacesOptions instance
     */
    public GetPowervsWorkspacesOptions build() {
      return new GetPowervsWorkspacesOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetPowervsWorkspacesOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the locationId.
     *
     * @param locationId the locationId
     * @return the GetPowervsWorkspacesOptions builder
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }
  }

  protected GetPowervsWorkspacesOptions() { }

  protected GetPowervsWorkspacesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locationId,
      "locationId cannot be null");
    instanceId = builder.instanceId;
    locationId = builder.locationId;
  }

  /**
   * New builder.
   *
   * @return a GetPowervsWorkspacesOptions builder
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
}

