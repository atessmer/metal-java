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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * SelfServiceReservationItemResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SelfServiceReservationItemResponse {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METRO_CODE = "metro_code";
  @SerializedName(SERIALIZED_NAME_METRO_CODE)
  private String metroCode;

  public static final String SERIALIZED_NAME_METRO_ID = "metro_id";
  @SerializedName(SERIALIZED_NAME_METRO_ID)
  private UUID metroId;

  public static final String SERIALIZED_NAME_METRO_NAME = "metro_name";
  @SerializedName(SERIALIZED_NAME_METRO_NAME)
  private String metroName;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private UUID planId;

  public static final String SERIALIZED_NAME_PLAN_NAME = "plan_name";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_SLUG = "plan_slug";
  @SerializedName(SERIALIZED_NAME_PLAN_SLUG)
  private String planSlug;

  public static final String SERIALIZED_NAME_PLAN_CATEGORIES = "plan_categories";
  @SerializedName(SERIALIZED_NAME_PLAN_CATEGORIES)
  private List<String> planCategories = null;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_TERM = "term";
  @SerializedName(SERIALIZED_NAME_TERM)
  private String term;

  public SelfServiceReservationItemResponse() {
  }

  public SelfServiceReservationItemResponse amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public SelfServiceReservationItemResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SelfServiceReservationItemResponse metroCode(String metroCode) {
    
    this.metroCode = metroCode;
    return this;
  }

   /**
   * Get metroCode
   * @return metroCode
  **/
  @javax.annotation.Nullable

  public String getMetroCode() {
    return metroCode;
  }


  public void setMetroCode(String metroCode) {
    this.metroCode = metroCode;
  }


  public SelfServiceReservationItemResponse metroId(UUID metroId) {
    
    this.metroId = metroId;
    return this;
  }

   /**
   * Get metroId
   * @return metroId
  **/
  @javax.annotation.Nullable

  public UUID getMetroId() {
    return metroId;
  }


  public void setMetroId(UUID metroId) {
    this.metroId = metroId;
  }


  public SelfServiceReservationItemResponse metroName(String metroName) {
    
    this.metroName = metroName;
    return this;
  }

   /**
   * Get metroName
   * @return metroName
  **/
  @javax.annotation.Nullable

  public String getMetroName() {
    return metroName;
  }


  public void setMetroName(String metroName) {
    this.metroName = metroName;
  }


  public SelfServiceReservationItemResponse planId(UUID planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nullable

  public UUID getPlanId() {
    return planId;
  }


  public void setPlanId(UUID planId) {
    this.planId = planId;
  }


  public SelfServiceReservationItemResponse planName(String planName) {
    
    this.planName = planName;
    return this;
  }

   /**
   * Get planName
   * @return planName
  **/
  @javax.annotation.Nullable

  public String getPlanName() {
    return planName;
  }


  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public SelfServiceReservationItemResponse planSlug(String planSlug) {
    
    this.planSlug = planSlug;
    return this;
  }

   /**
   * Get planSlug
   * @return planSlug
  **/
  @javax.annotation.Nullable

  public String getPlanSlug() {
    return planSlug;
  }


  public void setPlanSlug(String planSlug) {
    this.planSlug = planSlug;
  }


  public SelfServiceReservationItemResponse planCategories(List<String> planCategories) {
    
    this.planCategories = planCategories;
    return this;
  }

  public SelfServiceReservationItemResponse addPlanCategoriesItem(String planCategoriesItem) {
    if (this.planCategories == null) {
      this.planCategories = new ArrayList<>();
    }
    this.planCategories.add(planCategoriesItem);
    return this;
  }

   /**
   * Get planCategories
   * @return planCategories
  **/
  @javax.annotation.Nullable

  public List<String> getPlanCategories() {
    return planCategories;
  }


  public void setPlanCategories(List<String> planCategories) {
    this.planCategories = planCategories;
  }


  public SelfServiceReservationItemResponse quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public SelfServiceReservationItemResponse term(String term) {
    
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @javax.annotation.Nullable

  public String getTerm() {
    return term;
  }


  public void setTerm(String term) {
    this.term = term;
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
   * @return the SelfServiceReservationItemResponse instance itself
   */
  public SelfServiceReservationItemResponse putAdditionalProperty(String key, Object value) {
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
    SelfServiceReservationItemResponse selfServiceReservationItemResponse = (SelfServiceReservationItemResponse) o;
    return Objects.equals(this.amount, selfServiceReservationItemResponse.amount) &&
        Objects.equals(this.id, selfServiceReservationItemResponse.id) &&
        Objects.equals(this.metroCode, selfServiceReservationItemResponse.metroCode) &&
        Objects.equals(this.metroId, selfServiceReservationItemResponse.metroId) &&
        Objects.equals(this.metroName, selfServiceReservationItemResponse.metroName) &&
        Objects.equals(this.planId, selfServiceReservationItemResponse.planId) &&
        Objects.equals(this.planName, selfServiceReservationItemResponse.planName) &&
        Objects.equals(this.planSlug, selfServiceReservationItemResponse.planSlug) &&
        Objects.equals(this.planCategories, selfServiceReservationItemResponse.planCategories) &&
        Objects.equals(this.quantity, selfServiceReservationItemResponse.quantity) &&
        Objects.equals(this.term, selfServiceReservationItemResponse.term)&&
        Objects.equals(this.additionalProperties, selfServiceReservationItemResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, id, metroCode, metroId, metroName, planId, planName, planSlug, planCategories, quantity, term, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfServiceReservationItemResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metroCode: ").append(toIndentedString(metroCode)).append("\n");
    sb.append("    metroId: ").append(toIndentedString(metroId)).append("\n");
    sb.append("    metroName: ").append(toIndentedString(metroName)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planSlug: ").append(toIndentedString(planSlug)).append("\n");
    sb.append("    planCategories: ").append(toIndentedString(planCategories)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("id");
    openapiFields.add("metro_code");
    openapiFields.add("metro_id");
    openapiFields.add("metro_name");
    openapiFields.add("plan_id");
    openapiFields.add("plan_name");
    openapiFields.add("plan_slug");
    openapiFields.add("plan_categories");
    openapiFields.add("quantity");
    openapiFields.add("term");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SelfServiceReservationItemResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SelfServiceReservationItemResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SelfServiceReservationItemResponse is not found in the empty JSON string", SelfServiceReservationItemResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("metro_code") != null && !jsonObj.get("metro_code").isJsonNull()) && !jsonObj.get("metro_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metro_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metro_code").toString()));
      }
      if ((jsonObj.get("metro_id") != null && !jsonObj.get("metro_id").isJsonNull()) && !jsonObj.get("metro_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metro_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metro_id").toString()));
      }
      if ((jsonObj.get("metro_name") != null && !jsonObj.get("metro_name").isJsonNull()) && !jsonObj.get("metro_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metro_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metro_name").toString()));
      }
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if ((jsonObj.get("plan_name") != null && !jsonObj.get("plan_name").isJsonNull()) && !jsonObj.get("plan_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_name").toString()));
      }
      if ((jsonObj.get("plan_slug") != null && !jsonObj.get("plan_slug").isJsonNull()) && !jsonObj.get("plan_slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_slug").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("plan_categories") != null && !jsonObj.get("plan_categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_categories` to be an array in the JSON string but got `%s`", jsonObj.get("plan_categories").toString()));
      }
      if ((jsonObj.get("term") != null && !jsonObj.get("term").isJsonNull()) && !jsonObj.get("term").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `term` to be a primitive type in the JSON string but got `%s`", jsonObj.get("term").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SelfServiceReservationItemResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SelfServiceReservationItemResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SelfServiceReservationItemResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SelfServiceReservationItemResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SelfServiceReservationItemResponse>() {
           @Override
           public void write(JsonWriter out, SelfServiceReservationItemResponse value) throws IOException {
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
           public SelfServiceReservationItemResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SelfServiceReservationItemResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SelfServiceReservationItemResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SelfServiceReservationItemResponse
  * @throws IOException if the JSON string is invalid with respect to SelfServiceReservationItemResponse
  */
  public static SelfServiceReservationItemResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SelfServiceReservationItemResponse.class);
  }

 /**
  * Convert an instance of SelfServiceReservationItemResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

