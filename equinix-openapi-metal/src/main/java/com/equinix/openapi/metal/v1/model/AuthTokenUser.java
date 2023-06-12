/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. The fields available for search differ by resource, as does the search strategy.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.metal.v1.model.Href;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * AuthTokenUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthTokenUser {
  public static final String SERIALIZED_NAME_AVATAR_THUMB_URL = "avatar_thumb_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_THUMB_URL)
  private String avatarThumbUrl;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOMDATA = "customdata";
  @SerializedName(SERIALIZED_NAME_CUSTOMDATA)
  private Object customdata;

  public static final String SERIALIZED_NAME_DEFAULT_ORGANIZATION_ID = "default_organization_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ORGANIZATION_ID)
  private UUID defaultOrganizationId;

  public static final String SERIALIZED_NAME_DEFAULT_PROJECT_ID = "default_project_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PROJECT_ID)
  private UUID defaultProjectId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<Href> emails = null;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_FRAUD_SCORE = "fraud_score";
  @SerializedName(SERIALIZED_NAME_FRAUD_SCORE)
  private String fraudScore;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LAST_LOGIN_AT = "last_login_at";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN_AT)
  private OffsetDateTime lastLoginAt;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MAX_ORGANIZATIONS = "max_organizations";
  @SerializedName(SERIALIZED_NAME_MAX_ORGANIZATIONS)
  private Integer maxOrganizations;

  public static final String SERIALIZED_NAME_MAX_PROJECTS = "max_projects";
  @SerializedName(SERIALIZED_NAME_MAX_PROJECTS)
  private Integer maxProjects;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_SHORT_ID = "short_id";
  @SerializedName(SERIALIZED_NAME_SHORT_ID)
  private String shortId;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_TWO_FACTOR_AUTH = "two_factor_auth";
  @SerializedName(SERIALIZED_NAME_TWO_FACTOR_AUTH)
  private String twoFactorAuth;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AuthTokenUser() {
  }

  public AuthTokenUser avatarThumbUrl(String avatarThumbUrl) {
    
    this.avatarThumbUrl = avatarThumbUrl;
    return this;
  }

   /**
   * Get avatarThumbUrl
   * @return avatarThumbUrl
  **/
  @javax.annotation.Nullable

  public String getAvatarThumbUrl() {
    return avatarThumbUrl;
  }


  public void setAvatarThumbUrl(String avatarThumbUrl) {
    this.avatarThumbUrl = avatarThumbUrl;
  }


  public AuthTokenUser avatarUrl(String avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @javax.annotation.Nullable

  public String getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public AuthTokenUser createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AuthTokenUser customdata(Object customdata) {
    
    this.customdata = customdata;
    return this;
  }

   /**
   * Get customdata
   * @return customdata
  **/
  @javax.annotation.Nullable

  public Object getCustomdata() {
    return customdata;
  }


  public void setCustomdata(Object customdata) {
    this.customdata = customdata;
  }


  public AuthTokenUser defaultOrganizationId(UUID defaultOrganizationId) {
    
    this.defaultOrganizationId = defaultOrganizationId;
    return this;
  }

   /**
   * Get defaultOrganizationId
   * @return defaultOrganizationId
  **/
  @javax.annotation.Nullable

  public UUID getDefaultOrganizationId() {
    return defaultOrganizationId;
  }


  public void setDefaultOrganizationId(UUID defaultOrganizationId) {
    this.defaultOrganizationId = defaultOrganizationId;
  }


  public AuthTokenUser defaultProjectId(UUID defaultProjectId) {
    
    this.defaultProjectId = defaultProjectId;
    return this;
  }

   /**
   * Get defaultProjectId
   * @return defaultProjectId
  **/
  @javax.annotation.Nullable

  public UUID getDefaultProjectId() {
    return defaultProjectId;
  }


  public void setDefaultProjectId(UUID defaultProjectId) {
    this.defaultProjectId = defaultProjectId;
  }


  public AuthTokenUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AuthTokenUser emails(List<Href> emails) {
    
    this.emails = emails;
    return this;
  }

  public AuthTokenUser addEmailsItem(Href emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @javax.annotation.Nullable

  public List<Href> getEmails() {
    return emails;
  }


  public void setEmails(List<Href> emails) {
    this.emails = emails;
  }


  public AuthTokenUser firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public AuthTokenUser fraudScore(String fraudScore) {
    
    this.fraudScore = fraudScore;
    return this;
  }

   /**
   * Get fraudScore
   * @return fraudScore
  **/
  @javax.annotation.Nullable

  public String getFraudScore() {
    return fraudScore;
  }


  public void setFraudScore(String fraudScore) {
    this.fraudScore = fraudScore;
  }


  public AuthTokenUser fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public AuthTokenUser href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public AuthTokenUser id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AuthTokenUser lastLoginAt(OffsetDateTime lastLoginAt) {
    
    this.lastLoginAt = lastLoginAt;
    return this;
  }

   /**
   * Get lastLoginAt
   * @return lastLoginAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastLoginAt() {
    return lastLoginAt;
  }


  public void setLastLoginAt(OffsetDateTime lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }


  public AuthTokenUser lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public AuthTokenUser maxOrganizations(Integer maxOrganizations) {
    
    this.maxOrganizations = maxOrganizations;
    return this;
  }

   /**
   * Get maxOrganizations
   * @return maxOrganizations
  **/
  @javax.annotation.Nullable

  public Integer getMaxOrganizations() {
    return maxOrganizations;
  }


  public void setMaxOrganizations(Integer maxOrganizations) {
    this.maxOrganizations = maxOrganizations;
  }


  public AuthTokenUser maxProjects(Integer maxProjects) {
    
    this.maxProjects = maxProjects;
    return this;
  }

   /**
   * Get maxProjects
   * @return maxProjects
  **/
  @javax.annotation.Nullable

  public Integer getMaxProjects() {
    return maxProjects;
  }


  public void setMaxProjects(Integer maxProjects) {
    this.maxProjects = maxProjects;
  }


  public AuthTokenUser phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public AuthTokenUser shortId(String shortId) {
    
    this.shortId = shortId;
    return this;
  }

   /**
   * Get shortId
   * @return shortId
  **/
  @javax.annotation.Nullable

  public String getShortId() {
    return shortId;
  }


  public void setShortId(String shortId) {
    this.shortId = shortId;
  }


  public AuthTokenUser timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public AuthTokenUser twoFactorAuth(String twoFactorAuth) {
    
    this.twoFactorAuth = twoFactorAuth;
    return this;
  }

   /**
   * Get twoFactorAuth
   * @return twoFactorAuth
  **/
  @javax.annotation.Nullable

  public String getTwoFactorAuth() {
    return twoFactorAuth;
  }


  public void setTwoFactorAuth(String twoFactorAuth) {
    this.twoFactorAuth = twoFactorAuth;
  }


  public AuthTokenUser updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AuthTokenUser instance itself
   */
  public AuthTokenUser putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthTokenUser authTokenUser = (AuthTokenUser) o;
    return Objects.equals(this.avatarThumbUrl, authTokenUser.avatarThumbUrl) &&
        Objects.equals(this.avatarUrl, authTokenUser.avatarUrl) &&
        Objects.equals(this.createdAt, authTokenUser.createdAt) &&
        Objects.equals(this.customdata, authTokenUser.customdata) &&
        Objects.equals(this.defaultOrganizationId, authTokenUser.defaultOrganizationId) &&
        Objects.equals(this.defaultProjectId, authTokenUser.defaultProjectId) &&
        Objects.equals(this.email, authTokenUser.email) &&
        Objects.equals(this.emails, authTokenUser.emails) &&
        Objects.equals(this.firstName, authTokenUser.firstName) &&
        Objects.equals(this.fraudScore, authTokenUser.fraudScore) &&
        Objects.equals(this.fullName, authTokenUser.fullName) &&
        Objects.equals(this.href, authTokenUser.href) &&
        Objects.equals(this.id, authTokenUser.id) &&
        Objects.equals(this.lastLoginAt, authTokenUser.lastLoginAt) &&
        Objects.equals(this.lastName, authTokenUser.lastName) &&
        Objects.equals(this.maxOrganizations, authTokenUser.maxOrganizations) &&
        Objects.equals(this.maxProjects, authTokenUser.maxProjects) &&
        Objects.equals(this.phoneNumber, authTokenUser.phoneNumber) &&
        Objects.equals(this.shortId, authTokenUser.shortId) &&
        Objects.equals(this.timezone, authTokenUser.timezone) &&
        Objects.equals(this.twoFactorAuth, authTokenUser.twoFactorAuth) &&
        Objects.equals(this.updatedAt, authTokenUser.updatedAt)&&
        Objects.equals(this.additionalProperties, authTokenUser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarThumbUrl, avatarUrl, createdAt, customdata, defaultOrganizationId, defaultProjectId, email, emails, firstName, fraudScore, fullName, href, id, lastLoginAt, lastName, maxOrganizations, maxProjects, phoneNumber, shortId, timezone, twoFactorAuth, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthTokenUser {\n");
    sb.append("    avatarThumbUrl: ").append(toIndentedString(avatarThumbUrl)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    defaultOrganizationId: ").append(toIndentedString(defaultOrganizationId)).append("\n");
    sb.append("    defaultProjectId: ").append(toIndentedString(defaultProjectId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fraudScore: ").append(toIndentedString(fraudScore)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    maxOrganizations: ").append(toIndentedString(maxOrganizations)).append("\n");
    sb.append("    maxProjects: ").append(toIndentedString(maxProjects)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    twoFactorAuth: ").append(toIndentedString(twoFactorAuth)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("avatar_thumb_url");
    openapiFields.add("avatar_url");
    openapiFields.add("created_at");
    openapiFields.add("customdata");
    openapiFields.add("default_organization_id");
    openapiFields.add("default_project_id");
    openapiFields.add("email");
    openapiFields.add("emails");
    openapiFields.add("first_name");
    openapiFields.add("fraud_score");
    openapiFields.add("full_name");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("last_login_at");
    openapiFields.add("last_name");
    openapiFields.add("max_organizations");
    openapiFields.add("max_projects");
    openapiFields.add("phone_number");
    openapiFields.add("short_id");
    openapiFields.add("timezone");
    openapiFields.add("two_factor_auth");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthTokenUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthTokenUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthTokenUser is not found in the empty JSON string", AuthTokenUser.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("avatar_thumb_url") != null && !jsonObj.get("avatar_thumb_url").isJsonNull()) && !jsonObj.get("avatar_thumb_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_thumb_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_thumb_url").toString()));
      }
      if ((jsonObj.get("avatar_url") != null && !jsonObj.get("avatar_url").isJsonNull()) && !jsonObj.get("avatar_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_url").toString()));
      }
      if ((jsonObj.get("default_organization_id") != null && !jsonObj.get("default_organization_id").isJsonNull()) && !jsonObj.get("default_organization_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_organization_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_organization_id").toString()));
      }
      if ((jsonObj.get("default_project_id") != null && !jsonObj.get("default_project_id").isJsonNull()) && !jsonObj.get("default_project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_project_id").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("emails") != null && !jsonObj.get("emails").isJsonNull()) {
        JsonArray jsonArrayemails = jsonObj.getAsJsonArray("emails");
        if (jsonArrayemails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emails` to be an array in the JSON string but got `%s`", jsonObj.get("emails").toString()));
          }

          // validate the optional field `emails` (array)
          for (int i = 0; i < jsonArrayemails.size(); i++) {
            Href.validateJsonObject(jsonArrayemails.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("fraud_score") != null && !jsonObj.get("fraud_score").isJsonNull()) && !jsonObj.get("fraud_score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fraud_score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fraud_score").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonNull()) && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if ((jsonObj.get("short_id") != null && !jsonObj.get("short_id").isJsonNull()) && !jsonObj.get("short_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_id").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("two_factor_auth") != null && !jsonObj.get("two_factor_auth").isJsonNull()) && !jsonObj.get("two_factor_auth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `two_factor_auth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("two_factor_auth").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthTokenUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthTokenUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthTokenUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthTokenUser.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthTokenUser>() {
           @Override
           public void write(JsonWriter out, AuthTokenUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthTokenUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthTokenUser instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthTokenUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthTokenUser
  * @throws IOException if the JSON string is invalid with respect to AuthTokenUser
  */
  public static AuthTokenUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthTokenUser.class);
  }

 /**
  * Convert an instance of AuthTokenUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

