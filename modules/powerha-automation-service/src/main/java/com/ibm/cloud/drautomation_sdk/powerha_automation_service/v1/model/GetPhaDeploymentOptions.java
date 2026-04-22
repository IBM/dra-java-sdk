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
 * The getPhaDeployment options.
 */
public class GetPhaDeploymentOptions extends GenericModel {

  protected String phaInstanceId;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String phaInstanceId;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing GetPhaDeploymentOptions instance.
     *
     * @param getPhaDeploymentOptions the instance to initialize the Builder with
     */
    private Builder(GetPhaDeploymentOptions getPhaDeploymentOptions) {
      this.phaInstanceId = getPhaDeploymentOptions.phaInstanceId;
      this.ifNoneMatch = getPhaDeploymentOptions.ifNoneMatch;
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
     * Builds a GetPhaDeploymentOptions.
     *
     * @return the new GetPhaDeploymentOptions instance
     */
    public GetPhaDeploymentOptions build() {
      return new GetPhaDeploymentOptions(this);
    }

    /**
     * Set the phaInstanceId.
     *
     * @param phaInstanceId the phaInstanceId
     * @return the GetPhaDeploymentOptions builder
     */
    public Builder phaInstanceId(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the GetPhaDeploymentOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected GetPhaDeploymentOptions() { }

  protected GetPhaDeploymentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaInstanceId,
      "phaInstanceId cannot be empty");
    phaInstanceId = builder.phaInstanceId;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a GetPhaDeploymentOptions builder
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

