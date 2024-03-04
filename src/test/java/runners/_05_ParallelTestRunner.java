package runners;


import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.ConfigReader;
import utilities.ThreadSafeDriver;

@CucumberOptions(
        features = {"srs/test/java/features"},
        glue = {"stepdefinition","anotherPakegeNecassary"},
        tags = "@ParallelTest"
)

public class _05_ParallelTestRunner {

    @BeforeClass
    @Parameters("browserType")
    public void setUpClass(String browserName){
        ThreadSafeDriver.threadBrowserName.set(ConfigReader.getProperty(browserName));
    }

    @AfterClass
    public static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone",System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Tester Name","Mehmet Ali Sezgin");
    }
}
