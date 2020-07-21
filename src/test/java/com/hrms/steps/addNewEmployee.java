package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addNewEmployee extends CommonMethods {

	@Given("I am logged in with valid admin credentials")
	public void i_am_logged_in_with_valid_admin_credentials() {
		login.login();
	}

	@Given("I navigate to Add Employee page")
	public void i_navigate_to_Add_Employee_page() {
		dashboard.navigateToAddEmployee();
	}

	@Given("I enter Employee first name and last name")
	public void i_enter_Employee_first_name_and_last_name() {
		addEmp.employeeDetails("Jose", "Mourinho");
	}

	@When("I click save button")
	public void i_click_save_button() {
		wait(2);
		addEmp.save.click();
		takeScreenshot("Employee Added Successfully");
	}

	@Then("Employee is added successfully")
	public void employee_is_added_successfully() {
		String expected = "Jose Mourinho";
		Assert.assertEquals(expected, addEmp.verifyEmp.getText());
	}

	@When("I delete Employee Id")
	public void i_delete_Employee_Id() {
		wait(2);
		addEmp.empId.clear();
		// addEmp.empId.sendKeys(Keys.DELETE);
		wait(2);

	}

	@When("I click on create login checkbox")
	public void i_click_on_create_login_checkbox() {
		addEmp.chkLoginDetails.click();
	}

	@When("I enter login credentials")
	public void i_enter_login_credentials() {
		addEmp.CreateLogin("JoseSyntax2234!", "HumanHrm2234!");
	}

	@When("I enter employee {string}, {string} and {string}")
	public void i_enter_employee_and(String fName, String mName, String lName) {
		sendText(addEmp.empFirstname, fName);
		sendText(addEmp.empMiddlename, mName);
		sendText(addEmp.empLastname, lName);
	}

	@Then("{string},{string}, {string} is added and  {string} is displayed")
	public void is_added_and_is_displayed(String string, String string2, String string3, String string4) {

		Assert.assertEquals(string4, addEmp.verifyEmp.getText());
	}

}
	

	

	
