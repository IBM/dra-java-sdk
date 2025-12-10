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
 * The getEvent options.
 */
public class GetEventOptions extends GenericModel {

  protected String instanceId;
  protected String eventId;
  protected String acceptLanguage;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String eventId;
    private String acceptLanguage;

    /**
     * Instantiates a new Builder from an existing GetEventOptions instance.
     *
     * @param getEventOptions the instance to initialize the Builder with
     */
    private Builder(GetEventOptions getEventOptions) {
      this.instanceId = getEventOptions.instanceId;
      this.eventId = getEventOptions.eventId;
      this.acceptLanguage = getEventOptions.acceptLanguage;
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
     * @param eventId the eventId
     */
    public Builder(String instanceId, String eventId) {
      this.instanceId = instanceId;
      this.eventId = eventId;
    }

    /**
     * Builds a GetEventOptions.
     *
     * @return the new GetEventOptions instance
     */
    public GetEventOptions build() {
      return new GetEventOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetEventOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the eventId.
     *
     * @param eventId the eventId
     * @return the GetEventOptions builder
     */
    public Builder eventId(String eventId) {
      this.eventId = eventId;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the GetEventOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }
  }

  protected GetEventOptions() { }

  protected GetEventOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.eventId,
      "eventId cannot be empty");
    instanceId = builder.instanceId;
    eventId = builder.eventId;
    acceptLanguage = builder.acceptLanguage;
  }

  /**
   * New builder.
   *
   * @return a GetEventOptions builder
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
}

