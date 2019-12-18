package com.capgemini.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Employee employee= context.getBean("emp",Employee.class);
		System.out.println(employee.getAddress().getCity());
	}
}
