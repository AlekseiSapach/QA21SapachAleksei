package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouCardPage extends BasePage {
    private final static String pagePath = "/cart.html";

    // Блок описания локаторов для элементов
    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    // Блок инициализации
    public YouCardPage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return By.id("checkout");
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }
}
