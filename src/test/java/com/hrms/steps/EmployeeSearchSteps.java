package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods {

	
	@Given("user is navigated to HRMS")
	public void user_is_navigated_to_HRMS() {
		setUp();
	}

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		login.login();
	}
	
	@Given("user navigates to the employee list page")
	public void user_navigates_to_the_employee_list_page() {
		dashboard.navigateToEmpList();
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
		sendText(viewEmp.empID, "10079");
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		click(viewEmp.searchBtn);
		
	}

	@Then("user is able to see employee id is displayed")
	public void user_is_able_to_see_employee_id_is_displayed() {
		String expected = "10079";
		String actual = viewEmp.idResultTable.getText();
		Assert.assertEquals(actual, expected);
		takeScreenshot("EmployeeIdDisplayed");
	}

	@When("user enters valid employee name")
	public void user_enters_valid_employee_name() {
		// jsClick(viewEmp.empName);
		wait(3);
		sendText(viewEmp.empName, "Gulsum");

	}

	@Then("user is able to see employee name is displayed")
	public void user_is_able_to_see_employee_name__is_displayed() {
		String expected = "Gulsum";
		String actual = viewEmp.nameResultTable.getText();
		Assert.assertEquals(actual, expected);
		takeScreenshot("EmployeeNameDisplayed");
	}

}
