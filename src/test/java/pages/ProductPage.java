package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    private final static String pagePath = "/inventory.html";

    // Блок описания локаторов для элементов
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;

    @FindBy (id = "shopping_cart_container")
    public WebElement shoppingButton;

    // Блок инициализации
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок комплексных методов
    public ProductPage getAddToCart (){
        addToCartButton.click();
        return this;
    }
    public YouCardPage getShopping(){
        shoppingButton.click();
        return new YouCardPage(driver);
    }
}
