/**
 * Packet API
 * This is the API for Packet. Interact with your devices, user account, and projects.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: help@packet.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.packet.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.packet.client.model.CapacityPerBaremetal;


/**
 * CapacityPerFacility
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-01T08:27:06.669-05:00")
public class CapacityPerFacility   {
  @JsonProperty("baremetal_0")
  private CapacityPerBaremetal baremetal0 = null;

  @JsonProperty("baremetal_1")
  private CapacityPerBaremetal baremetal1 = null;

  @JsonProperty("baremetal_2")
  private CapacityPerBaremetal baremetal2 = null;

  @JsonProperty("baremetal_3")
  private CapacityPerBaremetal baremetal3 = null;

  public CapacityPerFacility baremetal0(CapacityPerBaremetal baremetal0) {
    this.baremetal0 = baremetal0;
    return this;
  }

   /**
   * Get baremetal0
   * @return baremetal0
  **/
  @ApiModelProperty(example = "null", value = "")
  public CapacityPerBaremetal getBaremetal0() {
    return baremetal0;
  }

  public void setBaremetal0(CapacityPerBaremetal baremetal0) {
    this.baremetal0 = baremetal0;
  }

  public CapacityPerFacility baremetal1(CapacityPerBaremetal baremetal1) {
    this.baremetal1 = baremetal1;
    return this;
  }

   /**
   * Get baremetal1
   * @return baremetal1
  **/
  @ApiModelProperty(example = "null", value = "")
  public CapacityPerBaremetal getBaremetal1() {
    return baremetal1;
  }

  public void setBaremetal1(CapacityPerBaremetal baremetal1) {
    this.baremetal1 = baremetal1;
  }

  public CapacityPerFacility baremetal2(CapacityPerBaremetal baremetal2) {
    this.baremetal2 = baremetal2;
    return this;
  }

   /**
   * Get baremetal2
   * @return baremetal2
  **/
  @ApiModelProperty(example = "null", value = "")
  public CapacityPerBaremetal getBaremetal2() {
    return baremetal2;
  }

  public void setBaremetal2(CapacityPerBaremetal baremetal2) {
    this.baremetal2 = baremetal2;
  }

  public CapacityPerFacility baremetal3(CapacityPerBaremetal baremetal3) {
    this.baremetal3 = baremetal3;
    return this;
  }

   /**
   * Get baremetal3
   * @return baremetal3
  **/
  @ApiModelProperty(example = "null", value = "")
  public CapacityPerBaremetal getBaremetal3() {
    return baremetal3;
  }

  public void setBaremetal3(CapacityPerBaremetal baremetal3) {
    this.baremetal3 = baremetal3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPerFacility capacityPerFacility = (CapacityPerFacility) o;
    return Objects.equals(this.baremetal0, capacityPerFacility.baremetal0) &&
        Objects.equals(this.baremetal1, capacityPerFacility.baremetal1) &&
        Objects.equals(this.baremetal2, capacityPerFacility.baremetal2) &&
        Objects.equals(this.baremetal3, capacityPerFacility.baremetal3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baremetal0, baremetal1, baremetal2, baremetal3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPerFacility {\n");
    
    sb.append("    baremetal0: ").append(toIndentedString(baremetal0)).append("\n");
    sb.append("    baremetal1: ").append(toIndentedString(baremetal1)).append("\n");
    sb.append("    baremetal2: ").append(toIndentedString(baremetal2)).append("\n");
    sb.append("    baremetal3: ").append(toIndentedString(baremetal3)).append("\n");
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
