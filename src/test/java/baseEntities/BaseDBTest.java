package baseEntities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import services.DataBaseService;

public class BaseDBTest {
    protected DataBaseService dataBaseService;

    @BeforeTest
    public void setupConnected(){
        dataBaseService = new DataBaseService();
    }

    @AfterTest
    public void close(){
        dataBaseService.closeConnected();
    }
}
