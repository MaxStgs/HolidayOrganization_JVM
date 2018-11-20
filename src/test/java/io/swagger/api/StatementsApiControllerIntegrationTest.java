package io.swagger.api;

import io.swagger.model.ListOfStatements;
import io.swagger.model.PostStatementDetails;

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
public class StatementsApiControllerIntegrationTest {

    @Autowired
    private StatementsApi api;

    @Test
    public void statementsGetTest() throws Exception {
        ResponseEntity<ListOfStatements> responseEntity = api.statementsGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void statementsPostTest() throws Exception {
        PostStatementDetails body = new PostStatementDetails();
        ResponseEntity<Void> responseEntity = api.statementsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
