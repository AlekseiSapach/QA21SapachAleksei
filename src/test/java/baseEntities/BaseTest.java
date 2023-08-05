package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import steps.CheckoutStep;
import steps.LoginStep;
import steps.ProductStep;
import utils.configuration.ReadProperties;

public class BaseTest {
    protected WebDriver driver;

    protected LoginStep loginStep;
    protected ProductStep productStep;
    protected CheckoutStep checkoutStep;
    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected YouCardPage youCardPage;
    protected OverviewPage overviewPage;
    protected CompletePage completePage;
    protected CheckoutPage checkoutPage;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStep(driver);
        productStep = new ProductStep(driver);
        checkoutStep = new CheckoutStep(driver);
        loginPage  = new LoginPage(driver);
        productPage = new ProductPage(driver);
        youCardPage = new YouCardPage(driver);
        overviewPage = new OverviewPage(driver);
        completePage = new CompletePage(driver);
        checkoutPage = new CheckoutPage(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}