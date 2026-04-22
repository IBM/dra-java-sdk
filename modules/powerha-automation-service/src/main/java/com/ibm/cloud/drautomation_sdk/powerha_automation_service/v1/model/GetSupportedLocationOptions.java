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
 * The getSupportedLocation options.
 */
public class GetSupportedLocationOptions extends GenericModel {

  protected String phaInstanceId;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String phaInstanceId;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing GetSupportedLocationOptions instance.
     *
     * @param getSupportedLocationOptions the instance to initialize the Builder with
     */
    private Builder(GetSupportedLocationOptions getSupportedLocationOptions) {
      this.phaInstanceId = getSupportedLocationOptions.phaInstanceId;
      this.ifNoneMatch = getSupportedLocationOptions.ifNoneMatch;
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
     */
    public Builder(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
    }

    /**
     * Builds a GetSupportedLocationOptions.
     *
     * @return the new GetSupportedLocationOptions instance
     */
    public GetSupportedLocationOptions build() {
      return new GetSupportedLocationOptions(this);
    }

    /**
     * Set the phaInstanceId.
     *
     * @param phaInstanceId the phaInstanceId
     * @return the GetSupportedLocationOptions builder
     */
    public Builder phaInstanceId(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the GetSupportedLocationOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected GetSupportedLocationOptions() { }

  protected GetSupportedLocationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaInstanceId,
      "phaInstanceId cannot be empty");
    phaInstanceId = builder.phaInstanceId;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a GetSupportedLocationOptions builder
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

