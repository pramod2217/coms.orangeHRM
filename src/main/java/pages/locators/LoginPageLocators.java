package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {

	// @FindBy(xpath = "//input[@name='username']")
	// public WebElement username;
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	public WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement login_button;

	@FindBy(xpath = "//*[@class='orangehrm-login-logo']/img")
	public WebElement orangeHRM_Logo;

	@FindBy(xpath = "//*[@class='orangehrm-login-branding']/img")
	public WebElement orangeHRM_Branding;
	
	@FindBy(xpath = "//*[@class='oxd-userdropdown-name']")
	public WebElement userDropdownName;

}
