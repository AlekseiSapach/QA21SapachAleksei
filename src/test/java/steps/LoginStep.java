package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class LoginStep extends BaseStep {

    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public DashboardPage successLogin(String username, String psw) {
        loginPage.login(username, psw);

        return dashboardPage;
    }

}
