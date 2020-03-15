package TestRunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
//@CucumberOptions(features="Selenium_TEST",glue={"SeleniumTest"}, plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
//		 "junit:target/cucumber-reports/Cucumber.xml",
//		 "html:target/cucumber-reports"},monochrome = true)	


@CucumberOptions(features="Selenium_TEST",glue={"SeleniumTest"}, plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml"})

//@CucumberOptions(features="TestFeature",glue={"StepDefinition"})
public class Runner 				
{		

}
