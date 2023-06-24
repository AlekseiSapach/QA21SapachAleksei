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
    @DataProvider(name = "Data for Div Int")
    public static Object[][] dataForDivInt(){
        return new Object[][]{
                {10,2,5},
                {15,6,2},
                {-8,2,-4},
                {-10,-2,5},
                {0,8,0},
        };
    }
    @DataProvider(name = "Data for Div Int Zero")
    public static Object[][] dataForDivIntZero() {
        return new Object[][]{
                {10, 0, ArithmeticException.class},
                {0,0,ArithmeticException.class}
        };
    }
    @DataProvider(name = "Data for Div Double")
    public static Object[][] dataForDivDouble(){
        return new Object[][]{
                {10.5,3.5,3.0},
                {8.4,16.8,0.5},
                {-22.5,4.5,-5.0},
                {-8.4,-16.8,0.5},
                {0,2.5,0}
        };
    }
    @DataProvider(name = "Data for Div Double Zero")
    public static Object[][] dataForDivDoubleZero(){
        return new Object[][]{
                {0d,0,Double.NaN},
                {1.2d,0,Double.POSITIVE_INFINITY},
                {-1.2d,0,Double.NEGATIVE_INFINITY}
        };
    }
}
