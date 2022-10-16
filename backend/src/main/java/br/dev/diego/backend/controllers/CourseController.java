package br.dev.diego.backend.controllers;

import br.dev.diego.backend.entities.dto.CourseDTO;
import br.dev.diego.backend.entities.dto.CourseSaveDTO;
import br.dev.diego.backend.services.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/api/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<CourseDTO>> findAll() {
        return ResponseEntity.ok().body(courseService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CourseDTO> findById(@PathVariable Long id) {
        return courseService.findById(id)
                .map(courseDTO -> ResponseEntity.ok().body(courseDTO))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CourseDTO> save(@RequestBody CourseSaveDTO entity) {
        CourseDTO courseDTO = courseService.save(entity);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(courseDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(courseDTO);
    }
    
}