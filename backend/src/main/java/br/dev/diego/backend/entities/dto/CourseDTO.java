package br.dev.diego.backend.entities.dto;

import br.dev.diego.backend.entities.Course;
import com.fasterxml.jackson.annotation.JsonProperty;
public class CourseDTO {

    @JsonProperty("_id")
    private String id;
    private String name;
    private String category;

    public CourseDTO() {
    }

    public CourseDTO(Course entity) {
        id = entity.getId().toString();
        name = entity.getName();
        category = entity.getCategory().getName();
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