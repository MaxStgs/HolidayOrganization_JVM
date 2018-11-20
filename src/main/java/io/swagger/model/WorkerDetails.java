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
 * Worker details
 */
@ApiModel(description = "Worker details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class WorkerDetails   {
  @JsonProperty("id")
  private Integer id = null;

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

  public WorkerDetails id(Integer id) {
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

  public WorkerDetails name(String name) {
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

  public WorkerDetails photo(File photo) {
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

  public WorkerDetails phone(String phone) {
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

  public WorkerDetails passportData(String passportData) {
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

  public WorkerDetails role(String role) {
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

  public WorkerDetails color(String color) {
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

  public WorkerDetails login(String login) {
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

  public WorkerDetails password(String password) {
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

  public WorkerDetails rating(Float rating) {
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
    WorkerDetails workerDetails = (WorkerDetails) o;
    return Objects.equals(this.id, workerDetails.id) &&
        Objects.equals(this.name, workerDetails.name) &&
        Objects.equals(this.photo, workerDetails.photo) &&
        Objects.equals(this.phone, workerDetails.phone) &&
        Objects.equals(this.passportData, workerDetails.passportData) &&
        Objects.equals(this.role, workerDetails.role) &&
        Objects.equals(this.color, workerDetails.color) &&
        Objects.equals(this.login, workerDetails.login) &&
        Objects.equals(this.password, workerDetails.password) &&
        Objects.equals(this.rating, workerDetails.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, photo, phone, passportData, role, color, login, password, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

