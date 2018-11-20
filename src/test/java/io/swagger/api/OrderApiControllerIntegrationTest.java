package io.swagger.api;

import io.swagger.model.ListOfOrdersFromSite;
import io.swagger.model.OrderFromSiteDetails;
import io.swagger.model.PostOrderFromSiteDetails;

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
public class OrderApiControllerIntegrationTest {

    @Autowired
    private OrderApi api;

    @Test
    public void orderGetTest() throws Exception {
        ResponseEntity<ListOfOrdersFromSite> responseEntity = api.orderGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void orderOrderIdGetTest() throws Exception {
        Integer orderId = 56;
        ResponseEntity<OrderFromSiteDetails> responseEntity = api.orderOrderIdGet(orderId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void orderPostTest() throws Exception {
        PostOrderFromSiteDetails body = new PostOrderFromSiteDetails();
        ResponseEntity<Void> responseEntity = api.orderPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
