package br.dev.diego.backend.services;

import br.dev.diego.backend.entities.dto.CourseDTO;
import br.dev.diego.backend.entities.dto.CourseSaveDTO;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    List<CourseDTO> findAll();

    Optional<CourseDTO> findById(Long id);

    CourseDTO save(CourseSaveDTO entity);
}