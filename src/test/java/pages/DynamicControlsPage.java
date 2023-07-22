package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicControlsPage extends BasePage {
    private final static String pagePath = "/dynamic_controls";

    // Блок описания локаторов для элементов
    private final By buttonRemoveLocator = By.xpath("//*[@onclick = 'swapCheckbox()']");
    private final By buttonEnableLocator = By.xpath("//*[@onclick = 'swapInput()']");
    private final By loadingLocator = By.id("loading");
    private final By checkboxLocator = By.id("checkbox");
    private final By messageLocator = By.id("message");
    private final By inputTextLocator = By.tagName("input");


    // Блок инициализации
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonRemoveLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getButtonRemove() {
        return driver.findElement(buttonRemoveLocator);
    }
    public WebElement getButtonEnable() {
        return driver.findElement(buttonEnableLocator);
    }
    public WebElement getLoading() {
        return driver.findElement(loadingLocator);
    }
    public WebElement getCheckbox() {
        return driver.findElement(checkboxLocator);
    }
    public WebElement getMessage() {
        return driver.findElement(messageLocator);
    }
    public WebElement getInputText() {
        return driver.findElement(inputTextLocator);
    }
}
