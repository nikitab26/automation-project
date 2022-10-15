Feature: This is a login feature

  @Login
  Scenario: Manager should be able to login with valid credentials
    Given Open application in browser
    When Enter 'mngr446201','esudana' and click on login
    Then Login should be successful

  @T92
  Scenario: Manager should not be able to login with invalid credentials
    Given Open application in browser
    When Enter '','esudana'
    Then Error message should be shown


  @T93
  Scenario: Manager should not be able to login with invalid credentials
    Given Open application in browser
    When Enter 'mngr446201',''
    Then Error message should be shown