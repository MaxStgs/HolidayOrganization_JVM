package io.swagger.api;

import io.swagger.EMF;
import io.swagger.converters.ComingConverter;
import io.swagger.entities.ComingsEntity;
import io.swagger.model.ComingDetails;
import io.swagger.model.ListOfComings;
import io.swagger.model.PostComingDetails;
import io.swagger.model.PutComingDetails;
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
public class ComingsApiController implements ComingsApi {

    private static final Logger log = LoggerFactory.getLogger(ComingsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ComingsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> comingsComingIdDelete(@ApiParam(value = "comingId",required=true) @PathVariable("comingId") Integer comingId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ComingDetails> comingsComingIdGet(@ApiParam(value = "comingId",required=true) @PathVariable("comingId") Integer comingId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ComingDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> comingsComingIdPut(@ApiParam(value = "comingId",required=true) @PathVariable("comingId") Integer comingId,@ApiParam(value = ""  )  @Valid @RequestBody PutComingDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListOfComings> comingsGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ListOfComings>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> comingsPost(@ApiParam(value = ""  )  @Valid @RequestBody PostComingDetails body) {
        String accept = request.getHeader("Accept");

        EMF.getEm().getTransaction().begin();
        ComingsEntity comingsEntity = ComingConverter.postModelToEntity(body);
        EMF.getEm().persist(comingsEntity);
        EMF.getEm().getTransaction().commit();

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
