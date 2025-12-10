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

import java.util.Date;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Represents an individual event in the system, including details about action, resource, user, and timestamps.
 */
public class Event extends GenericModel {

  /**
   * Level of the event (notice, info, warning, error).
   */
  public interface Level {
    /** notice. */
    String NOTICE = "notice";
    /** info. */
    String INFO = "info";
    /** warning. */
    String WARNING = "warning";
    /** error. */
    String ERROR = "error";
  }

  protected String action;
  @SerializedName("api_source")
  protected String apiSource;
  @SerializedName("event_id")
  protected String eventId;
  protected String level;
  protected String message;
  @SerializedName("message_data")
  protected Map<String, Object> messageData;
  protected Map<String, Object> metadata;
  protected String resource;
  protected Date time;
  protected String timestamp;
  protected EventUser user;

  protected Event() { }

  /**
   * Gets the action.
   *
   * Type of action for this event.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the apiSource.
   *
   * Source of API when it being executed.
   *
   * @return the apiSource
   */
  public String getApiSource() {
    return apiSource;
  }

  /**
   * Gets the eventId.
   *
   * ID of the Activity.
   *
   * @return the eventId
   */
  public String getEventId() {
    return eventId;
  }

  /**
   * Gets the level.
   *
   * Level of the event (notice, info, warning, error).
   *
   * @return the level
   */
  public String getLevel() {
    return level;
  }

  /**
   * Gets the message.
   *
   * The (translated) message of the event.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the messageData.
   *
   * A flexible schema placeholder to allow any JSON value (aligns with interface{} in Go).
   *
   * @return the messageData
   */
  public Map<String, Object> getMessageData() {
    return messageData;
  }

  /**
   * Gets the metadata.
   *
   * A flexible schema placeholder to allow any JSON value (aligns with interface{} in Go).
   *
   * @return the metadata
   */
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  /**
   * Gets the resource.
   *
   * Type of resource for this event.
   *
   * @return the resource
   */
  public String getResource() {
    return resource;
  }

  /**
   * Gets the time.
   *
   * Time of activity in ISO 8601 - RFC3339.
   *
   * @return the time
   */
  public Date getTime() {
    return time;
  }

  /**
   * Gets the timestamp.
   *
   * Time of activity in unix epoch.
   *
   * @return the timestamp
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Gets the user.
   *
   * Information about a user associated with an event.
   *
   * @return the user
   */
  public EventUser getUser() {
    return user;
  }
}

