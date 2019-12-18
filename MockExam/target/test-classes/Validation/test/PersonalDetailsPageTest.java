package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagefactory.PersonalDetailsPage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalDetailsPageTest {

	
	WebDriver driver;
	
	PersonalDetailsPage personaldetails;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\KPOBBATH\\\\Documents\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("C:\\Users\\KPOBBATH\\Desktop\\Karthik\\jpafiles\\resume\\src\\webpages\\PersonalDetails.html");
		personaldetails=new PersonalDetailsPage(driver);}
	@org.junit.Test
	public void testPersonaldetailsPage() {
		personaldetails.setlastName().sendKeys("karthik");
		personaldetails.setlastName().sendKeys("pobbathi");
		personaldetails.setemail().sendKeys("kaasdf2gmail.com");
		personaldetails.setaddress1().sendKeys("jdfhsjkld");
		personaldetails.setaddress2().sendKeys("wefawefase");
		personaldetails.setcity().click();
		personaldetails.setcity().click();
		driver.findElement(By.linkText("Next")).click();
	    Alert al = driver.switchTo().alert();
	        Assert.assertEquals("Personal details are validated and accepted successfully.",al.getText());
}

	
}
