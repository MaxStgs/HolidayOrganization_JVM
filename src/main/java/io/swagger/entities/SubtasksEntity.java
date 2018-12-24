package io.swagger.entities;

import javax.persistence.*;

@Entity
@Table(name = "subtasks", schema = "holidaydb", catalog = "")
public class SubtasksEntity {
    private Integer subtaskId;
    private Integer subtaskNumber;
    private Integer status;
    private String description;
    private Integer taskId;

    @Id
    @Column(name = "subtask_id", nullable = false)
    public Integer getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(Integer subtaskId) {
        this.subtaskId = subtaskId;
    }

    @Basic
    @Column(name = "subtask_number", nullable = false)
    public Integer getSubtaskNumber() {
        return subtaskNumber;
    }

    public void setSubtaskNumber(Integer subtaskNumber) {
        this.subtaskNumber = subtaskNumber;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "task_id", nullable = false)
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubtasksEntity that = (SubtasksEntity) o;

        if (subtaskId != null ? !subtaskId.equals(that.subtaskId) : that.subtaskId != null) return false;
        if (subtaskNumber != null ? !subtaskNumber.equals(that.subtaskNumber) : that.subtaskNumber != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subtaskId != null ? subtaskId.hashCode() : 0;
        result = 31 * result + (subtaskNumber != null ? subtaskNumber.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        return result;
    }
}
