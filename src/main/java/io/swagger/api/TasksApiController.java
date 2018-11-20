package io.swagger.api;

import io.swagger.model.ListOfSubtasks;
import io.swagger.model.ListOfTasks;
import io.swagger.model.PostTaskDetails;
import io.swagger.model.PutTaskDetails;
import io.swagger.model.SubtaskDetails;
import io.swagger.model.TaskDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

@Controller
public class TasksApiController implements TasksApi {

    private static final Logger log = LoggerFactory.getLogger(TasksApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TasksApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ListOfTasks> tasksGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ListOfTasks>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> tasksPost(@ApiParam(value = ""  )  @Valid @RequestBody PostTaskDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TaskDetails> tasksTaskIdGet(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") Integer taskId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<TaskDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> tasksTaskIdPut(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") Integer taskId,@ApiParam(value = ""  )  @Valid @RequestBody PutTaskDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SubtaskDetails> tasksTaskIdSubtaskIdGet(@ApiParam(value = "The Task Id",required=true) @PathVariable("taskId") Integer taskId,@ApiParam(value = "The Subtask Id",required=true) @PathVariable("subtaskId") Integer subtaskId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<SubtaskDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListOfSubtasks> tasksTaskIdSubtasksGet(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") Integer taskId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ListOfSubtasks>(HttpStatus.NOT_IMPLEMENTED);
    }

}
