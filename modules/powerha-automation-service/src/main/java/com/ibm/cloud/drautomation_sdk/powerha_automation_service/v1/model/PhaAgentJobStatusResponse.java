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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Status information of a PowerHA agent job.
 */
public class PhaAgentJobStatusResponse extends GenericModel {

  @SerializedName("bytes_downloaded")
  protected Long bytesDownloaded;
  @SerializedName("creation_at")
  protected Date creationAt;
  @SerializedName("file_name")
  protected String fileName;
  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("last_updated_at")
  protected Date lastUpdatedAt;
  @SerializedName("service_instance_id")
  protected String serviceInstanceId;
  protected String status;
  @SerializedName("total_bytes")
  protected Long totalBytes;
  @SerializedName("vm_id")
  protected String vmId;

  protected PhaAgentJobStatusResponse() { }

  /**
   * Gets the bytesDownloaded.
   *
   * Number of bytes downloaded so far.
   *
   * @return the bytesDownloaded
   */
  public Long getBytesDownloaded() {
    return bytesDownloaded;
  }

  /**
   * Gets the creationAt.
   *
   * Timestamp when the job was created.
   *
   * @return the creationAt
   */
  public Date getCreationAt() {
    return creationAt;
  }

  /**
   * Gets the fileName.
   *
   * Name of the file that has been downloaded.
   *
   * @return the fileName
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * Gets the jobId.
   *
   * Unique identifier of the job.
   *
   * @return the jobId
   */
  public String getJobId() {
    return jobId;
  }

  /**
   * Gets the lastUpdatedAt.
   *
   * Timestamp of the last update for this status.
   *
   * @return the lastUpdatedAt
   */
  public Date getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  /**
   * Gets the serviceInstanceId.
   *
   * Identifier of the service instance associated with the deployment.
   *
   * @return the serviceInstanceId
   */
  public String getServiceInstanceId() {
    return serviceInstanceId;
  }

  /**
   * Gets the status.
   *
   * Current status of the deployment.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the totalBytes.
   *
   * Total size in bytes of the file that has to be downloaded.
   *
   * @return the totalBytes
   */
  public Long getTotalBytes() {
    return totalBytes;
  }

  /**
   * Gets the vmId.
   *
   * Identifier of the virtual machine involved in the deployment.
   *
   * @return the vmId
   */
  public String getVmId() {
    return vmId;
  }
}

