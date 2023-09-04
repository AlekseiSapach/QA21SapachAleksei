package tests.api;

import baseEntities.BaseApiTest;
import com.github.dockerjava.api.model.Endpoint;
import com.google.gson.Gson;
import io.restassured.response.Response;
import models.User;
import org.apache.http.HttpStatus;
import org.openqa.selenium.json.TypeToken;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TestrailApi2 extends BaseApiTest {

    @Test
    public void getAllUsers() {
        User expectedUser = User.builder()
                .name(" Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .role("Lead")
                .build();
        given()
                .when()
                .get(Endpoints.GET_ALL_USERS)
                .then()
                .log().body()
                .body("get(0).name", is(expectedUser.getName()))
                .body("get(0).email", equalTo(expectedUser.getEmail()))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getUser() {
        int userID = 1;
        User expectedUser = User.builder()
                .name(" Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .role("Lead")
                .build();
        User actualUser = given()
                .pathParam("user_id", userID)
                .when()
                .get(Endpoints.GET_USER)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(User.class);
        Assert.assertTrue(expectedUser.equals(actualUser));
    }
    @Test
    public void getUser1() {
        int userID = 1;
        Gson gson = new Gson();
        User expectedUser = User.builder()
                .name(" Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .role("Lead")
                .build();
        Response response = given()
                .pathParam("user_id", userID)

                .get(Endpoints.GET_USER);

        User actualUser = gson.fromJson(response.getBody().asString(), User.class);
        Assert.assertTrue(expectedUser.equals(actualUser));
    }

    @Test
    public void getAllUsers1() {
        Gson gson = new Gson();

        User expectedUser = User.builder()
                .name(" Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .role("Lead")
                .build();

        Response response = given()
                .when()
                .get(Endpoints.GET_ALL_USERS);

        User[] actualUser = gson.fromJson(response.getBody().asString(),User[].class);

        User actualUser = new User();
        for (User user: actualUsers){
            if (user.getId()==1){
                actualUser=user;
            }
        }

        Assert.assertEquals(actualUser,expectedUser);
    }
    @Test
    public void getAllUsers2() {
        Gson gson = new Gson();

        User expectedUser = User.builder()
                .name(" Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .role("Lead")
                .build();

        Response response = given()
                .when()
                .get(Endpoints.GET_ALL_USERS);

        Type listType = new TypeToken<ArrayList<User>>(){}.getType();
        List<User> actualUsersList = gson.fromJson(response.getBody().asString(), listType);

        Assert.assertEquals(actualUsersList.get(0),expectedUser);
    }
}
