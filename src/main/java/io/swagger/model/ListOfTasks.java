package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TaskDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of Tasks
 */
@ApiModel(description = "List of Tasks")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

public class ListOfTasks   {
  @JsonProperty("list")
  @Valid
  private List<TaskDetails> list = null;

  public ListOfTasks list(List<TaskDetails> list) {
    this.list = list;
    return this;
  }

  public ListOfTasks addListItem(TaskDetails listItem) {
    if (this.list == null) {
      this.list = new ArrayList<TaskDetails>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TaskDetails> getList() {
    return list;
  }

  public void setList(List<TaskDetails> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOfTasks listOfTasks = (ListOfTasks) o;
    return Objects.equals(this.list, listOfTasks.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfTasks {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

