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
 * The getSchematicWorkspace options.
 */
public class GetSchematicWorkspaceOptions extends GenericModel {

  protected String instanceId;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing GetSchematicWorkspaceOptions instance.
     *
     * @param getSchematicWorkspaceOptions the instance to initialize the Builder with
     */
    private Builder(GetSchematicWorkspaceOptions getSchematicWorkspaceOptions) {
      this.instanceId = getSchematicWorkspaceOptions.instanceId;
      this.ifNoneMatch = getSchematicWorkspaceOptions.ifNoneMatch;
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
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
    }

    /**
     * Builds a GetSchematicWorkspaceOptions.
     *
     * @return the new GetSchematicWorkspaceOptions instance
     */
    public GetSchematicWorkspaceOptions build() {
      return new GetSchematicWorkspaceOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetSchematicWorkspaceOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the GetSchematicWorkspaceOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected GetSchematicWorkspaceOptions() { }

  protected GetSchematicWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a GetSchematicWorkspaceOptions builder
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

