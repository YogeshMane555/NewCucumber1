package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Object_CheckOut;
import PageObject.Object_HomeScreenn;
import PageObject.Object_SwagLabsLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_SwagLabsLogin {
	
	WebDriver sp;
	Object_SwagLabsLogin osll;
	Object_HomeScreenn ohs;
	Object_CheckOut oco;
	

	
	@Given("User able to access swag labs")
	public void user_able_to_access_swag_labs() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\git\\NewCucumber1\\src\\test\\java\\Drivers\\chromedriver.exe");
		
		sp=new ChromeDriver();
		
		sp.manage().window().maximize();
		
		sp.manage().deleteAllCookies();
		
		sp.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		
		sp.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		
		sp.get("https://www.saucedemo.com/v1");

	}

	@When("User enter Valid Username and Password")
	public void user_enter_valid_username_and_password() {
		
		osll=new Object_SwagLabsLogin(sp);
		
		osll.enterUsername("standard_user");
		
		osll.enterPassword("secret_sauce");
		
	}

	@When("click on Login button")
	public void click_on_login_button() {
	   
		osll.clickLogin();
	}
	
	@Then("User is navigated to home screenn")
	public void user_is_navigated_to_home_screenn() {
	    	
		osll.validateLogin();
	}
	
	@When("User click on Add to Cart button for Fleece Jacket and Bolt T-shirt")
	public void user_click_on_add_to_cart_button_for_fleece_jacket_and_bolt_t_shirt() {
	    
		ohs=new Object_HomeScreenn(sp);
		
		ohs.clickBoltTshirt();
		
		ohs.clickFleeceJacket();
	}

	@When("Clicks on Add to Cart button at Header section")
	public void clicks_on_add_to_cart_button_at_header_section() {
		
		ohs.clickAddToCart();
	   
	}

	@Then("on Cart Screen Selected item is displayed")
	public void on_cart_screen_selected_item_is_displayed() {
		
		ohs.validateAddtoCart();
	    
	}


	@When("User clicks on remove button for fleece Jacket")
	public void user_clicks_on_remove_button_for_fleece_jacket() {
	    
		oco=new Object_CheckOut(sp);
		
		oco.clickRemoveFleece();
		
	}

	@When("clicks on Checkout button")
	public void clicks_on_checkout_button() {
		
	   oco.clickCheckOut();
	}

	@Then("User is navigated to Payment screen")
	public void user_is_navigated_to_payment_screen() {
	   
		oco.validateCheckout();
	}

	
}
