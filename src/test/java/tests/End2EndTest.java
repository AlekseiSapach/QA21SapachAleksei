package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CompletePage;
import pages.OverviewPage;
import pages.YouCardPage;
import utils.configuration.ReadProperties;

public class End2EndTest extends BaseTest {
    @Test
    public void end2endTest() {

        loginStep.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened();
        productStep.productSelection().isPageOpened();

        youCardPage.getCheckoutButton().click();

        checkoutStep.getInformation(ReadProperties.firstname(),ReadProperties.lastname(),
                ReadProperties.zipCode()).isPageOpened();

        overviewPage.getFinishButton().click();

        completePage.isPageOpened();
        Assert.assertEquals(completePage.getLabel().getText(),"Thank you for your order!");

    }

}
