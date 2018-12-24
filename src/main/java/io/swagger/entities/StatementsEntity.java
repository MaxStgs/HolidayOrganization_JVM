package io.swagger.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "statements", schema = "holidaydb", catalog = "")
public class StatementsEntity {
    private Integer statementId;
    private Timestamp dateRecord;
    private Integer workerId;

    @Id
    @Column(name = "statement_id", nullable = false)
    public Integer getStatementId() {
        return statementId;
    }

    public void setStatementId(Integer statementId) {
        this.statementId = statementId;
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

        StatementsEntity that = (StatementsEntity) o;

        if (statementId != null ? !statementId.equals(that.statementId) : that.statementId != null) return false;
        if (dateRecord != null ? !dateRecord.equals(that.dateRecord) : that.dateRecord != null) return false;
        if (workerId != null ? !workerId.equals(that.workerId) : that.workerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = statementId != null ? statementId.hashCode() : 0;
        result = 31 * result + (dateRecord != null ? dateRecord.hashCode() : 0);
        result = 31 * result + (workerId != null ? workerId.hashCode() : 0);
        return result;
    }
}
