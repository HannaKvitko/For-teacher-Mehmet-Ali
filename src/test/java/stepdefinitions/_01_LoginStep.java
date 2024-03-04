package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import utilities.ThreadSafeDriver;


public class _01_LoginStep {

    LoginPage loginPage = new LoginPage();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        // Navigate to Campus
        ThreadSafeDriver.getDriver().get("https://test.mersys.io/");

    }


    @When("Enter user name and password in the text boxes")
    public void enterUserNameAndPasswordInTheTextBoxes() {
        loginPage.usernameTextBox.sendKeys("turkeyts");
        loginPage.passwordTextBox.sendKeys("TechnoStudy123");
    }

    @And("Click on the Login button")
    public void clickOnTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("User should be login successfully")
    public void userShouldBeLoginSuccessfully() {
        Assert.assertTrue(loginPage.technoStudyImage.isDisplayed());
    }
}
