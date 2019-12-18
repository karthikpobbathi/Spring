package com.capgemini.SpringExam.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SessionDetails {
	@Id
	private String sessionName;
	private int duration;
	private String role;
	private String faculty;
	@OneToOne
	private FacultyDetails facultyDetails;
	
	public SessionDetails() {
		super();}
	
	public SessionDetails(String sessionName, int duration, String role, String faculty) {
		super();
		this.sessionName = sessionName;
		this.duration = duration;
		this.role = role;
		this.faculty = faculty;
		//this.facultyDetails = facultyDetails;
	}

	public FacultyDetails getFacultyDetails() {
		return facultyDetails;
	}

	public void setFacultyDetails(FacultyDetails facultyDetails) {
		this.facultyDetails = facultyDetails;
	}

	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	
	
}
