package br.dev.diego.backend.repositories;

import br.dev.diego.backend.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}