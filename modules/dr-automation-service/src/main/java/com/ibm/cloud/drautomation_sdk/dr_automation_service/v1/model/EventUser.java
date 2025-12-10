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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about a user associated with an event.
 */
public class EventUser extends GenericModel {

  protected String email;
  protected String name;
  @SerializedName("user_id")
  protected String userId;

  protected EventUser() { }

  /**
   * Gets the email.
   *
   * Email of the User.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Gets the name.
   *
   * Name of the User.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the userId.
   *
   * ID of user who created/caused the event.
   *
   * @return the userId
   */
  public String getUserId() {
    return userId;
  }
}

