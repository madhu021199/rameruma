package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src/test/java/feature/checklogin.feature"},
		dryRun=!true,
		glue= {"steps"})

public class CheckLoginRunner extends AbstractTestNGCucumberTests {

}
