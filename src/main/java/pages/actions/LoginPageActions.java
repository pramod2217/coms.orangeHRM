package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;

public class LoginPageActions {

	LoginPageLocators loginPageLocators = null;

	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);

	}

	// Actions action = new Actions(SeleniumDriver.getDriver());

	/*
	 * public void navigateTO() {
	 * 
	 * }
	 */

	public void orangeHRM_Logo() {
		if (loginPageLocators.orangeHRM_Logo.isDisplayed()) {
			System.out.println("Login Page OrangHRM Logo image is present");
		}

	}

	public void orangeHRM_Branding() {
		if (loginPageLocators.orangeHRM_Branding.isDisplayed()) {
			System.out.println("Login Page OrangHRM Branding image is present");
		}
	}

	public void usernamePassword() {
		loginPageLocators.username.sendKeys("Admin");
		loginPageLocators.password.sendKeys("admin123");
	}

	public void clicLoginBtn() {
		loginPageLocators.login_button.click();
	}
	
	public void getNameToValidateLogin() {
		String fullName = loginPageLocators.userDropdownName.getText();
		System.out.println("the user has logedin succesfully and name of the user is :"+fullName);
		
	}

}
