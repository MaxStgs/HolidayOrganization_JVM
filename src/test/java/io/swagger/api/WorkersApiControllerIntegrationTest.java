package io.swagger.api;

import io.swagger.model.ListOfWorkers;
import io.swagger.model.PostWorkerDetails;
import io.swagger.model.PutWorkerDetails;
import io.swagger.model.WorkerDetails;

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
public class WorkersApiControllerIntegrationTest {

    @Autowired
    private WorkersApi api;

    @Test
    public void workersGetTest() throws Exception {
        ResponseEntity<ListOfWorkers> responseEntity = api.workersGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void workersOrderIdGetTest() throws Exception {
        Integer orderId = 56;
        ResponseEntity<Void> responseEntity = api.workersOrderIdGet(orderId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void workersPostTest() throws Exception {
        PostWorkerDetails body = new PostWorkerDetails();
        ResponseEntity<Void> responseEntity = api.workersPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void workersWorkerIdGetTest() throws Exception {
        Integer workerId = 56;
        ResponseEntity<WorkerDetails> responseEntity = api.workersWorkerIdGet(workerId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void workersWorkerIdPutTest() throws Exception {
        Integer workerId = 56;
        PutWorkerDetails body = new PutWorkerDetails();
        ResponseEntity<Void> responseEntity = api.workersWorkerIdPut(workerId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
