package com.growskill.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.growskill.exception.CourseNotFoundException;
import com.growskill.exception.EnrollmentNotFoundException;
import com.growskill.exception.UserNotFoundException;
import com.growskill.model.Course;
import com.growskill.model.User;
import com.growskill.repository.CourseRepository;
import com.growskill.repository.EnrollmentRepository;
import com.growskill.repository.UserRepository;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CourseServiceTest {

    @InjectMocks
    private CourseService courseService;

    @Mock
    private CourseRepository courseRepository;

    @Mock
    private UserRepository userRepository;

    @Mock
    private EnrollmentRepository enrollmentRepository;

    @Test
    public void testValidateAndEnroll() throws CourseNotFoundException, UserNotFoundException, EnrollmentNotFoundException {
        // Given
        Course mockCourse = new Course();
        mockCourse.setCourseId(1L);
        mockCourse.setTitle("Java Programming");
        mockCourse.setInstructor("John Doe");

        User mockUser = new User();
        mockUser.setUserId(1L);

        
        when(courseRepository.findById(1L)).thenReturn(java.util.Optional.of(mockCourse));
        when(userRepository.findById(1L)).thenReturn(java.util.Optional.of(mockUser));
        when(enrollmentRepository.existsByUserAndCourse(mockUser, mockCourse)).thenReturn(false);

        // When
        courseService.validateAndEnroll(1L, mockUser);

    }

}

