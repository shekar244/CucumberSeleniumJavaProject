package Others;

import com.ysr.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class TestInter extends BaseTest {
    protected static final Logger logger = LogManager.getLogger(TestInter.class);
   @Test
   public void TestOne() {
       driver.get("https://www.google.com");
       logger.info("Opened the URL");

   }


}
