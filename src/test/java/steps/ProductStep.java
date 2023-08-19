package steps;

import baseEntities.BaseStep;
import pages.YouCardPage;

public class ProductStep extends BaseStep {

    public ProductStep() {
        super();
    }

    public YouCardPage productSelection() {
        productPage.getProduct();

        return youCardPage;
    }
}