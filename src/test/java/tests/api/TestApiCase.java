package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Case;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class TestApiCase extends BaseApiTest {
    @Test
    public void addCase(){
        int sectionId = 15;
        Gson gson = new Gson();
        Case expectedCase = Case.builder()
                .titleCase("TestCase88")
                .templateId(1)
                .typeId(7)
                .priorityId(2)
                .sectionId(15)
                .build();
        Response response = given()
                .body(expectedCase, ObjectMapperType.GSON)
                .pathParam("section_id",sectionId)
                .post(Endpoints.ADD_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();
        Case actualCase = gson.fromJson(response.getBody().asString(), Case.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(expectedCase.equals(actualCase));
    }
    @Test
    public void getCase(){
        int caseId = 9;
        Gson gson = new Gson();
        Case expectedCase = Case.builder()
                .titleCase("TestCase2")
                .templateId(1)
                .typeId(7)
                .priorityId(2)
                .sectionId(7)
                .build();
        Response response = given()
                .body(expectedCase, ObjectMapperType.GSON)
                .pathParam("case_id",caseId)
                .get(Endpoints.GET_CASE);
        Case actualCase = gson.fromJson(response.getBody().asString(), Case.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(expectedCase.equals(actualCase));
    }
    @Test
    public void updateCase(){
        int caseId = 9;
        Gson gson = new Gson();
        Case expectedCase = Case.builder()
                .titleCase("TestCase234")
                .templateId(1)
                .typeId(7)
                .priorityId(2)
                .sectionId(7)
                .build();
        Response response = given()
                .body(expectedCase, ObjectMapperType.GSON)
                .pathParam("case_id",caseId)
                .post(Endpoints.UPDATE_CASE);
        Case actualCase = gson.fromJson(response.getBody().asString(), Case.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(expectedCase.equals(actualCase));
    }
    @Test
    public void deleteCase(){
        int caseId = 6;
        given()
                .pathParam("case_ad",caseId)
                .when()
                .post(Endpoints.DELETE_CASE)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
