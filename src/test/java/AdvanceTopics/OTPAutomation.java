package AdvanceTopics;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class OTPAutomation {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        Properties properties = new Properties();
        FileInputStream fs = new FileInputStream("src/main/resources/configuration.properties");
        properties.load(fs);
        driver.findElement(By.id("login_field")).sendKeys(properties.getProperty("username"));
        driver.findElement(By.id("password")).sendKeys(properties.getProperty("password"));
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("Use your authenticator app")).click();
        Totp topt = new Totp(properties.getProperty("git2FAKey"));
        String currentotp = topt.now();
        System.out.println(currentotp);
        //WebElement OTPField = driver.findElement(By.name("app_otp"));
        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        wait.until(d-> driver.findElement(By.name("app_otp")));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("app_otp")).sendKeys(currentotp);
        System.out.println(driver.getTitle());
        driver.quit();



    }

}
