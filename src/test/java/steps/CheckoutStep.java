package steps;

import baseEntities.BaseStep;
import pages.OverviewPage;

public class CheckoutStep extends BaseStep {

    public CheckoutStep() {
        super();
    }

    public OverviewPage getInformation(String firstname, String lastname, String zipcode) {
        checkoutPage.getCheck(firstname,lastname,zipcode);

        return overviewPage;
    }
}