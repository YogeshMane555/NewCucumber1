package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_GoogleAutosuggestion {

	public WebDriver sp;

	@Given("User able to open Google Search Engine")
	public void user_able_to_open_google_search_engine() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yogemane\\eclipse-workspace\\NewCucumber\\src\\test\\java\\Drivers\\chromedriver.exe");

		sp = new ChromeDriver();

		sp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		sp.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		sp.manage().window().maximize();

		sp.manage().deleteAllCookies();
		
		sp.get("https://www.google.com/");

	}

	@When("User enter some text")
	public void user_enter_some_text() {
		
		sp.findElement(By.xpath("//textarea[contains(@id,'APjFqb')]")).sendKeys("YO");

	}

	@When("wait for suggestion list")
	public void wait_for_suggestion_list() throws InterruptedException {
	
		Thread.sleep(3000);
	}

	@Then("User is able to select one autosuggestion")
	public void user_is_able_to_select_one_autosuggestion() throws InterruptedException {

		List<WebElement>ss=sp.findElements(By.xpath("//ul[contains(@class,'G43f7e')]"));
		
		int TotalNumberofAutosuggestion=ss.size();
		
		System.out.println("Autosuggesiton count is :"+TotalNumberofAutosuggestion);
		
		for(WebElement autoss:ss)
		{
			String txt=autoss.getText();
			
			if(txt.contains("youtube studio"))
			{
				autoss.click();
			    
				Thread.sleep(3000);
				
			}
			
			sp.findElement(By.xpath("//div[contains(@class,'FPdoLc lJ9FBc')]/child::center/input[1]")).click();
			
			Thread.sleep(2000);
			
			System.out.println("Autosuggestion are :"+txt);
		}
	}

}
