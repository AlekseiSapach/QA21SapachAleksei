import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeWorkTest extends BaseTest
{
    @Test (testName = "Целочисленное деление",groups = "integer Value",
            dataProvider = "Data for Div Int", dataProviderClass = StaticProvider.class)
    public void testDivInt(int a, int b, int expectedValue)
    {
        Assert.assertEquals(calculator.divInt(a,b),expectedValue,"Значения не одинаковые");
    }
    @Test (testName = "Деление на ноль целого числа",groups = {"integer Value","division byZero"},
            dataProvider = "Data for Div Int Zero",
            dataProviderClass = StaticProvider.class, expectedExceptions = ArithmeticException.class)
    public void testDivIntZero(int a, int b, Object expectedValue)
    {
        Assert.assertEquals(calculator.divInt(a,b),expectedValue,"Значения не одинаковые");
    }

    @Test (testName = "Деление с остатком",groups = "decimal Value",
            dataProvider = "Data for Div Double", dataProviderClass = StaticProvider.class)
    public void testDivDouble(double a, double b, double expectedValue)
    {
        Assert.assertEquals(calculator.divInt(a,b),expectedValue,"Значения не одинаковые");
    }
    @Test (testName = "Деление с остатком на ноль",groups = {"decimal Value","division byZero"},
            dataProvider = "Data for Div Double Zero", dataProviderClass = StaticProvider.class)
    public void testDivDoubleZero(double a, double b, double expectedValue)
    {
        Assert.assertEquals(calculator.divInt(a,b),expectedValue,"Значения не одинаковые");
    }
    @Test (enabled = false,description = "скопированный тест, который не будет запускаться",
            dataProvider = "Data for Div Int", dataProviderClass = StaticProvider.class)
    public void testDivIntCopy(int a, int b, int expectedValue)
    {
        Assert.assertEquals(calculator.divInt(a,b),expectedValue,"Значения не одинаковые");
    }
    @Test (priority = 1,description = "Тест с приоритетом", timeOut = 1000,
            dataProvider = "Data for Div Int Zero",
            dataProviderClass = StaticProvider.class, expectedExceptions = ArithmeticException.class)
    public void testDivIntZeroCopy (int a, int b, Object expectedValue)
    {
        Assert.assertEquals(calculator.divInt(a,b),expectedValue,"Значения не одинаковые");
    }
    @Test (invocationCount = 2, invocationTimeOut = 500, threadPoolSize = 2,
            dataProvider = "Data for Div Double", dataProviderClass = StaticProvider.class)
    public void testDivDoubleCopy(double a, double b, double expectedValue)
    {
        Assert.assertEquals(calculator.divInt(a,b),expectedValue,"Значения не одинаковые");
    }
    @Test (priority = 2,dependsOnMethods ="testDivDoubleZero",
            dataProvider = "Data for Div Double Zero", dataProviderClass = StaticProvider.class)
    public void testDivDoubleZeroCopy(double a, double b, double expectedValue)
    {
        Assert.assertEquals(calculator.divInt(a,b),expectedValue,"Значения не одинаковые");
    }
    @Parameters({"value1","value2"})
    @Test
    public void testParamDiv(@Optional("10") int argument1, @Optional("2") int argument2)
    {
        int expectedValue = 5;
        Assert.assertEquals(calculator.divInt(argument1,argument2),expectedValue,"Значения не одинаковые");
    }
    private int expectedValue = 1;
    @Test(retryAnalyzer = Retry.class, dataProvider = "Data for Div test",
            dataProviderClass = StaticProvider.class)
    public void testRetryDiv(int a, int b)
    {
        int actualValue = calculator.divInt(a,b);
        if(actualValue==expectedValue)
        {
            System.out.println("Значения равны");
            Assert.assertTrue(true);
        }
        else
        {
            expectedValue++;
            System.out.println("Значения не равны");
            throw new NullPointerException();
        }
    }

}
