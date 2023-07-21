package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage extends BasePage {
    private final static String pagePath = "/checkout-step-two.html";

    // Блок описания локаторов для элементов

    private final By finishButtonLocator = By.id("finish");

    // Блок инициализации
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return finishButtonLocator;
    }

    // Блок атомарных методов

    public WebElement getFinishButton() {
        return driver.findElement(finishButtonLocator);
    }

    // Блок комплексных методов

}
