package io.swagger.converters;

import io.swagger.entities.ComingsEntity;
import io.swagger.model.ComingDetails;
import io.swagger.model.PostComingDetails;
import io.swagger.model.PutComingDetails;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ComingConverter {

    public static ComingsEntity modelToEntity(ComingDetails comingDetails) {
        ComingsEntity comingsEntity = new ComingsEntity();

        comingsEntity.setComingId(comingDetails.getId());
        comingsEntity.setStatementId(comingDetails.getIdStatement());
        comingsEntity.setDateRecord(Timestamp.valueOf(comingDetails.getDate().toLocalDateTime().toString()));
        comingsEntity.setComment(comingDetails.getComments());
        comingsEntity.setAmount(BigDecimal.valueOf(comingDetails.getTotal().doubleValue()));

        return comingsEntity;
    }

    public static ComingDetails entityToModel(ComingsEntity comingsEntity) {
        return null;
    }

    public static ComingsEntity postModelToEntity(PostComingDetails postComingDetails) {
        ComingsEntity comingsEntity = new ComingsEntity();

        //comingsEntity.setComingId(postComingDetails.getId());
        comingsEntity.setStatementId(postComingDetails.getIdStatement());
        comingsEntity.setDateRecord(new Timestamp(postComingDetails.getDate().toEpochSecond() * 1000));
        comingsEntity.setComment(postComingDetails.getComments());
        comingsEntity.setAmount(BigDecimal.valueOf(postComingDetails.getTotal().doubleValue()));

        return comingsEntity;
    }

    public static ComingsEntity putModelToEntity(PutComingDetails putComingDetails) {
        return null;
    }
}
