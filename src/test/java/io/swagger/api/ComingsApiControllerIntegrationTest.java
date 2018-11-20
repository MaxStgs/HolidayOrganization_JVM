package io.swagger.api;

import io.swagger.model.ComingDetails;
import io.swagger.model.ListOfComings;
import io.swagger.model.PostComingDetails;
import io.swagger.model.PutComingDetails;

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
public class ComingsApiControllerIntegrationTest {

    @Autowired
    private ComingsApi api;

    @Test
    public void comingsComingIdDeleteTest() throws Exception {
        Integer comingId = 56;
        ResponseEntity<Void> responseEntity = api.comingsComingIdDelete(comingId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void comingsComingIdGetTest() throws Exception {
        Integer comingId = 56;
        ResponseEntity<ComingDetails> responseEntity = api.comingsComingIdGet(comingId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void comingsComingIdPutTest() throws Exception {
        Integer comingId = 56;
        PutComingDetails body = new PutComingDetails();
        ResponseEntity<Void> responseEntity = api.comingsComingIdPut(comingId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void comingsGetTest() throws Exception {
        ResponseEntity<ListOfComings> responseEntity = api.comingsGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void comingsPostTest() throws Exception {
        PostComingDetails body = new PostComingDetails();
        ResponseEntity<Void> responseEntity = api.comingsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
