package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C://Users//Yogesh//git//NewCucumber1//src//test//java//Features"},
glue={"StepDefination"},
monochrome= true,
tags =("@CheckOut"))
//plugin= {"json:target/cucumber-reports/Report.json"})
public class TestRunner {

}
