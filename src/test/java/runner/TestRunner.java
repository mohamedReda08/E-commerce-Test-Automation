package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features ="src\\main\\resources\\features",
        glue = "stepDefenitions",
        plugin = {
                "pretty", "html:target/cucumber.html"
        },
        tags = "@Smoke"
)
public class TestRunner {
}
