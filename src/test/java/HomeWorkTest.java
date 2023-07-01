import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkTest {
    protected WebDriver driver;
    @BeforeMethod
    public  void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }
    @Test
    public void calculatorFloorHeatingTest() throws InterruptedException {

        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");

        WebElement selectWebElement = driver.findElement(By.id("room_type"));
        Select selectRoom = new Select(selectWebElement);
        WebElement selectWebElement1 = driver.findElement(By.id("heating_type"));
        Select selectType = new Select(selectWebElement1);

        WebElement widthInput = driver.findElement(By.id("el_f_width"));
        WebElement lengthInput = driver.findElement(By.id("el_f_lenght"));
        WebElement calcButton = driver.findElement(By.name("button"));
        WebElement heatlossInput = driver.findElement(By.id("el_f_losses"));

        widthInput.sendKeys("5");
        lengthInput.sendKeys("3");
        selectRoom.selectByValue("3");
        selectType.selectByValue("3");
        heatlossInput.sendKeys("140");

        calcButton.click();
        Thread.sleep(2000);

        Assert.assertEquals(driver.findElement(By.id("floor_cable_power")).getAttribute("value"),"78");
        Assert.assertEquals(driver.findElement(By.id("spec_floor_cable_power")).getAttribute("value"),"5");

    }
    //Дополнительное задание: Попробовал сделать, но не получилось инициализироввать чек-бокс, в окне
    // после запуска тест падает именно на чек-боксе
    //Ну и конечно же само подтверждение, что не робот - выбор нужных картинок)
    /*@Test
    public void calculatorLaminateTest() throws InterruptedException {

        driver.get("https://calc.by/building-calculators/laminate.html");

        WebElement selectWebElement = driver.findElement(By.id("laying_method_laminate"));
        Select selectLaminate = new Select(selectWebElement);

        WebElement lengthInput = driver.findElement(By.id("ln_room_id"));
        WebElement widthInput = driver.findElement(By.id("wd_room_id"));
        WebElement lnLamIdInput = driver.findElement(By.id("ln_lam_id"));
        WebElement wdLamIdInput = driver.findElement(By.id("wd_lam_id"));
        WebElement radioButton = driver.findElement(By.id("direction-laminate-id1"));
        WebElement calcButton = driver.findElement(By.className("calc-btn"));

        lengthInput.clear();
        lengthInput.sendKeys("500");
        widthInput.clear();
        widthInput.sendKeys("400");
        lnLamIdInput.clear();
        lnLamIdInput.sendKeys("2000");
        wdLamIdInput.clear();
        wdLamIdInput.sendKeys("200");
        selectLaminate.selectByValue("2");
        radioButton.click();
        calcButton.click();

        WebElement nameInput = driver.findElement(By.id("name_input"));
        WebElement emailInput = driver.findElement(By.id("email_input"));
        WebElement commentInput = driver.findElement(By.id("comment"));
        WebElement checkButton = driver.findElement(By.id("recaptcha-anchor"));
        WebElement orderBtn = driver.findElement(By.id("order_btn"));

        nameInput.sendKeys("Aleks");
        emailInput.sendKeys("test@gmail.com");
        commentInput.sendKeys("Test calculator");
        checkButton.click();
        orderBtn.click();
        Thread.sleep(2000);

        Assert.assertEquals(driver.findElement(By.xpath
                ("//*[@id=\"t3-content\"]/div[3]/article/section/div[2]/div[3]/div[2]/div[1]/span")),
                "53");
        Assert.assertEquals(driver.findElement(By.xpath
                ("//*[@id=\"t3-content\"]/div[3]/article/section/div[2]/div[3]/div[2]/div[2]/span")),
                "7");
    }*/

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
