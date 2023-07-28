package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.OverviewPage;
import pages.YouCardPage;

public class CheckoutStep extends BaseStep {

    public CheckoutStep(WebDriver driver) {
        super(driver);
    }
    @Step
    public OverviewPage getInformation(String firstname, String lastname, String zipcode) {
        checkoutPage.getCheck(firstname,lastname,zipcode);

        return overviewPage;
    }
}