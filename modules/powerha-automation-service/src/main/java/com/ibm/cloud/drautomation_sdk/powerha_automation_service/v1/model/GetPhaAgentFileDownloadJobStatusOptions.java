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
 * The getPhaAgentFileDownloadJobStatus options.
 */
public class GetPhaAgentFileDownloadJobStatusOptions extends GenericModel {

  protected String phaInstanceId;
  protected String phaJobId;
  protected String acceptLanguage;
  protected String ifNoneMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String phaInstanceId;
    private String phaJobId;
    private String acceptLanguage;
    private String ifNoneMatch;

    /**
     * Instantiates a new Builder from an existing GetPhaAgentFileDownloadJobStatusOptions instance.
     *
     * @param getPhaAgentFileDownloadJobStatusOptions the instance to initialize the Builder with
     */
    private Builder(GetPhaAgentFileDownloadJobStatusOptions getPhaAgentFileDownloadJobStatusOptions) {
      this.phaInstanceId = getPhaAgentFileDownloadJobStatusOptions.phaInstanceId;
      this.phaJobId = getPhaAgentFileDownloadJobStatusOptions.phaJobId;
      this.acceptLanguage = getPhaAgentFileDownloadJobStatusOptions.acceptLanguage;
      this.ifNoneMatch = getPhaAgentFileDownloadJobStatusOptions.ifNoneMatch;
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
     * @param phaJobId the phaJobId
     */
    public Builder(String phaInstanceId, String phaJobId) {
      this.phaInstanceId = phaInstanceId;
      this.phaJobId = phaJobId;
    }

    /**
     * Builds a GetPhaAgentFileDownloadJobStatusOptions.
     *
     * @return the new GetPhaAgentFileDownloadJobStatusOptions instance
     */
    public GetPhaAgentFileDownloadJobStatusOptions build() {
      return new GetPhaAgentFileDownloadJobStatusOptions(this);
    }

    /**
     * Set the phaInstanceId.
     *
     * @param phaInstanceId the phaInstanceId
     * @return the GetPhaAgentFileDownloadJobStatusOptions builder
     */
    public Builder phaInstanceId(String phaInstanceId) {
      this.phaInstanceId = phaInstanceId;
      return this;
    }

    /**
     * Set the phaJobId.
     *
     * @param phaJobId the phaJobId
     * @return the GetPhaAgentFileDownloadJobStatusOptions builder
     */
    public Builder phaJobId(String phaJobId) {
      this.phaJobId = phaJobId;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the GetPhaAgentFileDownloadJobStatusOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the ifNoneMatch.
     *
     * @param ifNoneMatch the ifNoneMatch
     * @return the GetPhaAgentFileDownloadJobStatusOptions builder
     */
    public Builder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  protected GetPhaAgentFileDownloadJobStatusOptions() { }

  protected GetPhaAgentFileDownloadJobStatusOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaInstanceId,
      "phaInstanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.phaJobId,
      "phaJobId cannot be empty");
    phaInstanceId = builder.phaInstanceId;
    phaJobId = builder.phaJobId;
    acceptLanguage = builder.acceptLanguage;
    ifNoneMatch = builder.ifNoneMatch;
  }

  /**
   * New builder.
   *
   * @return a GetPhaAgentFileDownloadJobStatusOptions builder
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
   * Gets the phaJobId.
   *
   * Unique ID to track the pha agent file download.
   *
   * @return the phaJobId
   */
  public String phaJobId() {
    return phaJobId;
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

