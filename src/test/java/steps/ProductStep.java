package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.YouCardPage;

public class ProductStep extends BaseStep {

    public ProductStep(WebDriver driver) {
        super(driver);
    }

    @Step
    public YouCardPage productSelection() {
        productPage.getProduct();

        return youCardPage;
    }
}