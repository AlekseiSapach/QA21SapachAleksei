import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkTest extends BaseTest
{
    @Test (testName = "Целочисленное деление",groups = "integer Value",
            dataProvider = "Data for Div Int", dataProviderClass = StaticProvider.class)
    public void testDivInt(int a, int b, int expectedValue)
    {
        Assert.assertEquals(calculator.divInt(a,b),expectedValue,"Значения не одинаковые");
    }
    @Test (testName = "Деление на ноль целого числа",groups = {"integer Value","division byZero"}, dataProvider = "Data for Div Int Zero",
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

}
