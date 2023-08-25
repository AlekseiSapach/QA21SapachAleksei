package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;
import utils.configuration.ReadProperties;

public class LoginStepDefs extends BaseTest {
    private BaseTest baseTest;
    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected YouCardPage youCardPage;
    protected OverviewPage overviewPage;
    protected CompletePage completePage;
    protected CheckoutPage checkoutPage;

    public LoginStepDefs (BaseTest baseTest){
        this.baseTest = baseTest;
    }
    @Given("open login page")
    public void openLoginPage(){
        driver.get(ReadProperties.getUrl());
    }
    @When("user enter username {} and password {}")
    public void setUserAndPassword(String username, String password){
        loginPage  = new LoginPage(driver);
        loginPage.emailInput.sendKeys(username);
        loginPage.pswInput.sendKeys(password);
    }
    @When("user clicks login button")
    public void clickLoginButton(){
        loginPage.logInButton.click();
    }
    @Then("product page is displayed")
    public void isProductPageIsDisplayed(){
        productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.isPageOpened());
    }
    @And("user click add to cart button")
    public void clickAddToCartButton(){
        productPage.addToCartButton.click();
    }
    @And("user click shopping cart button")
    public void clickShoppingCartButton(){
        productPage.shoppingButton.click();
    }
    @And("user click checkout button")
    public void clickCheckoutButton(){
        youCardPage.checkoutButton.click();
    }
    @And("user click continue button")
    public void clickContinueButton(){
        checkoutPage.continueButton.click();
    }
    @And("user click finish button")
    public void clickFinishButton(){
        overviewPage.finishButton.click();
    }

    @Then("you card page is displayed")
    public void youCardPageIsDisplayed() {
        youCardPage = new YouCardPage(driver);
        Assert.assertTrue(youCardPage.isPageOpened());
    }

    @Then("checkout page is displayed")
    public void checkoutPageIsDisplayed() {
        checkoutPage = new CheckoutPage(driver);
        Assert.assertTrue(checkoutPage.isPageOpened());
    }
    @Then("overview page is displayed")
    public void overviewPageIsDisplayed() {
        overviewPage = new OverviewPage(driver);
        Assert.assertTrue(overviewPage.isPageOpened());
    }

    @When("enter user data firstname {}, lastname {}  and zipcode {}")
    public void enterUserDataAnd(String firstname, String lastname, String zipcode) {
        checkoutPage.firstNameInput.sendKeys(firstname);
        checkoutPage.lastNameInput.sendKeys(lastname);
        checkoutPage.zipCodeInput.sendKeys(zipcode);
    }
    @Then("message {} is displayed")
    public void getMessageIsDisplayed(String message) {
        completePage = new CompletePage(driver);
        Assert.assertEquals(message,"Thank you for your order!");
    }
}
