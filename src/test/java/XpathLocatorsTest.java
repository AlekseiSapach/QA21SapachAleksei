import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class XpathLocatorsTest {

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
    public void basicXpathLocatorsTest(){
        driver.get("https://selectorshub.com/xpath-practice-page/");

        // Все элементы на странице начина с HTML
        driver.findElements(By.xpath("//*"));
        // Аналог поиска по tagName
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
        // Аналог родительского div и на один уровень ниже р1
        Assert.assertTrue(driver.findElement(By.xpath("//div/form")).isDisplayed());
        // Аналог родительского div и на любом уровене ниже div
        Assert.assertTrue(driver.findElement(By.xpath("//div//div")).isDisplayed());
        // Поиск элемента с тэгом div у которого есть аьттрибут id
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id]")).isDisplayed());
        // Поиск элемента у которого есть аттрибут id cо значением top-logo
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id = 'tablepress-1-name']")).isDisplayed());
        // Поиск элемента у которого есть аттрибут method cо значением и aттрибут target со значением
        Assert.assertTrue(driver.findElement(By.xpath
                ("//*[@width='200' and @height='100']")).isDisplayed());
        // Поиск элемента у которого значение аттрибута начинается с
        Assert.assertTrue(driver.findElement(By.xpath("//*[starts-with(@id, 'car')]")).isDisplayed());
        // Поиск элемента у которого значение аттрибута содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@id, 'length')]")).isDisplayed());
        // Поиск элемента у которого текстовое значение содержит равно
        Assert.assertTrue(driver.findElement(By.xpath("//label[text() = 'Choose a car:']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[. = 'Password']")).isDisplayed());
        // Поиск элемента у которого текстовое значение содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath
                ("//*[contains(text(), 'generate manual')]")).isDisplayed());
        // Поиск элемента по индексу
        Assert.assertTrue(driver.findElement(By.xpath
                ("//div[@class = 'input-label'][2]")).isDisplayed());
    }

    @Test
    public void axesXPathTest() {
        driver.get("https://selectorshub.com/xpath-practice-page/");

        // Поиск родителя у элемента с тэгом h1
        Assert.assertTrue(driver.findElement(By.xpath("//header/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//section/parent::div")).isDisplayed());
        // Поиск всех предков с тэгом div у элемента с тэгом h1
        Assert.assertTrue(driver.findElement(By.xpath("//header/ancestor::div")).isDisplayed());
        // Использование child - все дочерние элементы с тэго a от div
        Assert.assertTrue(driver.findElement(By.xpath("//form/child::div")).isDisplayed());
        // Использование child - все дочерние элементы с тэго a от div
        Assert.assertTrue(driver.findElement(By.xpath("//header/descendant::p")).isDisplayed());
        //Использование following - Выбирает всё в документе после закрытия тэга текущего узла
        Assert.assertTrue(driver.findElement(By.xpath
                ("//*[@id='colophon']/following::iframe")).isDisplayed());
        //Использование following-sibling - Выбирает все узлы одного уровня после текущего узла
        Assert.assertTrue(driver.findElement(By.xpath
                ("//*[@id='e-animations-css']/following-sibling::script")).isDisplayed());
        //Использование preceding- Выбирает все узлы, которые появляются перед текущим узлом в документе
        Assert.assertTrue(driver.findElement(By.xpath
                ("//*[@id='global-styles-inline-css']/preceding::link")).isDisplayed());
        //Использование preceding-sibling - Выбирает все узлы одного уровня до текущего узла
        Assert.assertTrue(driver.findElement(By.xpath
                ("//*[@name='robots']/preceding-sibling::link")).isDisplayed());
    }
}
