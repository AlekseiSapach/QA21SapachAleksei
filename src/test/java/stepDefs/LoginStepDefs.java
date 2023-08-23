package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductPage;
import utils.configuration.ReadProperties;

public class LoginStepDefs extends BaseTest {
    private BaseTest baseTest;
    private LoginPage loginPage;

    public LoginStepDefs (BaseTest baseTest){
        this.baseTest = baseTest;
    }
    @Given("open login page")
    public void openLoginPage(){
        driver.get(ReadProperties.getUrl());
    }
    @When("user enter username {} and password {}")
    public void setUserAndPassword(String username, String password){
        loginPage = new LoginPage(driver);
        loginPage.emailInput.sendKeys(username);
        loginPage.pswInput.sendKeys(password);
    }
    @When("user clicks login button")
    public void clickLoginButton(){
        loginPage.logInButton.click();
    }
    @Then("dashboard page is displayed")
    public void isDashboardPageIsDisplayed(){
        Assert.assertTrue(new ProductPage(driver).isPageOpened());

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
