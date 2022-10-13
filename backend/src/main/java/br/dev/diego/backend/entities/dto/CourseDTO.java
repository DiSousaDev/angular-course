package br.dev.diego.backend.entities.dto;

import br.dev.diego.backend.entities.Course;
import com.fasterxml.jackson.annotation.JsonProperty;
public class CourseDTO {

    @JsonProperty("_id")
    private final String id;
    private final String name;
    private final String category;

    public CourseDTO(Course entity) {
        id = entity.getId().toString();
        name = entity.getName();
        category = entity.getCategory();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}