package org.cap.model;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NamedNativeQueries;


@NamedQuery(query = "from Employee e where e.salary>=:empsal",name="findBySalary")
@NamedNativeQuery(query = "select fname from employee",name ="findAllFirstName")
@NamedNativeQuery(query = "select max(salary) from employee",name = "findMaxSalary")


@Entity
//@Table(name="Employee_Details")
public class Employee {
	@Id
	@GeneratedValue
	private int employeeId;
	@Column(name="fname",nullable = false)
	private String firstName;
	@Basic
	private String lastName;
	private double salary;
	
	
	@ManyToOne
	@JoinColumn(name = "companyId")
	private Company company;
	
	public Employee( String firstName, String lastName, double salary, Company company) {
		super();
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.company = company;
	}


	public Employee(int employeeId, String firstName, String lastName, double salary, Company company) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.company = company;
	}
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		//this.company = company;
	}

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}
	
	
	
}
