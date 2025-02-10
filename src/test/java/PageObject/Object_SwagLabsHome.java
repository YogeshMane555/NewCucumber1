package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_SwagLabsHome {

	WebDriver sp;
	
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Backpack')]/ancestor::div[1]/following-sibling::div/button")
	WebElement btn_backpackAddtoCart;
	
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Bike Light')]/ancestor::div[1]/following-sibling::div/button")
	WebElement btn_bikeLightAddtoCart;
	
	@FindBy(className="svg-inline--fa fa-shopping-cart fa-w-18 fa-3x")
	WebElement btn_AddToCart;
	
	
	public Object_SwagLabsHome(WebDriver sp) {
		
		this.sp=sp;
		
		PageFactory.initElements(sp, this);
	}

	public void clickBackPack()
	{
		btn_backpackAddtoCart.click();
	}
	
	public void clickBikeLight()
	{
		btn_bikeLightAddtoCart.click();
	}
	
	public void clickonAddtoCart()
	{
		btn_AddToCart.click();
	}
	
	
}
