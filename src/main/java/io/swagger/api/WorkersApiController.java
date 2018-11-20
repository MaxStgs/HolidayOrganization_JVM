package io.swagger.api;

import io.swagger.model.ListOfWorkers;
import io.swagger.model.PostWorkerDetails;
import io.swagger.model.PutWorkerDetails;
import io.swagger.model.WorkerDetails;
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
public class WorkersApiController implements WorkersApi {

    private static final Logger log = LoggerFactory.getLogger(WorkersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WorkersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ListOfWorkers> workersGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ListOfWorkers>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> workersOrderIdGet(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") Integer orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> workersPost(@ApiParam(value = ""  )  @Valid @RequestBody PostWorkerDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WorkerDetails> workersWorkerIdGet(@ApiParam(value = "workerId",required=true) @PathVariable("workerId") Integer workerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<WorkerDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> workersWorkerIdPut(@ApiParam(value = "workerId",required=true) @PathVariable("workerId") Integer workerId,@ApiParam(value = ""  )  @Valid @RequestBody PutWorkerDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
