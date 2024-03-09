package com.growskill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.growskill.service.*;
import com.growskill.exception.*;
import com.growskill.model.*;

@RestController
@RequestMapping("/user")
public class UserController {
	 @Autowired
	 private UserService userService;
	
	 @PostMapping("/enroll/{courseId}")
	 public ResponseEntity<String> enrollUser(@PathVariable Long courseId, @RequestBody User user) {
	     try {
	         userService.enrollUser(courseId, user);
	         return ResponseEntity.ok("Enrolled successfully!");
	     } catch (CourseNotFoundException | UserNotFoundException | EnrollmentNotFoundException e) {
	         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	     } catch (Exception e) {
	         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
	     }
	 }
}

