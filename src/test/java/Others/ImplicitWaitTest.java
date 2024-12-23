package Others;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
//for testing out the webdriver manager from Bonigarcia //
public class ImplicitWaitTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();

    }

}
