import org.testng.annotations.*;

public class BaseTest {
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass....");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest....");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod....");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite....");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("BeforeGroups....");
    }@AfterClass
    public void afterClass(){
        System.out.println("AfterClass....");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest....");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod....");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite....");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("AfterGroups....");
    }

}
