package io.swagger.api;

import io.swagger.model.ListOfOuts;
import io.swagger.model.OutDetails;
import io.swagger.model.PostOutDetails;
import io.swagger.model.PutOutDetails;

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
public class OutsApiControllerIntegrationTest {

    @Autowired
    private OutsApi api;

    @Test
    public void outsGetTest() throws Exception {
        ResponseEntity<ListOfOuts> responseEntity = api.outsGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void outsOutIdDeleteTest() throws Exception {
        Integer outId = 56;
        ResponseEntity<Void> responseEntity = api.outsOutIdDelete(outId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void outsOutIdGetTest() throws Exception {
        Integer outId = 56;
        ResponseEntity<OutDetails> responseEntity = api.outsOutIdGet(outId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void outsOutIdPutTest() throws Exception {
        Integer outId = 56;
        PutOutDetails body = new PutOutDetails();
        ResponseEntity<Void> responseEntity = api.outsOutIdPut(outId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void outsPostTest() throws Exception {
        PostOutDetails body = new PostOutDetails();
        ResponseEntity<Void> responseEntity = api.outsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
