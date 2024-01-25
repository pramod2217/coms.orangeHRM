package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*@CucumberOptions(plugin = { "json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html",
	"com.cucumber.listener.ExtentCucumberFormatter" }, features = "src/test/resources/Features", glue = "steps",tags = "@LoginIn-Pasitive")
, plugin = {
		"html:target/cucumner-reports/cucumber-html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }*/
@CucumberOptions(features = "src/test/resources/features", glue = "steps",tags = "@Scenario1")
public class RunCuck extends AbstractTestNGCucumberTests {

}
