package com.growskill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.growskill.exception.*;
import com.growskill.model.*;
import com.growskill.repository.*;

@Service
public class CourseService {

    @Autowired
    private static CourseRepository courseRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public void validateAndEnroll(Long courseId, User user) throws CourseNotFoundException, UserNotFoundException, EnrollmentNotFoundException {
        // Implement validation logic and enrollment
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new CourseNotFoundException(courseId));
        User existingUser = userRepository.findById(user.getUserId()).orElseThrow(() -> new UserNotFoundException(user.getUserId()));

        // Validate and enroll user in the course
        if (!enrollmentRepository.existsByUserAndCourse(existingUser, course)) {
            Enrollment enrollment = new Enrollment();
            enrollmentRepository.save(enrollment);
        } else {
            throw new EnrollmentNotFoundException("User is already enrolled in this course.");
        }
    }

    public static Course getCourseById(Long courseId) throws CourseNotFoundException {
        return courseRepository.findById(courseId).orElseThrow(() -> new CourseNotFoundException(courseId));
    }

    public static Course createCourse(Course course) {
        // Implement logic to create a course
        return courseRepository.save(course);
    }
}
