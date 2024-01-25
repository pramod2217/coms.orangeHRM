package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftNavBarLocators {

	@FindBy(how = How.XPATH, using = "//a/span[text()='Admin']")
	public WebElement adminLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='PIM']")
	public WebElement pimLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='Leave']")
	public WebElement leaveLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='Time']")
	public WebElement timeLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='Recruitment']")
	public WebElement recruitmentLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='My Info']")
	public WebElement myInfoLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='Performance']")
	public WebElement performanceLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='Dashboard']")
	public WebElement dashboardLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='Directory']")
	public WebElement directoryLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='Maintenance']")
	public WebElement maintenanceLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='Claim']")
	public WebElement claimLink;
	@FindBy(how = How.XPATH, using = "//a/span[text()='Buzz']")
	public WebElement buzzLink;

}
