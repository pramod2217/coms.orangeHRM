package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddEmployeeLocators {
	@FindBy(how = How.LINK_TEXT, using = "Add Employee")
	public WebElement addEmployeeTab;
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

}
