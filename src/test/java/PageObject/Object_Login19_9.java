package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Login19_9 {

	public WebDriver km;
	
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	WebElement txt_usrnm;
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	WebElement txt_pswd;
	
	@FindBy(xpath="//input[contains(@id,'login-button')]")
	WebElement btn_login;
	
	
	public Object_Login19_9(WebDriver km)
	{
		this.km=km;
		
		PageFactory.initElements(km, this);
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
}
