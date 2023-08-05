package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage {
    private final static String pagePath = "/checkout-step-two.html";

    // Блок описания локаторов для элементов
    @FindBy(id = "finish")
    public WebElement finishButton;

    // Блок инициализации
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("finish");
    }
}
