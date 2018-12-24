package io.swagger.entities;

import javax.persistence.*;

@Entity
@Table(name = "list_workers_for_order", schema = "holidaydb", catalog = "")
public class ListWorkersForOrderEntity {
    private Integer listId;
    private Integer workerId;

    @Id
    @Column(name = "list_id", nullable = false)
    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
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

        ListWorkersForOrderEntity that = (ListWorkersForOrderEntity) o;

        if (listId != null ? !listId.equals(that.listId) : that.listId != null) return false;
        if (workerId != null ? !workerId.equals(that.workerId) : that.workerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = listId != null ? listId.hashCode() : 0;
        result = 31 * result + (workerId != null ? workerId.hashCode() : 0);
        return result;
    }
}
