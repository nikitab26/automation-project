Feature: This is a customer addition feature

  @AddCust
  Scenario: Manager should be able to add new customer
    Given Open application in browser
    And Enter 'mngr446201','esudana' and click on login
    And Login should be successful
    When Click on New Customer
    And Fill customer details and click on submit
    Then New customer should be added

  @EditCust
  Scenario: Manager should be able to edit existing customer
    Given Open application in browser
    And Enter 'mngr446201','esudana' and click on login
    And Login should be successful
    When Click on Edit Customer and enter customer ID
    And Edit customer details and click on submit
    Then Customer details should get edited

  @DeleteCust
  Scenario: Manager should be able to delete existing customer
    Given Open application in browser
    And Enter 'mngr446201','esudana' and click on login
    And Login should be successful
    When Click on delete Customer and enter customer ID
    And Click on Ok
    Then Customer should get deleted




