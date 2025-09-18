package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_HomeScreenn {

	WebDriver sp;
	
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Bolt T-Shirt')]/../../following-sibling::div/button")
	private WebElement btn_boltt_shirt;
	
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Fleece Jacket')]/../../following-sibling::div/button")
	private WebElement btn_fleece_jacket;
	
	@FindBy(xpath="//div[contains(@id,'shopping_cart_container')]")
	private WebElement btn_AddToCart;
	
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Fleece Jacket')]")
	private WebElement txt_fleeceJacket;

	//Constructor
	public Object_HomeScreenn(WebDriver sp) {
		
		this.sp=sp;
		
		PageFactory.initElements(sp, this);
	}
	
	public void clickBoltTshirt()
	{
		btn_boltt_shirt.click();
	}
	
	public void clickFleeceJacket()
	{
		btn_fleece_jacket.click();
	}
	
	public void clickAddToCart()
	{
		btn_AddToCart.click();
	}
	
	public void validateAddtoCart()
	{
		Boolean bb=txt_fleeceJacket.isDisplayed();
		
		System.out.println("Add to Cart Functionality Working ?:"+bb);
	}
}
