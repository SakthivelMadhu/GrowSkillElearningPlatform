package com.growskill.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.growskill.model.Course;
import com.growskill.model.Enrollment;
import com.growskill.model.User;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
	
    default boolean existsByUserAndCourse(User user, Course course) {
		return false;
	}

}
