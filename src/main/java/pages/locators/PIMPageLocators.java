package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PIMPageLocators {
	// PIM tab Locators
	@FindBy(how = How.LINK_TEXT, using = "Configuration")
	public WebElement pimConfigurationTab;
	@FindBy(how = How.LINK_TEXT, using = "Add Employee")
	public WebElement addEmployeeTab;
	@FindBy(how = How.LINK_TEXT, using = "Employee List")
	public WebElement employeeListTab;
	@FindBy(how = How.LINK_TEXT, using = "Reports")
	public WebElement pimReportsTab;

	// add employee page locators
	@FindBy(how = How.NAME, using = "firstName")
	public WebElement empFirstName;
	@FindBy(how = How.NAME, using = "middleName")
	public WebElement empMiddleName;
	@FindBy(how = How.NAME, using = "lastName")
	public WebElement empLastName;
	@FindBy(how = How.XPATH, using = "//*[@class='oxd-grid-2 orangehrm-full-width-grid']//input")
	public WebElement empID;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElement addEmpPageSaveBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-toast-content oxd-toast-content--success']")
	public WebElement addEmpPageSuccessfullToastMsg;

	// Employee List page locators
	@FindBy(how = How.XPATH, using = "//label[contains(.,'Employee Name')]/../following-sibling::div//input")
	public WebElement empListEmployeeName;
	@FindBy(how = How.XPATH, using = "//label[contains(.,'Employee Id')]/../following-sibling::div//input")
	public WebElement empListEmployeeId;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElement empListSearchBtn;

}
