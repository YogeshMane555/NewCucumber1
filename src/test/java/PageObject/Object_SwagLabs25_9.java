package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_SwagLabs25_9 {

	WebDriver km;
	
	public Object_SwagLabs25_9(WebDriver km) {
		
		this.km=km;
		
		PageFactory.initElements(km, this);
	}

	@FindBy(xpath="//input[contains(@name,'user-name')]")
	WebElement username;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@name,'login-button')]")
	WebElement login;
	
	@FindBy(xpath="//a[contains(@data-test,'shopping-cart-link')]")
	WebElement addtoCart;
	
	public void eterUsername(String usnm)
	{
		username.sendKeys(usnm);
	}
	
	public void enterPassword(String pswd)
	{
		password.sendKeys(pswd);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public boolean validateAddtoCart()
	{
		boolean b=addtoCart.isDisplayed();
		
		return b;
	}
}
