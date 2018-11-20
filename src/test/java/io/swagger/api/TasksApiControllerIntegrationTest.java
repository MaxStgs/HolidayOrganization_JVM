package io.swagger.api;

import io.swagger.model.ListOfSubtasks;
import io.swagger.model.ListOfTasks;
import io.swagger.model.PostTaskDetails;
import io.swagger.model.PutTaskDetails;
import io.swagger.model.SubtaskDetails;
import io.swagger.model.TaskDetails;

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
public class TasksApiControllerIntegrationTest {

    @Autowired
    private TasksApi api;

    @Test
    public void tasksGetTest() throws Exception {
        ResponseEntity<ListOfTasks> responseEntity = api.tasksGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void tasksPostTest() throws Exception {
        PostTaskDetails body = new PostTaskDetails();
        ResponseEntity<Void> responseEntity = api.tasksPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void tasksTaskIdGetTest() throws Exception {
        Integer taskId = 56;
        ResponseEntity<TaskDetails> responseEntity = api.tasksTaskIdGet(taskId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void tasksTaskIdPutTest() throws Exception {
        Integer taskId = 56;
        PutTaskDetails body = new PutTaskDetails();
        ResponseEntity<Void> responseEntity = api.tasksTaskIdPut(taskId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void tasksTaskIdSubtaskIdGetTest() throws Exception {
        Integer taskId = 56;
        Integer subtaskId = 56;
        ResponseEntity<SubtaskDetails> responseEntity = api.tasksTaskIdSubtaskIdGet(taskId, subtaskId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void tasksTaskIdSubtasksGetTest() throws Exception {
        Integer taskId = 56;
        ResponseEntity<ListOfSubtasks> responseEntity = api.tasksTaskIdSubtasksGet(taskId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
