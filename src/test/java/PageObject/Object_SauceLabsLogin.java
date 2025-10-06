package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_SauceLabsLogin {

	WebDriver km;
	
	//WebElements 
	@FindBy(id="user-name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login-button")
	WebElement btn_Login;
	
	@FindBy(xpath="//a[contains(@class,'shopping_cart_link')]")
	WebElement addToCart;
	
	@FindBy(xpath="//div[contains(@class,'error-message-container error')]")
	WebElement errorMsg;
	
	
	
	//constructor
	public Object_SauceLabsLogin(WebDriver km)
	{
		this.km=km;
		
		PageFactory.initElements(km,this);
	}
	
	
	
	
	//Methods
	public void enterUsername(String usrnm)
	{
		txt_username.clear();
		txt_username.sendKeys(usrnm);
	}
	
	public void enterPassword(String pwd)
	{
		txt_password.clear();
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_Login.click();
	}
	
	public boolean verifyAddToCart()
	{
		return addToCart.isDisplayed();
	}
	
	public String getErrorMessage()
	{
		return errorMsg.getText();
	}
}
