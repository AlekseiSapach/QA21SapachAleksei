package tests.gui;

import baseEntities.BaseTest;
import helper.DataHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class End2EndTest extends BaseTest {
    @Test
    public void end2endTest() {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened();
        productStep.productSelection().isPageOpened();
        youCardPage.checkoutButton.click();
        checkoutStep.getInformation(DataHelper.getUserCard()).isPageOpened();
        overviewPage.finishButton.click();
        completePage.isPageOpened();
        Assert.assertEquals(completePage.label.getText(),"Thank you for your order!");
    }
}
