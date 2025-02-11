package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Object_AutomationPractice {

	WebDriver sp;
	
	@FindBy(xpath="//input[contains(@value,'radio3')]")
	WebElement Radio3;
	
	//Constructor
	public Object_AutomationPractice(WebDriver sp)
	{
		this.sp=sp;
		
		PageFactory.initElements(sp, this);
	}
	
	public void clickRadiobutton()
	{
		Radio3.click();
	}
	
	public void ValidateRadioButton()
	{
		Boolean b=Radio3.isSelected();
	
		System.out.println("Is Radio button 3 selected ?:"+b);
	
	}
	
	
}
