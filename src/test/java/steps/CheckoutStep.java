package steps;

import baseEntities.BaseStep;
import models.UserCard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.OverviewPage;

public class CheckoutStep extends BaseStep {
    Logger logger = LogManager.getLogger(CheckoutStep.class);

    public CheckoutStep(WebDriver driver) {
        super(driver);
    }

    public OverviewPage getInformation(UserCard  userCard) {
        checkoutPage.getCheck(userCard);

        logger.info(userCard.toString());
        return overviewPage;
    }
}