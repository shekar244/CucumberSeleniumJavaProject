package com.ysr.stepdef;

import com.ysr.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class LoginPageStepDef {
    // This class will contain the step definitions for the login page scenarios
    // The step definitions will use the Page Object Model (POM) to interact with the web elements
    // and perform actions on the login page
    private WebDriver driver;
    private LoginPage loginPage;
    String TestURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
    @Before
    public void setUp() {
        // Set up the WebDriver instance and initialize the LoginPage object
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.acceptInsecureCerts();
//        capabilities.setCapability(s);
        driver = new ChromeDriver();
    }
    @After
    public void tearDown() {
     if(driver != null)   // Quit the WebDriver instance
        driver.quit();
    }

    @Given("I am on the opencart login page")
    public void i_am_on_the_opencart_login_page() {
        driver.get(TestURL);
        loginPage = new LoginPage(driver);
    }
    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
        // Enter the email address in the email input field
        loginPage.enterEmail("shekar@gmail.com");
        loginPage.enterPassword("password1");
    }
    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String username, String password) {
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        // Click on the login button
        loginPage.clickLoginButton();
    }



    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
        // Add assertions to verify successful login
        Assert.assertTrue(loginPage.isLogoutLinkDisplayed());
    }

    @Then("I should see an error message indicating error message")
    public void iShouldSeeAnErrorMessageIndicatingErrorMessage() {
        // Add assertions to verify error message
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }


}
