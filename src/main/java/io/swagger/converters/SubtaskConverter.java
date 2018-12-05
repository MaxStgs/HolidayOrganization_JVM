package io.swagger.converters;

import io.swagger.entities.SubtasksEntity;
import io.swagger.model.SubtaskDetails;

public class SubtaskConverter {

    public static SubtaskDetails entityToModel(SubtasksEntity entity) {
        SubtaskDetails model = new SubtaskDetails();

        model.setId(entity.getSubtaskId());
        model.setDescription(entity.getDescription());
        model.setIdInList(entity.getSubtaskNumber());
        model.setStatus(entity.getStatus() != 0);
        model.setIdTask(entity.getTaskId());

        return model;
    }

    public static SubtasksEntity modelToEntity(SubtaskDetails model) {
        SubtasksEntity entity = new SubtasksEntity();

        entity.setTaskId(model.getId());
        entity.setDescription(model.getDescription());
        entity.setStatus(model.isStatus() ? 1 : 0);
        entity.setSubtaskNumber(model.getIdInList());
        entity.setSubtaskId(model.getId());

        return entity;
    }
}
