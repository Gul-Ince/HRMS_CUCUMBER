Feature: Sauce Demo Login


#always good to have the user story number

#Description: US-3421 The purpose of this feature file is to automate 
  #           sauce demo app login feature with valid and invalid credentials

#Acceptance Criteria: I want to automate sauce demo login functionality 
#you can also place the acceptance criteria here

Scenario: invalid login

Given user is on login page
When user enter invalid username
And user enter invalid password
And click on login button
Then user should see the error message

Scenario: invalid login

Given user is on login page
When user enter invalid username as"admin"
And user enter invalid password "admin@123"
And click on login button
Then user should see the error message

Scenario: invalid login
Given user is on login page
When user validates below paragrapgh 
"""
Each day has a promise to brigten up the day
but first you must allow the sun to come your way
"""
And user enter invalid password 
And click on login button
Then user should see the error message
