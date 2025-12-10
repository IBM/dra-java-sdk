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
 * The createManageDr options.
 */
public class CreateManageDrOptions extends GenericModel {

  protected String instanceId;
  protected String locationId;
  protected String machineType;
  protected String orchestratorLocationType;
  protected String orchestratorName;
  protected String orchestratorPassword;
  protected String orchestratorWorkspaceId;
  protected String apiKey;
  protected String clientId;
  protected String clientSecret;
  protected String guid;
  protected Boolean orchestratorHa;
  protected String proxyIp;
  protected String regionId;
  protected String resourceInstance;
  protected String secret;
  protected String secretGroup;
  protected String sshKeyName;
  protected String standbyMachineType;
  protected String standbyOrchestratorName;
  protected String standbyOrchestratorWorkspaceId;
  protected String standbyTier;
  protected String tenantName;
  protected String tier;
  protected String standByRedeploy;
  protected String acceptLanguage;
  protected Boolean acceptsIncomplete;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String locationId;
    private String machineType;
    private String orchestratorLocationType;
    private String orchestratorName;
    private String orchestratorPassword;
    private String orchestratorWorkspaceId;
    private String apiKey;
    private String clientId;
    private String clientSecret;
    private String guid;
    private Boolean orchestratorHa;
    private String proxyIp;
    private String regionId;
    private String resourceInstance;
    private String secret;
    private String secretGroup;
    private String sshKeyName;
    private String standbyMachineType;
    private String standbyOrchestratorName;
    private String standbyOrchestratorWorkspaceId;
    private String standbyTier;
    private String tenantName;
    private String tier;
    private String standByRedeploy;
    private String acceptLanguage;
    private Boolean acceptsIncomplete;

