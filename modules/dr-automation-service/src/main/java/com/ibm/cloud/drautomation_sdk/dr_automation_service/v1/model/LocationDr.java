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
 * Represents a disaster recovery location.
 */
public class LocationDr extends GenericModel {

  protected String region;
  protected String type;
  protected String url;

  protected LocationDr() { }

  /**
   * Gets the region.
   *
   * The region identifier of the DR location.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the type.
   *
   * The type of location (e.g., data-center, cloud-region).
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the url.
   *
   * The URL endpoint to access the DR location.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }
}

