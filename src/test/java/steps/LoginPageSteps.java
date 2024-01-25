package steps;

import io.cucumber.java.en.*;
import pages.actions.LoginPageActions;
import utils.SeleniumDriver;

public class LoginPageSteps {

	LoginPageActions loginPageActions = new LoginPageActions();

	@Given("I am on HomePage")
	public void i_am_on_home_page() {
		// SeleniumDriver.setUpDriver();
		SeleniumDriver.openPage("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("im on home page");

	}

	@Then("I see OrangeHRM Logo")
	public void i_see_orange_hrm_logo() {

		loginPageActions.orangeHRM_Logo();
	}

	@Then("I see OrangeHRM Branding")
	public void i_see_orange_hrm_branding() {

		loginPageActions.orangeHRM_Branding();

	}

	@Then("Enterd the username and password")
	public void enterd_the_username_and_password() {

		loginPageActions.usernamePassword();

	}

	@Then("Clicked on the Login Button")
	public void clicked_on_the_login_button() {

		loginPageActions.clicLoginBtn();
	}

	@And("Review the fullName on TopBar")
	public void review_the_full_name_on_top_bar() {

		loginPageActions.getNameToValidateLogin();
	}

}
