package Others;

import com.ysr.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test
    public void myFirstTest() {
        driver.get("https://www.google.ca");
        logger.debug("Navigated to google canada ");
        String title = driver.getTitle();
        logger.debug("Page title is: " + title);
        Assert.assertEquals(title, "Google");
    }
}
