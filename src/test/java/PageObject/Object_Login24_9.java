package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Login24_9 {

	public WebDriver km;
	
	@FindBy(xpath="//input[contains(@name,'email')]")
	WebElement email;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@value,'Login')]")
	WebElement login;
	
	@FindBy(xpath="//h2[contains(text(),'My Orders')]")
	WebElement myOrder;
	
	public Object_Login24_9(WebDriver km)
	{
		this.km=km;
		
		PageFactory.initElements(km, this);
	}
	
	public void enterUsername(String eml)
	{
		email.sendKeys(eml);
	}
	
	public void enterPassword(String pswd)
	{
		password.sendKeys(pswd);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public boolean validateLogin()
	{
		boolean b=myOrder.isDisplayed();
		
		return b;
	}
}
