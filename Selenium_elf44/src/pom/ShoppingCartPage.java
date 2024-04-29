package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="termsofservice")
	private WebElement termsCheckBox;
	
	@FindBy(id="checkout")
	private WebElement checkoutBtn;

	public WebElement getTermsCheckBox() {
		return termsCheckBox;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}

}
