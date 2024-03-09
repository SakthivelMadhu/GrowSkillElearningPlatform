package com.growskill.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.growskill.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
	Optional<Course> findByTitle(String title);
	
}
