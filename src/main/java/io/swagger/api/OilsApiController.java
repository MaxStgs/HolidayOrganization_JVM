package io.swagger.api;

import io.swagger.model.ListOfOils;
import io.swagger.model.OilDetails;
import io.swagger.model.PostOilDetails;
import io.swagger.model.PutOilDetails;
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
public class OilsApiController implements OilsApi {

    private static final Logger log = LoggerFactory.getLogger(OilsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OilsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ListOfOils> oilsGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ListOfOils>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> oilsOilIdDelete(@ApiParam(value = "oilId",required=true) @PathVariable("oilId") Integer oilId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OilDetails> oilsOilIdGet(@ApiParam(value = "oilId",required=true) @PathVariable("oilId") Integer oilId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OilDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> oilsOilIdPut(@ApiParam(value = "oilId",required=true) @PathVariable("oilId") Integer oilId,@ApiParam(value = ""  )  @Valid @RequestBody PutOilDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> oilsPost(@ApiParam(value = ""  )  @Valid @RequestBody PostOilDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
