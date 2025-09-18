package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_CheckOut {

	WebDriver sp;
	
	@FindBy(xpath="//div[contains(text(),'49.99')]/following-sibling::button")
	private WebElement btn_fleece;
	
	@FindBy(xpath="//a[contains(text(),'CHECKOUT')]")
	private WebElement btn_checkOut;
	
	@FindBy(xpath="//div[contains(text(),'Checkout: Your Information')]")
	WebElement txt_info;
	
	public Object_CheckOut(WebDriver sp) {
		
		this.sp=sp;
		
		PageFactory.initElements(sp,this);
	}
	
	public void clickRemoveFleece()
	{
		btn_fleece.click();
	}
	
	public void clickCheckOut()
	{
		btn_checkOut.click();
	}
	
	public void validateCheckout()
	{
		Boolean bbb=txt_info.isDisplayed();
		
		System.out.println("Are we redirected to checkoutPage ?:"+bbb);
	}
	
}
