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
        Assert.assertTrue(
                loginStep.successLogin(ReadProperties.username(), ReadProperties.password()
                ).isPageOpened()
        );
        Assert.assertTrue(productStep.productSelection().isPageOpened());

        YouCardPage youCardPage = new YouCardPage(driver);
        youCardPage.getCheckoutButton().click();

        Assert.assertTrue(checkoutStep.getInformation(ReadProperties.firstname(),ReadProperties.lastname(),
                ReadProperties.zipCode()).isPageOpened());

        OverviewPage overviewPage = new OverviewPage(driver);
        overviewPage.getFinishButton().click();

        CompletePage completePage = new CompletePage(driver);
        completePage.isPageOpened();
        Assert.assertEquals(completePage.getLabel().getText(),"Thank you for your order!");

    }

}
