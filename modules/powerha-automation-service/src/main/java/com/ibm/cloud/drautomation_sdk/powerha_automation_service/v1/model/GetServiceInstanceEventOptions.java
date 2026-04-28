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
 * The getServiceInstanceEvent options.
 */
public class GetServiceInstanceEventOptions extends GenericModel {

  protected String phaInstanceId;
  protected String eventId;
  protected String acceptLanguage;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String phaInstanceId;
    private String eventId;
    private String acceptLanguage;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing GetServiceInstanceEventOptions instance.
     *
     * @param getServiceInstanceEventOptions the instance to initialize the Builder with
     */
    private Builder(GetServiceInstanceEventOptions getServiceInstanceEventOptions) {
      this.phaInstanceId = getServiceInstanceEventOptions.phaInstanceId;
      this.eventId = getServiceInstanceEventOptions.eventId;
      this.acceptLanguage = getServiceInstanceEventOptions.acceptLanguage;
      this.ifNoneMatch = getServiceInstanceEventOptions.ifNoneMatch;
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
     * @param eventId the eventId
     */
    public Builder(String phaInstanceId, String eventId) {
      this.phaInstanceId = phaInstanceId;
      this.eventId = eventId;
    }

    /**
     * Builds a GetServiceInstanceEventOptions.
     *
     * @return the new GetServiceInstanceEventOptions instance
     */
    public GetServiceInstanceEventOptions build() {
      return new GetServiceInstanceEventOptions(this);
    }

    /**
     * Set the phaInstanceId.
     *
     * @param phaInstanceId the phaInstanceId
     * @return the GetServiceInstanceEventOptions builder
     */
    public Builder phaInstanceId(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
      return this;
    }

    /**
     * Set the eventId.
     *
     * @param eventId the eventId
     * @return the GetServiceInstanceEventOptions builder
     */
    public Builder eventId(String eventId) {
      this.eventId = eventId;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the GetServiceInstanceEventOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the GetServiceInstanceEventOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected GetServiceInstanceEventOptions() { }

  protected GetServiceInstanceEventOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaInstanceId,
      "phaInstanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.eventId,
      "eventId cannot be empty");
    phaInstanceId = builder.phaInstanceId;
    eventId = builder.eventId;
    acceptLanguage = builder.acceptLanguage;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a GetServiceInstanceEventOptions builder
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
   * Gets the eventId.
   *
   * Event ID.
   *
   * @return the eventId
   */
  public String eventId() {
    return eventId;
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

