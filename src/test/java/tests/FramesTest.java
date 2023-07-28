package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import services.WaitService;

public class FramesTest extends BaseTest {
    @Test
    public void successLoginTest() {
        WaitService waitService = new WaitService(driver);
        FramesPage framesPage = new FramesPage(driver);
        framesPage.openPageByUrl();
        framesPage.getIframesLink().click();
        driver.switchTo().frame(framesPage.getFrame());
        Assert.assertEquals(framesPage.getLabel().getText(),"Your content goes here.");
    }
}