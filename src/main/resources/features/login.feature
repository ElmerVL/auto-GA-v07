Feature: Validation of the login page
  # Elmer Valencia Ledezma
  # 1
  Scenario: Validate 'PRINT' button in the 'ADMINS MANAGEMENT' page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'PRINT' button on 'admin management' page
  # 2
  Scenario: Validate 'EXPORT INTO CSV' button in the 'ADMINS MANAGEMENT' page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'EXPORT INTO CSV' button on 'admin management' page
  # 3
  Scenario: Validate 'CHECK ALL' checkbox to select all admins
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'Check All' checkbox on header list
  # 4
  Scenario: Validate 'DESC' and 'ASC' order option when select the 'First Name' column
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'First Name' column on header list to 'desc' order
    And Click 'First Name' column on header list to 'asc' order

  #Scenario: Validate "Login" label in the LOGIN page
    #Given I Load PHP Travels
    #And fill "test@test.com" email field on 'Login' page
    #And fill "test@test.com" password field on 'Login' page
    #Then verify the "Login" label button is displayed on 'Login' page
