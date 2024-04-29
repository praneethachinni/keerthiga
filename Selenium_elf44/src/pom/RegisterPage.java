package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="gender-male")
    private WebElement genderMale;

	@FindBy(id="gender-female")
    private WebElement genderFemale;
	
	@FindBy(id="FirstName")
    private WebElement firstNameTextBox;
	
	@FindBy(id="LastName")
    private WebElement lastNameTextBox;
	
	@FindBy(id="Email")
    private WebElement emailTextBox;
	
	@FindBy(id="Password")
    private WebElement passwordTextBox;
	
	@FindBy(id="ConfirmPassword")
    private WebElement confirmPasswordTextBox;
	
	@FindBy(id="register-button")
    private WebElement registerButton;

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getGenderFemale() {
		return genderFemale;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}
	
	public WebElement getRegisterButton() {
		return registerButton;
	}
}
