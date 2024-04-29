package pom_scripts;

import org.testng.annotations.Test;

import pom.CheckOutPage;
import pom.ShoppingCartPage;

public class PlaceOrder extends AddToCart{
	@Test
    public void placingOrder() {
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getTermsCheckBox().click();
		scp.getCheckoutBtn().click();
		
		CheckOutPage cop = new CheckOutPage(driver);
		cop.getCityTextBox().sendKeys("tadipatri");
		cop.getAddress1TextBox().sendKeys("tadipatri");
		cop.getCountryDropDown().click();
		cop.getCountryDropDownOption().click();
		cop.getZipPostalCodeTextBox().sendKeys("515411");
		cop.getPhoneNumTextBox().sendKeys("7396995038");
		cop.getContinueButton1().click();
		cop.getInStoreCheckBox().click();
		cop.getContinueButton2().click();
		cop.getGroundRadioBtn().click();
		cop.getContinueButton3().click();
		cop.getCodRadioBtn().click();
		cop.getContinueButton4().click();
		cop.getContinueButton5().click();
		cop.getConfirmButton().click();
	}
}
