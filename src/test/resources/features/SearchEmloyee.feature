
@sprint2
Feature: Search

 Background:
  Given user is navigated to HRMS
  And user is logged with valid admin credentials
  And user navigates to the employee list page
 
 @smoke2
  Scenario: Search employee by id
  When user enters valid employee id
  And  user clicks on search button
  Then user is able to see employee id is displayed
  
 @smoke2
  Scenario: Search employee by name
  When user enters valid employee name
  And user clicks on search button
  Then user is able to see employee name is displayed