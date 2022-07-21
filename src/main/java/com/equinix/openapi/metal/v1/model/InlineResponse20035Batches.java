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
import com.equinix.openapi.metal.v1.model.InlineResponse20033;
import com.equinix.openapi.metal.v1.model.InlineResponse20035VlanAssignments;
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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * InlineResponse20035Batches
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class InlineResponse20035Batches {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("error_messages")
  private List<String> errorMessages = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("port")
  private InlineResponse20033 port = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    QUEUED("queued"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    FAILED("failed");

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

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("vlan_assignments")
  private List<InlineResponse20035VlanAssignments> vlanAssignments = null;

  public InlineResponse20035Batches createdAt(OffsetDateTime createdAt) {
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

  public InlineResponse20035Batches errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public InlineResponse20035Batches addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<String>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

   /**
   * Get errorMessages
   * @return errorMessages
  **/
  @ApiModelProperty(value = "")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public InlineResponse20035Batches id(UUID id) {
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

  public InlineResponse20035Batches port(InlineResponse20033 port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20033 getPort() {
    return port;
  }

  public void setPort(InlineResponse20033 port) {
    this.port = port;
  }

  public InlineResponse20035Batches quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public InlineResponse20035Batches state(StateEnum state) {
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

  public InlineResponse20035Batches updatedAt(OffsetDateTime updatedAt) {
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

  public InlineResponse20035Batches vlanAssignments(List<InlineResponse20035VlanAssignments> vlanAssignments) {
    this.vlanAssignments = vlanAssignments;
    return this;
  }

  public InlineResponse20035Batches addVlanAssignmentsItem(InlineResponse20035VlanAssignments vlanAssignmentsItem) {
    if (this.vlanAssignments == null) {
      this.vlanAssignments = new ArrayList<InlineResponse20035VlanAssignments>();
    }
    this.vlanAssignments.add(vlanAssignmentsItem);
    return this;
  }

   /**
   * Get vlanAssignments
   * @return vlanAssignments
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20035VlanAssignments> getVlanAssignments() {
    return vlanAssignments;
  }

  public void setVlanAssignments(List<InlineResponse20035VlanAssignments> vlanAssignments) {
    this.vlanAssignments = vlanAssignments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20035Batches inlineResponse20035Batches = (InlineResponse20035Batches) o;
    return Objects.equals(this.createdAt, inlineResponse20035Batches.createdAt) &&
        Objects.equals(this.errorMessages, inlineResponse20035Batches.errorMessages) &&
        Objects.equals(this.id, inlineResponse20035Batches.id) &&
        Objects.equals(this.port, inlineResponse20035Batches.port) &&
        Objects.equals(this.quantity, inlineResponse20035Batches.quantity) &&
        Objects.equals(this.state, inlineResponse20035Batches.state) &&
        Objects.equals(this.updatedAt, inlineResponse20035Batches.updatedAt) &&
        Objects.equals(this.vlanAssignments, inlineResponse20035Batches.vlanAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, errorMessages, id, port, quantity, state, updatedAt, vlanAssignments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20035Batches {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    vlanAssignments: ").append(toIndentedString(vlanAssignments)).append("\n");
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

