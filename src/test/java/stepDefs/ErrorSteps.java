package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Then;

public class ErrorSteps extends  BaseTest {
    private BaseTest baseTest;

    public ErrorSteps (BaseTest baseTest){
        this.baseTest = baseTest;
    }

    @Then("error username")
    public void getErrorUsername(){

    }

    @Then("error password")
    public void getErrorPassword(){

    }
}
