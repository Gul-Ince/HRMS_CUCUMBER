@errorMessage  @sprint1
Feature: errorMessage

Background:
Given I navigate to HRM website


@smoke3
Scenario: Error message Validation with invalid password and valid username

    When I enter valid username and invalid password
    And  I click login button
    Then I see "Invalid credentials" error message displayed
    
@smoke3    
Scenario: Error message Validation with empty password and valid username
    
    When I enter valid username and leave password empty
    And  I click login button
    Then I see "Password cannot be empty" error message displayed
    
@smoke3    
Scenario: Error message Validation with empty username and valid password
  
    When I leave username empty and enter valid password
    And  I click login button
    Then I see "Username cannot be empty" error message displayed