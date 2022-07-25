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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * PaymentMethodUpdateInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodUpdateInput {
  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billing_address";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Object billingAddress;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholder_name";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_EXPIRATION_MONTH = "expiration_month";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_MONTH)
  private String expirationMonth;

  public static final String SERIALIZED_NAME_EXPIRATION_YEAR = "expiration_year";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_YEAR)
  private Integer expirationYear;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public PaymentMethodUpdateInput() { 
  }

  public PaymentMethodUpdateInput billingAddress(Object billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(Object billingAddress) {
    this.billingAddress = billingAddress;
  }


  public PaymentMethodUpdateInput cardholderName(String cardholderName) {
    
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * Get cardholderName
   * @return cardholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCardholderName() {
    return cardholderName;
  }


  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }


  public PaymentMethodUpdateInput _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public PaymentMethodUpdateInput expirationMonth(String expirationMonth) {
    
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Get expirationMonth
   * @return expirationMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpirationMonth() {
    return expirationMonth;
  }


  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }


  public PaymentMethodUpdateInput expirationYear(Integer expirationYear) {
    
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Get expirationYear
   * @return expirationYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getExpirationYear() {
    return expirationYear;
  }


  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }


  public PaymentMethodUpdateInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodUpdateInput paymentMethodUpdateInput = (PaymentMethodUpdateInput) o;
    return Objects.equals(this.billingAddress, paymentMethodUpdateInput.billingAddress) &&
        Objects.equals(this.cardholderName, paymentMethodUpdateInput.cardholderName) &&
        Objects.equals(this._default, paymentMethodUpdateInput._default) &&
        Objects.equals(this.expirationMonth, paymentMethodUpdateInput.expirationMonth) &&
        Objects.equals(this.expirationYear, paymentMethodUpdateInput.expirationYear) &&
        Objects.equals(this.name, paymentMethodUpdateInput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, cardholderName, _default, expirationMonth, expirationYear, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodUpdateInput {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("billing_address");
    openapiFields.add("cardholder_name");
    openapiFields.add("default");
    openapiFields.add("expiration_month");
    openapiFields.add("expiration_year");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentMethodUpdateInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentMethodUpdateInput.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentMethodUpdateInput is not found in the empty JSON string", PaymentMethodUpdateInput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentMethodUpdateInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentMethodUpdateInput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cardholder_name") != null && !jsonObj.get("cardholder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardholder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardholder_name").toString()));
      }
      if (jsonObj.get("expiration_month") != null && !jsonObj.get("expiration_month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration_month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration_month").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodUpdateInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodUpdateInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodUpdateInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodUpdateInput.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodUpdateInput>() {
           @Override
           public void write(JsonWriter out, PaymentMethodUpdateInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodUpdateInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodUpdateInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodUpdateInput
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodUpdateInput
  */
  public static PaymentMethodUpdateInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodUpdateInput.class);
  }

 /**
  * Convert an instance of PaymentMethodUpdateInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

