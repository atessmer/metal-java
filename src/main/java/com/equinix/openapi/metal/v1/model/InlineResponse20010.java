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
import com.equinix.openapi.metal.v1.model.InlineResponse20010BgpNeighbors;
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
 * InlineResponse20010
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class InlineResponse20010 {
  @SerializedName("bgp_neighbors")
  private List<InlineResponse20010BgpNeighbors> bgpNeighbors = null;

  public InlineResponse20010 bgpNeighbors(List<InlineResponse20010BgpNeighbors> bgpNeighbors) {
    this.bgpNeighbors = bgpNeighbors;
    return this;
  }

  public InlineResponse20010 addBgpNeighborsItem(InlineResponse20010BgpNeighbors bgpNeighborsItem) {
    if (this.bgpNeighbors == null) {
      this.bgpNeighbors = new ArrayList<InlineResponse20010BgpNeighbors>();
    }
    this.bgpNeighbors.add(bgpNeighborsItem);
    return this;
  }

   /**
   * A list of BGP session neighbor data
   * @return bgpNeighbors
  **/
  @ApiModelProperty(value = "A list of BGP session neighbor data")
  public List<InlineResponse20010BgpNeighbors> getBgpNeighbors() {
    return bgpNeighbors;
  }

  public void setBgpNeighbors(List<InlineResponse20010BgpNeighbors> bgpNeighbors) {
    this.bgpNeighbors = bgpNeighbors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.bgpNeighbors, inlineResponse20010.bgpNeighbors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgpNeighbors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
    sb.append("    bgpNeighbors: ").append(toIndentedString(bgpNeighbors)).append("\n");
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

