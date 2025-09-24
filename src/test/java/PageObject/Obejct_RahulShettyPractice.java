package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Obejct_RahulShettyPractice {

	WebDriver km;
	
	@FindBy(id="dropdown-class-example")
	WebElement DropDown;

	public Obejct_RahulShettyPractice(WebDriver km) {
		
		this.km=km;
		
		PageFactory.initElements(km, this);
	}

	public void clickDropDown()
	{
		Select s=new Select(DropDown);
		
		s.selectByVisibleText("Option2");
	}
}
