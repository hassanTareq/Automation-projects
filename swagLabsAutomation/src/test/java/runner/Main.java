package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"stepDefs"},
        plugin = {"pretty","html:Target/TestReport.html"},
        tags = "@smoke"
)
public class Main extends AbstractTestNGCucumberTests {
}
