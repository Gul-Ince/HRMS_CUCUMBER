$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
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
formatter.scenario({
  "name": "Validating login using valid Admin credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sprint2"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid  Admin username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_enter_valid_Admin_username_and_password()"
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
  "name": "I see Welcome Admin displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_see_Welcome_Admin_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Validating login using valid Admin credentials");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating login using valid ESS credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sprint2"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid ESS username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_enter_valid_ESS_username_and_password()"
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
  "name": "I see Welcome ESS displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_see_Welcome_ESS_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Validating login using valid ESS credentials");
formatter.after({
  "status": "passed"
});
});