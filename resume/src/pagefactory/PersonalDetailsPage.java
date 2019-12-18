package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {

	WebDriver driver;

	public PersonalDetailsPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtFirstName")
	WebElement firstname;
	
	@FindBy(id="txtLastName")
	WebElement lastname;

	@FindBy(id="txtEmail")
	WebElement email;

	@FindBy(id="txtPhone")
	WebElement phone;

	@FindBy(id="address1")
	WebElement add1;
	
	@FindBy(id="address2")
	WebElement add2;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[9]/td[2]/select/option[2]")
	WebElement city;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[10]/td[2]/select/option[2]")
	WebElement state;
		
	public WebElement setfirstName() {
		return firstname;
	}
	
	public WebElement setlastName() {
		return lastname;
	}
	
	public WebElement setemail() {
		return email;
	}
	
	public WebElement setphone() {
		return phone;
	}
	
	public WebElement setaddress1() {
		return add1;
	}
	
	public WebElement setaddress2() {
		return add2;
	}
	
	public WebElement setcity() {
		return city;
	}
	
	public WebElement setstate() {
		return state;
	}

	
}