    /**
     * Instantiates a new Builder from an existing CreateManageDrOptions instance.
     *
     * @param createManageDrOptions the instance to initialize the Builder with
     */
    private Builder(CreateManageDrOptions createManageDrOptions) {
      this.instanceId = createManageDrOptions.instanceId;
      this.locationId = createManageDrOptions.locationId;
      this.machineType = createManageDrOptions.machineType;
      this.orchestratorLocationType = createManageDrOptions.orchestratorLocationType;
      this.orchestratorName = createManageDrOptions.orchestratorName;
      this.orchestratorPassword = createManageDrOptions.orchestratorPassword;
      this.orchestratorWorkspaceId = createManageDrOptions.orchestratorWorkspaceId;
      this.apiKey = createManageDrOptions.apiKey;
      this.clientId = createManageDrOptions.clientId;
      this.clientSecret = createManageDrOptions.clientSecret;
      this.guid = createManageDrOptions.guid;
      this.orchestratorHa = createManageDrOptions.orchestratorHa;
      this.proxyIp = createManageDrOptions.proxyIp;
      this.regionId = createManageDrOptions.regionId;
      this.resourceInstance = createManageDrOptions.resourceInstance;
      this.secret = createManageDrOptions.secret;
      this.secretGroup = createManageDrOptions.secretGroup;
      this.sshKeyName = createManageDrOptions.sshKeyName;
      this.standbyMachineType = createManageDrOptions.standbyMachineType;
      this.standbyOrchestratorName = createManageDrOptions.standbyOrchestratorName;
      this.standbyOrchestratorWorkspaceId = createManageDrOptions.standbyOrchestratorWorkspaceId;
      this.standbyTier = createManageDrOptions.standbyTier;
      this.tenantName = createManageDrOptions.tenantName;
      this.tier = createManageDrOptions.tier;
      this.standByRedeploy = createManageDrOptions.standByRedeploy;
      this.acceptLanguage = createManageDrOptions.acceptLanguage;
      this.acceptsIncomplete = createManageDrOptions.acceptsIncomplete;
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
     * @param locationId the locationId
     * @param machineType the machineType
     * @param orchestratorLocationType the orchestratorLocationType
     * @param orchestratorName the orchestratorName
     * @param orchestratorPassword the orchestratorPassword
     * @param orchestratorWorkspaceId the orchestratorWorkspaceId
     */
    public Builder(String instanceId, String locationId, String machineType, String orchestratorLocationType, String orchestratorName, String orchestratorPassword, String orchestratorWorkspaceId) {
      this.instanceId = instanceId;
      this.locationId = locationId;
      this.machineType = machineType;
      this.orchestratorLocationType = orchestratorLocationType;
      this.orchestratorName = orchestratorName;
      this.orchestratorPassword = orchestratorPassword;
      this.orchestratorWorkspaceId = orchestratorWorkspaceId;
    }

    /**
     * Builds a CreateManageDrOptions.
     *
     * @return the new CreateManageDrOptions instance
     */
    public CreateManageDrOptions build() {
      return new CreateManageDrOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateManageDrOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the locationId.
     *
     * @param locationId the locationId
     * @return the CreateManageDrOptions builder
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * Set the machineType.
     *
     * @param machineType the machineType
     * @return the CreateManageDrOptions builder
     */
    public Builder machineType(String machineType) {
      this.machineType = machineType;
      return this;
    }

    /**
     * Set the orchestratorLocationType.
     *
     * @param orchestratorLocationType the orchestratorLocationType
     * @return the CreateManageDrOptions builder
     */
    public Builder orchestratorLocationType(String orchestratorLocationType) {
      this.orchestratorLocationType = orchestratorLocationType;
      return this;
    }

    /**
     * Set the orchestratorName.
     *
     * @param orchestratorName the orchestratorName
     * @return the CreateManageDrOptions builder
     */
    public Builder orchestratorName(String orchestratorName) {
      this.orchestratorName = orchestratorName;
      return this;
    }

    /**
     * Set the orchestratorPassword.
     *
     * @param orchestratorPassword the orchestratorPassword
     * @return the CreateManageDrOptions builder
     */
    public Builder orchestratorPassword(String orchestratorPassword) {
      this.orchestratorPassword = orchestratorPassword;
      return this;
    }

    /**
     * Set the orchestratorWorkspaceId.
     *
     * @param orchestratorWorkspaceId the orchestratorWorkspaceId
     * @return the CreateManageDrOptions builder
     */
    public Builder orchestratorWorkspaceId(String orchestratorWorkspaceId) {
      this.orchestratorWorkspaceId = orchestratorWorkspaceId;
      return this;
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the CreateManageDrOptions builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the clientId.
     *
     * @param clientId the clientId
     * @return the CreateManageDrOptions builder
     */
    public Builder clientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    /**
     * Set the clientSecret.
     *
     * @param clientSecret the clientSecret
     * @return the CreateManageDrOptions builder
     */
    public Builder clientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
      return this;
    }

    /**
     * Set the guid.
     *
     * @param guid the guid
     * @return the CreateManageDrOptions builder
     */
    public Builder guid(String guid) {
      this.guid = guid;
      return this;
    }

    /**
     * Set the orchestratorHa.
     *
     * @param orchestratorHa the orchestratorHa
     * @return the CreateManageDrOptions builder
     */
    public Builder orchestratorHa(Boolean orchestratorHa) {
      this.orchestratorHa = orchestratorHa;
      return this;
    }

    /**
     * Set the proxyIp.
     *
     * @param proxyIp the proxyIp
     * @return the CreateManageDrOptions builder
     */
    public Builder proxyIp(String proxyIp) {
      this.proxyIp = proxyIp;
      return this;
    }

    /**
     * Set the regionId.
     *
     * @param regionId the regionId
     * @return the CreateManageDrOptions builder
     */
    public Builder regionId(String regionId) {
      this.regionId = regionId;
      return this;
    }

    /**
     * Set the resourceInstance.
     *
     * @param resourceInstance the resourceInstance
     * @return the CreateManageDrOptions builder
     */
    public Builder resourceInstance(String resourceInstance) {
      this.resourceInstance = resourceInstance;
      return this;
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the CreateManageDrOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Set the secretGroup.
     *
     * @param secretGroup the secretGroup
     * @return the CreateManageDrOptions builder
     */
    public Builder secretGroup(String secretGroup) {
      this.secretGroup = secretGroup;
      return this;
    }

    /**
     * Set the sshKeyName.
     *
     * @param sshKeyName the sshKeyName
     * @return the CreateManageDrOptions builder
     */
    public Builder sshKeyName(String sshKeyName) {
      this.sshKeyName = sshKeyName;
      return this;
    }

    /**
     * Set the standbyMachineType.
     *
     * @param standbyMachineType the standbyMachineType
     * @return the CreateManageDrOptions builder
     */
    public Builder standbyMachineType(String standbyMachineType) {
      this.standbyMachineType = standbyMachineType;
      return this;
    }

    /**
     * Set the standbyOrchestratorName.
     *
     * @param standbyOrchestratorName the standbyOrchestratorName
     * @return the CreateManageDrOptions builder
     */
    public Builder standbyOrchestratorName(String standbyOrchestratorName) {
      this.standbyOrchestratorName = standbyOrchestratorName;
      return this;
    }

    /**
     * Set the standbyOrchestratorWorkspaceId.
     *
     * @param standbyOrchestratorWorkspaceId the standbyOrchestratorWorkspaceId
     * @return the CreateManageDrOptions builder
     */
    public Builder standbyOrchestratorWorkspaceId(String standbyOrchestratorWorkspaceId) {
      this.standbyOrchestratorWorkspaceId = standbyOrchestratorWorkspaceId;
      return this;
    }

    /**
     * Set the standbyTier.
     *
     * @param standbyTier the standbyTier
     * @return the CreateManageDrOptions builder
     */
    public Builder standbyTier(String standbyTier) {
      this.standbyTier = standbyTier;
      return this;
    }

    /**
     * Set the tenantName.
     *
     * @param tenantName the tenantName
     * @return the CreateManageDrOptions builder
     */
    public Builder tenantName(String tenantName) {
      this.tenantName = tenantName;
      return this;
    }

    /**
     * Set the tier.
     *
     * @param tier the tier
     * @return the CreateManageDrOptions builder
     */
    public Builder tier(String tier) {
      this.tier = tier;
      return this;
    }

    /**
     * Set the standByRedeploy.
     *
     * @param standByRedeploy the standByRedeploy
     * @return the CreateManageDrOptions builder
     */
    public Builder standByRedeploy(String standByRedeploy) {
      this.standByRedeploy = standByRedeploy;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the CreateManageDrOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the acceptsIncomplete.
     *
     * @param acceptsIncomplete the acceptsIncomplete
     * @return the CreateManageDrOptions builder
     */
    public Builder acceptsIncomplete(Boolean acceptsIncomplete) {
      this.acceptsIncomplete = acceptsIncomplete;
      return this;
    }
  }

  protected CreateManageDrOptions() { }

  protected CreateManageDrOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locationId,
      "locationId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.machineType,
      "machineType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.orchestratorLocationType,
      "orchestratorLocationType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.orchestratorName,
      "orchestratorName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.orchestratorPassword,
      "orchestratorPassword cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.orchestratorWorkspaceId,
      "orchestratorWorkspaceId cannot be null");
    instanceId = builder.instanceId;
    locationId = builder.locationId;
    machineType = builder.machineType;
    orchestratorLocationType = builder.orchestratorLocationType;
    orchestratorName = builder.orchestratorName;
    orchestratorPassword = builder.orchestratorPassword;
    orchestratorWorkspaceId = builder.orchestratorWorkspaceId;
    apiKey = builder.apiKey;
    clientId = builder.clientId;
    clientSecret = builder.clientSecret;
    guid = builder.guid;
    orchestratorHa = builder.orchestratorHa;
    proxyIp = builder.proxyIp;
    regionId = builder.regionId;
    resourceInstance = builder.resourceInstance;
    secret = builder.secret;
    secretGroup = builder.secretGroup;
    sshKeyName = builder.sshKeyName;
    standbyMachineType = builder.standbyMachineType;
    standbyOrchestratorName = builder.standbyOrchestratorName;
    standbyOrchestratorWorkspaceId = builder.standbyOrchestratorWorkspaceId;
    standbyTier = builder.standbyTier;
    tenantName = builder.tenantName;
    tier = builder.tier;
    standByRedeploy = builder.standByRedeploy;
    acceptLanguage = builder.acceptLanguage;
    acceptsIncomplete = builder.acceptsIncomplete;
  }

  /**
   * New builder.
   *
   * @return a CreateManageDrOptions builder
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
   * Gets the locationId.
   *
   * The location or data center identifier where the service instance is deployed.
   *
   * @return the locationId
   */
  public String locationId() {
    return locationId;
  }

  /**
   * Gets the machineType.
   *
   * The machine type used for deploying orchestrator.
   *
   * @return the machineType
   */
  public String machineType() {
    return machineType;
  }

  /**
   * Gets the orchestratorLocationType.
   *
   * The cloud location where your orchestator need to be created.
   *
   * @return the orchestratorLocationType
   */
  public String orchestratorLocationType() {
    return orchestratorLocationType;
  }

  /**
   * Gets the orchestratorName.
   *
   * The username used for the orchestrator.
   *
   * @return the orchestratorName
   */
  public String orchestratorName() {
    return orchestratorName;
  }

  /**
   * Gets the orchestratorPassword.
   *
   * The password that you can use to access your orchestrator.
   *
   * @return the orchestratorPassword
   */
  public String orchestratorPassword() {
    return orchestratorPassword;
  }

  /**
   * Gets the orchestratorWorkspaceId.
   *
   * The unique identifier orchestrator workspace.
   *
   * @return the orchestratorWorkspaceId
   */
  public String orchestratorWorkspaceId() {
    return orchestratorWorkspaceId;
  }

  /**
   * Gets the apiKey.
   *
   * The api Key of the service instance for deploying the disaster recovery service.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the clientId.
   *
   * The Client Id created for MFA authentication API.
   *
   * @return the clientId
   */
  public String clientId() {
    return clientId;
  }

  /**
   * Gets the clientSecret.
   *
   * The client secret created for MFA authentication API.
   *
   * @return the clientSecret
   */
  public String clientSecret() {
    return clientSecret;
  }

  /**
   * Gets the guid.
   *
   * The global unique identifier of the service instance.
   *
   * @return the guid
   */
  public String guid() {
    return guid;
  }

  /**
   * Gets the orchestratorHa.
   *
   * Indicates whether the orchestrator High Availability (HA) is enabled for the service instance.
   *
   * @return the orchestratorHa
   */
  public Boolean orchestratorHa() {
    return orchestratorHa;
  }

  /**
   * Gets the proxyIp.
   *
   * Proxy IP for the Communication between Orchestrator and Service broker.
   *
   * @return the proxyIp
   */
  public String proxyIp() {
    return proxyIp;
  }

  /**
   * Gets the regionId.
   *
   * The power virtual server region where the service instance is deployed.
   *
   * @return the regionId
   */
  public String regionId() {
    return regionId;
  }

  /**
   * Gets the resourceInstance.
   *
   * The uniquie identifier of the associated IBM Cloud resource instance.
   *
   * @return the resourceInstance
   */
  public String resourceInstance() {
    return resourceInstance;
  }

  /**
   * Gets the secret.
   *
   * The secret name or identifier used for retrieving credentials from secrets manager.
   *
   * @return the secret
   */
  public String secret() {
    return secret;
  }

  /**
   * Gets the secretGroup.
   *
   * The secret group name in IBM Cloud Secrets Manager containing sensitive data for the service instance.
   *
   * @return the secretGroup
   */
  public String secretGroup() {
    return secretGroup;
  }

  /**
   * Gets the sshKeyName.
   *
   * The name of the SSH key used for deploying the orchestator.
   *
   * @return the sshKeyName
   */
  public String sshKeyName() {
    return sshKeyName;
  }

  /**
   * Gets the standbyMachineType.
   *
   * The machine type used for deploying standby virtual machines.
   *
   * @return the standbyMachineType
   */
  public String standbyMachineType() {
    return standbyMachineType;
  }

  /**
   * Gets the standbyOrchestratorName.
   *
   * The username for the standby orchestrator management interface.
   *
   * @return the standbyOrchestratorName
   */
  public String standbyOrchestratorName() {
    return standbyOrchestratorName;
  }

  /**
   * Gets the standbyOrchestratorWorkspaceId.
   *
   * The unique identifier of the standby orchestrator workspace.
   *
   * @return the standbyOrchestratorWorkspaceId
   */
  public String standbyOrchestratorWorkspaceId() {
    return standbyOrchestratorWorkspaceId;
  }

  /**
   * Gets the standbyTier.
   *
   * The storage tier used for deploying standby orchestrator.
   *
   * @return the standbyTier
   */
  public String standbyTier() {
    return standbyTier;
  }

  /**
   * Gets the tenantName.
   *
   * The tenant name for MFA authentication API.
   *
   * @return the tenantName
   */
  public String tenantName() {
    return tenantName;
  }

  /**
   * Gets the tier.
   *
   * The storage tier used for deploying primary orchestrator.
   *
   * @return the tier
   */
  public String tier() {
    return tier;
  }

  /**
   * Gets the standByRedeploy.
   *
   * Flag to indicate if standby should be redeployed (must be "true" or "false").
   *
   * @return the standByRedeploy
   */
  public String standByRedeploy() {
    return standByRedeploy;
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
   * Gets the acceptsIncomplete.
   *
   * A value of true indicates that both the IBM Cloud platform and the requesting client support asynchronous
   * deprovisioning.
   *
   * @return the acceptsIncomplete
   */
  public Boolean acceptsIncomplete() {
    return acceptsIncomplete;
  }
}

