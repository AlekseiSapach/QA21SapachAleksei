Feature: End2End Test

  Scenario: Success Login
    Given open login page
    When user enter username standard_user and password secret_sauce
    * user clicks login button
    Then product page is displayed
    * user click add to cart button
    * user click shopping cart button
    Then you card page is displayed
    * user click checkout button
    Then checkout page is displayed
    When enter user data firstname Sapach, lastname Aleksei  and zipcode 1992
    * user click continue button
    Then overview page is displayed
    * user click finish button
    Then message Thank you for your order! is displayed
