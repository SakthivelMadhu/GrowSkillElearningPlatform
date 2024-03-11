package com.growskill.model;



import java.time.*;

import jakarta.persistence.*;

@Entity
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certificate_id")
    private Long certificateId;

    @ManyToOne
    @JoinColumn(name = "enrollment_id")
    private Enrollment enrollment;

    @Column(name = "certificate_content", length = 5000)  // Adjust the length as needed
    private String certificateContent;

    @Column(name = "date_issued")
    private LocalDate dateIssued;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(Long certificateId, Enrollment enrollment, String certificateContent, LocalDate dateIssued) {
		super();
		this.certificateId = certificateId;
		this.enrollment = enrollment;
		this.certificateContent = certificateContent;
		this.dateIssued = dateIssued;
	}

	public Long getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
	}

	public Enrollment getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Enrollment enrollment) {
		this.enrollment = enrollment;
	}

	public String getCertificateContent() {
		return certificateContent;
	}

	public void setCertificateContent(String certificateContent) {
		this.certificateContent = certificateContent;
	}

	public LocalDate getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(LocalDate dateIssued) {
		this.dateIssued = dateIssued;
	}

    
}


