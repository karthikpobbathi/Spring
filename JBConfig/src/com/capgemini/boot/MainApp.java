package com.capgemini.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.model.Employee;
import com.capgemini.model.EmployeeConfig;

public class MainApp {
public static void main(String[] args) {
	 ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
	   
    Employee employee = ctx.getBean(Employee.class);
    
    employee.setName("karthik");
    employee.setId(100);
    System.out.println(employee);
    

}
}