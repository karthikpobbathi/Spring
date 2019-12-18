package com.cap.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cap.model.Address;
import com.cap.model.Employee;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");

					
					Employee emp = (Employee)applicationContext.getBean("emp");
					Address add= applicationContext.getBean("add",Address.class );
					System.out.println(add.getCity()+emp.getEmpid());
					System.out.println(emp.getEmpname()); 
			 

	}

}
