package io.swagger.converters;

import io.swagger.entities.CarsEntity;
import io.swagger.model.CarDetails;

public class CarConverter {

    public static CarsEntity modelToEntity(CarDetails model) {
        CarsEntity entity = new CarsEntity();

        entity.setCarId(model.getId());
        entity.setBrand(model.getMark());
        entity.setRefMap(model.getLinkToChip());
        entity.setModel(model.getModel());
        entity.setGovNumber(model.getGovNumber());

        return entity;
    }

    public static CarDetails entityToModel(CarsEntity entity) {
        CarDetails details = new CarDetails();

        details.setId(entity.getCarId());
        details.setGovNumber(entity.getGovNumber());
        details.setLinkToChip(entity.getRefMap());
        details.setMark(entity.getBrand());
        details.setModel(entity.getModel());

        return details;
    }
}
