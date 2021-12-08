package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utils.Utils.*;

public class Hooks {

    @Before(order = 1)
    public void suitUp() {
    }

    @After()
    public void tearDown(Scenario scenario) {
        printFinal(scenario);
        limparCache();
        driver.quit();
    }
}
