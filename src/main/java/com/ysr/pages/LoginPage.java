package com.ysr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    //Locators
    private By emailInputLocator = By.name("email");
    private By passwordInputLocator = By.name("password");
    private By loginButtonLocator = By.xpath("//input[@type='submit']");
    private By forgottenpasswordLocator = By.linkText("Forgotten Password");
    private By logoutLinkLocator   = By.linkText("Logout");
    private By errorMessageLocator = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    //Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    //Methods
    public void enterEmail(String email){
        driver.findElement(emailInputLocator).sendKeys(email);
    }
    public void enterPassword(String password){
        driver.findElement(passwordInputLocator).sendKeys(password);
    }
        public void clickLoginButton(){
        driver.findElement(loginButtonLocator).click();
    }
    public void clickForgottenPasswordLink(){
        driver.findElement(forgottenpasswordLocator).click();
    }
    public void clickLogoutLink(){
        driver.findElement(logoutLinkLocator).click();
    }
    public boolean isLogoutLinkDisplayed(){
        return driver.findElement(logoutLinkLocator).isDisplayed();
    }
    public boolean isErrorMessageDisplayed(){
        return driver.findElement(errorMessageLocator).isDisplayed();
    }

    public void login(String email, String password){
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
    public void logout(){
        clickLogoutLink();
    }
}
