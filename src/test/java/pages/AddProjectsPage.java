package pages;

import baseEntities.BasePage;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectsPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/add/1";

    // Блок описания локаторов для элементов
    private final By RadioButton1Locator = By.id("suite_mode_single");
    private final By RadioButton2Locator = By.id("suite_mode_single_baseline");
    private final By RadioButton3Locator = By.id("suite_mode_multi");
    private final By RadioGroupLocator = By.xpath("//*[@id=\"form\"]/div[4]/div[2]/div[1]/div[7]");

    // Блок инициализации
    public AddProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return RadioButton1Locator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getRadioButton1() {
        return driver.findElement(RadioButton1Locator);
    }
    public WebElement getRadioButton2() {
        return driver.findElement(RadioButton2Locator);
    }
    public WebElement getRadioButton3() {
        return driver.findElement(RadioButton3Locator);
    }
    public WebElement getRadioGroup() {
        return driver.findElement(RadioGroupLocator);
    }

    public RadioButton getAddProjectRadio() {
        return new RadioButton(driver, RadioGroupLocator);
    }
}
