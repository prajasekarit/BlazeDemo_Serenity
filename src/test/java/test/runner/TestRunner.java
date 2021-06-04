package test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/FeatureFiles/Blaze_application.feature" },
		// features= {".//Features/end_to_end.feature"},
		 glue="step.definitions",
		// dryRun=false,
		// monochrome=true,
		plugin = { "pretty" }// ,
        ,tags= {"@Test-1"}
)

public class TestRunner {

}
