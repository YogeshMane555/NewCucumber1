package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Object_Login19_9;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepLogin19_9 {

	public WebDriver km;
	public Object_Login19_9 ol;
	
	@Given("User navigated to SauceDemo URL")
	public void user_navigated_to_sauce_demo_url() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\git\\NewCucumber1\\src\\test\\java\\Drivers\\chromedriver.exe");
		
		km=new ChromeDriver();
		
		km.manage().window().maximize();
		
		km.manage().deleteAllCookies();
		
		km.get("https://www.saucedemo.com/v1/");
	}

	@When("User Enter Valid Username")
	public void user_enter_valid_username() {
	    
		ol=new Object_Login19_9(km);
		
		ol.enterUsername("standard_user");
	}

	@When("Valid Password and Clicks on Login button")
	public void valid_password_and_clicks_on_login_button() {
	   
		ol.enterPassword("secret_sauce");
	}

	@Then("it redirected to Home Screen")
	public void it_redirected_to_home_screen() {
	   
		ol.clickLogin();
	}

	@Given("User Navigated to SauceDemoHome Screen")
	public void user_navigated_to_sauce_demo_home_screen() {
	    
	}

	@When("User click Add to cart for backpack")
	public void user_click_add_to_cart_for_backpack() {
	    
	}

	@When("Clicks on main AddTOCart Button")
	public void clicks_on_main_add_to_cart_button() {
	    
	}

	@Then("Selected Item is displayed")
	public void selected_item_is_displayed() {
	    
	}


	
}
