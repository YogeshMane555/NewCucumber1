package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"classpath:Features"},
glue= {"classpath:StepDefination"},
tags= "@Ym",
plugin= {"pretty","json:C://Users//Yogesh//git//NewCucumber1//target//Reportt.json"},
monochrome=true
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
