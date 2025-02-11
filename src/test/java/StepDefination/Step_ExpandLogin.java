package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Object_ExpandLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_ExpandLogin {

	WebDriver sp;
	
	Object_ExpandLogin oel;
	
	@Given("User able to open expand login page")
	public void user_able_to_open_expand_login_page() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\git\\NewCucumber1\\src\\test\\java\\Drivers\\chromedriver.exe");
		
		sp=new ChromeDriver();
		
		sp.manage().window().maximize();
		
		sp.manage().deleteAllCookies();
		
		sp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		sp.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		sp.get("https://practice.expandtesting.com/login");
	}

	@When("User enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)sp;
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		oel=new Object_ExpandLogin(sp);
		
		oel.enterUserName();
		
		oel.enterPassword();
		
		Thread.sleep(2000);
	 
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		
	   oel.clickLogin();
	}

	@Then("User is navigated to home screen")
	public void user_is_navigated_to_home_screen() {
		
		Boolean b= sp.getPageSource().contains("You logged");
		
		System.out.println("Is it logged in??? :"+b);
		
		sp.quit();
	   
	}
	
}
