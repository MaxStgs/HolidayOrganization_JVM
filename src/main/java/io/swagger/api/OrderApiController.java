package io.swagger.api;

import io.swagger.EMF;
import io.swagger.converters.OrderFromSiteConverter;
import io.swagger.entities.OrdersSiteEntity;
import io.swagger.model.ListOfOrdersFromSite;
import io.swagger.model.OrderFromSiteDetails;
import io.swagger.model.PostOrderFromSiteDetails;
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
public class OrderApiController implements OrderApi {

    private static final Logger log = LoggerFactory.getLogger(OrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ListOfOrdersFromSite> orderGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ListOfOrdersFromSite>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrderFromSiteDetails> orderOrderIdGet(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") Integer orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OrderFromSiteDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> orderPost(@ApiParam(value = ""  )  @Valid @RequestBody PostOrderFromSiteDetails body) {
        String accept = request.getHeader("Accept");

        EMF.getEm().getTransaction().begin();
        OrdersSiteEntity ordersSiteEntity = OrderFromSiteConverter.postModelToEntity(body);
        EMF.getEm().persist(ordersSiteEntity);
        EMF.getEm().getTransaction().commit();

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
