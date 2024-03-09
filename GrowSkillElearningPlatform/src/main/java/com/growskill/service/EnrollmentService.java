package com.growskill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.growskill.exception.*;
import com.growskill.model.*;
import com.growskill.repository.*;

@Service
public class EnrollmentService {
 @Autowired
 private EnrollmentRepository enrollmentRepository;

 public void validateAndEnroll(Long courseId, User user) throws CourseNotFoundException, UserNotFoundException, EnrollmentNotFoundException {
     // Implement validation logic and enrollment
     Course course = new Course(null, null, null);
     User existingUser = new User(null, null, null);

     // Validate and enroll user in the course
     if (!enrollmentRepository.existsByUserAndCourse(existingUser, course)) {
         Enrollment enrollment = new Enrollment(courseId, existingUser, course, null);
         enrollmentRepository.save(enrollment);
     } else {
         throw new EnrollmentNotFoundException("User is already enrolled in this course.");
     }
 }
}

