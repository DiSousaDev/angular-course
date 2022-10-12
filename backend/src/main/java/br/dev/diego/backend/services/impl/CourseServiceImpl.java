package br.dev.diego.backend.services.impl;

import br.dev.diego.backend.entities.dto.CourseDTO;
import br.dev.diego.backend.repositories.CourseRepository;
import br.dev.diego.backend.services.CourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CourseDTO> findAll() {
        return repository.findAll().stream().map(CourseDTO::new).collect(Collectors.toList());
    }
}