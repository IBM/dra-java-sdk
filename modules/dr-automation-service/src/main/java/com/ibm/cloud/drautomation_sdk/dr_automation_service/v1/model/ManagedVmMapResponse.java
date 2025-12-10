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
 * Map of VM IDs to managed VM details.
 */
public class ManagedVmMapResponse extends GenericModel {

  @SerializedName("managed_vm_list")
  protected Map<String, ManagedVmDetails> managedVmList;

  protected ManagedVmMapResponse() { }

  /**
   * Gets the managedVmList.
   *
   * A map where the key is the VM ID and the value is the corresponding ManagedVmDetails object.
   *
   * @return the managedVmList
   */
  public Map<String, ManagedVmDetails> getManagedVmList() {
    return managedVmList;
  }
}

