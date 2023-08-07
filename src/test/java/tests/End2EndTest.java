package tests;

import baseEntities.BaseTest;
import helper.DataHelper;
import models.UserCardBuild;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class End2EndTest extends BaseTest {
    @Test
    public void end2endTest() {

        loginPage.getEmail(ReadProperties.username())
                .getPassword(ReadProperties.password())
                .getClick()
                .getAddToCart()
                .getShopping();
        youCardPage.checkoutButton.click();
        checkoutStep.getInformation(DataHelper.getUserCard()).isPageOpened();
        overviewPage.finishButton.click();
        completePage.isPageOpened();
        Assert.assertEquals(completePage.label.getText(),"Thank you for your order!");
    }
}
