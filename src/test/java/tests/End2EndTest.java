package tests;

import baseEntities.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

@Epic("Custom purchase process")
@Feature("Custom path")
public class End2EndTest extends BaseTest {
    @Test(description = "Совершение покупки")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Оригинал тест.")
    @Link("https://example.org/story-1276")
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

    @Test(description = "Покупка в интернет-магазине")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Дубликат теста end2endTest.")
    @TmsLink("TestCase-1299")
    public void end2endTest_1() {

        loginStep.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened();
        productStep.productSelection().isPageOpened();

        youCardPage.getCheckoutButton().click();

        checkoutStep.getInformation(ReadProperties.firstname(),ReadProperties.lastname(),
                ReadProperties.zipCode()).isPageOpened();

        overviewPage.getFinishButton().click();

        completePage.isPageOpened();
        Assert.assertEquals(completePage.getLabel().getText(),"Thank you for your order!");

    }
    @Test(description = "Покупка в интернет-магазине failed")
    @Severity(SeverityLevel.MINOR)
    @Description("Заведомо падающий тест.")
    @Issue("BUG-1")
    public void end2endTest_2() {

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
