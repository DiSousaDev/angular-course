package br.dev.diego.backend.entities.dto;

import br.dev.diego.backend.entities.Course;
import com.fasterxml.jackson.annotation.JsonProperty;
public class CourseDTO {

    @JsonProperty("_id")
    private final Long id;
    private final String name;
    private final String category;

    public CourseDTO(Course entity) {
        id = entity.getId();
        name = entity.getName();
        category = entity.getCategory();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}