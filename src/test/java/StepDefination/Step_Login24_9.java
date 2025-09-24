package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageObject.Object_Login24_9;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Login24_9 {

	public WebDriver km;

	public Object_Login24_9 ol;

	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Yogesh//git//NewCucumber1//src//test//java//Drivers//chromedriver.exe");

		km = new ChromeDriver();

		km.manage().window().maximize();

		km.manage().deleteAllCookies();

	}
	
	
	@Given("I am able to open Naveen Automation Practice Page")
	public void i_am_able_to_open_naveen_automation_practice_page() {

		km.get("https://naveenautomationlabs.com/opencart/index.php?route=account/account");

	}

	@Given("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {

		ol = new Object_Login24_9(km);

		ol.enterUsername("yogeshmane008@gmail.com");

		ol.enterPassword("Friday@2511");
	}

	@When("I click on Login Button")
	public void i_click_on_login_button() {

		ol.clickLogin();
	}

	@Then("it should redirect to Home Screen")
	public void it_should_redirect_to_home_screen() {

		ol.validateLogin();
	
	}
	
	@AfterClass
	public void tearDown()
	{
		km.quit();
	}

}
