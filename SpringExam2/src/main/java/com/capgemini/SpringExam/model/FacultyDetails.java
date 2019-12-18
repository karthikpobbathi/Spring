package com.capgemini.SpringExam.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FacultyDetails {
	
	@Id
	private String sessionName;
	private int duration;
	
	
	public FacultyDetails(String sessionName, int duration) {
		super();
		this.sessionName = sessionName;
		this.duration = duration;
		//this.sessionDetails = sessionDetails;
	}
	
	public FacultyDetails() {
		super();
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
	
}
