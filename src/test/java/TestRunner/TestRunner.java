package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C://Users//yogemane//eclipse-workspace//NewCucumber//src//test//java//Features"},
glue={"StepDefination"},
monochrome= true, 
plugin= {"pretty","json:target/cucumber-reports/report2.json"})
public class TestRunner {

}
