package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    public void uploadTest() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.openPageByUrl();
        String pathToFile = FileUploadTest.class.getClassLoader().getResource("JavaDownload.jpg").getPath();
        fileUploadPage.getButtonFileUpload().sendKeys(pathToFile);
        fileUploadPage.getButtonFileSubmit().click();
        Assert.assertEquals("JavaDownload.jpg",fileUploadPage.getLabelUploaded().getText());
    }
}