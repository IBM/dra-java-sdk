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
 * The createClusterNode options.
 */
public class CreateClusterNodeOptions extends GenericModel {

  protected String phaInstanceId;
  protected List<String> primaryClusterNodes;
  protected List<String> secondaryClusterNodes;
  protected String acceptLanguage;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String phaInstanceId;
    private List<String> primaryClusterNodes;
    private List<String> secondaryClusterNodes;
    private String acceptLanguage;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing CreateClusterNodeOptions instance.
     *
     * @param createClusterNodeOptions the instance to initialize the Builder with
     */
    private Builder(CreateClusterNodeOptions createClusterNodeOptions) {
      this.phaInstanceId = createClusterNodeOptions.phaInstanceId;
      this.primaryClusterNodes = createClusterNodeOptions.primaryClusterNodes;
      this.secondaryClusterNodes = createClusterNodeOptions.secondaryClusterNodes;
      this.acceptLanguage = createClusterNodeOptions.acceptLanguage;
      this.ifNoneMatch = createClusterNodeOptions.ifNoneMatch;
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
     * @param primaryClusterNodes the primaryClusterNodes
     */
    public Builder(String phaInstanceId, List<String> primaryClusterNodes) {
      this.phaInstanceId = phaInstanceId;
      this.primaryClusterNodes = primaryClusterNodes;
    }

    /**
     * Builds a CreateClusterNodeOptions.
     *
     * @return the new CreateClusterNodeOptions instance
     */
    public CreateClusterNodeOptions build() {
      return new CreateClusterNodeOptions(this);
    }

    /**
     * Adds a new element to primaryClusterNodes.
     *
     * @param primaryClusterNodes the new element to be added
     * @return the CreateClusterNodeOptions builder
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
     * Adds a new element to secondaryClusterNodes.
     *
     * @param secondaryClusterNodes the new element to be added
     * @return the CreateClusterNodeOptions builder
     */
    public Builder addSecondaryClusterNodes(String secondaryClusterNodes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(secondaryClusterNodes,
        "secondaryClusterNodes cannot be null");
      if (this.secondaryClusterNodes == null) {
        this.secondaryClusterNodes = new ArrayList<String>();
      }
      this.secondaryClusterNodes.add(secondaryClusterNodes);
      return this;
    }

    /**
     * Set the phaInstanceId.
     *
     * @param phaInstanceId the phaInstanceId
     * @return the CreateClusterNodeOptions builder
     */
    public Builder phaInstanceId(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
      return this;
    }

    /**
     * Set the primaryClusterNodes.
     * Existing primaryClusterNodes will be replaced.
     *
     * @param primaryClusterNodes the primaryClusterNodes
     * @return the CreateClusterNodeOptions builder
     */
    public Builder primaryClusterNodes(List<String> primaryClusterNodes) {
      this.primaryClusterNodes = primaryClusterNodes;
      return this;
    }

    /**
     * Set the secondaryClusterNodes.
     * Existing secondaryClusterNodes will be replaced.
     *
     * @param secondaryClusterNodes the secondaryClusterNodes
     * @return the CreateClusterNodeOptions builder
     */
    public Builder secondaryClusterNodes(List<String> secondaryClusterNodes) {
      this.secondaryClusterNodes = secondaryClusterNodes;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the CreateClusterNodeOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the CreateClusterNodeOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected CreateClusterNodeOptions() { }

  protected CreateClusterNodeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaInstanceId,
      "phaInstanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryClusterNodes,
      "primaryClusterNodes cannot be null");
    phaInstanceId = builder.phaInstanceId;
    primaryClusterNodes = builder.primaryClusterNodes;
    secondaryClusterNodes = builder.secondaryClusterNodes;
    acceptLanguage = builder.acceptLanguage;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a CreateClusterNodeOptions builder
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
   * Gets the secondaryClusterNodes.
   *
   * List of secondary cluster node VM IDs.
   *
   * @return the secondaryClusterNodes
   */
  public List<String> secondaryClusterNodes() {
    return secondaryClusterNodes;
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

