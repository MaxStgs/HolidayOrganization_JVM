package io.swagger.api;

import io.swagger.model.ListOfOils;
import io.swagger.model.OilDetails;
import io.swagger.model.PostOilDetails;
import io.swagger.model.PutOilDetails;

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
public class OilsApiControllerIntegrationTest {

    @Autowired
    private OilsApi api;

    @Test
    public void oilsGetTest() throws Exception {
        ResponseEntity<ListOfOils> responseEntity = api.oilsGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void oilsOilIdDeleteTest() throws Exception {
        Integer oilId = 56;
        ResponseEntity<Void> responseEntity = api.oilsOilIdDelete(oilId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void oilsOilIdGetTest() throws Exception {
        Integer oilId = 56;
        ResponseEntity<OilDetails> responseEntity = api.oilsOilIdGet(oilId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void oilsOilIdPutTest() throws Exception {
        Integer oilId = 56;
        PutOilDetails body = new PutOilDetails();
        ResponseEntity<Void> responseEntity = api.oilsOilIdPut(oilId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void oilsPostTest() throws Exception {
        PostOilDetails body = new PostOilDetails();
        ResponseEntity<Void> responseEntity = api.oilsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
