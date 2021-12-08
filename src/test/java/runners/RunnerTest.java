package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/",
        glue = "stepsDefinitions",
        dryRun = false,
        tags = {""},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        plugin = {"html:target/cucumber-report", "pretty"}
)
public class RunnerTest {
}
