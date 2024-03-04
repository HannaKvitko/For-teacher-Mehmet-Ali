package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"srs/test/java/features"},
        glue = {"stepdefinition","anotherPakegeNecassary"},
        tags = "@Regression"
)

public class _03_RegressionRunner extends AbstractTestNGCucumberTests {
}
