package steps;

import baseEntities.BaseStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.ProductPage;

public class LoginStep extends BaseStep {
    Logger logger = LogManager.getLogger(LoginStep.class);

    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public ProductPage successLogin(String username, String psw) {
        loginPage.login(username, psw);

        logger.info(username);
        logger.info(psw);
        return productPage;
    }
}