package Others;

import com.ysr.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test
    public void myFirstTest() throws InterruptedException {
        driver.get("https://epass-ca.quipugroup.net/?clientID=16&libraryID=1");
        logger.debug("Navigated to TPL");
        String title = driver.getTitle();
        logger.debug("Page title is: " + title);
        //Assert.assertEquals(title, "Google");
        Thread.sleep(100);

    }
}
