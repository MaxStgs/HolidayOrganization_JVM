package io.swagger.api;


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
public class OrdersApiControllerIntegrationTest {

    @Autowired
    private OrdersApi api;

    @Test
    public void ordersGetTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.ordersGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void ordersOrderIdGetTest() throws Exception {
        Integer orderId = 56;
        ResponseEntity<Void> responseEntity = api.ordersOrderIdGet(orderId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
