package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@When("I enter valid  Admin username and password")
	public void i_enter_valid_Admin_username_and_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
	}

	@Then("I see Welcome Admin displayed")
	public void i_see_Welcome_Admin_displayed() {
		String expected = "Welcome Admin";
		Assert.assertEquals(expected, dashboard.welcome.getText());
		takeScreenshot("Welcome Admin");
	}

	@When("I enter valid ESS username and password")
	public void i_enter_valid_ESS_username_and_password() {
		sendText(login.username, "Gulzuzu");
		sendText(login.password, "Nusaybah007!");
	}

	@Then("I see Welcome ESS displayed")
	public void i_see_Welcome_ESS_displayed() {
		String expected = "Welcome gulsum255";
		Assert.assertEquals(expected, dashboard.welcome.getText());
		takeScreenshot("Welcome Gulsum");
	}

	@When("I enter valid {string} and {string}")
	public void i_enter_valid_and(String userName, String passWord) {
		sendText(login.username, userName);
		sendText(login.password, passWord);

	}

	@Then("I see Welcome {string} displayed")
	public void i_see_Welcome_displayed(String string) {
		String expected = "Welcome " + string;
		Assert.assertEquals(expected, dashboard.welcome.getText());
	}

	@Then("{string} is successfully logged in")
	public void is_successfully_logged_in(String string) {
        wait(2);
		Assert.assertEquals(string, dashboard.welcome.getText());

	}

	@When("I enter invalid Userame and Password and I see error message")
	public void i_enter_invalid_Userame_and_Password_and_I_see_error_message(
			io.cucumber.datatable.DataTable invalidCredentials) {
		List<Map<String, String>> maps = invalidCredentials.asMaps();

		for (Map<String, String> map : maps) {

			sendText(login.username, map.get("UserName"));
			sendText(login.password, map.get("Password"));
			click(login.loginBtn);

			String expected = map.get("ErrorMessage");
			Assert.assertEquals(expected, login.errorMsg.getText());
			takeScreenshot("invalid credentials");
		}

	}

	// with list

//	@When("I enter invalid Userame and Password and I see error message")
//	public void i_enter_invalid_Userame_and_Password_and_I_see_error_message(io.cucumber.datatable.DataTable invalidCredentials) {
//	List<List<String>> lists= invalidCredentials.asLists();
//	 for (List<String> list:lists) {

//		 sendText(login.username,list.get(0));
//		   sendText(login.password,list.get(1));
//		   click(login.loginBtn);
//		   String expected=list.get(2);
//         Assert.assertEquals(expected, login.errorMsg.getText());
//		   takeScreenshot("invalid credentials");

//	 }

}
