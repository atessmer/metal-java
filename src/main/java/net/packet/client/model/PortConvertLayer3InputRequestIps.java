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


package net.packet.client.model;

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
 * PortConvertLayer3InputRequestIps
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class PortConvertLayer3InputRequestIps {
  @SerializedName("address_family")
  private Integer addressFamily = null;

  @SerializedName("public")
  private Boolean _public = null;

  public PortConvertLayer3InputRequestIps addressFamily(Integer addressFamily) {
    this.addressFamily = addressFamily;
    return this;
  }

   /**
   * Get addressFamily
   * @return addressFamily
  **/
  @ApiModelProperty(value = "")
  public Integer getAddressFamily() {
    return addressFamily;
  }

  public void setAddressFamily(Integer addressFamily) {
    this.addressFamily = addressFamily;
  }

  public PortConvertLayer3InputRequestIps _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortConvertLayer3InputRequestIps portConvertLayer3InputRequestIps = (PortConvertLayer3InputRequestIps) o;
    return Objects.equals(this.addressFamily, portConvertLayer3InputRequestIps.addressFamily) &&
        Objects.equals(this._public, portConvertLayer3InputRequestIps._public);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFamily, _public);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortConvertLayer3InputRequestIps {\n");
    
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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
