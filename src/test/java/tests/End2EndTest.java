package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Condition.exactText;

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
        completePage.getLabel().shouldHave(exactText("Thank you for your order!"));
    }
}
