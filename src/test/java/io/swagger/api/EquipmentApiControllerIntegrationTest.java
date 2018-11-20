package io.swagger.api;

import io.swagger.model.EquipmentDetails;
import io.swagger.model.ListOfEquipments;
import io.swagger.model.PostEquipmentDetails;
import io.swagger.model.PutEquipmentDetails;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EquipmentApiControllerIntegrationTest {

    @Autowired
    private EquipmentApi api;

    @Test
    public void equipmentEquipmentIdGetTest() throws Exception {
        Integer equipmentId = 56;
        ResponseEntity<EquipmentDetails> responseEntity = api.equipmentEquipmentIdGet(equipmentId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void equipmentEquipmentIdPutTest() throws Exception {
        Integer equipmentId = 56;
        PutEquipmentDetails body = new PutEquipmentDetails();
        ResponseEntity<Void> responseEntity = api.equipmentEquipmentIdPut(equipmentId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void equipmentGetTest() throws Exception {
        ResponseEntity<ListOfEquipments> responseEntity = api.equipmentGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void equipmentOrderIdGetTest() throws Exception {
        Integer orderId = 56;
        ResponseEntity<EquipmentDetails> responseEntity = api.equipmentOrderIdGet(orderId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void equipmentPostTest() throws Exception {
        PostEquipmentDetails body = new PostEquipmentDetails();
        ResponseEntity<Void> responseEntity = api.equipmentPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
