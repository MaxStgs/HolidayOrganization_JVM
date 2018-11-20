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
 * Put Coming Details
 */
@ApiModel(description = "Put Coming Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class PutComingDetails   {
  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("total")
  private Float total = null;

  @JsonProperty("idStatement")
  private Integer idStatement = null;

  public PutComingDetails comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")


  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public PutComingDetails date(OffsetDateTime date) {
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

  public PutComingDetails total(Float total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }

  public PutComingDetails idStatement(Integer idStatement) {
    this.idStatement = idStatement;
    return this;
  }

  /**
   * Get idStatement
   * @return idStatement
  **/
  @ApiModelProperty(value = "")


  public Integer getIdStatement() {
    return idStatement;
  }

  public void setIdStatement(Integer idStatement) {
    this.idStatement = idStatement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutComingDetails putComingDetails = (PutComingDetails) o;
    return Objects.equals(this.comments, putComingDetails.comments) &&
        Objects.equals(this.date, putComingDetails.date) &&
        Objects.equals(this.total, putComingDetails.total) &&
        Objects.equals(this.idStatement, putComingDetails.idStatement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, date, total, idStatement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutComingDetails {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    idStatement: ").append(toIndentedString(idStatement)).append("\n");
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

