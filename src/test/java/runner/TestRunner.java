package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@all", plugin = { "pretty",
	"html:Report/Cucumber/MyReport.html" }, publish = true, features = "src/test/resources/features", glue = {
		"stepdefinitions", "hooks" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
