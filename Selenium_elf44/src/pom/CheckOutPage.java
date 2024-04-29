package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="BillingNewAddress_Company")
	private WebElement companyTextBox;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement cityTextBox;
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement countryDropDown;
	
	@FindBy(xpath="//option[text()='India']")
	private WebElement countryDropDownOption;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address1TextBox;
    
	@FindBy(id="BillingNewAddress_Address2")
	private WebElement address2TextBox;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement zipPostalCodeTextBox;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phoneNumTextBox;
	
	@FindBy(id="BillingNewAddress_FaxNumber")
	private WebElement faxNumTextBox;
	
	@FindBy(xpath="//input[@title='Continue']")
	private WebElement continueButton1;
	
	@FindBy(id="PickUpInStore")
	private WebElement inStoreCheckBox;
	
	@FindBy(linkText="Back")
	private WebElement back1;
	
	@FindBy(xpath="//input[@title='Continue']")
	private WebElement continueButton2;
	
	@FindBy(xpath="//input[@value='Ground___Shipping.FixedRate']")
	private WebElement groundRadioBtn;
	
	@FindBy(xpath="//input[@value='Next Day Air___Shipping.FixedRate']")
	private WebElement nextDayAirRadioBtn;
	
	@FindBy(xpath="//input[@value='2nd Day Air___Shipping.FixedRate']")
	private WebElement dayAir2nd;
	
	@FindBy(linkText="Back")
	private WebElement back2;
	
	@FindBy(xpath="//input[@title='Continue']")
	private WebElement continueButton3;
	
	@FindBy(xpath="//input[@value='Payments.CashOnDelivery']")
	private WebElement codRadioBtn;
	
	@FindBy(xpath="//input[@value='Payments.CheckMoneyOrder']")
	private WebElement checkMoneyOrderRadioBtn;
	
	@FindBy(xpath="//input[@value='Payments.Manual']")
	private WebElement creditCardRadioBtn;
	
	@FindBy(xpath="//input[@value='Payments.PurchaseOrder']")
	private WebElement purchaseOrderRadioBtn;
	
	@FindBy(linkText="Back")
	private WebElement back3;
	
	@FindBy(xpath="//input[@title='Continue']")
	private WebElement continueButton4;
	
	@FindBy(linkText="Back")
	private WebElement back4;
	
	@FindBy(xpath="//input[@title='Continue']")
	private WebElement continueButton5;
	
	@FindBy(linkText="Back")
	private WebElement back5;
	
	@FindBy(xpath="//input[@value='Confirm']")
	private WebElement confirmButton;

	public WebElement getCompanyTextBox() {
		return companyTextBox;
	}

	public WebElement getCityTextBox() {
		return cityTextBox;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getCountryDropDownOption() {
		return countryDropDownOption;
	}

	public WebElement getAddress1TextBox() {
		return address1TextBox;
	}

	public WebElement getAddress2TextBox() {
		return address2TextBox;
	}

	public WebElement getZipPostalCodeTextBox() {
		return zipPostalCodeTextBox;
	}

	public WebElement getPhoneNumTextBox() {
		return phoneNumTextBox;
	}

	public WebElement getFaxNumTextBox() {
		return faxNumTextBox;
	}

	public WebElement getContinueButton1() {
		return continueButton1;
	}

	public WebElement getInStoreCheckBox() {
		return inStoreCheckBox;
	}

	public WebElement getBack1() {
		return back1;
	}

	public WebElement getContinueButton2() {
		return continueButton2;
	}

	public WebElement getGroundRadioBtn() {
		return groundRadioBtn;
	}

	public WebElement getNextDayAirRadioBtn() {
		return nextDayAirRadioBtn;
	}

	public WebElement getDayAir2nd() {
		return dayAir2nd;
	}

	public WebElement getBack2() {
		return back2;
	}

	public WebElement getContinueButton3() {
		return continueButton3;
	}

	public WebElement getCodRadioBtn() {
		return codRadioBtn;
	}

	public WebElement getCheckMoneyOrderRadioBtn() {
		return checkMoneyOrderRadioBtn;
	}

	public WebElement getCreditCardRadioBtn() {
		return creditCardRadioBtn;
	}

	public WebElement getPurchaseOrderRadioBtn() {
		return purchaseOrderRadioBtn;
	}

	public WebElement getBack3() {
		return back3;
	}

	public WebElement getContinueButton4() {
		return continueButton4;
	}

	public WebElement getBack4() {
		return back4;
	}

	public WebElement getContinueButton5() {
		return continueButton5;
	}

	public WebElement getBack5() {
		return back5;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}


}
