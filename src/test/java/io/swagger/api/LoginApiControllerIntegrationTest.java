package io.swagger.api;

import io.swagger.model.LoginDetails;
import io.swagger.model.PostLoginDetails;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginApiControllerIntegrationTest {

    @Autowired
    private LoginApi api;

    @Test
    public void loginPostTest() throws Exception {
        PostLoginDetails body = new PostLoginDetails();
        ResponseEntity<LoginDetails> responseEntity = api.loginPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
