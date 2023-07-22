package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage extends BasePage {
    private final static String pagePath = "/upload";

    // Блок описания локаторов для элементов
    private final By buttonFileUploadLocator = By.id("file-upload");
    private final By buttonFileSubmitLocator = By.id("file-submit");
    private final By labelUploadedLocator = By.id("uploaded-files");

    // Блок инициализации
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonFileUploadLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getButtonFileUpload() {
        return waitService.waitForExists(buttonFileUploadLocator);
    }
    public WebElement getButtonFileSubmit() {
        return waitService.waitForExists(buttonFileSubmitLocator);
    }
    public WebElement getLabelUploaded() {
        return waitService.waitForExists(labelUploadedLocator);
    }
}
