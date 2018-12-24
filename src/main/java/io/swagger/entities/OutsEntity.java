package io.swagger.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "outs", schema = "holidaydb", catalog = "")
public class OutsEntity {
    private Integer outId;
    private Timestamp dateRecord;
    private String comment;
    private BigDecimal amount;
    private Integer statementId;

    @Id
    @Column(name = "out_id", nullable = false)
    public Integer getOutId() {
        return outId;
    }

    public void setOutId(Integer outId) {
        this.outId = outId;
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
    @Column(name = "comment", nullable = false, length = 2000)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "amount", nullable = false, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "statement_id", nullable = false)
    public Integer getStatementId() {
        return statementId;
    }

    public void setStatementId(Integer statementId) {
        this.statementId = statementId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OutsEntity that = (OutsEntity) o;

        if (outId != null ? !outId.equals(that.outId) : that.outId != null) return false;
        if (dateRecord != null ? !dateRecord.equals(that.dateRecord) : that.dateRecord != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (statementId != null ? !statementId.equals(that.statementId) : that.statementId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = outId != null ? outId.hashCode() : 0;
        result = 31 * result + (dateRecord != null ? dateRecord.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (statementId != null ? statementId.hashCode() : 0);
        return result;
    }
}
