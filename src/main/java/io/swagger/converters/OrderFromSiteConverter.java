package io.swagger.converters;

import io.swagger.entities.OrdersSiteEntity;
import io.swagger.model.OrderFromSiteDetails;
import io.swagger.model.PostOrderFromSiteDetails;
import org.threeten.bp.OffsetDateTime;

import java.sql.Timestamp;

public class OrderFromSiteConverter {
    public static OrdersSiteEntity postModelToEntity(PostOrderFromSiteDetails postOrderFromSiteDetails) {
        OrdersSiteEntity ordersSiteEntity = new OrdersSiteEntity();

        ordersSiteEntity.setCity(postOrderFromSiteDetails.getCity());
        ordersSiteEntity.setAttraction(postOrderFromSiteDetails.getAttractions());
        ordersSiteEntity.setComments(postOrderFromSiteDetails.getComments());
        ordersSiteEntity.setEmailAddress(postOrderFromSiteDetails.getMailAddress());
        ordersSiteEntity.setStartTime(postOrderFromSiteDetails.getTimeStart().toLocalDateTime().toString());
        //ordersSiteEntity.setStartTime("");
        ordersSiteEntity.setEndTime(postOrderFromSiteDetails.getTimeEnd().toLocalDateTime().toString());
        //ordersSiteEntity.setEndTime("");
        //ordersSiteEntity.setOrderSiteId(postOrderFromSiteDetails.getId());
        ordersSiteEntity.setPhone(postOrderFromSiteDetails.getPhone());
        ordersSiteEntity.setPlace(postOrderFromSiteDetails.getPlace());
        //ordersSiteEntity.setEndTime(postOrderFromSiteDetails.getTimeEnd().toLocalDateTime().toString());
        ordersSiteEntity.setDateDay(postOrderFromSiteDetails.getDate().toLocalDateTime().toString());

        return ordersSiteEntity;
    }

    public static OrderFromSiteDetails entityToModel(OrdersSiteEntity ordersSiteEntity) {
        OrderFromSiteDetails orderFromSiteDetails = new OrderFromSiteDetails();

        orderFromSiteDetails.setAttractions(ordersSiteEntity.getAttraction());
        orderFromSiteDetails.setCity(ordersSiteEntity.getCity());
        orderFromSiteDetails.setComments(ordersSiteEntity.getComments());
        //orderFromSiteDetails.setDate(ordersSiteEntity.get);
        orderFromSiteDetails.setId(ordersSiteEntity.getOrderSiteId());
        orderFromSiteDetails.setMailAddress(ordersSiteEntity.getEmailAddress());
        orderFromSiteDetails.setPhone(ordersSiteEntity.getPhone());
        orderFromSiteDetails.setPlace(ordersSiteEntity.getPlace());
        orderFromSiteDetails.setTimeStart(OffsetDateTime.now());
        orderFromSiteDetails.setTimeEnd(OffsetDateTime.now());

        return orderFromSiteDetails;
    }
}
