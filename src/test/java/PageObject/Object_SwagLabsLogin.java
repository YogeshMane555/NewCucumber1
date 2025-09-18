package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_SwagLabsLogin {

	WebDriver sp;
	
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	private WebElement txt_username;
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	private WebElement txt_password;
	
	@FindBy(xpath="//input[contains(@id,'login-button')]")
	private WebElement btn_login;
	
	@FindBy(xpath="//div[contains(@class,'app_logo')]")
	WebElement logoImg;
	
	//Constructor
	public Object_SwagLabsLogin(WebDriver sp) {
		
		this.sp=sp;
		
		PageFactory.initElements(sp, this);
	}
	
	public void enterUsername(String usnm)
	{
		txt_username.sendKeys(usnm);
	}
	
	public void enterPassword(String psw)
	{
		txt_password.sendKeys(psw);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
	
	public void validateLogin()
	{
		boolean b=logoImg.isDisplayed();
		
		System.out.println("Login Successfull ?:"+b);
	}
}
