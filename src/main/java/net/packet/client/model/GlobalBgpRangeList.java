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
import java.util.ArrayList;
import java.util.List;
import net.packet.client.model.GlobalBgpRange;

/**
 * GlobalBgpRangeList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class GlobalBgpRangeList {
  @SerializedName("global_bgp_ranges")
  private List<GlobalBgpRange> globalBgpRanges = null;

  public GlobalBgpRangeList globalBgpRanges(List<GlobalBgpRange> globalBgpRanges) {
    this.globalBgpRanges = globalBgpRanges;
    return this;
  }

  public GlobalBgpRangeList addGlobalBgpRangesItem(GlobalBgpRange globalBgpRangesItem) {
    if (this.globalBgpRanges == null) {
      this.globalBgpRanges = new ArrayList<GlobalBgpRange>();
    }
    this.globalBgpRanges.add(globalBgpRangesItem);
    return this;
  }

   /**
   * Get globalBgpRanges
   * @return globalBgpRanges
  **/
  @ApiModelProperty(value = "")
  public List<GlobalBgpRange> getGlobalBgpRanges() {
    return globalBgpRanges;
  }

  public void setGlobalBgpRanges(List<GlobalBgpRange> globalBgpRanges) {
    this.globalBgpRanges = globalBgpRanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalBgpRangeList globalBgpRangeList = (GlobalBgpRangeList) o;
    return Objects.equals(this.globalBgpRanges, globalBgpRangeList.globalBgpRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalBgpRanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalBgpRangeList {\n");
    
    sb.append("    globalBgpRanges: ").append(toIndentedString(globalBgpRanges)).append("\n");
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
