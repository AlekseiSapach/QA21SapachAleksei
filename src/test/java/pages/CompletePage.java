package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends BasePage {
    private final static String pagePath = "/checkout-complete.html";

    // Блок описания локаторов для элементов
    @FindBy(className = "complete-header")
    public WebElement label;

    // Блок инициализации
    public CompletePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.className("complete-header");
    }

}
