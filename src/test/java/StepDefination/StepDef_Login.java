package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Login {

	public WebDriver sp;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    
		System.setProperty("webdriver.chrome.driver", "C://Users//chromedriver//chromedriver.exe");
		
		sp=new ChromeDriver();
		
		sp.manage().window().maximize();
		
		sp.manage().deleteAllCookies();
		
		sp.get("https://www.saucedemo.com/v1");
	}

	@When("User Enter Valid Username and Password")
	public void user_enter_valid_username_and_password() throws InterruptedException {
	   
		sp.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		sp.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {
	 
		sp.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
	}

	@Then("User should be Navigated to Home Screen")
	public void user_should_be_navigated_to_home_screen() {
	   
		System.out.println("Current I have Navigated to Home Screen");
	}
	
}
