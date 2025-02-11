package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_APDropDown {

	@Given("User able to open Automation Practice Page")
	public void user_able_to_open_automation_practice_page() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\git\\NewCucumber1\\src\\test\\java\\Drivers\\chromedriver.exe");
		
		WebDriver sp=new ChromeDriver();
		
		sp.manage().window();
		
		sp.manage().deleteAllCookies();
		
		sp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		sp.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		sp.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@When("User select Dropdown value3")
	public void user_select_dropdown_value3() {
	   
	}

	@When("wait for {int} second")
	public void wait_for_second(Integer int1) {
	    
	}

	@Then("Validate whther User selected Dropdown value {int}")
	public void validate_whther_user_selected_dropdown_value(Integer int1) {
	    
	}
	
}
