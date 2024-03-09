package com.growskill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.growskill.exception.*;
import com.growskill.model.*;

@Service
public class UserService {
	 @Autowired
	 private CourseService courseService;
	
	 public void enrollUser(Long courseId, User user) throws CourseNotFoundException, UserNotFoundException, EnrollmentNotFoundException {
	    
	     courseService.validateAndEnroll(courseId, user);
	 }
}
