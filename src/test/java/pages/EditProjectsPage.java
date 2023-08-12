package pages;

import baseEntities.BasePage;
import elements.DropDownMenu;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProjectsPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/edit/1";

    // Блок описания локаторов для элементов
    private final By editReferencesLocator = By.id("projects-tabs-references");
    private final By selectButtonLocator = By.xpath("//*[@id=\"reference_plugin_chzn\"]/a/div/b");

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
    public WebElement getSelectButton (){
        return driver.findElement(selectButtonLocator);
    }
    public DropDownMenu getEditType(){
        return new DropDownMenu(driver, "active-result");
    }
}
