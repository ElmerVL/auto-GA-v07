Feature: Validation of the login page
  Scenario: Load PHP travels page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    #And Click 'Cars' link on 'Left Panel' Page

    And fill "test@test.com" email field on 'Login' page
    And fill "test@test.com" password field on 'Login' page
    Then verify the "Login" label button is displayed on 'Login' page
