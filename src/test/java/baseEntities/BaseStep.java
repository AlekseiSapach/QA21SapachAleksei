package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected YouCardPage youCardPage;
    protected CheckoutPage checkoutPage;
    protected OverviewPage overviewPage;

    public BaseStep() {

        loginPage = new LoginPage();
        productPage = new ProductPage();
        youCardPage = new YouCardPage();
        checkoutPage = new CheckoutPage();
        overviewPage = new OverviewPage();
    }
}