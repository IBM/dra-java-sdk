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
 * The getPvsworkspaceSchematic options.
 */
public class GetPvsworkspaceSchematicOptions extends GenericModel {

  protected String instanceId;
  protected String schematicId;
  protected String locationId;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String schematicId;
    private String locationId;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing GetPvsworkspaceSchematicOptions instance.
     *
     * @param getPvsworkspaceSchematicOptions the instance to initialize the Builder with
     */
    private Builder(GetPvsworkspaceSchematicOptions getPvsworkspaceSchematicOptions) {
      this.instanceId = getPvsworkspaceSchematicOptions.instanceId;
      this.schematicId = getPvsworkspaceSchematicOptions.schematicId;
      this.locationId = getPvsworkspaceSchematicOptions.locationId;
      this.ifNoneMatch = getPvsworkspaceSchematicOptions.ifNoneMatch;
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
     * @param schematicId the schematicId
     * @param locationId the locationId
     */
    public Builder(String instanceId, String schematicId, String locationId) {
      this.instanceId = instanceId;
      this.schematicId = schematicId;
      this.locationId = locationId;
    }

    /**
     * Builds a GetPvsworkspaceSchematicOptions.
     *
     * @return the new GetPvsworkspaceSchematicOptions instance
     */
    public GetPvsworkspaceSchematicOptions build() {
      return new GetPvsworkspaceSchematicOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetPvsworkspaceSchematicOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the schematicId.
     *
     * @param schematicId the schematicId
     * @return the GetPvsworkspaceSchematicOptions builder
     */
    public Builder schematicId(String schematicId) {
      this.schematicId = schematicId;
      return this;
    }

    /**
     * Set the locationId.
     *
     * @param locationId the locationId
     * @return the GetPvsworkspaceSchematicOptions builder
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the GetPvsworkspaceSchematicOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected GetPvsworkspaceSchematicOptions() { }

  protected GetPvsworkspaceSchematicOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schematicId,
      "schematicId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locationId,
      "locationId cannot be null");
    instanceId = builder.instanceId;
    schematicId = builder.schematicId;
    locationId = builder.locationId;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a GetPvsworkspaceSchematicOptions builder
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
   * Gets the schematicId.
   *
   * Schematic ID value.
   *
   * @return the schematicId
   */
  public String schematicId() {
    return schematicId;
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

