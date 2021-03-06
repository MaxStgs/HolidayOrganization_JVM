/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ListOfOuts;
import io.swagger.model.OutDetails;
import io.swagger.model.PostOutDetails;
import io.swagger.model.PutOutDetails;
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

@Api(value = "outs", description = "the outs API")
public interface OutsApi {

    @ApiOperation(value = "", nickname = "outsGet", notes = "Reading list of outs", response = ListOfOuts.class, tags={ "Outs", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Good reading outs", response = ListOfOuts.class),
        @ApiResponse(code = 500, message = "Bad reading outs") })
    @RequestMapping(value = "/outs",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ListOfOuts> outsGet();


    @ApiOperation(value = "", nickname = "outsOutIdDelete", notes = "Delete out by ID", tags={ "Outs", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Good delete out by ID"),
        @ApiResponse(code = 404, message = "Bad delete out, not found ID"),
        @ApiResponse(code = 500, message = "Bad delete out") })
    @RequestMapping(value = "/outs/{outId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> outsOutIdDelete(@ApiParam(value = "outId",required=true) @PathVariable("outId") Integer outId);


    @ApiOperation(value = "", nickname = "outsOutIdGet", notes = "Get out by ID", response = OutDetails.class, tags={ "Outs", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Good reading out by ID", response = OutDetails.class),
        @ApiResponse(code = 404, message = "Bad reading out, not found ID"),
        @ApiResponse(code = 500, message = "Bad reading out") })
    @RequestMapping(value = "/outs/{outId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<OutDetails> outsOutIdGet(@ApiParam(value = "outId",required=true) @PathVariable("outId") Integer outId);


    @ApiOperation(value = "", nickname = "outsOutIdPut", notes = "Modify out", tags={ "Outs", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Good modify out by ID"),
        @ApiResponse(code = 404, message = "Bad modify out, not found ID"),
        @ApiResponse(code = 500, message = "Bad modify out") })
    @RequestMapping(value = "/outs/{outId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> outsOutIdPut(@ApiParam(value = "outId",required=true) @PathVariable("outId") Integer outId,@ApiParam(value = ""  )  @Valid @RequestBody PutOutDetails body);


    @ApiOperation(value = "", nickname = "outsPost", notes = "Add out", tags={ "Outs", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Good add out"),
        @ApiResponse(code = 500, message = "Bad add out") })
    @RequestMapping(value = "/outs",
        consumes = {"multipart/form-data"},
        method = RequestMethod.POST)
    ResponseEntity<Void> outsPost(@ApiParam(value = ""  )  @Valid @RequestBody PostOutDetails body);

}
