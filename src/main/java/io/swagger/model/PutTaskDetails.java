package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Put Task Details
 */
@ApiModel(description = "Put Task Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class PutTaskDetails   {
  @JsonProperty("date")
  private File date = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("idWorker")
  private Integer idWorker = null;

  public PutTaskDetails date(File date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public File getDate() {
    return date;
  }

  public void setDate(File date) {
    this.date = date;
  }

  public PutTaskDetails description(String description) {
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

  public PutTaskDetails idWorker(Integer idWorker) {
    this.idWorker = idWorker;
    return this;
  }

  /**
   * Get idWorker
   * @return idWorker
  **/
  @ApiModelProperty(value = "")


  public Integer getIdWorker() {
    return idWorker;
  }

  public void setIdWorker(Integer idWorker) {
    this.idWorker = idWorker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutTaskDetails putTaskDetails = (PutTaskDetails) o;
    return Objects.equals(this.date, putTaskDetails.date) &&
        Objects.equals(this.description, putTaskDetails.description) &&
        Objects.equals(this.idWorker, putTaskDetails.idWorker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, description, idWorker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutTaskDetails {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idWorker: ").append(toIndentedString(idWorker)).append("\n");
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

