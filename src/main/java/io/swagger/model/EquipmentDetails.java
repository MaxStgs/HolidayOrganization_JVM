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
 * Equipment details
 */
@ApiModel(description = "Equipment details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class EquipmentDetails   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("rentTime")
  private OffsetDateTime rentTime = null;

  @JsonProperty("price")
  private Float price = null;

  public EquipmentDetails id(Integer id) {
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

  public EquipmentDetails rentTime(OffsetDateTime rentTime) {
    this.rentTime = rentTime;
    return this;
  }

  /**
   * Get rentTime
   * @return rentTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRentTime() {
    return rentTime;
  }

  public void setRentTime(OffsetDateTime rentTime) {
    this.rentTime = rentTime;
  }

  public EquipmentDetails price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")


  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipmentDetails equipmentDetails = (EquipmentDetails) o;
    return Objects.equals(this.id, equipmentDetails.id) &&
        Objects.equals(this.rentTime, equipmentDetails.rentTime) &&
        Objects.equals(this.price, equipmentDetails.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rentTime, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipmentDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rentTime: ").append(toIndentedString(rentTime)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

