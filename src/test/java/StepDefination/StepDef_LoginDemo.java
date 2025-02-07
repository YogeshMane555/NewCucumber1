package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Object_Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_LoginDemo {

	WebDriver sp=null;
	
	Object_Login ol;
	
	@Given("User able to open DemoLogin Page")
	public void user_able_to_open_demo_login_page() {
	   
		System.setProperty("webdriver.chrome.driver", "C://Users//yogemane//eclipse-workspace//NewCucumber//src//test//java//Drivers//chromedriver.exe");
		
		sp=new ChromeDriver();
		
		sp.manage().window().maximize();
		
		sp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		sp.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		sp.manage().deleteAllCookies();
		
		sp.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("User enter Valid Username and Valid Password")
	public void user_enter_valid_username_and_valid_password() throws InterruptedException {
		
		ol=new Object_Login(sp);
		
		ol.enterUsrm("student");
		
		ol.enterPswd("Password123");
		
		Thread.sleep(3000);
	}

	@When("clicks on Submit button")
	public void clicks_on_submit_button() {
		
		ol.clickSubmit();
	 
	}

	@Then("User is redirected to HomeScreen Page")
	public void user_is_redirected_to_home_screen_page() {
	    
		Boolean b=ol.validateLogOutDisplayed();
		
		System.out.println("Is Logout Button Displayed ?:"+b);
	}
	
}
