package StepDefination;

import org.openqa.selenium.WebDriver;

import PageObject.Object_SwagLabsHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_SwagLabsHome {

	WebDriver sp;
	
	Object_SwagLabsHome oslh;
	
	@Given("User able to access Home screen after Login")
	public void user_able_to_access_home_screen_after_login() {
	    
	}
	
	@When("User clicks on Sauce Labs backpack Add to cart")
	public void user_clicks_on_sauce_labs_backpack_add_to_cart() {
	    
		oslh=new Object_SwagLabsHome(sp);
		
		oslh.clickBackPack();
				
	}

	@When("clicks on Sauce Labs Bike Light Add to cart button")
	public void clicks_on_sauce_labs_bike_light_add_to_cart_button() {
	    
		oslh.clickBackPack();
	}

	@When("Clicks on Add to cart button")
	public void clicks_on_add_to_cart_button() {
	    
		oslh.clickonAddtoCart();
	}

	@Then("Items which are selected that is visible on Add to cart page")
	public void items_which_are_selected_that_is_visible_on_add_to_cart_page() {
	    
		
	}
	
}
