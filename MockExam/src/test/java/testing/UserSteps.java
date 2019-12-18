package testing;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.PersonalDetailsPage;

public class UserSteps {
		
	WebDriver driver;
	PersonalDetailsPage personaldetails;
	Alert al;
	@Before
	public void bokka() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPOBBATH\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("C:\\Users\\KPOBBATH\\Desktop\\Karthik\\jpafiles\\resume\\src\\webpages\\PersonalDetails.html");
		personaldetails=new PersonalDetailsPage(driver);
	}
	
	/*@Given("^Personal details page$")
	public void personal_details_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("C:\\Users\\KPOBBATH\\Downloads\\SET03\\WebPages\\PersonalDetails.html");
	   
	}

	@When("^I click on next without entering data in firstname page$")
	public void i_click_on_next_without_entering_data_in_firstname_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Next")).click();
		al = driver.switchTo().alert();
//		al = driver.switchTo().alert();
//	    al.accept();
		personaldetails.setfirstName().sendKeys("dfgh");
		driver.findElement(By.linkText("Next")).click();
	    al = driver.switchTo().alert();
	    al.accept();
	   
	}

	@When("^Or any other fields in the form$")
	public void or_any_other_fields_in_the_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		personaldetails.setfirstName().sendKeys("dfgh");
		
		driver.findElement(By.linkText("Next")).click();
		al = driver.switchTo().alert();
	}

	@Then("^In alert box it have to show \"([^\"]*)\"$")
	public void in_alert_box_it_have_to_show(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(arg1, al.getText());
		
	    al.accept();
	    throw new PendingException();
	}*/
	
	
	
	
	
	@Given("^Personal details page$")
	public void personal_details_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("C:\\Users\\KPOBBATH\\Downloads\\SET03\\WebPages\\PersonalDetails.html");
	    //throw new PendingException();
	}

	@When("^I click on next without entering data in firstname page$")
	public void i_click_on_next_without_entering_data_in_firstname_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[11]/td/a")).click();
		
	    //throw new PendingException();
	}

	@Then("^In alert box it have to show \"([^\"]*)\"$")
	public void in_alert_box_it_have_to_show(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		
		al = driver.switchTo().alert();
		assertEquals("Please fill the First Name", al.getText());
		
	    al.accept();
	    driver.close();
	    //throw new PendingException();
	}

	@When("^I click on next without entering data in lastname page$")
	public void i_click_on_next_without_entering_data_in_lastname_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
personaldetails.setfirstName().sendKeys("dfgh");
		driver.findElement(By.linkText("Next")).click();
	    //throw new PendingException();
	}


}
