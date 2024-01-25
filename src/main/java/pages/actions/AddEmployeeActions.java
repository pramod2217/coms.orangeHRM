package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.AddEmployeeLocators;
import utils.SeleniumDriver;

public class AddEmployeeActions {

	AddEmployeeLocators addEmployeeLocators = null;

	public AddEmployeeActions() {
		this.addEmployeeLocators = new AddEmployeeLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), addEmployeeLocators);

	}

	Actions action = new Actions(SeleniumDriver.getDriver());

	public void clickOnAddEmployeeTab() {
		action.click(addEmployeeLocators.addEmployeeTab).perform();

	}

	public void enterNewEmpDetails(String FirstName, String MiddleName, String LastName, String EmployeeID) {
		//action.sendKeys(addEmployeeLocators.empFirstName, FirstName).perform();
		addEmployeeLocators.empFirstName.sendKeys(FirstName);
		addEmployeeLocators.empMiddleName.sendKeys(MiddleName);
		addEmployeeLocators.empLastName.sendKeys(LastName);
		addEmployeeLocators.empID.clear();
		addEmployeeLocators.empID.sendKeys(EmployeeID);
	}

	public void clickOnAddEmpPageSaveBtn() {
		if (addEmployeeLocators.addEmpPageSaveBtn != null) {
			addEmployeeLocators.addEmpPageSaveBtn.click();
			System.out.println("user clicked on the save button n the add employee page");
		}
	}

}
