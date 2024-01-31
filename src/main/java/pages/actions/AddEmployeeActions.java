package pages.actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.PIMPageLocators;
import utils.SeleniumDriver;

public class AddEmployeeActions {

	PIMPageLocators addEmployeeLocators = null;
	private String eMpId;

	public AddEmployeeActions() {
		this.addEmployeeLocators = new PIMPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), addEmployeeLocators);

	}

	Actions action = new Actions(SeleniumDriver.getDriver());

	public void clickOnAddEmployeeTab() {
		action.click(addEmployeeLocators.addEmployeeTab).perform();

	}

	public void enterNewEmpDetails(String FirstName, String MiddleName, String LastName) {
		// action.sendKeys(addEmployeeLocators.empFirstName, FirstName).perform();

		addEmployeeLocators.empFirstName.sendKeys(FirstName);
		addEmployeeLocators.empMiddleName.sendKeys(MiddleName);
		addEmployeeLocators.empLastName.sendKeys(LastName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(),
		// Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));

		eMpId = addEmployeeLocators.empID.getText();
		System.out.println("the current employee id is :" + eMpId);
		// addEmployeeLocators.empID.sendKeys(EmployeeID);

	}

	public String getString() {

		return eMpId;
	}

	public void clickOnAddEmpPageSaveBtn() {

		addEmployeeLocators.addEmpPageSaveBtn.click();

		System.out.println("user clicked on the save button on the add employee page");

	}

	public void readSuccessToastMsg() {

		if (addEmployeeLocators.addEmpPageSaveBtn.isDisplayed()) {
			System.out.println("User addedd sussessfully");
			// System.out.println(addEmployeeLocators.addEmpPageSuccessfullToastMsg.getClass());
		} else {
			System.out.println("User not addedd sussessfully");
		}
		;

	}

}
