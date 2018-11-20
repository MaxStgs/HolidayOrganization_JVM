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
 * Car details
 */
@ApiModel(description = "Car details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class CarDetails   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mark")
  private String mark = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("govNumber")
  private String govNumber = null;

  @JsonProperty("linkToChip")
  private String linkToChip = null;

  public CarDetails id(Integer id) {
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

  public CarDetails mark(String mark) {
    this.mark = mark;
    return this;
  }

  /**
   * Get mark
   * @return mark
  **/
  @ApiModelProperty(value = "")


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public CarDetails model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CarDetails govNumber(String govNumber) {
    this.govNumber = govNumber;
    return this;
  }

  /**
   * Get govNumber
   * @return govNumber
  **/
  @ApiModelProperty(value = "")


  public String getGovNumber() {
    return govNumber;
  }

  public void setGovNumber(String govNumber) {
    this.govNumber = govNumber;
  }

  public CarDetails linkToChip(String linkToChip) {
    this.linkToChip = linkToChip;
    return this;
  }

  /**
   * Get linkToChip
   * @return linkToChip
  **/
  @ApiModelProperty(value = "")


  public String getLinkToChip() {
    return linkToChip;
  }

  public void setLinkToChip(String linkToChip) {
    this.linkToChip = linkToChip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarDetails carDetails = (CarDetails) o;
    return Objects.equals(this.id, carDetails.id) &&
        Objects.equals(this.mark, carDetails.mark) &&
        Objects.equals(this.model, carDetails.model) &&
        Objects.equals(this.govNumber, carDetails.govNumber) &&
        Objects.equals(this.linkToChip, carDetails.linkToChip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mark, model, govNumber, linkToChip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    govNumber: ").append(toIndentedString(govNumber)).append("\n");
    sb.append("    linkToChip: ").append(toIndentedString(linkToChip)).append("\n");
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

