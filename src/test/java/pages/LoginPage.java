package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    // Блок описания локаторов для элементов
    private final By emailInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");

    // Блок инициализации
    public LoginPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return logInButtonLocator;
    }

    // Блок атомарных методов
    public SelenideElement getEmailInput() {
        return $(emailInputLocator);
    }

    public SelenideElement getPswInput() {
        return $(pswInputLocator);
    }

    public SelenideElement getLogInButton() {
        return $(logInButtonLocator);
    }

    // Блок комплексных методов
    public void login(String username, String psw) {
        getEmailInput().sendKeys(username);
        getPswInput().sendKeys(psw);
        getLogInButton().click();
    }
}
