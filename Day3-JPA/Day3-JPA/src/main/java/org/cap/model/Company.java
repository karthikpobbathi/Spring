package org.cap.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	private int companyId;
	private String companyName;
	
	@OneToMany(targetEntity = Employee.class,fetch = FetchType.LAZY,mappedBy = "company")
	private List<Employee> employees=new ArrayList<Employee>();

	public Company(int companyId, String companyName, List<Employee> employees) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.employees = employees;
	}

	public Company() {
		super();
	}

	

	public Company(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	  @Override public String toString() { return "Company [companyId=" + companyId
	  + ", companyName=" + companyName + "]"; }
	 
	
	
	
	
}
