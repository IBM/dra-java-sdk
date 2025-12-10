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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response object containing all DR automation summary information.
 */
public class DrAutomationGetSummaryResponse extends GenericModel {

  @SerializedName("managed_vm_list")
  protected Map<String, Object> managedVmList;
  @SerializedName("orchestrator_details")
  protected OrchestratorDetails orchestratorDetails;
  @SerializedName("service_details")
  protected ServiceDetails serviceDetails;

  protected DrAutomationGetSummaryResponse() { }

  /**
   * Gets the managedVmList.
   *
   * A flexible schema placeholder to allow any JSON value (aligns with interface{} in Go).
   *
   * @return the managedVmList
   */
  public Map<String, Object> getManagedVmList() {
    return managedVmList;
  }

  /**
   * Gets the orchestratorDetails.
   *
   * Contains details about the orchestrator configuration.
   *
   * @return the orchestratorDetails
   */
  public OrchestratorDetails getOrchestratorDetails() {
    return orchestratorDetails;
  }

  /**
   * Gets the serviceDetails.
   *
   * Contains details about the DR automation service.
   *
   * @return the serviceDetails
   */
  public ServiceDetails getServiceDetails() {
    return serviceDetails;
  }
}

