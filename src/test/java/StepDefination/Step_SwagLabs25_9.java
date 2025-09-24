package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.Object_SwagLabs25_9;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_SwagLabs25_9 {

	WebDriver km;
	
	Object_SwagLabs25_9 os;
	
	@Before
	public void setUp()
	{
        System.setProperty("webdriver.chrome.driver", "C://Users//Yogesh//git//NewCucumber1//src//test//java//Drivers//chromedriver.exe");
		
		km=new ChromeDriver();
		
		km.manage().window().maximize();
		
		km.manage().deleteAllCookies();
	}
	
	
	@Given("I am able to able Swag Labs Login Page")
	public void i_am_able_to_able_swag_labs_login_page() {

		km.get("https://www.saucedemo.com/");

	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {

		os=new Object_SwagLabs25_9(km);

		os.eterUsername("standard_user");
		
		os.enterPassword("secret_sauce");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    
		os.clickLogin();
	}

	@Then("It should redirect to Invetory Page")
	public void it_should_redirect_to_invetory_page() {
	   
		Assert.assertEquals(os.validateAddtoCart(), true);
	}
	
	@After
	public void tearDown()
	{
		km.quit();
	}
	
}
