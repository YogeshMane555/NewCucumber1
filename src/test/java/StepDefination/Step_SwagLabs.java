package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Object_HomeScreen;
import PageObject.Object_LoginSwagLabs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_SwagLabs {

	WebDriver sp;
	
	Object_LoginSwagLabs olsb;
	
	Object_HomeScreen ohs;
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\git\\NewCucumber1\\src\\test\\java\\Drivers\\chromedriver.exe");
		
		sp=new ChromeDriver();
		
		sp.manage().window().maximize();
		
		sp.manage().deleteAllCookies();
		
		sp.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		
		sp.manage().timeouts().pageLoadTimeout(3,TimeUnit.MINUTES);
	}
	
	@Given("User able to access Swag Labs Login page")
	public void user_able_to_access_swag_labs_login_page() {
	    
		sp.get("https://www.saucedemo.com/v1/");	
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		
		olsb=new Object_LoginSwagLabs(sp);
		
		olsb.enterUsername("standard_user");
		
		olsb.enterPassword("secret_sauce");
		
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
	   
		olsb.clickLogin();
	}

	@Then("User is navigated to Home Screen")
	public void user_is_navigated_to_home_screen() 
	{
		olsb.validateLogin();		
	}

	@When("User select Add to Cart button on Backpack and Bike Light Add to cart button")
	public void user_select_add_to_cart_button_on_backpack_and_bike_light_add_to_cart_button() throws InterruptedException {
	
		ohs=new Object_HomeScreen(sp);
		
		ohs.clickBackPackAddtoCart();
		
		ohs.clickBikeLight();
		
	}

	@And("After clicking on Add to cart main button")
	public void after_clicking_on_add_to_cart_main_button() {
	   
		ohs.clickAddToCart();
	}

	@Then("Selected Item is able to see")
	public void selected_item_is_able_to_see() {
		
		ohs.valiateSelectedItem();
	   
	}
	
	@After
	public void tearDown()
	{
		sp.quit();
	}
}
