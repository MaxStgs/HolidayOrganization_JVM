package io.swagger.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "equipments", schema = "holidaydb", catalog = "")
public class EquipmentsEntity {
    private Integer equipmentId;
    private String name;
    private Timestamp timeRent;
    private BigDecimal price;

    @Id
    @Column(name = "equipment_id", nullable = false)
    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
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
    @Column(name = "time_rent", nullable = false)
    public Timestamp getTimeRent() {
        return timeRent;
    }

    public void setTimeRent(Timestamp timeRent) {
        this.timeRent = timeRent;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipmentsEntity that = (EquipmentsEntity) o;

        if (equipmentId != null ? !equipmentId.equals(that.equipmentId) : that.equipmentId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (timeRent != null ? !timeRent.equals(that.timeRent) : that.timeRent != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = equipmentId != null ? equipmentId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (timeRent != null ? timeRent.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
