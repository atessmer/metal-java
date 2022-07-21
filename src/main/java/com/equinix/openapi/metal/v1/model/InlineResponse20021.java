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
import com.equinix.openapi.metal.v1.model.InlineResponse20021Metros;
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

/**
 * InlineResponse20021
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class InlineResponse20021 {
  @SerializedName("metros")
  private List<InlineResponse20021Metros> metros = null;

  public InlineResponse20021 metros(List<InlineResponse20021Metros> metros) {
    this.metros = metros;
    return this;
  }

  public InlineResponse20021 addMetrosItem(InlineResponse20021Metros metrosItem) {
    if (this.metros == null) {
      this.metros = new ArrayList<InlineResponse20021Metros>();
    }
    this.metros.add(metrosItem);
    return this;
  }

   /**
   * Get metros
   * @return metros
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20021Metros> getMetros() {
    return metros;
  }

  public void setMetros(List<InlineResponse20021Metros> metros) {
    this.metros = metros;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20021 inlineResponse20021 = (InlineResponse20021) o;
    return Objects.equals(this.metros, inlineResponse20021.metros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metros);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021 {\n");
    
    sb.append("    metros: ").append(toIndentedString(metros)).append("\n");
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

