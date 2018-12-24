package io.swagger.api;

import io.swagger.EMF;
import io.swagger.converters.WorkerConverter;
import io.swagger.entities.WorkersEntity;
import io.swagger.model.ListOfWorkers;
import io.swagger.model.PostWorkerDetails;
import io.swagger.model.PutWorkerDetails;
import io.swagger.model.WorkerDetails;
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
public class WorkersApiController implements WorkersApi {

    private static final Logger log = LoggerFactory.getLogger(WorkersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WorkersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ListOfWorkers> workersGet() {
        String accept = request.getHeader("Accept");

        TypedQuery<WorkersEntity> query = EMF.getEm().createQuery("from WorkersEntity", WorkersEntity.class);
        ListOfWorkers listOfWorkers = new ListOfWorkers();

        for (int i = 0; i < query.getResultList().size(); i++) {
            listOfWorkers.addListItem(WorkerConverter.entityToModel(query.getResultList().get(i)));
        }
        return new ResponseEntity<ListOfWorkers>(listOfWorkers, HttpStatus.OK);
    }

    public ResponseEntity<Void> workersOrderIdGet(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") Integer orderId) {
        String accept = request.getHeader("Accept");

        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> workersPost(@ApiParam(value = ""  )  @Valid @RequestBody PostWorkerDetails body) {
        String accept = request.getHeader("Accept");

        EMF.getEm().getTransaction().begin();
        WorkersEntity workersEntity = WorkerConverter.postModelToEntity(body);
        EMF.getEm().persist(workersEntity);
        EMF.getEm().getTransaction().commit();

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<WorkerDetails> workersWorkerIdGet(@ApiParam(value = "workerId",required=true) @PathVariable("workerId") Integer workerId) {
        String accept = request.getHeader("Accept");

        TypedQuery<WorkersEntity> query = EMF.getEm().createQuery("from WorkersEntity", WorkersEntity.class);
        WorkerDetails workerDetails = WorkerConverter.entityToModel(query.getResultList().get(0));
        if(workerDetails == null) {
            return new ResponseEntity<WorkerDetails>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<WorkerDetails>(workerDetails, HttpStatus.OK);
    }

    public ResponseEntity<Void> workersWorkerIdPut(@ApiParam(value = "workerId",required=true) @PathVariable("workerId") Integer workerId,@ApiParam(value = ""  )  @Valid @RequestBody PutWorkerDetails body) {
        String accept = request.getHeader("Accept");

        WorkersEntity workersEntity = EMF.getEm().find(WorkersEntity.class, workerId);

        EMF.getEm().getTransaction().begin();
        EMF.getEm().persist(WorkerConverter.putModelToEntity(workersEntity, body));
        EMF.getEm().getTransaction().commit();

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
