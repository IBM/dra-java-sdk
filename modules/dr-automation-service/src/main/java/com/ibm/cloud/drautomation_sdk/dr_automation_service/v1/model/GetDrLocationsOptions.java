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
 * The getDrLocations options.
 */
public class GetDrLocationsOptions extends GenericModel {

  protected String instanceId;
  protected String acceptLanguage;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String acceptLanguage;

    /**
     * Instantiates a new Builder from an existing GetDrLocationsOptions instance.
     *
     * @param getDrLocationsOptions the instance to initialize the Builder with
     */
    private Builder(GetDrLocationsOptions getDrLocationsOptions) {
      this.instanceId = getDrLocationsOptions.instanceId;
      this.acceptLanguage = getDrLocationsOptions.acceptLanguage;
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
     * Builds a GetDrLocationsOptions.
     *
     * @return the new GetDrLocationsOptions instance
     */
    public GetDrLocationsOptions build() {
      return new GetDrLocationsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetDrLocationsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the GetDrLocationsOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }
  }

  protected GetDrLocationsOptions() { }

  protected GetDrLocationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    acceptLanguage = builder.acceptLanguage;
  }

  /**
   * New builder.
   *
   * @return a GetDrLocationsOptions builder
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
   * Gets the acceptLanguage.
   *
   * The language requested for the return document.
   *
   * @return the acceptLanguage
   */
  public String acceptLanguage() {
    return acceptLanguage;
  }
}

