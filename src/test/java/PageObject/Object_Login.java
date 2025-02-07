package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Object_Login {
	
	WebDriver sp;
	
	//Constructor
	public Object_Login(WebDriver sp) {
		
		this.sp=sp;
		
	}


	private By txt_usrnm=By.xpath("//input[contains(@id,'username')]");
	
	private By txt_pswd=By.xpath("//input[contains(@id,'password')]");
	
	private By btn_submt=By.xpath("//button[contains(@id,'submit')]");
	
	private By btn_logout=By.xpath("//a[contains(text(),'Log out')]");
	
	
	public void enterUsrm(String usn)
	{
		sp.findElement(txt_usrnm).sendKeys(usn);
	}
	
	public void enterPswd(String psw)
	{
		sp.findElement(txt_pswd).sendKeys(psw);
	}
	
	public void clickSubmit()
	{
		sp.findElement(btn_submt).click();
	}
	
	public Boolean validateLogOutDisplayed()
	{
		return sp.findElement(btn_logout).isDisplayed();
	}
			
}
