package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capgemini.pagepom.Contact;
import com.capgemini.pagepom.Home;
import com.capgemini.pagepom.Register;
import com.capgemini.pagepom.Success;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;
	Contact contact;
	Home home;
	Register register;
	Success success;
	Alert alert;
	@Before
	public void prerequisities() {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPOBBATH\\Documents\\chromedriver.exe");
		   driver=new ChromeDriver();
		   contact=new Contact(driver);
		   home=new Home(driver);
		   register= new Register(driver);
		   success= new Success(driver);
	}
	
	@Given("^Opening the home page$")
	public void opening_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("C:\\Users\\KPOBBATH\\Desktop\\SET A\\Home.html");
	}

	@Then("^Header content should be verified$")
	public void header_content_should_be_verified() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Contact Us link is clicked$")
	public void contact_Us_link_is_clicked() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    home.getContact().click();
	}

	@Then("^Contact Us page should be opened and title should be 'Contact Us'$")
	public void contact_Us_page_should_be_opened_and_title_should_be_Contact_Us() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = contact.title();
		assertEquals("Contact Us", title);
		driver.get("C:\\Users\\KPOBBATH\\Desktop\\SET A\\Home.html");
	}

	@When("^Register link is clicked$")
	public void register_link_is_clicked() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		home.getRegister().click();
	}

	@Then("^Register page is opened and title should be 'Employee Registration Page'$")
	public void register_page_is_opened_and_title_should_be_Employee_Registration_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		assertEquals("Employee Registration Page", title);
	}

	@When("^Submit button is clicked without entering any values in the fields$")
	public void submit_button_is_clicked_without_entering_any_values_in_the_fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    register.getSubmit().click();
	}

	@Then("^alert message should be displayed as 'Please fill in the Your Employee Name box'$")
public void alert_message_should_be_displayed_as_Please_fill_in_the_Your_Employee_Name_box()  throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		Alert alert=driver.switchTo().alert();
		assertEquals("Please fill in the 'Your Employee Name' box.", alert.getText());
	    alert.accept();
}
	@When("^Submit button is clicked without entering Employee Number field$")
	public void submit_button_is_clicked_without_entering_Employee_Number_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    register.getName().sendKeys("karthik");
	    register.getSubmit().click();
	}

	@Then("^alert message should be displayed as 'Enter Employee Number'\\.$")
	public void alert_message_should_be_displayed_as_Enter_Employee_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Alert alert=driver.switchTo().alert();
		assertEquals("Enter Employee Number", alert.getText());
	   alert.accept();
	}

	@When("^any character is entered in the contact Number field without entering Employee name field$")
	public void any_character_is_entered_in_the_contact_Number_field_without_entering_Employee_name_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 register.getName().sendKeys("");
		 register.getEmployeeNumber().sendKeys("9999999999");
		 register .getSubmit().click();
	}

	@When("^any character is entered in the contact number field$")
	public void any_character_is_entered_in_the_contact_number_field() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		register.getContactNumber().sendKeys("45454d");
		register.getSubmit().click();
	}

	

	@Then("^alert message should  display as 'Enter Number'$")
	public void alert_message_should_display_as_Enter_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Alert alert=driver.switchTo().alert();
		assertEquals("Enter Number", alert.getText());
	   alert.accept();
	}

	@When("^submit button is clicked without selecting the Job Location option$")
	public void submit_button_is_clicked_without_selecting_the_Job_Location_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // register.getLocation().click();
		register.getContactNumber().sendKeys("9999999999");
		register .getSubmit().click();
	    
	}

	@Then("^alert message should be displayed as 'Select your Job Location'$")
	public void alert_message_should_be_displayed_as_Select_your_Job_Location() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Alert alert=driver.switchTo().alert();
		assertEquals("Select your Job Location", alert.getText());
	   alert.accept();
	}

	@When("^Submit button is clicked without giving the valid email id$")
	public void submit_button_is_clicked_without_giving_the_valid_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		register.getLocation().click();
		register.getEmail().sendKeys("karthik");
		register .getSubmit().click();
	}

	@Then("^error message should be displayed as 'You have entered an invalid email address!'$")
	public void error_message_should_be_displayed_as_You_have_entered_an_invalid_email_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Alert alert=driver.switchTo().alert();
		assertEquals("You have entered an invalid email address!", alert.getText());
	   alert.accept();
	}

	@When("^Submit button is clicked it navigate to next page$")
	public void submit_button_is_clicked_it_navigate_to_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		register.getEmail().sendKeys("karthik@gmail.com");
		register.getSubmit().click();
	}

	@Then("^message should be displayed as 'Registered Successfully!'$")
	public void message_should_be_displayed_as_Registered_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    success.getMessage().getText();
	}

	@Then("^Title should be Confirmation Page$")
	public void title_should_be_Confirmation_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("You have entered an invalid email address!", success.getMessage().getText());
	}
	
}
