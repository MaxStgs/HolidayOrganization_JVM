package io.swagger.api;

import io.swagger.model.ListOfOuts;
import io.swagger.model.OutDetails;
import io.swagger.model.PostOutDetails;
import io.swagger.model.PutOutDetails;
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
public class OutsApiController implements OutsApi {

    private static final Logger log = LoggerFactory.getLogger(OutsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OutsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ListOfOuts> outsGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ListOfOuts>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> outsOutIdDelete(@ApiParam(value = "outId",required=true) @PathVariable("outId") Integer outId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OutDetails> outsOutIdGet(@ApiParam(value = "outId",required=true) @PathVariable("outId") Integer outId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OutDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> outsOutIdPut(@ApiParam(value = "outId",required=true) @PathVariable("outId") Integer outId,@ApiParam(value = ""  )  @Valid @RequestBody PutOutDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> outsPost(@ApiParam(value = ""  )  @Valid @RequestBody PostOutDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
