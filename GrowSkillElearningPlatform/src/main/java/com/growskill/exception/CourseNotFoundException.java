package com.growskill.exception;

public class CourseNotFoundException extends RuntimeException {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CourseNotFoundException(Long courseId) {
        super("Course not found with ID: " + courseId);
    }

}
