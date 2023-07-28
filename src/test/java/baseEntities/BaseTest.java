package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.CompletePage;
import pages.OverviewPage;
import pages.YouCardPage;
import steps.CheckoutStep;
import steps.LoginStep;
import steps.ProductStep;
import utils.configuration.ReadProperties;

@Listeners(InvokedListener.class)
//@Listeners(Listener.class)
public class BaseTest {
    protected WebDriver driver;

    protected LoginStep loginStep;
    protected ProductStep productStep;
    protected CheckoutStep checkoutStep;
    protected YouCardPage youCardPage;
    protected OverviewPage overviewPage;
    protected CompletePage completePage;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStep(driver);
        productStep = new ProductStep(driver);
        checkoutStep = new CheckoutStep(driver);
        youCardPage = new YouCardPage(driver);
        overviewPage = new OverviewPage(driver);
        completePage = new CompletePage(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}