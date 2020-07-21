@addEmployee
Feature: Add Employee
  Validation for adding new Employee

  Background: 
    Given I am logged in with valid admin credentials
    And I navigate to Add Employee page

  @commandsmoke
  Scenario: Add and Modify Employee Details
    When I enter employee details
      | FirstName | MiddleName | LastName |
      | Ameer     | M          | Khan     |
    And I click save button
    And I click on Edit
    Then I am able to modify Employee Details
      | DriverLicense | LicenseExpiryDate | SSN         | SIN      | Gender | MaritalStatus | Nationality | DateOfBirth | NickName|Smoker | MilitaryService |
      | A9820383748   | 2026-Jun-12       | 222-22-3456 | 72830554 | Male   | Married       | British     | 2000-Jun-27 | gul      |Smoker| AirForce        |
    And I click on Save button
