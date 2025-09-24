package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Login23_9 {

	public WebDriver km;
	
	@FindBy(xpath="//input[contains(@name,'email')]")
	WebElement emailId;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@value,'Login')]")
	WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Forgotten Password')]")
	WebElement forgotPassword;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logOut;
	
	public Object_Login23_9(WebDriver km)
	{
		this.km=km;
		
		PageFactory.initElements(km, this);
		
	}
	
	
	public void enterUserName(String usrnm)
	{
		emailId.sendKeys(usrnm);
	}
	
	public void enterPassword(String pswd)
	{
		password.sendKeys(pswd);
	}
	
	public void clickLoginPage()
	{
		loginButton.click();
	}
	
	public boolean validateforgotPassword()
	{
		boolean b=forgotPassword.isDisplayed();
		
		return b;
	}
	
	public boolean validateLogout()
	{
		boolean logout=logOut.isDisplayed();
		
		return logout;
	}
}
