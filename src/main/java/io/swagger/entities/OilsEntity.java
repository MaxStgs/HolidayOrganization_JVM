package io.swagger.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "oils", schema = "holidaydb", catalog = "")
public class OilsEntity {
    private Integer oilId;
    private Timestamp dateRecord;
    private BigDecimal amount;
    private byte[] photoOdometer;
    private BigDecimal oilCount;
    private byte[] photoCheck;
    private Integer statementId;
    private Integer carId;

    @Id
    @Column(name = "oil_id", nullable = false)
    public Integer getOilId() {
        return oilId;
    }

    public void setOilId(Integer oilId) {
        this.oilId = oilId;
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
    @Column(name = "amount", nullable = false, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "photo_odometer", nullable = false)
    public byte[] getPhotoOdometer() {
        return photoOdometer;
    }

    public void setPhotoOdometer(byte[] photoOdometer) {
        this.photoOdometer = photoOdometer;
    }

    @Basic
    @Column(name = "oil_count", nullable = false, precision = 2)
    public BigDecimal getOilCount() {
        return oilCount;
    }

    public void setOilCount(BigDecimal oilCount) {
        this.oilCount = oilCount;
    }

    @Basic
    @Column(name = "photo_check", nullable = false)
    public byte[] getPhotoCheck() {
        return photoCheck;
    }

    public void setPhotoCheck(byte[] photoCheck) {
        this.photoCheck = photoCheck;
    }

    @Basic
    @Column(name = "statement_id", nullable = false)
    public Integer getStatementId() {
        return statementId;
    }

    public void setStatementId(Integer statementId) {
        this.statementId = statementId;
    }

    @Basic
    @Column(name = "car_id", nullable = false)
    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OilsEntity that = (OilsEntity) o;

        if (oilId != null ? !oilId.equals(that.oilId) : that.oilId != null) return false;
        if (dateRecord != null ? !dateRecord.equals(that.dateRecord) : that.dateRecord != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (!Arrays.equals(photoOdometer, that.photoOdometer)) return false;
        if (oilCount != null ? !oilCount.equals(that.oilCount) : that.oilCount != null) return false;
        if (!Arrays.equals(photoCheck, that.photoCheck)) return false;
        if (statementId != null ? !statementId.equals(that.statementId) : that.statementId != null) return false;
        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oilId != null ? oilId.hashCode() : 0;
        result = 31 * result + (dateRecord != null ? dateRecord.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photoOdometer);
        result = 31 * result + (oilCount != null ? oilCount.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photoCheck);
        result = 31 * result + (statementId != null ? statementId.hashCode() : 0);
        result = 31 * result + (carId != null ? carId.hashCode() : 0);
        return result;
    }
}
