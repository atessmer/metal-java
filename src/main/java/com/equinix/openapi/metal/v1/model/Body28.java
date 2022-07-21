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
import java.math.BigDecimal;

/**
 * Body28
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class Body28 {
  @SerializedName("description")
  private String description = null;

  @SerializedName("licensee_product_id")
  private String licenseeProductId = null;

  @SerializedName("size")
  private BigDecimal size = null;

  public Body28 description(String description) {
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

  public Body28 licenseeProductId(String licenseeProductId) {
    this.licenseeProductId = licenseeProductId;
    return this;
  }

   /**
   * Get licenseeProductId
   * @return licenseeProductId
  **/
  @ApiModelProperty(value = "")
  public String getLicenseeProductId() {
    return licenseeProductId;
  }

  public void setLicenseeProductId(String licenseeProductId) {
    this.licenseeProductId = licenseeProductId;
  }

  public Body28 size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body28 body28 = (Body28) o;
    return Objects.equals(this.description, body28.description) &&
        Objects.equals(this.licenseeProductId, body28.licenseeProductId) &&
        Objects.equals(this.size, body28.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, licenseeProductId, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body28 {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    licenseeProductId: ").append(toIndentedString(licenseeProductId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

