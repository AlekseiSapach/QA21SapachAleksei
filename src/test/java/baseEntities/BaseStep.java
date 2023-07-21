package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected WebDriver driver;

    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected YouCardPage youCardPage;
    protected CheckoutPage checkoutPage;
    protected OverviewPage overviewPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        youCardPage = new YouCardPage(driver);
        checkoutPage = new CheckoutPage(driver);
        overviewPage = new OverviewPage(driver);
    }
}