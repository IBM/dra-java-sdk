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
 * Response containing details of a stored API key.
 */
public class ApiKeyResponse extends GenericModel {

  protected String status;
  protected String id;

  protected ApiKeyResponse() { }

  /**
   * Gets the status.
   *
   * Status of the API key retrieval request.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the id.
   *
   * Unique identifier for the API key record.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }
}

