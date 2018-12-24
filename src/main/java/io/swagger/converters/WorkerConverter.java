package io.swagger.converters;

import io.swagger.entities.WorkersEntity;
import io.swagger.model.PostWorkerDetails;
import io.swagger.model.PutWorkerDetails;
import io.swagger.model.WorkerDetails;

public class WorkerConverter {

    public static WorkersEntity modelToEntity(WorkerDetails model) {
        WorkersEntity workersEntity = new WorkersEntity();

        workersEntity.setWorkerId(model.getId());
        workersEntity.setUserColor(model.getColor());
        workersEntity.setLogin(model.getLogin());
        workersEntity.setFullName(model.getName());
        workersEntity.setPassportData(model.getPassportData());
        workersEntity.setPass(model.getPassportData());
        workersEntity.setPhone(model.getPhone());
        workersEntity.setRating(model.getRating().doubleValue());
        workersEntity.setRole(model.getRole());

        return workersEntity;
    }

    public static WorkerDetails entityToModel(WorkersEntity entity) {
        WorkerDetails workerDetails = new WorkerDetails();

        workerDetails.setId(entity.getWorkerId());
        workerDetails.setColor(entity.getUserColor());
        workerDetails.setLogin(entity.getLogin());
        workerDetails.setName(entity.getFullName());
        workerDetails.setPassportData(entity.getPassportData());
        workerDetails.setPassword(entity.getPass());
        workerDetails.setPhone(entity.getPhone());
        workerDetails.setRating(entity.getRating().floatValue());
        workerDetails.setRole(entity.getRole());

        return workerDetails;
    }

    public static WorkersEntity postModelToEntity(PostWorkerDetails model) {
        WorkersEntity workersEntity = new WorkersEntity();

        workersEntity.setUserColor(model.getColor());
        workersEntity.setLogin(model.getLogin());
        workersEntity.setFullName(model.getName());
        workersEntity.setPassportData(model.getPassportData());
        workersEntity.setPass(model.getPassword());
        workersEntity.setPhone(model.getPhone());
        workersEntity.setRating(model.getRating().doubleValue());
        workersEntity.setRole(model.getRole());
        // Todo: Update Photo - Parse File Error
        workersEntity.setPhoto(new byte[]{});

        return workersEntity;
    }

    public static WorkersEntity putModelToEntity(WorkersEntity workersEntity, PutWorkerDetails model) {
        workersEntity.setUserColor(model.getColor());
        workersEntity.setLogin(model.getLogin());
        workersEntity.setFullName(model.getName());
        workersEntity.setPassportData(model.getPassportData());
        workersEntity.setPass(model.getPassword());
        workersEntity.setPhone(model.getPhone());
        workersEntity.setRating(model.getRating().doubleValue());
        workersEntity.setRole(model.getRole());
        // Todo: Update Photo - Parse File Error
        workersEntity.setPhoto(new byte[]{});

        return workersEntity;
    }
}
