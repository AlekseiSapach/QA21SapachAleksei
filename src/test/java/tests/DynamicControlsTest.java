package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;
import services.WaitService;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void DynamicTest() {
        WaitService waitService  = new WaitService(driver);
        DynamicControlsPage dynamicControlsPage =new DynamicControlsPage(driver);
        dynamicControlsPage.openPageByUrl();
        dynamicControlsPage.getButtonRemove().click();
        waitService.waitForElementInvisible(dynamicControlsPage.getCheckbox());
        dynamicControlsPage.getMessage().isDisplayed();
        dynamicControlsPage.getInputText().isDisplayed();
        dynamicControlsPage.getInputText().getAttribute("disabled");
        dynamicControlsPage.getButtonEnable().click();
        dynamicControlsPage.getMessage().isDisplayed();
        Assert.assertFalse(Boolean.parseBoolean(dynamicControlsPage.getInputText().getAttribute("disabled")));
    }
}