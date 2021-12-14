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
import java.util.UUID;
import net.packet.client.model.Href;
import org.threeten.bp.OffsetDateTime;

/**
 * PortVlanAssignment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class PortVlanAssignment {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("native")
  private Boolean _native = null;

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

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("vlan")
  private Integer vlan = null;

  @SerializedName("port")
  private Href port = null;

  @SerializedName("virtual_network")
  private Href virtualNetwork = null;

  public PortVlanAssignment id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PortVlanAssignment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PortVlanAssignment updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PortVlanAssignment _native(Boolean _native) {
    this._native = _native;
    return this;
  }

   /**
   * Get _native
   * @return _native
  **/
  @ApiModelProperty(value = "")
  public Boolean isNative() {
    return _native;
  }

  public void setNative(Boolean _native) {
    this._native = _native;
  }

  public PortVlanAssignment state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public PortVlanAssignment vlan(Integer vlan) {
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @ApiModelProperty(value = "")
  public Integer getVlan() {
    return vlan;
  }

  public void setVlan(Integer vlan) {
    this.vlan = vlan;
  }

  public PortVlanAssignment port(Href port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
  public Href getPort() {
    return port;
  }

  public void setPort(Href port) {
    this.port = port;
  }

  public PortVlanAssignment virtualNetwork(Href virtualNetwork) {
    this.virtualNetwork = virtualNetwork;
    return this;
  }

   /**
   * Get virtualNetwork
   * @return virtualNetwork
  **/
  @ApiModelProperty(value = "")
  public Href getVirtualNetwork() {
    return virtualNetwork;
  }

  public void setVirtualNetwork(Href virtualNetwork) {
    this.virtualNetwork = virtualNetwork;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortVlanAssignment portVlanAssignment = (PortVlanAssignment) o;
    return Objects.equals(this.id, portVlanAssignment.id) &&
        Objects.equals(this.createdAt, portVlanAssignment.createdAt) &&
        Objects.equals(this.updatedAt, portVlanAssignment.updatedAt) &&
        Objects.equals(this._native, portVlanAssignment._native) &&
        Objects.equals(this.state, portVlanAssignment.state) &&
        Objects.equals(this.vlan, portVlanAssignment.vlan) &&
        Objects.equals(this.port, portVlanAssignment.port) &&
        Objects.equals(this.virtualNetwork, portVlanAssignment.virtualNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, _native, state, vlan, port, virtualNetwork);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortVlanAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    _native: ").append(toIndentedString(_native)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    virtualNetwork: ").append(toIndentedString(virtualNetwork)).append("\n");
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
