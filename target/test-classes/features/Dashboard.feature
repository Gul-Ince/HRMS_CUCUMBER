#Author: your.email@your.domain.com
Feature: Dashboard


@regression
  Scenario: Dashboard menu view for admin
    When user is logged with valid admin credentials
    Then user see dashboard menu is displayed
      | Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |