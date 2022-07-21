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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Body4
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class Body4 {
  /**
   * Address family for BGP session.
   */
  @JsonAdapter(AddressFamilyEnum.Adapter.class)
  public enum AddressFamilyEnum {
    IPV4("ipv4"),
    
    IPV6("ipv6");

    private String value;

    AddressFamilyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressFamilyEnum fromValue(String text) {
      for (AddressFamilyEnum b : AddressFamilyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AddressFamilyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressFamilyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressFamilyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddressFamilyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("address_family")
  private AddressFamilyEnum addressFamily = null;

  @SerializedName("default_route")
  private Boolean defaultRoute = false;

  public Body4 addressFamily(AddressFamilyEnum addressFamily) {
    this.addressFamily = addressFamily;
    return this;
  }

   /**
   * Address family for BGP session.
   * @return addressFamily
  **/
  @ApiModelProperty(example = "ipv4", value = "Address family for BGP session.")
  public AddressFamilyEnum getAddressFamily() {
    return addressFamily;
  }

  public void setAddressFamily(AddressFamilyEnum addressFamily) {
    this.addressFamily = addressFamily;
  }

  public Body4 defaultRoute(Boolean defaultRoute) {
    this.defaultRoute = defaultRoute;
    return this;
  }

   /**
   * Set the default route policy.
   * @return defaultRoute
  **/
  @ApiModelProperty(value = "Set the default route policy.")
  public Boolean isDefaultRoute() {
    return defaultRoute;
  }

  public void setDefaultRoute(Boolean defaultRoute) {
    this.defaultRoute = defaultRoute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body4 body4 = (Body4) o;
    return Objects.equals(this.addressFamily, body4.addressFamily) &&
        Objects.equals(this.defaultRoute, body4.defaultRoute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFamily, defaultRoute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body4 {\n");
    
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    defaultRoute: ").append(toIndentedString(defaultRoute)).append("\n");
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

