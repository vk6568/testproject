package com.hcl.ingit.dto;

import java.io.Serializable;

public class RegistrationReqDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long StudentId;
	public RegistrationReqDTO(Long studentId) {
		super();
		StudentId = studentId;
	}
	public RegistrationReqDTO() {
		
	}
	public Long getStudentId() {
		return StudentId;
	}
	public void setStudentId(Long studentId) {
		StudentId = studentId;
	}
	
}
