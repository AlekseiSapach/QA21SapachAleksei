package baseEntities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.BeforeTest;
import utils.configuration.ReadProperties;

import static io.restassured.RestAssured.given;

public class BaseApiTest {
    @BeforeTest
    public void setupApi(){
        RestAssured.baseURI = ReadProperties.getUrl();
        RestAssured.requestSpecification = given()
                .auth().preemptive().basic(ReadProperties.username(),ReadProperties.password())
                .header(HTTP.CONTENT_TYPE, ContentType.JSON);


    }
}
