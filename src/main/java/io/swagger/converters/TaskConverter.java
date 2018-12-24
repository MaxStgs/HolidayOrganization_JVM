package io.swagger.converters;

import io.swagger.entities.TasksEntity;
import io.swagger.model.PostTaskDetails;
import io.swagger.model.TaskDetails;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskConverter {

    public static TaskDetails entityToModel(TasksEntity entity) {
        TaskDetails model = new TaskDetails();

        model.setId(entity.getTaskId());
        model.setDescription(entity.getDescription());
        model.setIdWorker(entity.getWorkerId());
        // Todo: After swagger1update. Update date.
        //model.setDate(new File(entity.getDateRecord().toString()));
        return model;
    }

    public static TasksEntity modelToEntity(PostTaskDetails model) {
        TasksEntity entity = new TasksEntity();

        // Todo: After swagger update. Update name.
//        entity.setName(model.getName());
        entity.setDescription(model.getDescription());

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(model.getDate().toString());
            entity.setDateRecord(new java.sql.Timestamp(parsedDate.getTime()));
        } catch (ParseException e) {
            System.out.println("TaskConverter.modelToEntity can't convert " +
                    model.getDate().toString() +
                    " to SimpleDateFormat");
        }

        entity.setWorkerId(model.getIdWorker());

        return entity;
    }
}
