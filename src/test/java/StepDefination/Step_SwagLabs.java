package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Object_SwagLabs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_SwagLabs {

	WebDriver sp;

	Object_SwagLabs osl;

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogemane\\eclipse-workspace\\NewCucumber\\src\\test\\java\\Drivers\\chromedriver.exe");

		sp = new ChromeDriver();

		sp.manage().window().maximize();

		sp.manage().deleteAllCookies();

		sp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		sp.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);

	}

	@Given("User able to access Swag Labs Web page")
	public void user_able_to_access_swag_labs_web_page() {

		sp.get("https://www.saucedemo.com/v1/");
	}

	@When("User enter valid Username and Password")
	public void user_enter_valid_username_and_password() {

		osl = new Object_SwagLabs(sp);

		osl.enterUsername("standard_user");

		osl.enterPassword("secret_sauce");

	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {

		osl.clickLogin();
	}

	@Then("User navigated to Home screen")
	public void user_navigated_to_home_screen() {

		Boolean b = osl.validateLogin();
		
		System.out.println("Is it Navigated to Home Screen ?:"+b);
	}
	
	@After
	public void tearDown()
	{
		sp.quit();
	}

}
