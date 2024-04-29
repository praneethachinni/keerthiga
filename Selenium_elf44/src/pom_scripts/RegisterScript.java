package pom_scripts;

import org.testng.annotations.Test;

import pom.BasePage;
import pom.RegisterPage;

public class RegisterScript extends BaseClass{
	@Test
	public void register() {
		BasePage bp = new BasePage(driver);
		bp.getRegister().click();
		RegisterPage rp = new RegisterPage(driver);
		rp.getGenderFemale().click();
		rp.getFirstNameTextBox().sendKeys("praneetha");
		rp.getLastNameTextBox().sendKeys("chinni");
		rp.getEmailTextBox().sendKeys("praneethaKoushik22@gmail.com");
		rp.getPasswordTextBox().sendKeys("Pranee@168");
		rp.getConfirmPasswordTextBox().sendKeys("Pranee@168");
		rp.getRegisterButton().click();
	}

}
