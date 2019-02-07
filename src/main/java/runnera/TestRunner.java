package runnera;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = "json:target/cucumber-report.json", 
features="src/main/resources/features",
glue="stepsDefinition")

public class TestRunner extends AbstractTestNGCucumberTests{


}
