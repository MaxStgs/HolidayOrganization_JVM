package io.swagger.converters;

public class Converter<model, entity> {
    public Class<entity> modelToEntity(Class<model> model) {
        return modelToEntityProcess(model);
    }

    public Class<model> entityToModel(Class<entity> entity) {
        return entityToModelProcess(entity);
    }

    public Class<entity> modelToEntityProcess(Class<model> model) { return null;}
    public Class<model> entityToModelProcess(Class<entity> entity) { return null;}
}
