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
    Then error username
  @gui
  @negative
  Scenario: Incorrect Login  (invalid password)
    Given open login page
    When user enter username standard_user and password secret_sauce1
    * user clicks login button
    Then error password