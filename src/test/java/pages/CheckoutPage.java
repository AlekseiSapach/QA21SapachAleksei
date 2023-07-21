package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    private final static String pagePath = "/checkout-step-one.html";

    // Блок описания локаторов для элементов
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By zipCodeInputLocator = By.id("postal-code");
    private final By continueButtonLocator = By.id("continue");

    // Блок инициализации
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return continueButtonLocator;
    }

    // Блок атомарных методов
    public WebElement getFirstNameInput() {
        return driver.findElement(firstNameInputLocator);
    }

    public WebElement getLastNameInput() {
        return driver.findElement(lastNameInputLocator);
    }
    public WebElement getZipCodeInput() {
        return driver.findElement(zipCodeInputLocator);
    }

    public WebElement getContinueButton() {
        return driver.findElement(continueButtonLocator);
    }

    // Блок комплексных методов
    public void getCheck(String firstname, String lastname, String zipcode) {
        getFirstNameInput().sendKeys(firstname);
        getLastNameInput().sendKeys(lastname);
        getZipCodeInput().sendKeys(zipcode);
        getContinueButton().click();
    }

}
