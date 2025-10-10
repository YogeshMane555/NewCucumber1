package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before
	public void setUp()
	{
        ChromeOptions co=new ChromeOptions();
    	
    	co.addArguments("start-maximized");
    	
    	co.addArguments("--incognito");
    	
    	co.addArguments("delete-all-cookies");
    	
    	BaseClass.km=new ChromeDriver(co);
	}

	@After
	public void tearDown()
	{
		if(BaseClass.km!=null)
		{
			BaseClass.km.quit();
		}
	}
}
