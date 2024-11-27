package Others;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class OtherTest {
    public static void main(String[] args) throws InterruptedException {
//        DesiredCapabilities capabilities = new SafariOptions();
//        capabilities.setCapability("browserName", "safari");
//        capabilities.setCapability("platform", "macos");
//        WebDriver driver = new SafariDriver(capabilities);
        AbstractDriverOptions options;
        options = new SafariOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new SafariDriver((SafariOptions) options);
        driver.manage().window().maximize();

        driver.get("https://www.google.ca");
        System.out.println("Current URL is : " +driver.getCurrentUrl() + " Title is : "+ driver.getTitle());
        Thread.sleep(10000);
//        driver.close();
        driver.quit();

    }
}