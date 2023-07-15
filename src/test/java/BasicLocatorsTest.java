import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class BasicLocatorsTest {

    protected WebDriver driver;
    @BeforeMethod
    public  void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void basicLocatorsTest_1(){
        driver.get("https://computer-database.gatling.io/computers");
        // Find webElement by ID
        driver.findElement(By.id("searchsubmit")).isDisplayed();
        // Find webElement by Name
        driver.findElement(By.name("f")).isDisplayed();
        // Find webElement by Tag
        driver.findElement(By.tagName("table")).isDisplayed();
    }
    @Test
    public void basicLocatorsTest_2(){
        driver.get("https://computer-database.gatling.io/computers");
        // Find webElement by LinkText
        driver.findElement(By.linkText("AN/FSQ-32")).isDisplayed();
        // Find webElement by ClassName
        driver.findElement(By.className("btn success")).isDisplayed();
        // Find webElement by PartialLinkText
        driver.findElement(By.partialLinkText("Blue Mountain")).isDisplayed();
    }
}
