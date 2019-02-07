package runnera;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber-report.json", 
features="features",
glue="SND-Assessment/src/main/java/stepsDefinition")

public class TestRunner{

}
