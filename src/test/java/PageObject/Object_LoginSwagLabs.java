package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_LoginSwagLabs {

	WebDriver sp;
	
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	WebElement txt_usrnm;
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	WebElement txt_pswd;
	
	@FindBy(xpath="//input[contains(@id,'login-button')]")
	WebElement btn_login;
	
	@FindBy(xpath="//div[contains(@class,'app_logo')]")
	WebElement logo;
	
	//Constructor
	public Object_LoginSwagLabs(WebDriver sp) {
		
		this.sp=sp;
		
		PageFactory.initElements(sp, this);
	}
	
	
	public void enterUsername(String usrnm)
	{
		txt_usrnm.sendKeys(usrnm);
	}
	
	public void enterPassword(String pswd)
	{
		txt_pswd.sendKeys(pswd);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
	
	public void validateLogin()
	{
		Boolean b=logo.isDisplayed();	
		
		System.out.println("Is Login Successfull ? :"+b);
	}
}
