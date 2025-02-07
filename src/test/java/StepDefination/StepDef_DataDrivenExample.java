//package StepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class StepDef_DataDrivenExample {
//
//	public WebDriver sp;
//	
//	@Given("User able to open Login Page")
//	public void user_able_to_open_login_page() {
//	    
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogemane\\eclipse-workspace\\NewCucumber\\src\\test\\java\\Drivers\\chromedriver.exe");
//		
//		sp=new ChromeDriver();
//		
//		sp.manage().window().maximize();
//		
//		sp.manage().deleteAllCookies();
//		
//		sp.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		sp.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		
//		sp.get("https://practicetestautomation.com/practice-test-login/");
//	}
//
//	@When("^User Enter (.*) and (.*)$")
//	public void user_enter_student_and_password123(String Username ,String Password) throws InterruptedException {
//	   
//		sp.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys(Username);
//		
//		Thread.sleep(2000);
//		
//		sp.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(Password);
//		
//	}
//
//	@When("Clicks on Login button")
//	public void clicks_on_login_button() {
//	    
//		sp.findElement(By.xpath("//button[contains(@id,'submit')]")).click();
//	}
// 
//	@Then("User is redirected to Home Screen")
//	public void user_is_redirected_to_home_screen() {
//	   
//		if(sp.getPageSource().contains("Congratulations")==true)
//	   {
//		  sp.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
//	   }
//		else
//		{
//			System.out.println("Login Failed !!!");
//		}
//		
//	}
//	
//}
