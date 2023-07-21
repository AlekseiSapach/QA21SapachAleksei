package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage extends BasePage {
    private final static String pagePath = "/checkout-complete.html";

    // Блок описания локаторов для элементов

    private final By labelLocator = By.className("complete-header");

    // Блок инициализации
    public CompletePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return labelLocator;
    }

    // Блок атомарных методов

    public WebElement getLabel() {
        return driver.findElement(labelLocator);
    }

    // Блок комплексных методов


}
