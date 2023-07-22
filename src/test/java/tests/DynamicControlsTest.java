package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.DynamicControlsPage;
import services.WaitService;
import utils.configuration.ReadProperties;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void DynamicTest() {
        WaitService waitService  = new WaitService(driver);
        DynamicControlsPage dynamicControlsPage =new DynamicControlsPage(driver);
        dynamicControlsPage.openPageByUrl();

        dynamicControlsPage.getButtonRemove().click();
        dynamicControlsPage.getMessage().isDisplayed();
        //Не смог понять почему тест падает на следующей строке, точнее почему падает понимаю,
        //но как исправить, до этого не смог дойти. Ругается на то, что в DynamicControlsPage мы ожидаем элемент
        //а тут проверяем, что его нет - противоречие получается между waitForExists и waitForElementInvisible
        Assert.assertTrue(waitService.waitForElementInvisible(dynamicControlsPage.getCheckbox()));
        Assert.assertTrue(dynamicControlsPage.getInputText().isDisplayed());
        Assert.assertTrue(Boolean.parseBoolean(dynamicControlsPage.getInputText().getAttribute("disabled")));
        dynamicControlsPage.getButtonEnable().click();
        dynamicControlsPage.getMessage().isDisplayed();
        Assert.assertFalse(Boolean.parseBoolean(dynamicControlsPage.getInputText().getAttribute("disabled")));




    }


}