package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    // Блок описания локаторов для элементов
    @FindBy(id = "user-name")
    public WebElement emailInput;
    @FindBy (id = "password")
    public WebElement pswInput;
    @FindBy (id = "login-button")
    public WebElement logInButton;

    private final By errorTextLocator = By.tagName("h3");
    private final By errorFieldTextLocator = By.tagName("h3");

    // Блок инициализации
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("login-button");
    }
    public WebElement getErrorTextElement() {
        return driver.findElement(errorTextLocator);
    }

    public WebElement getErrorFieldTextElement() {
        return driver.findElement(errorFieldTextLocator);
    }

    // Блок комплексных методов
    public void login(String username, String psw) {
        emailInput.sendKeys(username);
        pswInput.sendKeys(psw);
        logInButton.click();
    }
}
