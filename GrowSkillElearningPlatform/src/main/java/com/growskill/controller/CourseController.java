package com.growskill.controller;


import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.growskill.service.*;
import com.growskill.exception.*;
import com.growskill.model.*;


@RestController
@RequestMapping("/course")
public class CourseController {
	
	 @GetMapping("/{courseId}")
	 public ResponseEntity<Course> getCourseById(@PathVariable Long courseId) {
	     try {
	         Course course = CourseService.getCourseById(courseId);
	         return ResponseEntity.ok(course);
	     } catch (CourseNotFoundException e) {
	         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	     } catch (Exception e) {
	         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	     }
	 }
	
	 @PostMapping("/create")
	 public ResponseEntity<Course> createCourse(@RequestBody Course course) {
	     try {
	         Course createdCourse = CourseService.createCourse(course);
	         return ResponseEntity.status(HttpStatus.CREATED).body(createdCourse);
	     } catch (Exception e) {
	         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	     }
	 }

}

