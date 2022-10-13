package br.dev.diego.backend.services;

import br.dev.diego.backend.entities.dto.CourseDTO;
import br.dev.diego.backend.entities.dto.CourseSaveDTO;

import java.util.List;

public interface CourseService {

    List<CourseDTO> findAll();

    CourseDTO save(CourseSaveDTO entity);
}