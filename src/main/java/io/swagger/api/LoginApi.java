/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.LoginDetails;
import io.swagger.model.PostLoginDetails;
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

@Api(value = "login", description = "the login API")
public interface LoginApi {

    @ApiOperation(value = "", nickname = "loginPost", notes = "Login", response = LoginDetails.class, tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Good login", response = LoginDetails.class),
        @ApiResponse(code = 404, message = "Bad login, not found/bad pass"),
        @ApiResponse(code = 500, message = "Bad login") })
    @RequestMapping(value = "/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LoginDetails> loginPost(@ApiParam(value = ""  )  @Valid @RequestBody PostLoginDetails body);

}
