package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Subtask details
 */
@ApiModel(description = "Subtask details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class SubtaskDetails   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("idInList")
  private Integer idInList = null;

  @JsonProperty("status")
  private Boolean status = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("idTask")
  private Integer idTask = null;

  public SubtaskDetails id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SubtaskDetails idInList(Integer idInList) {
    this.idInList = idInList;
    return this;
  }

  /**
   * Get idInList
   * @return idInList
  **/
  @ApiModelProperty(value = "")


  public Integer getIdInList() {
    return idInList;
  }

  public void setIdInList(Integer idInList) {
    this.idInList = idInList;
  }

  public SubtaskDetails status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public SubtaskDetails description(String description) {
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

  public SubtaskDetails idTask(Integer idTask) {
    this.idTask = idTask;
    return this;
  }

  /**
   * Get idTask
   * @return idTask
  **/
  @ApiModelProperty(value = "")


  public Integer getIdTask() {
    return idTask;
  }

  public void setIdTask(Integer idTask) {
    this.idTask = idTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubtaskDetails subtaskDetails = (SubtaskDetails) o;
    return Objects.equals(this.id, subtaskDetails.id) &&
        Objects.equals(this.idInList, subtaskDetails.idInList) &&
        Objects.equals(this.status, subtaskDetails.status) &&
        Objects.equals(this.description, subtaskDetails.description) &&
        Objects.equals(this.idTask, subtaskDetails.idTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idInList, status, description, idTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubtaskDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idInList: ").append(toIndentedString(idInList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idTask: ").append(toIndentedString(idTask)).append("\n");
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

