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
 * Represents the response details for managing a DR service instance.
 */
public class ServiceInstanceManageDR extends GenericModel {

  @SerializedName("dashboard_url")
  protected String dashboardUrl;
  protected String id;

  protected ServiceInstanceManageDR() { }

  /**
   * Gets the dashboardUrl.
   *
   * URL to the dashboard for managing the DR service instance in IBM Cloud.
   *
   * @return the dashboardUrl
   */
  public String getDashboardUrl() {
    return dashboardUrl;
  }

  /**
   * Gets the id.
   *
   * The CRN (Cloud Resource Name) of the DR service instance.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }
}

