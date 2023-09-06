package tests.dbTest;

import baseEntities.BaseDBTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import services.DataBaseService;

import java.sql.ResultSet;
import java.sql.SQLException;

public class sqlTest extends BaseDBTest {
    static Logger logger = LogManager.getLogger(sqlTest.class);
    @Test
    public void firstDbTest(){
        ResultSet rs = dataBaseService.executeQuery("SELECT * FROM public.\"Users\"\n" +
                "ORDER BY id ASC");
        try{
            while (rs.next()){
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");
                int age = rs.getInt("age");

                logger.info("id " + id);
                logger.info("firstname " + firstname);
                logger.info("lastname " + lastname);
                logger.info("email " + email);
                logger.info("age " + age);
            }
        }catch (SQLException sqlException){
            logger.error(sqlException.getMessage());
        }
        logger.info("Test is completed");
    }
}
