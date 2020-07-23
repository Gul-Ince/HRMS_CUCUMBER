$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Dashboard.feature");
formatter.feature({
  "name": "Dashboard",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Dashboard menu view for admin",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see dashboard menu is displayed",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.DashboardSteps.user_see_dashboard_menu_is_displayed(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Dashboard menu view for admin");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sprint2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Entering new users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I enter valid \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "name": "I see Welcome \"\u003cFirstName\u003e\" displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "FirstName"
      ]
    },
    {
      "cells": [
        "Admin",
        "Hum@nhrm123",
        "Admin"
      ]
    },
    {
      "cells": [
        "Gulzuzu",
        "Nusaybah007!",
        "gulsum255"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Entering new users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sprint2"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"Admin\" and \"Hum@nhrm123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_enter_valid_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.ErrorMessageSteps.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see Welcome \"Admin\" displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_see_Welcome_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Entering new users");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Entering new users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sprint2"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"Gulzuzu\" and \"Nusaybah007!\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_enter_valid_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.ErrorMessageSteps.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see Welcome \"gulsum255\" displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_see_Welcome_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "Entering new users");
formatter.after({
  "status": "passed"
});
});