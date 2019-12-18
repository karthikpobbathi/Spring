package com.capgemini.boot;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.capgemini.model.Message;

public class MainApp {
public static void main(String[] args) {
	AbstractApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.xml");
	Message emp = (Message)applicationContext.getBean("helloWorld");
	System.out.println(emp.getMessage());

}
}
