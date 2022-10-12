Feature: This is a account addition feature

  @AddAcc
  Scenario: Manager should be able to add new account
    Given Open application in browser
    And Enter 'mngr446201','esudana' and click on login
    And Login should be successful
    When Click on New Account
    And Fill form and click on submit
    Then New account should be added
    And Click on Logout and manager should be logged out

  @DeleteAcc
  Scenario: Manager should be able to delete account
    Given Open application in browser
    And Enter 'mngr446201','esudana' and click on login
    And Login should be successful
    When Click on delete Account
    And Enter account no and click on submit
    And click on Ok
    Then Account should get deleted
#    And Click on Logout and manager should be logged out