package io.swagger.api;

import io.swagger.EMF;
import io.swagger.converters.EquipmentConverter;
import io.swagger.entities.EquipmentsEntity;
import io.swagger.model.EquipmentDetails;
import io.swagger.model.ListOfEquipments;
import io.swagger.model.PostEquipmentDetails;
import io.swagger.model.PutEquipmentDetails;
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

import javax.persistence.TypedQuery;
import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

@Controller
public class EquipmentApiController implements EquipmentApi {

    private static final Logger log = LoggerFactory.getLogger(EquipmentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EquipmentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EquipmentDetails> equipmentEquipmentIdGet(@ApiParam(value = "Equipment ID",required=true) @PathVariable("equipmentId") Integer equipmentId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<EquipmentDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> equipmentEquipmentIdPut(@ApiParam(value = "Equipment ID",required=true) @PathVariable("equipmentId") Integer equipmentId,@ApiParam(value = ""  )  @Valid @RequestBody PutEquipmentDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListOfEquipments> equipmentGet() {
        String accept = request.getHeader("Accept");

        TypedQuery<EquipmentsEntity> query = EMF.getEm().createQuery("from EquipmentsEntity", EquipmentsEntity.class);
        ListOfEquipments listOfEquipments = new ListOfEquipments();

        for (int i = 0; i < query.getResultList().size(); i++) {
            listOfEquipments.addListItem(EquipmentConverter.entityToModel(query.getResultList().get(i)));
        }

        return new ResponseEntity<ListOfEquipments>(listOfEquipments, HttpStatus.OK);
    }

    public ResponseEntity<EquipmentDetails> equipmentOrderIdGet(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") Integer orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<EquipmentDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> equipmentPost(@ApiParam(value = ""  )  @Valid @RequestBody PostEquipmentDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
