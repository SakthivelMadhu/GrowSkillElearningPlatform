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
    

	@Column(name = "payment_status")
    private boolean paymentStatus;

    private LocalDateTime enrollmentDate;
    
    @OneToOne(mappedBy = "enrollment", cascade = CascadeType.ALL, orphanRemoval = true)
    private Certificate certificate;

	

	public Enrollment(Long enrollmentId, User user, Course course, boolean paymentStatus, LocalDateTime enrollmentDate,
			Certificate certificate) {
		super();
		this.enrollmentId = enrollmentId;
		this.user = user;
		this.course = course;
		this.paymentStatus = paymentStatus;
		this.enrollmentDate = enrollmentDate;
		this.certificate = certificate;
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

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
    
    
    

}
