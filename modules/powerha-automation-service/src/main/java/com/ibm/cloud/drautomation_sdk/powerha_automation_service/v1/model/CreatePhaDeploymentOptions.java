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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createPhaDeployment options.
 */
public class CreatePhaDeploymentOptions extends GenericModel {

  protected String phaInstanceId;
  protected String locationId;
  protected String primaryWorkspace;
  protected String apiKey;
  protected String clusterType;
  protected String configureType;
  protected List<String> primaryClusterNodes;
  protected List<String> standbyClusterNodes;
  protected String primaryLocation;
  protected String secondaryLocation;
  protected String secondaryWorkspace;
  protected String acceptLanguage;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String phaInstanceId;
    private String locationId;
    private String primaryWorkspace;
    private String apiKey;
    private String clusterType;
    private String configureType;
    private List<String> primaryClusterNodes;
    private List<String> standbyClusterNodes;
    private String primaryLocation;
    private String secondaryLocation;
    private String secondaryWorkspace;
    private String acceptLanguage;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing CreatePhaDeploymentOptions instance.
     *
     * @param createPhaDeploymentOptions the instance to initialize the Builder with
     */
    private Builder(CreatePhaDeploymentOptions createPhaDeploymentOptions) {
      this.phaInstanceId = createPhaDeploymentOptions.phaInstanceId;
      this.locationId = createPhaDeploymentOptions.locationId;
      this.primaryWorkspace = createPhaDeploymentOptions.primaryWorkspace;
      this.apiKey = createPhaDeploymentOptions.apiKey;
      this.clusterType = createPhaDeploymentOptions.clusterType;
      this.configureType = createPhaDeploymentOptions.configureType;
      this.primaryClusterNodes = createPhaDeploymentOptions.primaryClusterNodes;
      this.standbyClusterNodes = createPhaDeploymentOptions.standbyClusterNodes;
      this.primaryLocation = createPhaDeploymentOptions.primaryLocation;
      this.secondaryLocation = createPhaDeploymentOptions.secondaryLocation;
      this.secondaryWorkspace = createPhaDeploymentOptions.secondaryWorkspace;
      this.acceptLanguage = createPhaDeploymentOptions.acceptLanguage;
      this.ifNoneMatch = createPhaDeploymentOptions.ifNoneMatch;
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
     * @param locationId the locationId
     * @param primaryWorkspace the primaryWorkspace
     */
    public Builder(String phaInstanceId, String locationId, String primaryWorkspace) {
      this.phaInstanceId = phaInstanceId;
      this.locationId = locationId;
      this.primaryWorkspace = primaryWorkspace;
    }

    /**
     * Builds a CreatePhaDeploymentOptions.
     *
     * @return the new CreatePhaDeploymentOptions instance
     */
    public CreatePhaDeploymentOptions build() {
      return new CreatePhaDeploymentOptions(this);
    }

    /**
     * Adds a new element to primaryClusterNodes.
     *
     * @param primaryClusterNodes the new element to be added
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder addPrimaryClusterNodes(String primaryClusterNodes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(primaryClusterNodes,
        "primaryClusterNodes cannot be null");
      if (this.primaryClusterNodes == null) {
        this.primaryClusterNodes = new ArrayList<String>();
      }
      this.primaryClusterNodes.add(primaryClusterNodes);
      return this;
    }

    /**
     * Adds a new element to standbyClusterNodes.
     *
     * @param standbyClusterNodes the new element to be added
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder addStandbyClusterNodes(String standbyClusterNodes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(standbyClusterNodes,
        "standbyClusterNodes cannot be null");
      if (this.standbyClusterNodes == null) {
        this.standbyClusterNodes = new ArrayList<String>();
      }
      this.standbyClusterNodes.add(standbyClusterNodes);
      return this;
    }

    /**
     * Set the phaInstanceId.
     *
     * @param phaInstanceId the phaInstanceId
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder phaInstanceId(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
      return this;
    }

    /**
     * Set the locationId.
     *
     * @param locationId the locationId
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * Set the primaryWorkspace.
     *
     * @param primaryWorkspace the primaryWorkspace
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder primaryWorkspace(String primaryWorkspace) {
      this.primaryWorkspace = primaryWorkspace;
      return this;
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the clusterType.
     *
     * @param clusterType the clusterType
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder clusterType(String clusterType) {
      this.clusterType = clusterType;
      return this;
    }

    /**
     * Set the configureType.
     *
     * @param configureType the configureType
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder configureType(String configureType) {
      this.configureType = configureType;
      return this;
    }

    /**
     * Set the primaryClusterNodes.
     * Existing primaryClusterNodes will be replaced.
     *
     * @param primaryClusterNodes the primaryClusterNodes
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder primaryClusterNodes(List<String> primaryClusterNodes) {
      this.primaryClusterNodes = primaryClusterNodes;
      return this;
    }

    /**
     * Set the standbyClusterNodes.
     * Existing standbyClusterNodes will be replaced.
     *
     * @param standbyClusterNodes the standbyClusterNodes
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder standbyClusterNodes(List<String> standbyClusterNodes) {
      this.standbyClusterNodes = standbyClusterNodes;
      return this;
    }

    /**
     * Set the primaryLocation.
     *
     * @param primaryLocation the primaryLocation
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder primaryLocation(String primaryLocation) {
      this.primaryLocation = primaryLocation;
      return this;
    }

    /**
     * Set the secondaryLocation.
     *
     * @param secondaryLocation the secondaryLocation
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder secondaryLocation(String secondaryLocation) {
      this.secondaryLocation = secondaryLocation;
      return this;
    }

    /**
     * Set the secondaryWorkspace.
     *
     * @param secondaryWorkspace the secondaryWorkspace
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder secondaryWorkspace(String secondaryWorkspace) {
      this.secondaryWorkspace = secondaryWorkspace;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the CreatePhaDeploymentOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected CreatePhaDeploymentOptions() { }

  protected CreatePhaDeploymentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaInstanceId,
      "phaInstanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locationId,
      "locationId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryWorkspace,
      "primaryWorkspace cannot be null");
    phaInstanceId = builder.phaInstanceId;
    locationId = builder.locationId;
    primaryWorkspace = builder.primaryWorkspace;
    apiKey = builder.apiKey;
    clusterType = builder.clusterType;
    configureType = builder.configureType;
    primaryClusterNodes = builder.primaryClusterNodes;
    standbyClusterNodes = builder.standbyClusterNodes;
    primaryLocation = builder.primaryLocation;
    secondaryLocation = builder.secondaryLocation;
    secondaryWorkspace = builder.secondaryWorkspace;
    acceptLanguage = builder.acceptLanguage;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a CreatePhaDeploymentOptions builder
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
   * Gets the locationId.
   *
   * Identifier for the deployment location.
   *
   * @return the locationId
   */
  public String locationId() {
    return locationId;
  }

  /**
   * Gets the primaryWorkspace.
   *
   * Primary workspace identifier.
   *
   * @return the primaryWorkspace
   */
  public String primaryWorkspace() {
    return primaryWorkspace;
  }

  /**
   * Gets the apiKey.
   *
   * The API key associated with the request.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the clusterType.
   *
   * Type of PowerHA cluster being deployed.
   *
   * @return the clusterType
   */
  public String clusterType() {
    return clusterType;
  }

  /**
   * Gets the configureType.
   *
   * Configuration type for the deployment.
   *
   * @return the configureType
   */
  public String configureType() {
    return configureType;
  }

  /**
   * Gets the primaryClusterNodes.
   *
   * List of primary cluster node VM IDs.
   *
   * @return the primaryClusterNodes
   */
  public List<String> primaryClusterNodes() {
    return primaryClusterNodes;
  }

  /**
   * Gets the standbyClusterNodes.
   *
   * List of standby cluster node VM IDs.
   *
   * @return the standbyClusterNodes
   */
  public List<String> standbyClusterNodes() {
    return standbyClusterNodes;
  }

  /**
   * Gets the primaryLocation.
   *
   * Location identifier for the primary cluster.
   *
   * @return the primaryLocation
   */
  public String primaryLocation() {
    return primaryLocation;
  }

  /**
   * Gets the secondaryLocation.
   *
   * Location identifier for the secondary cluster.
   *
   * @return the secondaryLocation
   */
  public String secondaryLocation() {
    return secondaryLocation;
  }

  /**
   * Gets the secondaryWorkspace.
   *
   * Secondary workspace identifier.
   *
   * @return the secondaryWorkspace
   */
  public String secondaryWorkspace() {
    return secondaryWorkspace;
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

