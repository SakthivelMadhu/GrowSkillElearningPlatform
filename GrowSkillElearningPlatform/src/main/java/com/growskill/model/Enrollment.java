package com.growskill.model;


import java.time.*;

import jakarta.persistence.*;

@Entity
public class Enrollment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    
    private LocalDateTime enrollmentDate;

	public Enrollment(Long enrollmentId, User user, Course course, LocalDateTime enrollmentDate) {
		super();
		this.enrollmentId = enrollmentId;
		this.user = user;
		this.course = course;
		this.enrollmentDate = enrollmentDate;
	}

	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(Long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDateTime getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(LocalDateTime enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
    
    
    

}
