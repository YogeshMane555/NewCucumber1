package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Object_DemoQALogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_DemoQALogin {

	WebDriver sp;
	
	Object_DemoQALogin odlogin;

	@Given("User able to open DemoQA Page")
	public void user_able_to_open_demo_qa_page() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yogemane\\eclipse-workspace\\NewCucumber\\src\\test\\java\\Drivers\\chromedriver.exe");

		sp = new ChromeDriver();

		sp.manage().window().maximize();

		sp.manage().deleteAllCookies();

		sp.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		sp.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		
		sp.get("https://demoqa.com/login");
	}

	@When("User enter valid username and valid Password")
	public void user_enter_valid_username_and_valid_password() throws InterruptedException {

		odlogin=new Object_DemoQALogin(sp);
		
		odlogin.enterUsername("YogeshM");
		
		odlogin.enterPassword("Friday@2511");
		
		Thread.sleep(3000);
		
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		
		odlogin.clickLogin();
		
	}

	@Then("User is navigated to Home screen")
	public void user_is_navigated_to_home_screen() {
		
		Boolean b=odlogin.ValidateLogout();
		
		System.out.println("Is Logout button Visible ?:"+b);

	}

}
