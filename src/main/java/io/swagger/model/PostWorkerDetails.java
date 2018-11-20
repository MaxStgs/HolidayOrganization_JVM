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
 * Post Worker Details
 */
@ApiModel(description = "Post Worker Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class PostWorkerDetails   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("photo")
  private File photo = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("passportData")
  private String passportData = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("rating")
  private Float rating = null;

  public PostWorkerDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostWorkerDetails photo(File photo) {
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

  public PostWorkerDetails phone(String phone) {
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

  public PostWorkerDetails passportData(String passportData) {
    this.passportData = passportData;
    return this;
  }

  /**
   * Get passportData
   * @return passportData
  **/
  @ApiModelProperty(value = "")


  public String getPassportData() {
    return passportData;
  }

  public void setPassportData(String passportData) {
    this.passportData = passportData;
  }

  public PostWorkerDetails role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public PostWorkerDetails color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public PostWorkerDetails login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(value = "")


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public PostWorkerDetails password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PostWorkerDetails rating(Float rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")


  public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostWorkerDetails postWorkerDetails = (PostWorkerDetails) o;
    return Objects.equals(this.name, postWorkerDetails.name) &&
        Objects.equals(this.photo, postWorkerDetails.photo) &&
        Objects.equals(this.phone, postWorkerDetails.phone) &&
        Objects.equals(this.passportData, postWorkerDetails.passportData) &&
        Objects.equals(this.role, postWorkerDetails.role) &&
        Objects.equals(this.color, postWorkerDetails.color) &&
        Objects.equals(this.login, postWorkerDetails.login) &&
        Objects.equals(this.password, postWorkerDetails.password) &&
        Objects.equals(this.rating, postWorkerDetails.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, photo, phone, passportData, role, color, login, password, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostWorkerDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    passportData: ").append(toIndentedString(passportData)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

