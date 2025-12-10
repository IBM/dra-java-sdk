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
 * The getMachineType options.
 */
public class GetMachineTypeOptions extends GenericModel {

  protected String instanceId;
  protected String primaryWorkspaceName;
  protected String acceptLanguage;
  protected String standbyWorkspaceName;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String primaryWorkspaceName;
    private String acceptLanguage;
    private String standbyWorkspaceName;

    /**
     * Instantiates a new Builder from an existing GetMachineTypeOptions instance.
     *
     * @param getMachineTypeOptions the instance to initialize the Builder with
     */
    private Builder(GetMachineTypeOptions getMachineTypeOptions) {
      this.instanceId = getMachineTypeOptions.instanceId;
      this.primaryWorkspaceName = getMachineTypeOptions.primaryWorkspaceName;
      this.acceptLanguage = getMachineTypeOptions.acceptLanguage;
      this.standbyWorkspaceName = getMachineTypeOptions.standbyWorkspaceName;
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
     * @param primaryWorkspaceName the primaryWorkspaceName
     */
    public Builder(String instanceId, String primaryWorkspaceName) {
      this.instanceId = instanceId;
      this.primaryWorkspaceName = primaryWorkspaceName;
    }

    /**
     * Builds a GetMachineTypeOptions.
     *
     * @return the new GetMachineTypeOptions instance
     */
    public GetMachineTypeOptions build() {
      return new GetMachineTypeOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetMachineTypeOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the primaryWorkspaceName.
     *
     * @param primaryWorkspaceName the primaryWorkspaceName
     * @return the GetMachineTypeOptions builder
     */
    public Builder primaryWorkspaceName(String primaryWorkspaceName) {
      this.primaryWorkspaceName = primaryWorkspaceName;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the GetMachineTypeOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the standbyWorkspaceName.
     *
     * @param standbyWorkspaceName the standbyWorkspaceName
     * @return the GetMachineTypeOptions builder
     */
    public Builder standbyWorkspaceName(String standbyWorkspaceName) {
      this.standbyWorkspaceName = standbyWorkspaceName;
      return this;
    }
  }

  protected GetMachineTypeOptions() { }

  protected GetMachineTypeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryWorkspaceName,
      "primaryWorkspaceName cannot be null");
    instanceId = builder.instanceId;
    primaryWorkspaceName = builder.primaryWorkspaceName;
    acceptLanguage = builder.acceptLanguage;
    standbyWorkspaceName = builder.standbyWorkspaceName;
  }

  /**
   * New builder.
   *
   * @return a GetMachineTypeOptions builder
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
   * Gets the primaryWorkspaceName.
   *
   * The primary Power virtual server workspace name.
   *
   * @return the primaryWorkspaceName
   */
  public String primaryWorkspaceName() {
    return primaryWorkspaceName;
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
   * Gets the standbyWorkspaceName.
   *
   * The standby Power virtual server workspace name.
   *
   * @return the standbyWorkspaceName
   */
  public String standbyWorkspaceName() {
    return standbyWorkspaceName;
  }
}

