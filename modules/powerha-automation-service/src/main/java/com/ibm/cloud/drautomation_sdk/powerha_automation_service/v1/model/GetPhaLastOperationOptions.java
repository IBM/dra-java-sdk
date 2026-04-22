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
 * The getPhaLastOperation options.
 */
public class GetPhaLastOperationOptions extends GenericModel {

  protected String phaInstanceId;
  protected String acceptLanguage;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String phaInstanceId;
    private String acceptLanguage;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing GetPhaLastOperationOptions instance.
     *
     * @param getPhaLastOperationOptions the instance to initialize the Builder with
     */
    private Builder(GetPhaLastOperationOptions getPhaLastOperationOptions) {
      this.phaInstanceId = getPhaLastOperationOptions.phaInstanceId;
      this.acceptLanguage = getPhaLastOperationOptions.acceptLanguage;
      this.ifNoneMatch = getPhaLastOperationOptions.ifNoneMatch;
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
     * Builds a GetPhaLastOperationOptions.
     *
     * @return the new GetPhaLastOperationOptions instance
     */
    public GetPhaLastOperationOptions build() {
      return new GetPhaLastOperationOptions(this);
    }

    /**
     * Set the phaInstanceId.
     *
     * @param phaInstanceId the phaInstanceId
     * @return the GetPhaLastOperationOptions builder
     */
    public Builder phaInstanceId(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the GetPhaLastOperationOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the GetPhaLastOperationOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected GetPhaLastOperationOptions() { }

  protected GetPhaLastOperationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaInstanceId,
      "phaInstanceId cannot be empty");
    phaInstanceId = builder.phaInstanceId;
    acceptLanguage = builder.acceptLanguage;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a GetPhaLastOperationOptions builder
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
   * Gets the acceptLanguage.
   *
   * The language requested for the return document.
   *
   * @return the acceptLanguage
   */
  public String acceptLanguage() {
    return acceptLanguage;
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

