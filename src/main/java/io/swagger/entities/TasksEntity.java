package io.swagger.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tasks", schema = "holidaydb", catalog = "")
public class TasksEntity {
    private Integer taskId;
    private String name;
    private Timestamp dateRecord;
    private String description;
    private Integer workerId;

    @Id
    @Column(name = "task_id", nullable = false)
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "date_record", nullable = false)
    public Timestamp getDateRecord() {
        return dateRecord;
    }

    public void setDateRecord(Timestamp dateRecord) {
        this.dateRecord = dateRecord;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "worker_id", nullable = false)
    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasksEntity that = (TasksEntity) o;

        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (dateRecord != null ? !dateRecord.equals(that.dateRecord) : that.dateRecord != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (workerId != null ? !workerId.equals(that.workerId) : that.workerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateRecord != null ? dateRecord.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (workerId != null ? workerId.hashCode() : 0);
        return result;
    }
}
