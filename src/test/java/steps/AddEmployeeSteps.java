package steps;

import io.cucumber.java.en.*;
import pages.actions.AddEmployeeActions;
import pages.actions.LeftNavBarActions;

public class AddEmployeeSteps {

	LeftNavBarActions leftNavBarActions = new LeftNavBarActions();
	AddEmployeeActions addEmployeeActions = new AddEmployeeActions();

	@Then("I clicked on the PIM Tab.")
	public void i_clicked_on_the_pim_tab() {
		leftNavBarActions.clickOnPimTab();
	}

	@Then("I clicked on the on the Add Employee")
	public void i_clicked_on_the_on_the_add_employee() {
		addEmployeeActions.clickOnAddEmployeeTab();
	}

	@When("^I enterd Employee \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\".$")
	public void i_enterd_employee_pramod_chandra_kakumani(String FirstName, String MiddleName, String LastName) {
		addEmployeeActions.enterNewEmpDetails(FirstName, MiddleName, LastName);

	}

	@Then("I clicked Save button")
	public void i_clicked_save_button() {
		addEmployeeActions.clickOnAddEmpPageSaveBtn();
	}

	@And("I see Successfull Toast Message")
	public void i_see_successfull_toast_message() {
		addEmployeeActions.readSuccessToastMsg();
	}

	@Then("I clicked on the EmployeeList")
	public void i_clicked_on_the_employee_list() {
	}

	@Then("I enter the EmployeeName {string} & EmployeeID {string}")
	public void i_enter_the_employee_name_employee_id(String string, String string2) {
	}

	@Then("I clicked on the Search Button")
	public void i_clicked_on_the_search_button() {
	}

	@Then("I see the Employee details in the RecordTable")
	public void i_see_the_employee_details_in_the_record_table() {
	}

}
