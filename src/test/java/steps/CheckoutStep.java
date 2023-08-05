package steps;

import baseEntities.BaseStep;
import models.UserCard;
import org.openqa.selenium.WebDriver;
import pages.OverviewPage;

public class CheckoutStep extends BaseStep {

    public CheckoutStep(WebDriver driver) {
        super(driver);
    }

    public OverviewPage getInformation(UserCard  userCard) {
        checkoutPage.getCheck(userCard);

        return overviewPage;
    }
}