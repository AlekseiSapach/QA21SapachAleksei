package tests.api;

import adapters.ProjectAdapter;
import baseEntities.BaseApiTest;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Milestone;
import models.Project;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class TestApiMilestone extends BaseApiTest {
    @Test
    public void addMilestone(){
        int projectId = 1;
        Milestone expectedMilestone = Milestone.builder()
                .milestoneName("TestMilestone 23")
                .milestoneDesc("This is a Milestone")
                .build();
        Response response = given()
                .body(expectedMilestone, ObjectMapperType.GSON)
                .pathParam("project_id",projectId)
                .when()
                .post(Endpoints.ADD_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("name",is(expectedMilestone.getMilestoneName()))
                .extract()
                .response();
    }
    @Test
    public void getMilestone(){
        int projectId = 1;
        Response response = given()
                .pathParam("project_id",projectId)
                .when()
                .get(Endpoints.GET_MILESTONES)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();
    }
    @Test
    public void updateMilestone(){
        int milestoneId = 47;
        Milestone expectedMilestone = Milestone.builder()
                .milestoneName("TestMilestone")
                .milestoneDesc("This is a Milestone Test")
                .build();
        Response response = given()
                .body(expectedMilestone, ObjectMapperType.GSON)
                .pathParam("milestone_id",milestoneId)
                .when()
                .post(Endpoints.UPDATE_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("description",is(expectedMilestone.getMilestoneDesc()))
                .extract()
                .response();
    }
    @Test
    public void deleteMilestone(){
        int milestoneId = 48;
        given()
                .pathParam("milestone_id",milestoneId)
                .when()
                .post(Endpoints.DELETE_MILESTONE)
                .then()
                .statusCode(HttpStatus.SC_OK);

    }
}
