package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends BasePage {
    private final static String pagePath = "/inventory.html";

    // Блок описания локаторов для элементов
    private final By addToCartButtonLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By shoppingButtonLocator = By.id("shopping_cart_container");

    // Блок инициализации
    public ProductPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return addToCartButtonLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public SelenideElement getAddToCartButton() {
        return $(addToCartButtonLocator);
    }
    public SelenideElement getShoppingButton() {
        return $(shoppingButtonLocator);
    }
    // Блок комплексных методов
    public void getProduct() {
        getAddToCartButton().click();
        getShoppingButton().click();
    }
}
