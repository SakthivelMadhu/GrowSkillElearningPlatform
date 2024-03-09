package com.growskill.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.growskill.exception.CourseNotFoundException;
import com.growskill.exception.EnrollmentNotFoundException;
import com.growskill.exception.UserNotFoundException;
import com.growskill.model.User;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private CourseService courseService;

    @Test
    public void testEnrollUser() throws CourseNotFoundException, UserNotFoundException, EnrollmentNotFoundException {
        // Given
        User mockUser = new User();
        mockUser.setUserId(1L);
        mockUser.setUsername("john.doe");

        
        doNothing().when(courseService).validateAndEnroll(anyLong(), any(User.class));

        // When
        userService.enrollUser(1L, mockUser);

    }

}
