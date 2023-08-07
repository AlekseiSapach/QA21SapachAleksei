package pages;

import baseEntities.BasePage;
import models.UserCard;
import models.UserCardBuild;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    private final static String pagePath = "/checkout-step-one.html";

    // Блок описания локаторов для элементов
    @FindBy(id = "first-name")
    public WebElement firstNameInput;
    @FindBy (id = "last-name")
    public WebElement lastNameInput;
    @FindBy (id = "postal-code")
    public WebElement zipCodeInput;
    @FindBy (id = "continue")
    public WebElement continueButton;

    // Блок инициализации
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return By.id("continue");
    }

    // Блок комплексных методов
    public void getCheck(UserCard userCard) {
        firstNameInput.sendKeys(userCard.getFirstName());
        lastNameInput.sendKeys(userCard.getLastName());
        zipCodeInput.sendKeys(userCard.getZipCode());
        continueButton.click();
    }
}
