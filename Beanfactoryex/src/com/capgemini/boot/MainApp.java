package com.capgemini.boot;
import org.springframework.beans.factory.InitializingBean; 
import org.springframework.beans.factory.xml.XmlBeanFactory; 
import org.springframework.core.io.ClassPathResource;

import com.capgemini.model.Message;

public class MainApp {
	public static void main(String[] args) { 
	      XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("bean.xml")); 
	      Message obj = (Message) factory.getBean("helloWorld");    
	      System.out.println(obj.getMessage());    
	   }
}
