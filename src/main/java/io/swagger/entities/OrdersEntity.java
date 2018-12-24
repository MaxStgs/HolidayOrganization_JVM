package io.swagger.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "orders", schema = "holidaydb", catalog = "")
public class OrdersEntity {
    private Integer orderId;
    private String typePayment;
    private Timestamp dateHoliday;
    private String place;
    private Timestamp timeArrive;
    private Timestamp timeReady;
    private Timestamp timeStart;
    private Timestamp timeEnd;
    private String listAttraction;
    private String comment;
    private Integer workerId;
    private Integer carId;
    private Integer listWorkersId;

    @Id
    @Column(name = "order_id", nullable = false)
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "type_payment", nullable = false, length = 20)
    public String getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }

    @Basic
    @Column(name = "date_holiday", nullable = true)
    public Timestamp getDateHoliday() {
        return dateHoliday;
    }

    public void setDateHoliday(Timestamp dateHoliday) {
        this.dateHoliday = dateHoliday;
    }

    @Basic
    @Column(name = "place", nullable = true, length = 100)
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Basic
    @Column(name = "time_arrive", nullable = true)
    public Timestamp getTimeArrive() {
        return timeArrive;
    }

    public void setTimeArrive(Timestamp timeArrive) {
        this.timeArrive = timeArrive;
    }

    @Basic
    @Column(name = "time_ready", nullable = true)
    public Timestamp getTimeReady() {
        return timeReady;
    }

    public void setTimeReady(Timestamp timeReady) {
        this.timeReady = timeReady;
    }

    @Basic
    @Column(name = "time_start", nullable = true)
    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    @Basic
    @Column(name = "time_end", nullable = true)
    public Timestamp getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Timestamp timeEnd) {
        this.timeEnd = timeEnd;
    }

    @Basic
    @Column(name = "list_attraction", nullable = true, length = 20)
    public String getListAttraction() {
        return listAttraction;
    }

    public void setListAttraction(String listAttraction) {
        this.listAttraction = listAttraction;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 20)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "worker_id", nullable = false)
    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    @Basic
    @Column(name = "car_id", nullable = false)
    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "list_workers_id", nullable = false)
    public Integer getListWorkersId() {
        return listWorkersId;
    }

    public void setListWorkersId(Integer listWorkersId) {
        this.listWorkersId = listWorkersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (typePayment != null ? !typePayment.equals(that.typePayment) : that.typePayment != null) return false;
        if (dateHoliday != null ? !dateHoliday.equals(that.dateHoliday) : that.dateHoliday != null) return false;
        if (place != null ? !place.equals(that.place) : that.place != null) return false;
        if (timeArrive != null ? !timeArrive.equals(that.timeArrive) : that.timeArrive != null) return false;
        if (timeReady != null ? !timeReady.equals(that.timeReady) : that.timeReady != null) return false;
        if (timeStart != null ? !timeStart.equals(that.timeStart) : that.timeStart != null) return false;
        if (timeEnd != null ? !timeEnd.equals(that.timeEnd) : that.timeEnd != null) return false;
        if (listAttraction != null ? !listAttraction.equals(that.listAttraction) : that.listAttraction != null)
            return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (workerId != null ? !workerId.equals(that.workerId) : that.workerId != null) return false;
        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;
        if (listWorkersId != null ? !listWorkersId.equals(that.listWorkersId) : that.listWorkersId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (typePayment != null ? typePayment.hashCode() : 0);
        result = 31 * result + (dateHoliday != null ? dateHoliday.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (timeArrive != null ? timeArrive.hashCode() : 0);
        result = 31 * result + (timeReady != null ? timeReady.hashCode() : 0);
        result = 31 * result + (timeStart != null ? timeStart.hashCode() : 0);
        result = 31 * result + (timeEnd != null ? timeEnd.hashCode() : 0);
        result = 31 * result + (listAttraction != null ? listAttraction.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (workerId != null ? workerId.hashCode() : 0);
        result = 31 * result + (carId != null ? carId.hashCode() : 0);
        result = 31 * result + (listWorkersId != null ? listWorkersId.hashCode() : 0);
        return result;
    }
}
