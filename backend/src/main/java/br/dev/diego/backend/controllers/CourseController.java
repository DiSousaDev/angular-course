package br.dev.diego.backend.controllers;

import br.dev.diego.backend.entities.dto.CourseDTO;
import br.dev.diego.backend.services.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<CourseDTO>> findAll() {
        return ResponseEntity.ok().body(courseService.findAll());
    }
    
}