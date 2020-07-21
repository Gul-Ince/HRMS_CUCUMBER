package com.hrms.steps;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLoginSteps extends CommonMethods {

@Given("user is on login page")
public void user_is_on_login_page() {
    BaseClass.driver.get(ConfigsReader.getProperty("url"));
}

@When("user enter invalid username")
public void user_enter_invalid_username() {
   
    sendText(sauceLogin.userName, "Admin");
}

@When("user enter invalid password")
public void user_enter_invalid_password() {
   
	 
}

@When("click on login button")
public void click_on_login_button() {
    click(sauceLogin.LoginBTN);
}

@Then("user should see the error message")
public void user_should_see_the_error_message() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@When("user enter invalid username as\"admin\"")
public void user_enter_invalid_username_as_admin() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter invalid password {string}")
public void user_enter_invalid_password(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user validates below paragrapgh")
public void user_validates_below_paragrapgh(String docString) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
