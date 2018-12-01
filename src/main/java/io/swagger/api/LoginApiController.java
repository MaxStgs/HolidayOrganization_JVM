package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.EMF;
import io.swagger.annotations.ApiParam;
import io.swagger.entities.WorkersEntity;
import io.swagger.model.LoginDetails;
import io.swagger.model.PostLoginDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import static io.swagger.EMF.getEm;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-20T18:24:21.559Z[GMT]")

@Controller
public class LoginApiController implements LoginApi {

    private static final Logger log = LoggerFactory.getLogger(LoginApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LoginApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<LoginDetails> loginPost(@ApiParam(value = ""  )  @Valid @RequestBody PostLoginDetails body) {
        String accept = request.getHeader("Accept");

        TypedQuery<WorkersEntity> query = getEm().
                createQuery("from WorkersEntity where login = :login and pass = :pass", WorkersEntity.class);
        query.setParameter("login", body.getLogin())
                .setParameter("pass", body.getPassword());
        boolean isRightCreditals = query.getResultList().size() >= 1;

        if(isRightCreditals){
            LoginDetails loginDetails = new LoginDetails();
            loginDetails.setRole("Genius");
            ResponseEntity<LoginDetails> response = new ResponseEntity<LoginDetails>(loginDetails, HttpStatus.OK);
            return response;
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        //return new ResponseEntity<LoginDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

}
