package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    private final static String pagePath = "/inventory.html";

    // Блок описания локаторов для элементов
    private final By addToCartButtonLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By shoppingButtonLocator = By.id("shopping_cart_container");

    // Блок инициализации
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return addToCartButtonLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getAddToCartButton() {
        return driver.findElement(addToCartButtonLocator);
    }
    public WebElement getShoppingButton() {
        return driver.findElement(shoppingButtonLocator);
    }
    // Блок комплексных методов
    public void getProduct() {
        getAddToCartButton().click();
        getShoppingButton().click();
    }
}
