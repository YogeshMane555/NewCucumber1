package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Object_AutomationPractice;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_AutomationPractice {

	WebDriver sp;
	
	Object_AutomationPractice oap;
	
	@Given("User able to open Automation Practice Webpage")
	public void user_able_to_open_automation_practice_webpage() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\git\\NewCucumber1\\src\\test\\java\\Drivers\\chromedriver.exe");
		
		sp=new ChromeDriver();
		
		sp.manage().window().maximize();
		
		sp.manage().deleteAllCookies();
		
		sp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		sp.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		sp.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}

	@When("User clicks on Radio button value1")
	public void user_clicks_on_radio_button_value1() {
	   
		oap=new Object_AutomationPractice(sp);
		
		oap.clickRadiobutton();
		
	}

	@When("wait for {int} Second")
	public void wait_for_second(Integer int1) throws InterruptedException {
	    
		Thread.sleep(3000);
	}

	@Then("Validate whether User Selected Radio button is Selected or not")
	public void validate_whether_user_selected_radio_button_is_selected_or_not() {
	   
		oap.ValidateRadioButton();
	}
	
}
