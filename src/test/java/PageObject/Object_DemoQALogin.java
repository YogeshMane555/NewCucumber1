package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_DemoQALogin {

	WebDriver sp;
	
	@FindBy(xpath="//input[contains(@id,'userName')]")
	private WebElement txt_usrnm;
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	private WebElement txt_pwd;
	
	@FindBy(xpath="//button[contains(@id,'login')]")
	private WebElement btn_login;
	
	@FindBy(xpath="//button[contains(text(),'Log out')]")
	private WebElement btn_logout;
	
	
	//Constructor
	public Object_DemoQALogin(WebDriver sp) {
		
		this.sp=sp;
		
		PageFactory.initElements(sp, this);
	}
	
	
	public void enterUsername(String usrnm)
	{
		txt_usrnm.sendKeys(usrnm);
	}
	
	public void enterPassword(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
	
	public void clickLogOut()
	{
		btn_logout.click();
	}
	
	public Boolean ValidateLogout()
	{
		return btn_logout.isDisplayed();
	}

}
