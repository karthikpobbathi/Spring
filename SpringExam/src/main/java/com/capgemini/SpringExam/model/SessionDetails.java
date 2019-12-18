package com.capgemini.SpringExam.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SessionDetails {
	@Id
	private String sessionName;
	public SessionDetails() {
		super();
	}
	public SessionDetails(String sessionName, int duration, String role, String faculty) {
		super();
		this.sessionName = sessionName;
		this.duration = duration;
		this.role = role;
		this.faculty = faculty;
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
	private int duration;
	private String role;
	private String faculty;

	
	
}
