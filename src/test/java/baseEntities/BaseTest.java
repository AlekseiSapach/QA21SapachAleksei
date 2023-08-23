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
    public static WebDriver driver;
    protected CheckoutStep checkoutStep;
    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected YouCardPage youCardPage;
    protected OverviewPage overviewPage;
    protected CompletePage completePage;
    protected CheckoutPage checkoutPage;
    protected LoginStep loginStep;
    protected ProductStep productStep;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        checkoutStep = new CheckoutStep(driver);
        loginStep = new LoginStep(driver);
        productStep = new ProductStep(driver);
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