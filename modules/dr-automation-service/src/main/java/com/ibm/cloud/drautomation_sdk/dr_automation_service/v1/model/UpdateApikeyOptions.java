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
 * The updateApikey options.
 */
public class UpdateApikeyOptions extends GenericModel {

  protected String instanceId;
  protected String apiKey;
  protected String acceptLanguage;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String apiKey;
    private String acceptLanguage;

    /**
     * Instantiates a new Builder from an existing UpdateApikeyOptions instance.
     *
     * @param updateApikeyOptions the instance to initialize the Builder with
     */
    private Builder(UpdateApikeyOptions updateApikeyOptions) {
      this.instanceId = updateApikeyOptions.instanceId;
      this.apiKey = updateApikeyOptions.apiKey;
      this.acceptLanguage = updateApikeyOptions.acceptLanguage;
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
     * @param apiKey the apiKey
     */
    public Builder(String instanceId, String apiKey) {
      this.instanceId = instanceId;
      this.apiKey = apiKey;
    }

    /**
     * Builds a UpdateApikeyOptions.
     *
     * @return the new UpdateApikeyOptions instance
     */
    public UpdateApikeyOptions build() {
      return new UpdateApikeyOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateApikeyOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the UpdateApikeyOptions builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the UpdateApikeyOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }
  }

  protected UpdateApikeyOptions() { }

  protected UpdateApikeyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apiKey,
      "apiKey cannot be null");
    instanceId = builder.instanceId;
    apiKey = builder.apiKey;
    acceptLanguage = builder.acceptLanguage;
  }

  /**
   * New builder.
   *
   * @return a UpdateApikeyOptions builder
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
   * Gets the apiKey.
   *
   * The new API key value that will replace the existing one.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
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

