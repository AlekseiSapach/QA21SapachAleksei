package pages;

import baseEntities.BasePage;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectsPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/add/1";

    // Блок описания локаторов для элементов
    private final By addButtonLocator = By.id("accept");

    // Блок инициализации
    public AddProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return addButtonLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getAddButton (){
        return driver.findElement(addButtonLocator);
    }
    public RadioButton getType(){
        return new RadioButton(driver, "suite_mode");
    }
}
