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
 * PostOrderFromSiteDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class PostOrderFromSiteDetails   {
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

  public PostOrderFromSiteDetails date(OffsetDateTime date) {
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

  public PostOrderFromSiteDetails city(String city) {
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

  public PostOrderFromSiteDetails place(String place) {
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

  public PostOrderFromSiteDetails timeStart(OffsetDateTime timeStart) {
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

  public PostOrderFromSiteDetails timeEnd(OffsetDateTime timeEnd) {
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

  public PostOrderFromSiteDetails phone(String phone) {
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

  public PostOrderFromSiteDetails mailAddress(String mailAddress) {
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

  public PostOrderFromSiteDetails attractions(String attractions) {
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

  public PostOrderFromSiteDetails comments(String comments) {
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
    PostOrderFromSiteDetails postOrderFromSiteDetails = (PostOrderFromSiteDetails) o;
    return Objects.equals(this.date, postOrderFromSiteDetails.date) &&
        Objects.equals(this.city, postOrderFromSiteDetails.city) &&
        Objects.equals(this.place, postOrderFromSiteDetails.place) &&
        Objects.equals(this.timeStart, postOrderFromSiteDetails.timeStart) &&
        Objects.equals(this.timeEnd, postOrderFromSiteDetails.timeEnd) &&
        Objects.equals(this.phone, postOrderFromSiteDetails.phone) &&
        Objects.equals(this.mailAddress, postOrderFromSiteDetails.mailAddress) &&
        Objects.equals(this.attractions, postOrderFromSiteDetails.attractions) &&
        Objects.equals(this.comments, postOrderFromSiteDetails.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, city, place, timeStart, timeEnd, phone, mailAddress, attractions, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOrderFromSiteDetails {\n");
    
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

