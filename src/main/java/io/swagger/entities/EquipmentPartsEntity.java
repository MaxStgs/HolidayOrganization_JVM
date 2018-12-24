package io.swagger.entities;

import javax.persistence.*;

@Entity
@Table(name = "equipment_parts", schema = "holidaydb", catalog = "")
public class EquipmentPartsEntity {
    private Integer equipmentId;
    private Integer partId;
    private String partName;

    @Id
    @Column(name = "equipment_id", nullable = false)
    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    @Basic
    @Column(name = "part_id", nullable = false)
    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    @Basic
    @Column(name = "part_name", nullable = true, length = 50)
    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipmentPartsEntity that = (EquipmentPartsEntity) o;

        if (equipmentId != null ? !equipmentId.equals(that.equipmentId) : that.equipmentId != null) return false;
        if (partId != null ? !partId.equals(that.partId) : that.partId != null) return false;
        if (partName != null ? !partName.equals(that.partName) : that.partName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = equipmentId != null ? equipmentId.hashCode() : 0;
        result = 31 * result + (partId != null ? partId.hashCode() : 0);
        result = 31 * result + (partName != null ? partName.hashCode() : 0);
        return result;
    }
}
