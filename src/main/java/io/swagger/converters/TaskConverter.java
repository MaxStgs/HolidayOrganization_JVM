package io.swagger.converters;

import io.swagger.entities.TasksEntity;
import io.swagger.model.TaskDetails;

public class TaskConverter {

    public static TaskDetails entityToModel(TasksEntity entity) {
        TaskDetails model = new TaskDetails();

        model.setId(entity.getTaskId());
        model.setDescription(entity.getDescription());
        return model;
    }

    public static TasksEntity modelToEntity() {
        TasksEntity entity = new TasksEntity();



        return entity;
    }
}
