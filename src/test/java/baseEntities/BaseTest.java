package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CompletePage;
import pages.OverviewPage;
import pages.YouCardPage;
import steps.CheckoutStep;
import steps.LoginStep;
import steps.ProductStep;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected LoginStep loginStep;
    protected ProductStep productStep;
    protected CheckoutStep checkoutStep;
    protected YouCardPage youCardPage;
    protected OverviewPage overviewPage;
    protected CompletePage completePage;

    @BeforeMethod
    public void setUp() {
        //SelenideLogger.addListener("AllureSelenide",new AllureSelenide());

        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;
        //Configuration.browserSize = "1640x900";

        loginStep = new LoginStep();
        productStep = new ProductStep();
        checkoutStep = new CheckoutStep();
        youCardPage = new YouCardPage();
        overviewPage = new OverviewPage();
        completePage = new CompletePage();

        open(ReadProperties.getUrl());
    }
    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}