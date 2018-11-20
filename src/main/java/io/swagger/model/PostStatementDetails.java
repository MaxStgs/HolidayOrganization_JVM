package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Post Statement Details
 */
@ApiModel(description = "Post Statement Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class PostStatementDetails   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("workerId")
  private Integer workerId = null;

  public PostStatementDetails date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public PostStatementDetails workerId(Integer workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * Get workerId
   * @return workerId
  **/
  @ApiModelProperty(value = "")


  public Integer getWorkerId() {
    return workerId;
  }

  public void setWorkerId(Integer workerId) {
    this.workerId = workerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStatementDetails postStatementDetails = (PostStatementDetails) o;
    return Objects.equals(this.date, postStatementDetails.date) &&
        Objects.equals(this.workerId, postStatementDetails.workerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, workerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStatementDetails {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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

