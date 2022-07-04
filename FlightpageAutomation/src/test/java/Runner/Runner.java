package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features/flightTest.feature", plugin = { "pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"}, glue = {"StepDefinitions"}, monochrome = true,tags = "")
public class Runner extends AbstractTestNGCucumberTests {
}
