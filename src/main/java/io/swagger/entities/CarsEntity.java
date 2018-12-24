package io.swagger.entities;

import javax.persistence.*;

@Entity
@Table(name = "cars", schema = "holidaydb", catalog = "")
public class CarsEntity {
    private Integer carId;
    private String brand;
    private String model;
    private String refMap;
    private String govNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id", nullable = false)
    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "brand", nullable = false, length = 20)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "model", nullable = false, length = 20)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "ref_map", nullable = false, length = 64)
    public String getRefMap() {
        return refMap;
    }

    public void setRefMap(String refMap) {
        this.refMap = refMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarsEntity that = (CarsEntity) o;

        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (refMap != null ? !refMap.equals(that.refMap) : that.refMap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carId != null ? carId.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (refMap != null ? refMap.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "gov_number", nullable = false, length = 10)
    public String getGovNumber() {
        return govNumber;
    }

    public void setGovNumber(String govNumber) {
        this.govNumber = govNumber;
    }
}
