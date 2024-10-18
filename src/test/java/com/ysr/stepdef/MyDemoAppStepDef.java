package com.ysr.stepdef;
import com.ysr.App;
import com.ysr.pages.LoginPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class MyDemoAppStepDef {


    XCUITestOptions options = new XCUITestOptions()
            .setDeviceName("iPhone 15 Pro Max-shekar")
            .setPlatformName("ios")
            .setPlatformVersion("18.0")
            .setBundleId("com.saucelabs.mydemo.app.ios")
            .connectHardwareKeyboard().setConnectHardwareKeyboard(true);
   AppiumDriver  appiumdriver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);

    public MyDemoAppStepDef() throws MalformedURLException {
    }

    @Before
    public void setUp() throws MalformedURLException {
        System.out.println("Setup");


    }
    @After
    public void tearDown() {
        if(appiumdriver != null)   // Quit the WebDriver instance
            appiumdriver.quit();
    }

//          @Given("I have launched the Mydemo IOS APP")
//        public void iHaveLaunchedTheMydemoIOSAPP() {
//            // Write code here that turns the phrase above into concrete actions
//
//
//        }

        @Given("I have entered a valid userid and password")
        public void i_have_entered_a_valid_userid_and_password () {
            // Write code here that turns the phrase above into concrete actions
            appiumdriver.findElement(AppiumBy.accessibilityId("More")).click();
            appiumdriver.findElement(AppiumBy.accessibilityId("More-tab-item")).click();

            appiumdriver.findElement(AppiumBy.accessibilityId("LogOut-menu-item")).click();
            appiumdriver.findElement(AppiumBy.className("XCUIElementTypeTextField")).sendKeys("bob@example.com");
            appiumdriver.findElement(AppiumBy.className("XCUIElementTypeSecureTextField")).sendKeys("10203040");

        }
        @When("I click on the login")
        public void i_click_on_the_login () {
            appiumdriver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Login\"]")).click();

                  }
        @Then("I will logged in successfully")
        public void i_will_logged_in_successfully () {
            // Write code here that turns the phrase above into concrete actions
            appiumdriver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"ProductItem\"])[1]")).click();
            appiumdriver.findElement(AppiumBy.accessibilityId("AddToCart")).click();
            appiumdriver.findElement(AppiumBy.accessibilityId("Cart-tab-item")).click();
            appiumdriver.findElement(AppiumBy.accessibilityId("ProceedToCheckout")).click();
            assert appiumdriver.findElement(AppiumBy.accessibilityId("Checkout")).isDisplayed();
            appiumdriver.quit();

        }

    }
