package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.ysr.stepdef"},
        plugin = {"pretty", "html:target/cucumber-reports.html"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {


   }

