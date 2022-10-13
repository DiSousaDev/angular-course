package br.dev.diego.backend.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseSaveDTO extends CourseDTO {
    @JsonProperty("category")
    private Long categoryId;

    public Long getCategoryId() {
        return categoryId;
    }
}