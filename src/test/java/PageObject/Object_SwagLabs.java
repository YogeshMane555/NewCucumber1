package PageObject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Object_SwagLabs {

	WebDriver sp;
	
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	WebElement txt_usrnm;
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	WebElement txt_pswd;
	
	@FindBy(xpath="//input[contains(@id,'login-button')]")
	WebElement btn_login;
	
	@FindBy(xpath="//a[contains(@class,'shopping_cart_link fa-layers fa-fw')]")
	WebElement homeScreenValidate;
	
	@FindBy(tagName ="img")
	List<WebElement> img;
	
	
	
	//Constructor
	public Object_SwagLabs(WebDriver sp) {
		
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
	
	public Boolean validateLogin()
	{
		
		Boolean b=homeScreenValidate.isDisplayed();
		
		return b;
		
	}
}
