import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends BaseTest {

    @Test
    public void sumTest_1()
    {
        int expectedValue = 5;
        int actualValue = calculator.sum(2,3);

        Assert.assertEquals(actualValue,expectedValue,"Значения не одинаковые");
    }
    @Test(enabled = false)
    public void sumTest_2()
    {
        int expectedValue = 5;
        int actualValue = calculator.sum(2,3);

        Assert.assertEquals(actualValue,expectedValue,"Значения не одинаковые");
    }


}
