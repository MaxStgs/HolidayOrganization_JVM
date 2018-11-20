package io.swagger.api;

import io.swagger.model.CarDetails;
import io.swagger.model.ListOfCars;
import io.swagger.model.PostCarDetails;
import io.swagger.model.PutCarDetails;
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
public class CarsApiController implements CarsApi {

    private static final Logger log = LoggerFactory.getLogger(CarsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CarsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CarDetails> carsCarIdGet(@ApiParam(value = "carId",required=true) @PathVariable("carId") Integer carId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CarDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> carsCarIdPut(@ApiParam(value = "carId",required=true) @PathVariable("carId") Integer carId,@ApiParam(value = ""  )  @Valid @RequestBody PutCarDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListOfCars> carsGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ListOfCars>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> carsPost(@ApiParam(value = ""  )  @Valid @RequestBody PostCarDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}