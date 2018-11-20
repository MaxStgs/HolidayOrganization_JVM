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
 * OilDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class OilDetails   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("photoOdometer")
  private File photoOdometer = null;

  @JsonProperty("countOil")
  private Float countOil = null;

  @JsonProperty("photoCheck")
  private File photoCheck = null;

  @JsonProperty("idStatement")
  private Integer idStatement = null;

  @JsonProperty("idCar")
  private Integer idCar = null;

  public OilDetails id(Integer id) {
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

  public OilDetails comments(String comments) {
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

  public OilDetails date(OffsetDateTime date) {
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

  public OilDetails photoOdometer(File photoOdometer) {
    this.photoOdometer = photoOdometer;
    return this;
  }

  /**
   * Get photoOdometer
   * @return photoOdometer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public File getPhotoOdometer() {
    return photoOdometer;
  }

  public void setPhotoOdometer(File photoOdometer) {
    this.photoOdometer = photoOdometer;
  }

  public OilDetails countOil(Float countOil) {
    this.countOil = countOil;
    return this;
  }

  /**
   * Get countOil
   * @return countOil
  **/
  @ApiModelProperty(value = "")


  public Float getCountOil() {
    return countOil;
  }

  public void setCountOil(Float countOil) {
    this.countOil = countOil;
  }

  public OilDetails photoCheck(File photoCheck) {
    this.photoCheck = photoCheck;
    return this;
  }

  /**
   * Get photoCheck
   * @return photoCheck
  **/
  @ApiModelProperty(value = "")

  @Valid

  public File getPhotoCheck() {
    return photoCheck;
  }

  public void setPhotoCheck(File photoCheck) {
    this.photoCheck = photoCheck;
  }

  public OilDetails idStatement(Integer idStatement) {
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

  public OilDetails idCar(Integer idCar) {
    this.idCar = idCar;
    return this;
  }

  /**
   * Get idCar
   * @return idCar
  **/
  @ApiModelProperty(value = "")


  public Integer getIdCar() {
    return idCar;
  }

  public void setIdCar(Integer idCar) {
    this.idCar = idCar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OilDetails oilDetails = (OilDetails) o;
    return Objects.equals(this.id, oilDetails.id) &&
        Objects.equals(this.comments, oilDetails.comments) &&
        Objects.equals(this.date, oilDetails.date) &&
        Objects.equals(this.photoOdometer, oilDetails.photoOdometer) &&
        Objects.equals(this.countOil, oilDetails.countOil) &&
        Objects.equals(this.photoCheck, oilDetails.photoCheck) &&
        Objects.equals(this.idStatement, oilDetails.idStatement) &&
        Objects.equals(this.idCar, oilDetails.idCar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, comments, date, photoOdometer, countOil, photoCheck, idStatement, idCar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OilDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    photoOdometer: ").append(toIndentedString(photoOdometer)).append("\n");
    sb.append("    countOil: ").append(toIndentedString(countOil)).append("\n");
    sb.append("    photoCheck: ").append(toIndentedString(photoCheck)).append("\n");
    sb.append("    idStatement: ").append(toIndentedString(idStatement)).append("\n");
    sb.append("    idCar: ").append(toIndentedString(idCar)).append("\n");
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

