package pom_scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pom.LoginPage;

public class LoginScript extends RegisterScript {
	@Test
	public void login() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextBox().sendKeys("praneethaKoushik22@gmail.com");
		lp.getPasswordTextBox().sendKeys("Pranee@168");
		lp.getLoginButton().click();
		
	}

}
