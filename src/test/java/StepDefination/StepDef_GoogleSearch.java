package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_GoogleSearch {

	public WebDriver sp;
	
	@Given("User Able to Open Google Search Page")
	public void user_able_to_open_google_search_page() {
	   
		System.setProperty("webdriver.chrome.driver", "C://Users//yogemane//eclipse-workspace//NewCucumber//src//test//java//Drivers//chromedriver.exe");
		
		sp=new ChromeDriver();
		
		sp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		sp.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		sp.manage().window().maximize();
		
		sp.manage().deleteAllCookies();
		
		sp.get("https://www.google.com/");
		
	}

	@When("User Enters Text in Seach box")
	public void user_enters_text_in_seach_box() throws InterruptedException {
	    
		sp.findElement(By.xpath("//textarea[contains(@class,'gLFyf')]")).sendKeys("Automation Testing");
		
	}

	@When("Clicks on Seach button")
	public void clicks_on_seach_button() {
	    
		sp.findElement(By.xpath("//div[contains(@class,'FPdoLc lJ9FBc')]/child::center/input[1]")).click();
	}

	@Then("User should navigated to searched page")
	public void User_should_navigated_to_searched_page() throws InterruptedException {
	    
		System.out.println("Currently I am in Searched Page");
		
		Thread.sleep(3000);
		
		sp.quit();
	}

	
}
