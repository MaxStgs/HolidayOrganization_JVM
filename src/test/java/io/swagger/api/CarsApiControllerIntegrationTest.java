package io.swagger.api;

import io.swagger.model.CarDetails;
import io.swagger.model.ListOfCars;
import io.swagger.model.PostCarDetails;
import io.swagger.model.PutCarDetails;

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
public class CarsApiControllerIntegrationTest {

    @Autowired
    private CarsApi api;

    @Test
    public void carsCarIdGetTest() throws Exception {
        Integer carId = 56;
        ResponseEntity<CarDetails> responseEntity = api.carsCarIdGet(carId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void carsCarIdPutTest() throws Exception {
        Integer carId = 56;
        PutCarDetails body = new PutCarDetails();
        ResponseEntity<Void> responseEntity = api.carsCarIdPut(carId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void carsGetTest() throws Exception {
        ResponseEntity<ListOfCars> responseEntity = api.carsGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void carsPostTest() throws Exception {
        PostCarDetails body = new PostCarDetails();
        ResponseEntity<Void> responseEntity = api.carsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
