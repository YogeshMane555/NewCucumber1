package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Object_APDropDown {

	WebDriver sp;
	
	@FindBy(xpath="//select[contains(@id,'dropdown-class-example')]")
	WebElement drpdwn;
	
	public void selectDropdownValue()
	{
		Select s=new Select(drpdwn);
		
		s.deselectByVisibleText("Option3");
	}
	
	
	
}
