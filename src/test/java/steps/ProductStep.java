package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.YouCardPage;

public class ProductStep extends BaseStep {

    public ProductStep(WebDriver driver) {
        super(driver);
    }

    public YouCardPage productSelection() {
        productPage.getProduct();

        return youCardPage;
    }
}