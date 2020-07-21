@addEmployee  
Feature: Add Employee
Validation for adding new Employee

 Background: 
  Given I am logged in with valid admin credentials
  And I navigate to Add Employee page

@smoke3
Scenario: Add new Employee
    Given I enter Employee first name and last name
    When I click save button
    Then Employee is added successfully

Scenario: Add Employee without Employee Id
    Given I enter Employee first name and last name
    When I delete Employee Id
    And  I click save button
    Then Employee is added successfully
    
Scenario: Add Employee without Employee Id
    Given I enter Employee first name and last name
    When I click on create login checkbox
    And  I enter login credentials
    And  I click save button
    Then Employee is added successfully

#DDT using Scenerio Outline
@data
Scenario Outline: Adding multiple Employees 
Given I delete Employee Id
When I enter employee "<FirstName>", "<MiddleName>" and "<LastName>"
And I click save button
Then "<FirstName>","<MiddleName>", "<LastName>" is added and  "<Expected>" is displayed

# if you use <> without " it passes as int
  Examples: 
      |FirstName  |MiddleName |LastName |Expected|
      |Nusaybah12 |     Z | Niazi12 |Nusaybah12 Z Niazi12|
      | Sara12 |     N | Niazi12    |Sara12 N Niazi12|
      | Zuhaira12|     M | Niazi12    |Zuhaira12 M Niazi12|
      

#adding multiple employees using Cucumbr DataTable
#@dataTable
#Scenario: Adding multiple employess
#When I enter employee details and click on save
#store this is the list using list add
# |Senel|S||Duman|
#  |Selma|S||Karapicak|
#  |Reyhan|R||Barindik|
# Then employee is addedd successfully 




Scenario: Add and Modify Employee Details
When I enter employee details


   | FirstName | MiddleName  | LastName    |
   | Amir  | M  | Khan |


And I click save button
And I click on Edit
Then I am able to modify Employee Details
| DriverLicense|LicenseExpiryDate|SSN |SIN|Gender|MaritalStatus|Nationality|DateOfBirth|NickName|Smoker|MilitaryService|
| A9820383748|2022-Jan-12| 222-22-3456   |72830554|Female|Married|British|1981-Jan-17|gul|Smoker|No|





