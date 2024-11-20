package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src/test/java/feature/login.feature"},
		dryRun=false,
		glue="steps",
		snippets= SnippetType.CAMELCASE,
		monochrome=true
		)
public class Runner extends AbstractTestNGCucumberTests{

}
