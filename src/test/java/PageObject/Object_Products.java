package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Products {

	WebDriver km;
	
	//WebElements 
	@FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")
	WebElement ATC_backPack;
	
	@FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-bike-light')]")
	WebElement ATC_bikeLight;

	@FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-bolt-t-shirt')]")
	WebElement ATC_tShirt;
	
	@FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-fleece-jacket')]")
	WebElement ATC_FleeceJacket;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	WebElement ATC_onsie;
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement ATC_redTshirt;
	
	@FindBy(xpath="//a[contains(@class,'shopping_cart_link')]")
	WebElement cart_button;
	
	@FindBy(xpath="//div[contains(@class,'cart_item_label')]")
	WebElement allItems;
	
	
	public Object_Products(WebDriver km)
	{
		this.km=km;

		PageFactory.initElements(km, this);
	}
	
	
	//Action Methods
	public void addAllProducts()
	{
		ATC_backPack.click();
		ATC_bikeLight.click();
		ATC_tShirt.click();
		ATC_FleeceJacket.click();
		ATC_onsie.click();
		ATC_redTshirt.click();
	}
	
	public void clickOnCart()
	{
		cart_button.click();
	}
	
	public boolean verifyItems()
	{
		boolean b=allItems.isDisplayed();
		return b;
	}
}
