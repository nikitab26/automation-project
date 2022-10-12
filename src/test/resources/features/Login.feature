Feature: This is a login feature

@Login
  Scenario: Manager should be able to login with valid credentials
    Given Open application in browser
    When Enter 'mngr446201','esudana' and click on login
    Then Login should be successful