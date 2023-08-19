package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CompletePage extends BasePage {
    private final static String pagePath = "/checkout-complete.html";

    // Блок описания локаторов для элементов
    private final By labelLocator = By.className("complete-header");

    // Блок инициализации
    public CompletePage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return labelLocator;
    }
    // Блок атомарных методов

    public SelenideElement getLabel() {
        return $(labelLocator);
    }
}
