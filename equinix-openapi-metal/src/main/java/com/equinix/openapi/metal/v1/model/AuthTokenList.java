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
import com.equinix.openapi.metal.v1.model.AuthToken;
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
 * AuthTokenList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthTokenList {
  public static final String SERIALIZED_NAME_API_KEYS = "api_keys";
  @SerializedName(SERIALIZED_NAME_API_KEYS)
  private List<AuthToken> apiKeys = null;

  public AuthTokenList() { 
  }

  public AuthTokenList apiKeys(List<AuthToken> apiKeys) {
    
    this.apiKeys = apiKeys;
    return this;
  }

  public AuthTokenList addApiKeysItem(AuthToken apiKeysItem) {
    if (this.apiKeys == null) {
      this.apiKeys = new ArrayList<>();
    }
    this.apiKeys.add(apiKeysItem);
    return this;
  }

   /**
   * Get apiKeys
   * @return apiKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AuthToken> getApiKeys() {
    return apiKeys;
  }


  public void setApiKeys(List<AuthToken> apiKeys) {
    this.apiKeys = apiKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthTokenList authTokenList = (AuthTokenList) o;
    return Objects.equals(this.apiKeys, authTokenList.apiKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthTokenList {\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
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
    openapiFields.add("api_keys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthTokenList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthTokenList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthTokenList is not found in the empty JSON string", AuthTokenList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthTokenList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthTokenList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayapiKeys = jsonObj.getAsJsonArray("api_keys");
      if (jsonArrayapiKeys != null) {
        // ensure the json data is an array
        if (!jsonObj.get("api_keys").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `api_keys` to be an array in the JSON string but got `%s`", jsonObj.get("api_keys").toString()));
        }

        // validate the optional field `api_keys` (array)
        for (int i = 0; i < jsonArrayapiKeys.size(); i++) {
          AuthToken.validateJsonObject(jsonArrayapiKeys.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthTokenList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthTokenList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthTokenList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthTokenList.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthTokenList>() {
           @Override
           public void write(JsonWriter out, AuthTokenList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthTokenList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthTokenList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthTokenList
  * @throws IOException if the JSON string is invalid with respect to AuthTokenList
  */
  public static AuthTokenList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthTokenList.class);
  }

 /**
  * Convert an instance of AuthTokenList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

