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
import com.equinix.openapi.metal.v1.model.InlineResponse2006Metro;
import com.equinix.openapi.metal.v1.model.InlineResponse2007;
import com.equinix.openapi.metal.v1.model.InlineResponse2009Facility;
import com.equinix.openapi.metal.v1.model.InlineResponse2009IpAddresses;
import com.equinix.openapi.metal.v1.model.InlineResponse2009OperatingSystem;
import com.equinix.openapi.metal.v1.model.InlineResponse2009Plan;
import com.equinix.openapi.metal.v1.model.InlineResponse200Devices;
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
 * InlineResponse2009
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class InlineResponse2009 {
  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("always_pxe")
  private Boolean alwaysPxe = null;

  @SerializedName("billing_cycle")
  private String billingCycle = null;

  @SerializedName("bonding_mode")
  private Integer bondingMode = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("created_by")
  private InlineResponse2006Metro createdBy = null;

  @SerializedName("customdata")
  private Object customdata = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("facility")
  private InlineResponse2009Facility facility = null;

  @SerializedName("hardware_reservation")
  private InlineResponse200Devices hardwareReservation = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("ip_addresses")
  private List<InlineResponse2009IpAddresses> ipAddresses = null;

  @SerializedName("ipxe_script_url")
  private String ipxeScriptUrl = null;

  @SerializedName("iqn")
  private String iqn = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("metro")
  private InlineResponse2006Metro metro = null;

  @SerializedName("network_ports")
  private InlineResponse2006Metro networkPorts = null;

  @SerializedName("operating_system")
  private InlineResponse2009OperatingSystem operatingSystem = null;

  @SerializedName("plan")
  private InlineResponse2009Plan plan = null;

  @SerializedName("project")
  private InlineResponse2006Metro project = null;

  @SerializedName("project_lite")
  private InlineResponse2006Metro projectLite = null;

  @SerializedName("provisioning_events")
  private List<InlineResponse2007> provisioningEvents = null;

  @SerializedName("provisioning_percentage")
  private Float provisioningPercentage = null;

  @SerializedName("root_password")
  private String rootPassword = null;

  @SerializedName("short_id")
  private String shortId = null;

  @SerializedName("spot_instance")
  private Boolean spotInstance = null;

  @SerializedName("spot_price_max")
  private Float spotPriceMax = null;

  @SerializedName("ssh_keys")
  private List<InlineResponse200Devices> sshKeys = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("switch_uuid")
  private String switchUuid = null;

  @SerializedName("termination_time")
  private OffsetDateTime terminationTime = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("userdata")
  private String userdata = null;

  @SerializedName("volumes")
  private List<InlineResponse200Devices> volumes = null;

  public InlineResponse2009 tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public InlineResponse2009 addTagsItem(String tagsItem) {
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

  public InlineResponse2009 alwaysPxe(Boolean alwaysPxe) {
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

  public InlineResponse2009 billingCycle(String billingCycle) {
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

  public InlineResponse2009 bondingMode(Integer bondingMode) {
    this.bondingMode = bondingMode;
    return this;
  }

   /**
   * Get bondingMode
   * @return bondingMode
  **/
  @ApiModelProperty(value = "")
  public Integer getBondingMode() {
    return bondingMode;
  }

  public void setBondingMode(Integer bondingMode) {
    this.bondingMode = bondingMode;
  }

  public InlineResponse2009 createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public InlineResponse2009 createdBy(InlineResponse2006Metro createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2006Metro getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(InlineResponse2006Metro createdBy) {
    this.createdBy = createdBy;
  }

  public InlineResponse2009 customdata(Object customdata) {
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

  public InlineResponse2009 description(String description) {
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

  public InlineResponse2009 facility(InlineResponse2009Facility facility) {
    this.facility = facility;
    return this;
  }

   /**
   * Get facility
   * @return facility
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2009Facility getFacility() {
    return facility;
  }

  public void setFacility(InlineResponse2009Facility facility) {
    this.facility = facility;
  }

  public InlineResponse2009 hardwareReservation(InlineResponse200Devices hardwareReservation) {
    this.hardwareReservation = hardwareReservation;
    return this;
  }

   /**
   * Get hardwareReservation
   * @return hardwareReservation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Devices getHardwareReservation() {
    return hardwareReservation;
  }

  public void setHardwareReservation(InlineResponse200Devices hardwareReservation) {
    this.hardwareReservation = hardwareReservation;
  }

  public InlineResponse2009 hostname(String hostname) {
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

  public InlineResponse2009 href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public InlineResponse2009 id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public InlineResponse2009 imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public InlineResponse2009 ipAddresses(List<InlineResponse2009IpAddresses> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public InlineResponse2009 addIpAddressesItem(InlineResponse2009IpAddresses ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<InlineResponse2009IpAddresses>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Get ipAddresses
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2009IpAddresses> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<InlineResponse2009IpAddresses> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  public InlineResponse2009 ipxeScriptUrl(String ipxeScriptUrl) {
    this.ipxeScriptUrl = ipxeScriptUrl;
    return this;
  }

   /**
   * Get ipxeScriptUrl
   * @return ipxeScriptUrl
  **/
  @ApiModelProperty(value = "")
  public String getIpxeScriptUrl() {
    return ipxeScriptUrl;
  }

  public void setIpxeScriptUrl(String ipxeScriptUrl) {
    this.ipxeScriptUrl = ipxeScriptUrl;
  }

  public InlineResponse2009 iqn(String iqn) {
    this.iqn = iqn;
    return this;
  }

   /**
   * Get iqn
   * @return iqn
  **/
  @ApiModelProperty(value = "")
  public String getIqn() {
    return iqn;
  }

  public void setIqn(String iqn) {
    this.iqn = iqn;
  }

  public InlineResponse2009 locked(Boolean locked) {
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

  public InlineResponse2009 metro(InlineResponse2006Metro metro) {
    this.metro = metro;
    return this;
  }

   /**
   * Get metro
   * @return metro
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2006Metro getMetro() {
    return metro;
  }

  public void setMetro(InlineResponse2006Metro metro) {
    this.metro = metro;
  }

  public InlineResponse2009 networkPorts(InlineResponse2006Metro networkPorts) {
    this.networkPorts = networkPorts;
    return this;
  }

   /**
   * Get networkPorts
   * @return networkPorts
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2006Metro getNetworkPorts() {
    return networkPorts;
  }

  public void setNetworkPorts(InlineResponse2006Metro networkPorts) {
    this.networkPorts = networkPorts;
  }

  public InlineResponse2009 operatingSystem(InlineResponse2009OperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Get operatingSystem
   * @return operatingSystem
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2009OperatingSystem getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(InlineResponse2009OperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public InlineResponse2009 plan(InlineResponse2009Plan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2009Plan getPlan() {
    return plan;
  }

  public void setPlan(InlineResponse2009Plan plan) {
    this.plan = plan;
  }

  public InlineResponse2009 project(InlineResponse2006Metro project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2006Metro getProject() {
    return project;
  }

  public void setProject(InlineResponse2006Metro project) {
    this.project = project;
  }

  public InlineResponse2009 projectLite(InlineResponse2006Metro projectLite) {
    this.projectLite = projectLite;
    return this;
  }

   /**
   * Get projectLite
   * @return projectLite
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2006Metro getProjectLite() {
    return projectLite;
  }

  public void setProjectLite(InlineResponse2006Metro projectLite) {
    this.projectLite = projectLite;
  }

  public InlineResponse2009 provisioningEvents(List<InlineResponse2007> provisioningEvents) {
    this.provisioningEvents = provisioningEvents;
    return this;
  }

  public InlineResponse2009 addProvisioningEventsItem(InlineResponse2007 provisioningEventsItem) {
    if (this.provisioningEvents == null) {
      this.provisioningEvents = new ArrayList<InlineResponse2007>();
    }
    this.provisioningEvents.add(provisioningEventsItem);
    return this;
  }

   /**
   * Get provisioningEvents
   * @return provisioningEvents
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2007> getProvisioningEvents() {
    return provisioningEvents;
  }

  public void setProvisioningEvents(List<InlineResponse2007> provisioningEvents) {
    this.provisioningEvents = provisioningEvents;
  }

  public InlineResponse2009 provisioningPercentage(Float provisioningPercentage) {
    this.provisioningPercentage = provisioningPercentage;
    return this;
  }

   /**
   * Only visible while device provisioning
   * @return provisioningPercentage
  **/
  @ApiModelProperty(value = "Only visible while device provisioning")
  public Float getProvisioningPercentage() {
    return provisioningPercentage;
  }

  public void setProvisioningPercentage(Float provisioningPercentage) {
    this.provisioningPercentage = provisioningPercentage;
  }

  public InlineResponse2009 rootPassword(String rootPassword) {
    this.rootPassword = rootPassword;
    return this;
  }

   /**
   * Root password is automatically generated when server is provisioned and it is removed after 24 hours
   * @return rootPassword
  **/
  @ApiModelProperty(value = "Root password is automatically generated when server is provisioned and it is removed after 24 hours")
  public String getRootPassword() {
    return rootPassword;
  }

  public void setRootPassword(String rootPassword) {
    this.rootPassword = rootPassword;
  }

  public InlineResponse2009 shortId(String shortId) {
    this.shortId = shortId;
    return this;
  }

   /**
   * Get shortId
   * @return shortId
  **/
  @ApiModelProperty(value = "")
  public String getShortId() {
    return shortId;
  }

  public void setShortId(String shortId) {
    this.shortId = shortId;
  }

  public InlineResponse2009 spotInstance(Boolean spotInstance) {
    this.spotInstance = spotInstance;
    return this;
  }

   /**
   * Whether or not the device is a spot instance.
   * @return spotInstance
  **/
  @ApiModelProperty(value = "Whether or not the device is a spot instance.")
  public Boolean isSpotInstance() {
    return spotInstance;
  }

  public void setSpotInstance(Boolean spotInstance) {
    this.spotInstance = spotInstance;
  }

  public InlineResponse2009 spotPriceMax(Float spotPriceMax) {
    this.spotPriceMax = spotPriceMax;
    return this;
  }

   /**
   * The maximum price per hour you are willing to pay to keep this spot instance.  If you are outbid, the termination will be set allowing two minutes before shutdown.
   * @return spotPriceMax
  **/
  @ApiModelProperty(value = "The maximum price per hour you are willing to pay to keep this spot instance.  If you are outbid, the termination will be set allowing two minutes before shutdown.")
  public Float getSpotPriceMax() {
    return spotPriceMax;
  }

  public void setSpotPriceMax(Float spotPriceMax) {
    this.spotPriceMax = spotPriceMax;
  }

  public InlineResponse2009 sshKeys(List<InlineResponse200Devices> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public InlineResponse2009 addSshKeysItem(InlineResponse200Devices sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<InlineResponse200Devices>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Get sshKeys
   * @return sshKeys
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200Devices> getSshKeys() {
    return sshKeys;
  }

  public void setSshKeys(List<InlineResponse200Devices> sshKeys) {
    this.sshKeys = sshKeys;
  }

  public InlineResponse2009 state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public InlineResponse2009 switchUuid(String switchUuid) {
    this.switchUuid = switchUuid;
    return this;
  }

   /**
   * Switch short id. This can be used to determine if two devices are connected to the same switch, for example.
   * @return switchUuid
  **/
  @ApiModelProperty(value = "Switch short id. This can be used to determine if two devices are connected to the same switch, for example.")
  public String getSwitchUuid() {
    return switchUuid;
  }

  public void setSwitchUuid(String switchUuid) {
    this.switchUuid = switchUuid;
  }

  public InlineResponse2009 terminationTime(OffsetDateTime terminationTime) {
    this.terminationTime = terminationTime;
    return this;
  }

   /**
   * When the device will be terminated. This is commonly set in advance for ephemeral spot market instances but this field may also be set with on-demand and reservation instances to automatically delete the resource at a given time. The termination time can also be used to release a hardware reservation instance at a given time, keeping the reservation open for other uses.  On a spot market device, the termination time will be set automatically when outbid.
   * @return terminationTime
  **/
  @ApiModelProperty(value = "When the device will be terminated. This is commonly set in advance for ephemeral spot market instances but this field may also be set with on-demand and reservation instances to automatically delete the resource at a given time. The termination time can also be used to release a hardware reservation instance at a given time, keeping the reservation open for other uses.  On a spot market device, the termination time will be set automatically when outbid.")
  public OffsetDateTime getTerminationTime() {
    return terminationTime;
  }

  public void setTerminationTime(OffsetDateTime terminationTime) {
    this.terminationTime = terminationTime;
  }

  public InlineResponse2009 updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public InlineResponse2009 user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public InlineResponse2009 userdata(String userdata) {
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

  public InlineResponse2009 volumes(List<InlineResponse200Devices> volumes) {
    this.volumes = volumes;
    return this;
  }

  public InlineResponse2009 addVolumesItem(InlineResponse200Devices volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<InlineResponse200Devices>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200Devices> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<InlineResponse200Devices> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(this.tags, inlineResponse2009.tags) &&
        Objects.equals(this.alwaysPxe, inlineResponse2009.alwaysPxe) &&
        Objects.equals(this.billingCycle, inlineResponse2009.billingCycle) &&
        Objects.equals(this.bondingMode, inlineResponse2009.bondingMode) &&
        Objects.equals(this.createdAt, inlineResponse2009.createdAt) &&
        Objects.equals(this.createdBy, inlineResponse2009.createdBy) &&
        Objects.equals(this.customdata, inlineResponse2009.customdata) &&
        Objects.equals(this.description, inlineResponse2009.description) &&
        Objects.equals(this.facility, inlineResponse2009.facility) &&
        Objects.equals(this.hardwareReservation, inlineResponse2009.hardwareReservation) &&
        Objects.equals(this.hostname, inlineResponse2009.hostname) &&
        Objects.equals(this.href, inlineResponse2009.href) &&
        Objects.equals(this.id, inlineResponse2009.id) &&
        Objects.equals(this.imageUrl, inlineResponse2009.imageUrl) &&
        Objects.equals(this.ipAddresses, inlineResponse2009.ipAddresses) &&
        Objects.equals(this.ipxeScriptUrl, inlineResponse2009.ipxeScriptUrl) &&
        Objects.equals(this.iqn, inlineResponse2009.iqn) &&
        Objects.equals(this.locked, inlineResponse2009.locked) &&
        Objects.equals(this.metro, inlineResponse2009.metro) &&
        Objects.equals(this.networkPorts, inlineResponse2009.networkPorts) &&
        Objects.equals(this.operatingSystem, inlineResponse2009.operatingSystem) &&
        Objects.equals(this.plan, inlineResponse2009.plan) &&
        Objects.equals(this.project, inlineResponse2009.project) &&
        Objects.equals(this.projectLite, inlineResponse2009.projectLite) &&
        Objects.equals(this.provisioningEvents, inlineResponse2009.provisioningEvents) &&
        Objects.equals(this.provisioningPercentage, inlineResponse2009.provisioningPercentage) &&
        Objects.equals(this.rootPassword, inlineResponse2009.rootPassword) &&
        Objects.equals(this.shortId, inlineResponse2009.shortId) &&
        Objects.equals(this.spotInstance, inlineResponse2009.spotInstance) &&
        Objects.equals(this.spotPriceMax, inlineResponse2009.spotPriceMax) &&
        Objects.equals(this.sshKeys, inlineResponse2009.sshKeys) &&
        Objects.equals(this.state, inlineResponse2009.state) &&
        Objects.equals(this.switchUuid, inlineResponse2009.switchUuid) &&
        Objects.equals(this.terminationTime, inlineResponse2009.terminationTime) &&
        Objects.equals(this.updatedAt, inlineResponse2009.updatedAt) &&
        Objects.equals(this.user, inlineResponse2009.user) &&
        Objects.equals(this.userdata, inlineResponse2009.userdata) &&
        Objects.equals(this.volumes, inlineResponse2009.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, alwaysPxe, billingCycle, bondingMode, createdAt, createdBy, customdata, description, facility, hardwareReservation, hostname, href, id, imageUrl, ipAddresses, ipxeScriptUrl, iqn, locked, metro, networkPorts, operatingSystem, plan, project, projectLite, provisioningEvents, provisioningPercentage, rootPassword, shortId, spotInstance, spotPriceMax, sshKeys, state, switchUuid, terminationTime, updatedAt, user, userdata, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    alwaysPxe: ").append(toIndentedString(alwaysPxe)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("    bondingMode: ").append(toIndentedString(bondingMode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    hardwareReservation: ").append(toIndentedString(hardwareReservation)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    ipxeScriptUrl: ").append(toIndentedString(ipxeScriptUrl)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    networkPorts: ").append(toIndentedString(networkPorts)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectLite: ").append(toIndentedString(projectLite)).append("\n");
    sb.append("    provisioningEvents: ").append(toIndentedString(provisioningEvents)).append("\n");
    sb.append("    provisioningPercentage: ").append(toIndentedString(provisioningPercentage)).append("\n");
    sb.append("    rootPassword: ").append(toIndentedString(rootPassword)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    spotInstance: ").append(toIndentedString(spotInstance)).append("\n");
    sb.append("    spotPriceMax: ").append(toIndentedString(spotPriceMax)).append("\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    switchUuid: ").append(toIndentedString(switchUuid)).append("\n");
    sb.append("    terminationTime: ").append(toIndentedString(terminationTime)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userdata: ").append(toIndentedString(userdata)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

