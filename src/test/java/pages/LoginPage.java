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

    // Блок инициализации
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("login-button");
    }

    // Блок комплексных методов
    public LoginPage getEmail(String username){
        emailInput.sendKeys(username);
        return this;
    }
    public LoginPage getPassword (String psw){
        pswInput.sendKeys(psw);
        return this;
    }
    public ProductPage getClick(){
        logInButton.click();
        return new ProductPage(driver);
    }
}
