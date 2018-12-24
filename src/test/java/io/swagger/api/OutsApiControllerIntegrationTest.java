package io.swagger.api;

import io.swagger.model.ListOfOuts;
import io.swagger.model.OutDetails;
import io.swagger.model.PostOutDetails;
import io.swagger.model.PutOutDetails;

import java.io.File;
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.threeten.bp.OffsetDateTime;

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
        String comments = "comments_example";
        OffsetDateTime date = OffsetDateTime.now();
        Float total = 3.4F;
        File photo = new File("L:\\Безымянный.jpg");
        Integer idStatement = 56;
        //comments, date, total, photo, idStatement
        PostOutDetails body = new PostOutDetails();
        body.setTotal(total);
        body.setIdStatement(idStatement);
        body.setComments(comments);
        body.setDate(date);
        body.setPhoto(photo);
        ResponseEntity<Void> responseEntity = api.outsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
