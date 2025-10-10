package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObject.Object_Products;
import Utility.BaseClass;



public class Step_Products {
   
	Object_Products op;

    @Given("User able to open Product Page")
    public void user_able_to_open_product_page() {
    	
    	BaseClass.km.get("https://www.saucedemo.com/inventory.html");
    }

    @When("user select all product")
    public void user_select_all_product() {
        
    	op=new Object_Products(BaseClass.km);
    	
    	op.addAllProducts();
    }

    @When("click on AddToCart button")
    public void click_on_add_to_cart_button() {
    	
    	op.clickOnCart();
        
    }

    @Then("All selected product should be displayed in Cart")
    public void all_selected_product_should_be_displayed_in_cart() {
       
    	Assert.assertTrue(op.verifyItems());
    }
}