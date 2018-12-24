package io.swagger.converters;

import io.swagger.entities.CarsEntity;
import io.swagger.model.CarDetails;
import io.swagger.model.PostCarDetails;
import io.swagger.model.PutCarDetails;

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

    public static CarsEntity postModelToEntity(PostCarDetails postCarDetails) {
        CarsEntity carsEntity = new CarsEntity();

        carsEntity.setBrand(postCarDetails.getMark());
        carsEntity.setModel(postCarDetails.getModel());
        carsEntity.setGovNumber(postCarDetails.getGovNumber());
        carsEntity.setRefMap(postCarDetails.getLinkToChip());

        return carsEntity;
    }

    public static CarsEntity putModelToEntity(CarsEntity carsEntity, PutCarDetails putCarDetails) {
        carsEntity.setBrand(putCarDetails.getMark());
        carsEntity.setModel(putCarDetails.getModel());
        carsEntity.setGovNumber(putCarDetails.getGovNumber());
        carsEntity.setRefMap(putCarDetails.getLinkToChip());

        return carsEntity;
    }
}
