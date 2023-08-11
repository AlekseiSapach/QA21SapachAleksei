package tests;

import baseEntities.BaseTest;
import elements.CheckBox;
import elements.RadioButton;
import elements.TableCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AddProjectsPage;
import pages.ProjectsPage;
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
    public void tableTest() {
        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );

        ProjectsPage projectsPage = new ProjectsPage(driver);
        projectsPage.openPageByUrl();

        TableCell cell = projectsPage.getProjectsTable().getCell("Project", 1);
        cell.getLink().click();
    }
}