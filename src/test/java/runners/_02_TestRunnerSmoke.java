package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



    @CucumberOptions(
            features = {"srs/test/java/features"},
            glue = {"stepdefinition","anotherPakegeNecassary"},
            tags = "@SmokeTest"
    )
    public class _02_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
