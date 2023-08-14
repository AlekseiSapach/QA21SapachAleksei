package pages;

import baseEntities.BasePage;
import elements.DropDownMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProjectsPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/edit/1";

    // Блок описания локаторов для элементов
    private final By editReferencesLocator = By.id("projects-tabs-references");
    private final By selectElementLocator = By.id("defect_plugin_chzn");

    // Блок инициализации
    public EditProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return editReferencesLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getEditReferences (){
        return driver.findElement(editReferencesLocator);
    }

    public DropDownMenu getSelectElement(){
        return new DropDownMenu(driver, selectElementLocator);
    }
}
