package com.hrms.steps;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class employeeAddSteps extends CommonMethods {

	@When("I enter employee details")
	public void i_enter_employee_details(io.cucumber.datatable.DataTable details) {

		Map<String, String> empMap = details.asMaps().get(0);
		addEmp.empFirstname.sendKeys(empMap.get("FirstName"));
		addEmp.empMiddlename.sendKeys(empMap.get("MiddleName"));
		addEmp.empLastname.sendKeys(empMap.get("LastName"));

		// List<Map<String,String>> empMap=details.asMaps();
		// addEmp.empFirstname.sendKeys(empMap.get(0).get("FirstName"));
		// addEmp.empMiddlename.sendKeys(empMap.get(0).get("MiddleName"));
		// addEmp.empLastname.sendKeys(empMap.get(0).get("LastName"));
		// }

	}

	@When("I click on Edit")
	public void i_click_on_Edit() {
		click(pdetails.editSaveBtn);
	}

	@Then("I am able to modify Employee Details")
	public void i_am_able_to_modify_Employee_Details(io.cucumber.datatable.DataTable modifyDetails) {
		List<Map<String, String>> empModifyList = modifyDetails.asMaps();
		for (Map<String, String> map : empModifyList) {

			pdetails.driverLicenceNum.sendKeys(map.get("DriverLicense"));
			sendText(pdetails.licenceExp, map.get("LicenseExpiryDate"));
			wait(2);
			sendText(pdetails.SSN, map.get("SSN"));
			sendText(pdetails.SIN, map.get("SIN"));
			wait(2);
			radioClick(pdetails.genderRadio, map.get("Gender"));
			selectDdValue(pdetails.maritalStatus, map.get("MaritalStatus"));
			selectDdValue(pdetails.nationalityDD, map.get("Nationality"));
			wait(2);
			sendText(pdetails.dateOfBirth, map.get("DateOfBirth"));
			wait(2);
			sendText(pdetails.nickName, map.get("NickName"));
			jsClick(pdetails.smoker);
		//	radioClickElement(pdetails.smoker, map.get("Smoker"));
			wait(2);
			sendText(pdetails.militaryService, map.get("MilitaryService"));
			
            
		}
	}

	@Then("I click on Save button")
	public void i_click_on_Save_button() {
		click(pdetails.editSaveBtn);
		takeScreenshot("Modified");
		
	}

}
