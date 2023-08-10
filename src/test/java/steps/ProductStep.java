package steps;

import baseEntities.BaseStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.YouCardPage;

public class ProductStep extends BaseStep {
    Logger logger = LogManager.getLogger(ProductStep.class);


    public ProductStep(WebDriver driver) {
        super(driver);
    }

    public YouCardPage productSelection() {
        productPage.getProduct();

        logger.info("Info message");
        return youCardPage;
    }
}