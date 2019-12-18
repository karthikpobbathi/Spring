package com.cap.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean  {

	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroyed");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing");
		
	}
}
