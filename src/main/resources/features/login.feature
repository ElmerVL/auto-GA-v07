Feature: Validation of the login page
  Scenario: Load PHP travels page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'PRINT' button on 'admin management' page