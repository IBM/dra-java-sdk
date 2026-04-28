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
 * The listServiceInstanceEvents options.
 */
public class ListServiceInstanceEventsOptions extends GenericModel {

  protected String phaInstanceId;
  protected String time;
  protected String fromTime;
  protected String toTime;
  protected String acceptLanguage;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String phaInstanceId;
    private String time;
    private String fromTime;
    private String toTime;
    private String acceptLanguage;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing ListServiceInstanceEventsOptions instance.
     *
     * @param listServiceInstanceEventsOptions the instance to initialize the Builder with
     */
    private Builder(ListServiceInstanceEventsOptions listServiceInstanceEventsOptions) {
      this.phaInstanceId = listServiceInstanceEventsOptions.phaInstanceId;
      this.time = listServiceInstanceEventsOptions.time;
      this.fromTime = listServiceInstanceEventsOptions.fromTime;
      this.toTime = listServiceInstanceEventsOptions.toTime;
      this.acceptLanguage = listServiceInstanceEventsOptions.acceptLanguage;
      this.ifNoneMatch = listServiceInstanceEventsOptions.ifNoneMatch;
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
     * Builds a ListServiceInstanceEventsOptions.
     *
     * @return the new ListServiceInstanceEventsOptions instance
     */
    public ListServiceInstanceEventsOptions build() {
      return new ListServiceInstanceEventsOptions(this);
    }

    /**
     * Set the phaInstanceId.
     *
     * @param phaInstanceId the phaInstanceId
     * @return the ListServiceInstanceEventsOptions builder
     */
    public Builder phaInstanceId(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
      return this;
    }

    /**
     * Set the time.
     *
     * @param time the time
     * @return the ListServiceInstanceEventsOptions builder
     */
    public Builder time(String time) {
      this.time = time;
      return this;
    }

    /**
     * Set the fromTime.
     *
     * @param fromTime the fromTime
     * @return the ListServiceInstanceEventsOptions builder
     */
    public Builder fromTime(String fromTime) {
      this.fromTime = fromTime;
      return this;
    }

    /**
     * Set the toTime.
     *
     * @param toTime the toTime
     * @return the ListServiceInstanceEventsOptions builder
     */
    public Builder toTime(String toTime) {
      this.toTime = toTime;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the ListServiceInstanceEventsOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the ListServiceInstanceEventsOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected ListServiceInstanceEventsOptions() { }

  protected ListServiceInstanceEventsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaInstanceId,
      "phaInstanceId cannot be empty");
    phaInstanceId = builder.phaInstanceId;
    time = builder.time;
    fromTime = builder.fromTime;
    toTime = builder.toTime;
    acceptLanguage = builder.acceptLanguage;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a ListServiceInstanceEventsOptions builder
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

