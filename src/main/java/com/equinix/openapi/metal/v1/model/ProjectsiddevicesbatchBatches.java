/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.metal.v1.model.ProjectsiddevicesbatchIpAddresses;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * ProjectsiddevicesbatchBatches
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class ProjectsiddevicesbatchBatches {
  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("always_pxe")
  private Boolean alwaysPxe = null;

  @SerializedName("billing_cycle")
  private String billingCycle = null;

  @SerializedName("customdata")
  private Object customdata = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("facility")
  private List<String> facility = null;

  @SerializedName("features")
  private List<String> features = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("hostnames")
  private List<String> hostnames = null;

  @SerializedName("ip_addresses")
  private List<ProjectsiddevicesbatchIpAddresses> ipAddresses = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("metro")
  private String metro = null;

  @SerializedName("no_ssh_keys")
  private Boolean noSshKeys = null;

  @SerializedName("operating_system")
  private String operatingSystem = null;

  @SerializedName("plan")
  private String plan = null;

  @SerializedName("project_ssh_keys")
  private List<UUID> projectSshKeys = null;

  @SerializedName("termination_time")
  private OffsetDateTime terminationTime = null;

  @SerializedName("user_ssh_keys")
  private List<UUID> userSshKeys = null;

  @SerializedName("userdata")
  private String userdata = null;

  public ProjectsiddevicesbatchBatches tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ProjectsiddevicesbatchBatches addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ProjectsiddevicesbatchBatches alwaysPxe(Boolean alwaysPxe) {
    this.alwaysPxe = alwaysPxe;
    return this;
  }

   /**
   * Get alwaysPxe
   * @return alwaysPxe
  **/
  @ApiModelProperty(value = "")
  public Boolean isAlwaysPxe() {
    return alwaysPxe;
  }

  public void setAlwaysPxe(Boolean alwaysPxe) {
    this.alwaysPxe = alwaysPxe;
  }

  public ProjectsiddevicesbatchBatches billingCycle(String billingCycle) {
    this.billingCycle = billingCycle;
    return this;
  }

   /**
   * Get billingCycle
   * @return billingCycle
  **/
  @ApiModelProperty(value = "")
  public String getBillingCycle() {
    return billingCycle;
  }

  public void setBillingCycle(String billingCycle) {
    this.billingCycle = billingCycle;
  }

  public ProjectsiddevicesbatchBatches customdata(Object customdata) {
    this.customdata = customdata;
    return this;
  }

   /**
   * Get customdata
   * @return customdata
  **/
  @ApiModelProperty(value = "")
  public Object getCustomdata() {
    return customdata;
  }

  public void setCustomdata(Object customdata) {
    this.customdata = customdata;
  }

  public ProjectsiddevicesbatchBatches description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectsiddevicesbatchBatches facility(List<String> facility) {
    this.facility = facility;
    return this;
  }

  public ProjectsiddevicesbatchBatches addFacilityItem(String facilityItem) {
    if (this.facility == null) {
      this.facility = new ArrayList<String>();
    }
    this.facility.add(facilityItem);
    return this;
  }

   /**
   * Array of facility codes the batch can use for provisioning. This param also takes a string if you want the batch to be fulfilled in only one facility. Cannot be set if the metro is already set.
   * @return facility
  **/
  @ApiModelProperty(value = "Array of facility codes the batch can use for provisioning. This param also takes a string if you want the batch to be fulfilled in only one facility. Cannot be set if the metro is already set.")
  public List<String> getFacility() {
    return facility;
  }

  public void setFacility(List<String> facility) {
    this.facility = facility;
  }

  public ProjectsiddevicesbatchBatches features(List<String> features) {
    this.features = features;
    return this;
  }

  public ProjectsiddevicesbatchBatches addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<String>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public ProjectsiddevicesbatchBatches hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @ApiModelProperty(value = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public ProjectsiddevicesbatchBatches hostnames(List<String> hostnames) {
    this.hostnames = hostnames;
    return this;
  }

  public ProjectsiddevicesbatchBatches addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<String>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Get hostnames
   * @return hostnames
  **/
  @ApiModelProperty(value = "")
  public List<String> getHostnames() {
    return hostnames;
  }

  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }

  public ProjectsiddevicesbatchBatches ipAddresses(List<ProjectsiddevicesbatchIpAddresses> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public ProjectsiddevicesbatchBatches addIpAddressesItem(ProjectsiddevicesbatchIpAddresses ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<ProjectsiddevicesbatchIpAddresses>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Get ipAddresses
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "")
  public List<ProjectsiddevicesbatchIpAddresses> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<ProjectsiddevicesbatchIpAddresses> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  public ProjectsiddevicesbatchBatches locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public ProjectsiddevicesbatchBatches metro(String metro) {
    this.metro = metro;
    return this;
  }

   /**
   * The metro ID or code the batch can use for provisioning. Cannot be set if the facility is already set.
   * @return metro
  **/
  @ApiModelProperty(value = "The metro ID or code the batch can use for provisioning. Cannot be set if the facility is already set.")
  public String getMetro() {
    return metro;
  }

  public void setMetro(String metro) {
    this.metro = metro;
  }

  public ProjectsiddevicesbatchBatches noSshKeys(Boolean noSshKeys) {
    this.noSshKeys = noSshKeys;
    return this;
  }

   /**
   * Get noSshKeys
   * @return noSshKeys
  **/
  @ApiModelProperty(value = "")
  public Boolean isNoSshKeys() {
    return noSshKeys;
  }

  public void setNoSshKeys(Boolean noSshKeys) {
    this.noSshKeys = noSshKeys;
  }

  public ProjectsiddevicesbatchBatches operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Get operatingSystem
   * @return operatingSystem
  **/
  @ApiModelProperty(value = "")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public ProjectsiddevicesbatchBatches plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(value = "")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public ProjectsiddevicesbatchBatches projectSshKeys(List<UUID> projectSshKeys) {
    this.projectSshKeys = projectSshKeys;
    return this;
  }

  public ProjectsiddevicesbatchBatches addProjectSshKeysItem(UUID projectSshKeysItem) {
    if (this.projectSshKeys == null) {
      this.projectSshKeys = new ArrayList<UUID>();
    }
    this.projectSshKeys.add(projectSshKeysItem);
    return this;
  }

   /**
   * Get projectSshKeys
   * @return projectSshKeys
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getProjectSshKeys() {
    return projectSshKeys;
  }

  public void setProjectSshKeys(List<UUID> projectSshKeys) {
    this.projectSshKeys = projectSshKeys;
  }

  public ProjectsiddevicesbatchBatches terminationTime(OffsetDateTime terminationTime) {
    this.terminationTime = terminationTime;
    return this;
  }

   /**
   * Get terminationTime
   * @return terminationTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminationTime() {
    return terminationTime;
  }

  public void setTerminationTime(OffsetDateTime terminationTime) {
    this.terminationTime = terminationTime;
  }

  public ProjectsiddevicesbatchBatches userSshKeys(List<UUID> userSshKeys) {
    this.userSshKeys = userSshKeys;
    return this;
  }

  public ProjectsiddevicesbatchBatches addUserSshKeysItem(UUID userSshKeysItem) {
    if (this.userSshKeys == null) {
      this.userSshKeys = new ArrayList<UUID>();
    }
    this.userSshKeys.add(userSshKeysItem);
    return this;
  }

   /**
   * The UUIDs of users whose SSH keys should be included on the provisioned device.
   * @return userSshKeys
  **/
  @ApiModelProperty(value = "The UUIDs of users whose SSH keys should be included on the provisioned device.")
  public List<UUID> getUserSshKeys() {
    return userSshKeys;
  }

  public void setUserSshKeys(List<UUID> userSshKeys) {
    this.userSshKeys = userSshKeys;
  }

  public ProjectsiddevicesbatchBatches userdata(String userdata) {
    this.userdata = userdata;
    return this;
  }

   /**
   * Get userdata
   * @return userdata
  **/
  @ApiModelProperty(value = "")
  public String getUserdata() {
    return userdata;
  }

  public void setUserdata(String userdata) {
    this.userdata = userdata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsiddevicesbatchBatches projectsiddevicesbatchBatches = (ProjectsiddevicesbatchBatches) o;
    return Objects.equals(this.tags, projectsiddevicesbatchBatches.tags) &&
        Objects.equals(this.alwaysPxe, projectsiddevicesbatchBatches.alwaysPxe) &&
        Objects.equals(this.billingCycle, projectsiddevicesbatchBatches.billingCycle) &&
        Objects.equals(this.customdata, projectsiddevicesbatchBatches.customdata) &&
        Objects.equals(this.description, projectsiddevicesbatchBatches.description) &&
        Objects.equals(this.facility, projectsiddevicesbatchBatches.facility) &&
        Objects.equals(this.features, projectsiddevicesbatchBatches.features) &&
        Objects.equals(this.hostname, projectsiddevicesbatchBatches.hostname) &&
        Objects.equals(this.hostnames, projectsiddevicesbatchBatches.hostnames) &&
        Objects.equals(this.ipAddresses, projectsiddevicesbatchBatches.ipAddresses) &&
        Objects.equals(this.locked, projectsiddevicesbatchBatches.locked) &&
        Objects.equals(this.metro, projectsiddevicesbatchBatches.metro) &&
        Objects.equals(this.noSshKeys, projectsiddevicesbatchBatches.noSshKeys) &&
        Objects.equals(this.operatingSystem, projectsiddevicesbatchBatches.operatingSystem) &&
        Objects.equals(this.plan, projectsiddevicesbatchBatches.plan) &&
        Objects.equals(this.projectSshKeys, projectsiddevicesbatchBatches.projectSshKeys) &&
        Objects.equals(this.terminationTime, projectsiddevicesbatchBatches.terminationTime) &&
        Objects.equals(this.userSshKeys, projectsiddevicesbatchBatches.userSshKeys) &&
        Objects.equals(this.userdata, projectsiddevicesbatchBatches.userdata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, alwaysPxe, billingCycle, customdata, description, facility, features, hostname, hostnames, ipAddresses, locked, metro, noSshKeys, operatingSystem, plan, projectSshKeys, terminationTime, userSshKeys, userdata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsiddevicesbatchBatches {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    alwaysPxe: ").append(toIndentedString(alwaysPxe)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    noSshKeys: ").append(toIndentedString(noSshKeys)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    projectSshKeys: ").append(toIndentedString(projectSshKeys)).append("\n");
    sb.append("    terminationTime: ").append(toIndentedString(terminationTime)).append("\n");
    sb.append("    userSshKeys: ").append(toIndentedString(userSshKeys)).append("\n");
    sb.append("    userdata: ").append(toIndentedString(userdata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

