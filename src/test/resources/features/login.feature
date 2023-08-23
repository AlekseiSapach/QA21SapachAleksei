Feature: Validation login functionality

  @gui
  @smoke
  Scenario: Success Login
    Given open login page
    When user enter username standard_user and password secret_sauce
    * user clicks login button
    Then dashboard page is displayed

  @gui
  @negative
  Scenario: Incorrect Login  (invalid username)
    Given open login page
    When user enter username standard_user1 and password secret_sauce
    * user clicks login button
    Then error login Epic sadface: Username and password do not match any user in this service is displayed
  @gui
  @negative
  Scenario: Incorrect password  (invalid password)
    Given open login page
    When user enter username standard_user and password secret_sauce1
    * user clicks login button
    Then error password Epic sadface: Username and password do not match any user in this service is displayed