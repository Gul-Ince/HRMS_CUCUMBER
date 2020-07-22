@login @sprint2
Feature: login

  @smoke
  Scenario: Validating login using valid Admin credentials
    When I enter valid  Admin username and password
    And I click login button
    Then I see Welcome Admin displayed

  @smoke
  Scenario: Validating login using valid ESS credentials
    When I enter valid ESS username and password
    And I click login button
    Then I see Welcome ESS displayed

  @validcredentials
  Scenario Outline: Entering new users
    When I enter valid "<Username>" and "<Password>"
    And I click login button
    Then I see Welcome "<FirstName>" displayed

    Examples: 
      | Username | Password      | FirstName |
      | Admin    | Hum@nhrm123   | Admin     |
      | Gulzuzu    | Nusaybah007! | gulsum255   |

  @invalidCredentials
  Scenario: Login with invalid credentials
    When I enter invalid Userame and Password and I see error message
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Hello    | Syntax123! | Invalid Credentials |

  @regression
  Scenario Outline: Invalid Login and message validation
    When I enter "<Username>" and "<Password>"
    And I click on login button
    Then I see "<ErrorMessage>"
      | UserName | Password   | ErrorMessage             |
      | Admin    | Admin123   | Invalid Credentials      |
      | Admin    |            | Password cannot be empty |
      |          | Syntax@123 | Username cannot be empty |
   #| Admin  | Admin123  | Invalid Credentials |
   #| Hello  | Syntax123! | Invalid Credentials |
