package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.Object_Login23_9;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Login23_9 {

	public WebDriver km;
	public Object_Login23_9 ol;

	@Before
	public void setUp() {
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogesh\\git\\NewCucumber1\\src\\test\\java\\Drivers\\chromedriver.exe");

		km = new ChromeDriver();

		km.manage().window().maximize();

		km.manage().deleteAllCookies();
	}

	
	
	@Given("I am on OpenCart Login Page")
	public void i_am_on_open_cart_login_page() {

		km.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@Given("I enter valid Username and Valid Password")
	public void i_enter_valid_username_and_valid_password() {

		Object_Login23_9 ol = new Object_Login23_9(km);

		ol.enterUserName("yogeshmane008@gmail.com");

		ol.enterPassword("Friday@2511");

	}

	@When("I click on Login button")
	public void i_click_on_login_button() {

		ol.clickLoginPage();
	}

	@Then("It should be Logged in Successfully")
	public void it_should_be_logged_in_successfully() {
		
		Assert.assertEquals(ol.validateLogout(), true);

	}
		
	

	@After
	public void tearDown()
	{
		km.quit();
	}
}
