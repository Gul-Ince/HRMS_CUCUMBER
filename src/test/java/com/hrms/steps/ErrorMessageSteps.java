package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ErrorMessageSteps extends CommonMethods {

	@Given("I navigate to HRM website")
	public void i_navigate_to_HRM_website() {
		setUp();
	}

	@When("I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Humanhrm123");
	}

	@When("I click login button")
	public void i_click_login_button() {
		jsClick(login.loginBtn);
	}

	@Then("I see {string} error message displayed")
	public void i_see_error_message_displayed(String string) {

		Assert.assertEquals(login.errorMsg.getText(), string);
        takeScreenshot("ErrorMessage");
	}

	@When("I enter valid username and leave password empty")
	public void i_enter_valid_username_and_leave_password_empty() {
		sendText(login.username, "Admin");
		sendText(login.password, "");
	}

	@When("I leave username empty and enter valid password")
	public void i_leave_username_empty_and_enter_valid_password() {
		sendText(login.username, "");
		sendText(login.password, "Hum@n123");
	}

}
