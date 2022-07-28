/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * PortVlanAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortVlanAssignment {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NATIVE = "native";
  @SerializedName(SERIALIZED_NAME_NATIVE)
  private Boolean _native;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Href port;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ASSIGNED("assigned"),
    
    UNASSIGNING("unassigning");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VIRTUAL_NETWORK = "virtual_network";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NETWORK)
  private Href virtualNetwork;

  public static final String SERIALIZED_NAME_VLAN = "vlan";
  @SerializedName(SERIALIZED_NAME_VLAN)
  private Integer vlan;

  public PortVlanAssignment() {
  }

  public PortVlanAssignment createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PortVlanAssignment id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public PortVlanAssignment _native(Boolean _native) {
    
    this._native = _native;
    return this;
  }

   /**
   * Get _native
   * @return _native
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNative() {
    return _native;
  }


  public void setNative(Boolean _native) {
    this._native = _native;
  }


  public PortVlanAssignment port(Href port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Href getPort() {
    return port;
  }


  public void setPort(Href port) {
    this.port = port;
  }


  public PortVlanAssignment state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public PortVlanAssignment updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PortVlanAssignment virtualNetwork(Href virtualNetwork) {
    
    this.virtualNetwork = virtualNetwork;
    return this;
  }

   /**
   * Get virtualNetwork
   * @return virtualNetwork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Href getVirtualNetwork() {
    return virtualNetwork;
  }


  public void setVirtualNetwork(Href virtualNetwork) {
    this.virtualNetwork = virtualNetwork;
  }


  public PortVlanAssignment vlan(Integer vlan) {
    
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVlan() {
    return vlan;
  }


  public void setVlan(Integer vlan) {
    this.vlan = vlan;
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
   */
  public PortVlanAssignment putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
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
    PortVlanAssignment portVlanAssignment = (PortVlanAssignment) o;
    return Objects.equals(this.createdAt, portVlanAssignment.createdAt) &&
        Objects.equals(this.id, portVlanAssignment.id) &&
        Objects.equals(this._native, portVlanAssignment._native) &&
        Objects.equals(this.port, portVlanAssignment.port) &&
        Objects.equals(this.state, portVlanAssignment.state) &&
        Objects.equals(this.updatedAt, portVlanAssignment.updatedAt) &&
        Objects.equals(this.virtualNetwork, portVlanAssignment.virtualNetwork) &&
        Objects.equals(this.vlan, portVlanAssignment.vlan)&&
        Objects.equals(this.additionalProperties, portVlanAssignment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, _native, port, state, updatedAt, virtualNetwork, vlan, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortVlanAssignment {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _native: ").append(toIndentedString(_native)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    virtualNetwork: ").append(toIndentedString(virtualNetwork)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("native");
    openapiFields.add("port");
    openapiFields.add("state");
    openapiFields.add("updated_at");
    openapiFields.add("virtual_network");
    openapiFields.add("vlan");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortVlanAssignment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PortVlanAssignment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortVlanAssignment is not found in the empty JSON string", PortVlanAssignment.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `port`
      if (jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) {
        Href.validateJsonObject(jsonObj.getAsJsonObject("port"));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `virtual_network`
      if (jsonObj.get("virtual_network") != null && !jsonObj.get("virtual_network").isJsonNull()) {
        Href.validateJsonObject(jsonObj.getAsJsonObject("virtual_network"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortVlanAssignment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortVlanAssignment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortVlanAssignment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortVlanAssignment.class));

       return (TypeAdapter<T>) new TypeAdapter<PortVlanAssignment>() {
           @Override
           public void write(JsonWriter out, PortVlanAssignment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
           public PortVlanAssignment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PortVlanAssignment instance = thisAdapter.fromJsonTree(jsonObj);
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
                 } else { // non-primitive type
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
  * Create an instance of PortVlanAssignment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortVlanAssignment
  * @throws IOException if the JSON string is invalid with respect to PortVlanAssignment
  */
  public static PortVlanAssignment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortVlanAssignment.class);
  }

 /**
  * Convert an instance of PortVlanAssignment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
