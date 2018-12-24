package io.swagger.converters;

import io.swagger.entities.EquipmentsEntity;
import io.swagger.model.EquipmentDetails;
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class EquipmentConverter {

    public static EquipmentsEntity modelToEntity(EquipmentDetails equipmentDetails) {
        EquipmentsEntity equipmentsEntity = new EquipmentsEntity();

        equipmentsEntity.setEquipmentId(equipmentDetails.getId());
        /*equipmentsEntity.setName(equipmentDetails.getName());*/
        //equipmentsEntity.setTimeRent(Timestamp.valueOf(equipmentDetails.getRentTime().toLocalDateTime().toString()));
        equipmentsEntity.setTimeRent(new Timestamp(System.nanoTime()));
        equipmentsEntity.setPrice(BigDecimal.valueOf(equipmentDetails.getPrice()));

        return equipmentsEntity;
    }


    public static EquipmentDetails entityToModel(EquipmentsEntity equipmentsEntity) {
        EquipmentDetails equipmentDetails = new EquipmentDetails();

        equipmentDetails.setId(equipmentsEntity.getEquipmentId());
        //equipmentDetails.setName(equipmentsEntity.getName());
        equipmentDetails.setPrice(equipmentsEntity.getPrice().floatValue());
        //equipmentDetails.setRentTime(equipmentsEntity.getTimeRent());
        equipmentDetails.setRentTime(OffsetDateTime.now());

        return equipmentDetails;
    }
}
