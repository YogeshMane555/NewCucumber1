package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_ExpandLogin {

	WebDriver sp;
	
	@FindBy(xpath="//input[contains(@id,'username')]")
	WebElement txt_usrnm;
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	WebElement txt_pswd;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement btn_login;
	
	//Constructor
	public Object_ExpandLogin(WebDriver sp) {
		
		this.sp=sp;
		
		PageFactory.initElements(sp,this);
	}
	
	public void enterUserName()
	{
		txt_usrnm.sendKeys("practice");
	}
	
	public void enterPassword()
	{
		txt_pswd.sendKeys("SuperSecretPassword!");
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
	
}
