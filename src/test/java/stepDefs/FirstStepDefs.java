package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.testng.Assert;
import java.util.Map;

public class FirstStepDefs {
    @Given("открыт браузер")
    public void startBrowser() {
    }

    @When("страница логина открыта")
    public void openLoginPage() {
    }

    @Then("поле username отображается")
    public void isUsernameFieldDisplayed() {
        Assert.assertTrue(true);
    }

    @And("поле password отображается")
    public void isPasswordFieldDisplayed() {
        Assert.assertTrue(true);
    }

    @But("поле password не отображается")
    public void isPasswordFieldNotDisplayed () {
        Assert.assertTrue(true);
    }

    @When("user {string} when password {string} logged in")
    public void userWhenPasswordLoggedIn(String username, String password) {
        System.out.println("Username: "+ username);
        System.out.println("Password: "+ password);
    }

    @When("user logged in")
    public void usersLoggedIn(DataTable parameters) {
        Map<String, String> expectedValue = parameters.asMap(String.class, String.class);
        System.out.println("Username: "+ expectedValue.get("username"));
        System.out.println("Password: "+ expectedValue.get("password"));
    }

    @When("^admin \"([^\"]*)\" when password \"([^\"]*)\" logged in$")
    public void adminWhenPasswordLoggedIn(String username, String password) {
        System.out.println("Username: "+ username);
        System.out.println("Password: "+ password);
    }

    @Then("title is {string}")
    public void titleIsAllProjects(String value) {
        System.out.println("Title: "+ value);
    }

    @And("^project id is (\\d+)$")
    public void projectIdIs(int value) {
        System.out.println("Id: "+ value);
    }

    @Then("error is displayed")
    public void errorIsDisplayed() {
        System.out.println("Ошибка");
    }
}
