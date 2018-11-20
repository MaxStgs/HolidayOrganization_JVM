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
 * OrderFromSiteDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class OrderFromSiteDetails   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("place")
  private String place = null;

  @JsonProperty("timeStart")
  private OffsetDateTime timeStart = null;

  @JsonProperty("timeEnd")
  private OffsetDateTime timeEnd = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("mailAddress")
  private String mailAddress = null;

  @JsonProperty("attractions")
  private String attractions = null;

  @JsonProperty("comments")
  private String comments = null;

  public OrderFromSiteDetails id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id
   * @return id
  **/
  @ApiModelProperty(value = "id")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderFromSiteDetails date(OffsetDateTime date) {
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

  public OrderFromSiteDetails city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrderFromSiteDetails place(String place) {
    this.place = place;
    return this;
  }

  /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(value = "")


  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public OrderFromSiteDetails timeStart(OffsetDateTime timeStart) {
    this.timeStart = timeStart;
    return this;
  }

  /**
   * Get timeStart
   * @return timeStart
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimeStart() {
    return timeStart;
  }

  public void setTimeStart(OffsetDateTime timeStart) {
    this.timeStart = timeStart;
  }

  public OrderFromSiteDetails timeEnd(OffsetDateTime timeEnd) {
    this.timeEnd = timeEnd;
    return this;
  }

  /**
   * Get timeEnd
   * @return timeEnd
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(OffsetDateTime timeEnd) {
    this.timeEnd = timeEnd;
  }

  public OrderFromSiteDetails phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OrderFromSiteDetails mailAddress(String mailAddress) {
    this.mailAddress = mailAddress;
    return this;
  }

  /**
   * Get mailAddress
   * @return mailAddress
  **/
  @ApiModelProperty(value = "")


  public String getMailAddress() {
    return mailAddress;
  }

  public void setMailAddress(String mailAddress) {
    this.mailAddress = mailAddress;
  }

  public OrderFromSiteDetails attractions(String attractions) {
    this.attractions = attractions;
    return this;
  }

  /**
   * Get attractions
   * @return attractions
  **/
  @ApiModelProperty(value = "")


  public String getAttractions() {
    return attractions;
  }

  public void setAttractions(String attractions) {
    this.attractions = attractions;
  }

  public OrderFromSiteDetails comments(String comments) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFromSiteDetails orderFromSiteDetails = (OrderFromSiteDetails) o;
    return Objects.equals(this.id, orderFromSiteDetails.id) &&
        Objects.equals(this.date, orderFromSiteDetails.date) &&
        Objects.equals(this.city, orderFromSiteDetails.city) &&
        Objects.equals(this.place, orderFromSiteDetails.place) &&
        Objects.equals(this.timeStart, orderFromSiteDetails.timeStart) &&
        Objects.equals(this.timeEnd, orderFromSiteDetails.timeEnd) &&
        Objects.equals(this.phone, orderFromSiteDetails.phone) &&
        Objects.equals(this.mailAddress, orderFromSiteDetails.mailAddress) &&
        Objects.equals(this.attractions, orderFromSiteDetails.attractions) &&
        Objects.equals(this.comments, orderFromSiteDetails.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, city, place, timeStart, timeEnd, phone, mailAddress, attractions, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFromSiteDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    timeStart: ").append(toIndentedString(timeStart)).append("\n");
    sb.append("    timeEnd: ").append(toIndentedString(timeEnd)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mailAddress: ").append(toIndentedString(mailAddress)).append("\n");
    sb.append("    attractions: ").append(toIndentedString(attractions)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

