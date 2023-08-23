package stepDefs;

import baseEntities.BaseTest;
import factory.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Step;

public class Hook extends BaseTest {
    private BaseTest baseTest;

    public Hook (BaseTest baseTest){
        this.baseTest = baseTest;
    }

    @Before(value = "@gui, @negative", order = 10001)
    @Step("Browser initialization")
    public void initGUIScenario(Scenario scenario){
        baseTest.driver = new BrowserFactory().getDriver();
    }
    @Before(value = "@smoke")
    @Step("Api initialization")
    public void initAPIScenario(Scenario scenario){
        System.out.println("Init connection to the server");
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Attach screenshot");
        }
        baseTest.driver.quit();
    }
}
