package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"classpath:Features"},
glue= {"classpath:StepDefination"},
tags= "@addProduct",
plugin= {"pretty","html:C://Users//Yogesh//git//NewCucumber1//target//Reportt.html","json:C://Users//Yogesh//git//NewCucumber1//target//JsonReportt.json"},
monochrome=true
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
