package com.capgemini.pagepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;

	public Home(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/header/ul/li[1]/a")
	WebElement home;
	
	@FindBy(xpath="/html/body/div/header/ul/li[2]/a")
	WebElement register;
	
	@FindBy(xpath="/html/body/div/header/ul/li[3]/a")
	WebElement contact;
	
	@FindBy(className="primary-content")
	WebElement header;
	
	public WebElement getHome() {
		return home;
	}

	

	public WebElement getRegister() {
		return register;
	}

	

	public WebElement getContact() {
		return contact;
	}

	

	public WebElement getHeader() {
		return header;
	}

}
