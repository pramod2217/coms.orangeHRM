package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.PIMPageLocators;
import utils.SeleniumDriver;

public class EmployeeListActions {
	PIMPageLocators employeeListLocatores = null;
	AddEmployeeActions addemp;

	public EmployeeListActions() {
		this.employeeListLocatores = new PIMPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), employeeListLocatores);
	}

	public void clickOnEmployeeListTab() {

		employeeListLocatores.employeeListTab.click();

	}

	public void empListPageEnterEmployeeDDetails(String employeeName) {
		addemp = new AddEmployeeActions();
		System.out.println(addemp.getString());
		employeeListLocatores.empListEmployeeName.sendKeys(employeeName);
		employeeListLocatores.empListEmployeeId.sendKeys(addemp.getString());

	}

	public void clickOnEmpListPageSearchBtn() {

		employeeListLocatores.empListSearchBtn.click();

	}
	
	public void empListResultTableValues() {
	
		
	}

}
