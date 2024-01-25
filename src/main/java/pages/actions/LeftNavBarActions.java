package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.LeftNavBarLocators;
import utils.SeleniumDriver;

public class LeftNavBarActions {

	LeftNavBarLocators leftNavBarLocators = null;

	public LeftNavBarActions() {
		this.leftNavBarLocators = new LeftNavBarLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), leftNavBarLocators);
	}

	Actions action = new Actions(SeleniumDriver.getDriver());

	public void clickOnAdminTab() {
		action.click(leftNavBarLocators.adminLink).perform();
	}

	public void clickOnPimTab() {
		action.click(leftNavBarLocators.pimLink).perform();
	}

	public void clickOnLeaveTab() {
		action.click(leftNavBarLocators.leaveLink).perform();

	}

	public void clickOnTimeTab() {
		action.click(leftNavBarLocators.timeLink).perform();

	}

	public void clickOnRecruitmentTab() {
		action.click(leftNavBarLocators.recruitmentLink).perform();

	}

	public void clickOnMyInfoTab() {
		action.click(leftNavBarLocators.myInfoLink).perform();

	}

	public void clickOnPerformanceTab() {
		action.click(leftNavBarLocators.performanceLink).perform();

	}

	public void clickOnDashboardTab() {
		action.click(leftNavBarLocators.dashboardLink).perform();

	}

	public void clickOnDirectoryTab() {
		action.click(leftNavBarLocators.directoryLink).perform();

	}

	public void clickOnMaintenanceTab() {
		action.click(leftNavBarLocators.maintenanceLink).perform();

	}

	public void ClickOnClaimTab() {
		action.click(leftNavBarLocators.claimLink).perform();

	}

	public void clickOnBuzzTab() {
		action.click(leftNavBarLocators.buzzLink).perform();

	}

}
