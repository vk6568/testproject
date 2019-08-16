package com.hcl.ingit.entiry;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long studentId;
private String firstName;
private String lastName;
private String courseName;
private String courseDuration;
private Double fee;
private String registrationStatus;
private String loginStatus;
public Registration() {
	
}
public Long getStudentId() {
	return studentId;
}
public void setStudentId(Long studentId) {
	this.studentId = studentId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseDuration() {
	return courseDuration;
}
public void setCourseDuration(String courseDuration) {
	this.courseDuration = courseDuration;
}
public Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}
public String getRegistrationStatus() {
	return registrationStatus;
}
public void setRegistrationStatus(String registrationStatus) {
	this.registrationStatus = registrationStatus;
}
public String getLoginStatus() {
	return loginStatus;
}
public void setLoginStatus(String loginStatus) {
	this.loginStatus = loginStatus;
}
public Registration(Long studentId, String firstName, String lastName, String courseName, String courseDuration,
		Double fee, String registrationStatus, String loginStatus) {
	super();
	this.studentId = studentId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.courseName = courseName;
	this.courseDuration = courseDuration;
	this.fee = fee;
	this.registrationStatus = registrationStatus;
	this.loginStatus = loginStatus;
}
}
