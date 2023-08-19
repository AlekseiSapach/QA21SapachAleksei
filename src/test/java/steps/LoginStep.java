package steps;

import baseEntities.BaseStep;
import pages.ProductPage;

public class LoginStep extends BaseStep {

    public LoginStep() {
        super();
    }

    public ProductPage successLogin(String username, String psw) {
        loginPage.login(username, psw);

        return productPage;
    }
}