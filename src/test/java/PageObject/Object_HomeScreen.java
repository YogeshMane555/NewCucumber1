package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_HomeScreen {
	
	WebDriver sp;

	@FindBy(xpath="//a[contains(@id,'item_4_title_link')]/parent::div/following-sibling::div/button")
	WebElement btn_backpack_addtocart;
	
	@FindBy(xpath="//a[contains(@id,'item_0_title_link')]/parent::div/following-sibling::div/button")
	WebElement btn_bikeLigth;
	
	@FindBy(xpath="//a[contains(@class,'shopping_cart_link fa-layers fa-fw')]")
	WebElement btn_AddToCart;
	
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Backpack')]")
	WebElement lbl_BackPack;
	
	//Constructor
	public Object_HomeScreen(WebDriver sp) {
		
		this.sp=sp;
		
		PageFactory.initElements(sp, this);
	}
	
	public void clickBackPackAddtoCart() throws InterruptedException
	{
		btn_backpack_addtocart.click();
		Thread.sleep(3000);
	}
	
	public void clickBikeLight() throws InterruptedException
	{
		btn_bikeLigth.click();
		Thread.sleep(3000);
	}
	
	public void clickAddToCart()
	{
		btn_AddToCart.click();
	}
	
	public void valiateSelectedItem()
	{
		Boolean b=lbl_BackPack.isDisplayed();
		
		System.out.println("Is Selected Item Displayed in Add to Cart Page ??:"+b);
	}
	
}
