package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage extends BasePage {
    private final static String pagePath = "/checkout-step-one.html";

    // Блок описания локаторов для элементов
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By zipCodeInputLocator = By.id("postal-code");
    private final By continueButtonLocator = By.id("continue");

    // Блок инициализации
    public CheckoutPage() {
        super();
    }
    @Override
    protected By getPageIdentifier() {
        return continueButtonLocator;
    }
    // Блок атомарных методов
    public SelenideElement getFirstNameInput() {
        return $(firstNameInputLocator);
    }

    public SelenideElement getLastNameInput() {
        return $(lastNameInputLocator);
    }
    public SelenideElement getZipCodeInput() {
        return $(zipCodeInputLocator);
    }

    public SelenideElement getContinueButton() {
        return $(continueButtonLocator);
    }
    // Блок комплексных методов
    public void getCheck(String firstname, String lastname, String zipcode) {
        getFirstNameInput().sendKeys(firstname);
        getLastNameInput().sendKeys(lastname);
        getZipCodeInput().sendKeys(zipcode);
        getContinueButton().click();
    }
}
