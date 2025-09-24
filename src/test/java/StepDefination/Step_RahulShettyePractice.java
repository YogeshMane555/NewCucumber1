package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Obejct_RahulShettyPractice;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_RahulShettyePractice {

	public WebDriver km;
	
	Obejct_RahulShettyPractice orsp;
	
	@Given("User Navigated to RahulShetty Practice URL")
	public void user_navigated_to_rahul_shetty_practice_url() {

		System.setProperty("webdriver.chrome.driver", "C://Users//Yogesh//git//NewCucumber1//src//test//java//Drivers//chromedriver.exe");
		
		km=new ChromeDriver();
		
		km.manage().window().maximize();
		
		km.manage().deleteAllCookies();
		
		km.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

	@When("User Clicks on DropDown")
	public void user_clicks_on_drop_down() {
		
		orsp=new Obejct_RahulShettyPractice(km);
	
	}

	@When("select Option2")
	public void select_option2() {
	    
	orsp.clickDropDown();
		
	}

	@Then("Selected Option is displayed")
	public void selected_option_is_displayed() throws InterruptedException {
	   
		Thread.sleep(2000);
		
		TakesScreenshot tk1=(TakesScreenshot)km;
		
		File src1=tk1.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src1, new File("C://Users//Yogesh//git//NewCucumber1//Screenshot//DropDown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
