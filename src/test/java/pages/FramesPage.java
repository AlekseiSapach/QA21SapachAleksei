package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage extends BasePage {
    private final static String pagePath = "/frames";

    // Блок описания локаторов для элементов
    private final By labelLocator = By.id("tinymce");
    private final By frameLocator = By.id("mce_0_ifr");
    private final By iframesLinkLocator = By.linkText("/iframe");

    // Блок инициализации
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return iframesLinkLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getIframesLink() {
        return waitService.waitForExists(iframesLinkLocator);
    }
    public WebElement getFrame() {
        return waitService.waitForExists(frameLocator);
    }
    public WebElement getLabel() {
        return waitService.waitForExists(labelLocator);
    }
}
