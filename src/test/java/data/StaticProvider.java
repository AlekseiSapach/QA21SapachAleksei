package data;

import org.testng.annotations.DataProvider;

public class StaticProvider {

    @DataProvider(name = "Data for Sum test")
    public static Object[][] dataForSumTest(){
        return new Object[][]{
                {-2,-3,-5},
                {0,0,0},
                {2,3,5}
        };
    }
}
