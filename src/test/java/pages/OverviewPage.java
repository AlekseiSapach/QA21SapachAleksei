package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OverviewPage extends BasePage {
    private final static String pagePath = "/checkout-step-two.html";

    // Блок описания локаторов для элементов

    private final By finishButtonLocator = By.id("finish");

    // Блок инициализации
    public OverviewPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return finishButtonLocator;
    }

    // Блок атомарных методов

    public SelenideElement getFinishButton() {
        return $(finishButtonLocator);
    }
}
