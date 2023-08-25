package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ErrorSteps extends  BaseTest {
    private BaseTest baseTest;

    public ErrorSteps (BaseTest baseTest){
        this.baseTest = baseTest;
    }

    @Then("error login {} is displayed")
    public void getErrorLogin(String error){
        Assert.assertEquals(error,"Epic sadface: Username and password do not match any user in this service");

    }
    @Then("error password {} is displayed")
    public void getErrorPassword(String error){
        Assert.assertEquals(error,"Epic sadface: Username and password do not match any user in this service");

    }
}
