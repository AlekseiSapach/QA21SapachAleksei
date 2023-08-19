package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class YouCardPage extends BasePage {
    private final static String pagePath = "/cart.html";

    // Блок описания локаторов для элементов
    private final By checkoutButtonLocator = By.id("checkout");

    // Блок инициализации
    public YouCardPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return checkoutButtonLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public SelenideElement getCheckoutButton() {
        return $(checkoutButtonLocator);
    }
}
