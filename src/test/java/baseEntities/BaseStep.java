package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected WebDriver driver;


    protected ContextMenuPage contextMenuPage;
    protected DynamicControlsPage dynamicControlsPage;
    protected FileUploadPage fileUploadPage;
    protected FramesPage framesPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;

        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        framesPage = new FramesPage(driver);
    }
}
