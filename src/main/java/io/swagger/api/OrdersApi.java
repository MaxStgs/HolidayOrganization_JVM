/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

@Api(value = "orders", description = "the orders API")
public interface OrdersApi {

    @ApiOperation(value = "", nickname = "ordersGet", notes = "Read orders", tags={ "Orders", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Good read orders"),
        @ApiResponse(code = 500, message = "Bad read orders") })
    @RequestMapping(value = "/orders",
        method = RequestMethod.GET)
    ResponseEntity<Void> ordersGet();


    @ApiOperation(value = "", nickname = "ordersOrderIdGet", notes = "Read order by ID", tags={ "Orders", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Good read order by ID"),
        @ApiResponse(code = 404, message = "Bad read order, not found ID"),
        @ApiResponse(code = 500, message = "Bad read order by ID") })
    @RequestMapping(value = "/orders/{orderId}",
        method = RequestMethod.GET)
    ResponseEntity<Void> ordersOrderIdGet(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") Integer orderId);

}
