package tests;

import baseEntities.BaseTest;
import elements.CheckBox;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AddProjectsPage;
import pages.EditProjectsPage;
import utils.configuration.ReadProperties;

public class WrappersTest extends BaseTest {

    @Test
    public void testCheckBox() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        CheckBox checkBox1 = new CheckBox(driver,By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        CheckBox checkBox2 = new CheckBox(driver,By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

        checkBox1.setCheckBox();
        checkBox2.removeCheckBox();
    }
    @Test
    public void tableRadio() {
        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );

        AddProjectsPage addProjectsPage = new AddProjectsPage(driver);
        addProjectsPage.openPageByUrl();
        addProjectsPage.getType().selectByIndex(2);
        addProjectsPage.getType().selectByValue("1");
        addProjectsPage.getType().selectByText("Use multiple test suites to manage cases");
    }
    @Test
    public void DropDown() {
        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );

        EditProjectsPage editProjectsPage = new EditProjectsPage(driver);
        editProjectsPage.openPageByUrl();
        editProjectsPage.getEditReferences().click();
        editProjectsPage.getSelectElement().selectByIndex(4);
        editProjectsPage.getSelectElement().selectByText("GitHub");
    }
}