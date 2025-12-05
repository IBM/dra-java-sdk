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
 * The listEvents options.
 */
public class ListEventsOptions extends GenericModel {

  protected String instanceId;
  protected String time;
  protected String fromTime;
  protected String toTime;
  protected String acceptLanguage;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String time;
    private String fromTime;
    private String toTime;
    private String acceptLanguage;

    /**
     * Instantiates a new Builder from an existing ListEventsOptions instance.
     *
     * @param listEventsOptions the instance to initialize the Builder with
     */
    private Builder(ListEventsOptions listEventsOptions) {
      this.instanceId = listEventsOptions.instanceId;
      this.time = listEventsOptions.time;
      this.fromTime = listEventsOptions.fromTime;
      this.toTime = listEventsOptions.toTime;
      this.acceptLanguage = listEventsOptions.acceptLanguage;
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
     * Builds a ListEventsOptions.
     *
     * @return the new ListEventsOptions instance
     */
    public ListEventsOptions build() {
      return new ListEventsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListEventsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the time.
     *
     * @param time the time
     * @return the ListEventsOptions builder
     */
    public Builder time(String time) {
      this.time = time;
      return this;
    }

    /**
     * Set the fromTime.
     *
     * @param fromTime the fromTime
     * @return the ListEventsOptions builder
     */
    public Builder fromTime(String fromTime) {
      this.fromTime = fromTime;
      return this;
    }

    /**
     * Set the toTime.
     *
     * @param toTime the toTime
     * @return the ListEventsOptions builder
     */
    public Builder toTime(String toTime) {
      this.toTime = toTime;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the ListEventsOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }
  }

  protected ListEventsOptions() { }

  protected ListEventsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    time = builder.time;
    fromTime = builder.fromTime;
    toTime = builder.toTime;
    acceptLanguage = builder.acceptLanguage;
  }

  /**
   * New builder.
   *
   * @return a ListEventsOptions builder
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
   * Gets the time.
   *
   * (deprecated - use from_time) A time in either ISO 8601 or unix epoch format.
   *
   * @return the time
   */
  public String time() {
    return time;
  }

  /**
   * Gets the fromTime.
   *
   * A from query time in either ISO 8601 or unix epoch format.
   *
   * @return the fromTime
   */
  public String fromTime() {
    return fromTime;
  }

  /**
   * Gets the toTime.
   *
   * A to query time in either ISO 8601 or unix epoch format.
   *
   * @return the toTime
   */
  public String toTime() {
    return toTime;
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

