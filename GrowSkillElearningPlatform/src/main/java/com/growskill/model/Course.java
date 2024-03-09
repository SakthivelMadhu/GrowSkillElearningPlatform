package com.growskill.model;


import jakarta.persistence.*;

@Entity
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String title;
    private String instructor;
    
	public Course(Long courseId, String title, String instructor) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.instructor = instructor;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
    
    

}
