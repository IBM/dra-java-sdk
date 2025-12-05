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
 * The getManageDr options.
 */
public class GetManageDrOptions extends GenericModel {

  protected String instanceId;
  protected String acceptLanguage;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String acceptLanguage;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing GetManageDrOptions instance.
     *
     * @param getManageDrOptions the instance to initialize the Builder with
     */
    private Builder(GetManageDrOptions getManageDrOptions) {
      this.instanceId = getManageDrOptions.instanceId;
      this.acceptLanguage = getManageDrOptions.acceptLanguage;
      this.ifNoneMatch = getManageDrOptions.ifNoneMatch;
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
     * Builds a GetManageDrOptions.
     *
     * @return the new GetManageDrOptions instance
     */
    public GetManageDrOptions build() {
      return new GetManageDrOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetManageDrOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the GetManageDrOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the GetManageDrOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected GetManageDrOptions() { }

  protected GetManageDrOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    acceptLanguage = builder.acceptLanguage;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a GetManageDrOptions builder
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

