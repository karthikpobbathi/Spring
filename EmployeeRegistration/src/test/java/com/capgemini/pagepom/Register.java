package com.capgemini.pagepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;

	public Register(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement name;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input")
	WebElement employeeNumber;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[4]/td[2]/textarea")
	WebElement address;
	
	@FindBy(name="txtFName1")
	WebElement contactNumber;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[6]/td[2]/select/option[2]")
	WebElement location;
		
	@FindBy(xpath="/html/body/form/table/tbody/tr[7]/td[2]/select/option[2]")
	WebElement designation;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[8]/td[2]/input")
	WebElement email;
	
	@FindBy(name="B4")
	WebElement submit;
	
	@FindBy(name="B5")
	WebElement reset;

	public WebElement getName() {
		return name;
	}

	public WebElement getEmployeeNumber() {
		return employeeNumber;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getContactNumber() {
		return contactNumber;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getDesignation() {
		return designation;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getReset() {
		return reset;
	}
}
