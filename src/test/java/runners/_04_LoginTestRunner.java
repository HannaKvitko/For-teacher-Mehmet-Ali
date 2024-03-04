package runners;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.ConfigReader;
import utilities.ThreadSafeDriver;

@CucumberOptions(
        features = {"srs/test/java/features"},
        glue = {"stepdefinition","anotherPakegeNecassary"},
        tags = "@LoginTest",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter"}
)

public class _04_LoginTestRunner {

    @BeforeClass
    @Parameters("browserType")
    public void setUpClass(String browserName){
        ThreadSafeDriver.threadBrowserName.set(ConfigReader.getProperty("browser"));
    }
}
