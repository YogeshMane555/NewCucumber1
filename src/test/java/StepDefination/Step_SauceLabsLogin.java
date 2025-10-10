package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.Object_SauceLabsLogin;
import Utility.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_SauceLabsLogin {


	Object_SauceLabsLogin osll;
	
	
	@Given("User able to access Login URL")
	public void user_able_to_access_login_url() {
		
		BaseClass.km.get("https://www.saucedemo.com/");
		
	}

	@When("User enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	    
		osll=new Object_SauceLabsLogin(BaseClass.km);
		
		osll.enterUsername("standard_user");
		
		osll.enterPassword("secret_sauce");
	}

	@When("click on Login button")
	public void click_on_login_button() {
	    
		osll.clickLogin();
	}

	@Then("it should redirected to Inventory Screen")
	public void it_should_redirected_to_inventory_screen() {
	    
		osll.verifyAddToCart();
	}

	@When("User enter Invalid username and password")
	public void user_enter_invalid_username_and_password() {
	 
		osll=new Object_SauceLabsLogin(BaseClass.km);
		
		osll.enterUsername("locked_out_user");
		
		osll.enterPassword("secret_sauce");
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
	   
		osll.clickLogin();
	}

	@Then("It should show Error Message")
	public void it_should_show_error_message() {
	   
		osll.getErrorMessage();
		
	}


}
