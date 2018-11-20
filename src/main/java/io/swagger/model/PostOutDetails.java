package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Post Out Details
 */
@ApiModel(description = "Post Out Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class PostOutDetails   {
  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("total")
  private Float total = null;

  @JsonProperty("photo")
  private File photo = null;

  @JsonProperty("idStatement")
  private Integer idStatement = null;

  public PostOutDetails comments(String comments) {
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

  public PostOutDetails date(OffsetDateTime date) {
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

  public PostOutDetails total(Float total) {
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

  public PostOutDetails photo(File photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public File getPhoto() {
    return photo;
  }

  public void setPhoto(File photo) {
    this.photo = photo;
  }

  public PostOutDetails idStatement(Integer idStatement) {
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
    PostOutDetails postOutDetails = (PostOutDetails) o;
    return Objects.equals(this.comments, postOutDetails.comments) &&
        Objects.equals(this.date, postOutDetails.date) &&
        Objects.equals(this.total, postOutDetails.total) &&
        Objects.equals(this.photo, postOutDetails.photo) &&
        Objects.equals(this.idStatement, postOutDetails.idStatement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, date, total, photo, idStatement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOutDetails {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
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

