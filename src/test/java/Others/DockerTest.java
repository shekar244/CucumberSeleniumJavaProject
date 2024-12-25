package Others;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DockerTest {

    @Test
    public void dockerTestChrome() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setBrowserName("chrome");

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), capabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.get("https://www.google.ca");
            String title = driver.getTitle();
            Assert.assertEquals(title, "Google");
            System.out.println(capabilities.getBrowserName());
            driver.quit();
    }
    @Test
    public void dockerTestFirefox() throws MalformedURLException {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setCapability("BrowserName","chrome");
//        chromeOptions.setCapability("Platform","LINUX");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setBrowserName("firefox");
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.google.ca");
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(capabilities.getBrowserName());
        driver.quit();

    }
    @Test
    public void dockerTestMSEdge() throws MalformedURLException {
//             ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setCapability("BrowserName","chrome");
//        chromeOptions.setCapability("Platform","LINUX");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setBrowserName("MicrosoftEdge");
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.google.ca");
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(capabilities.getBrowserName());
        driver.quit();

    }
}
