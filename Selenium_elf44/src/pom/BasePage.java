package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
    private WebElement register;
	
	@FindBy(linkText = "Log in")
	private WebElement login;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shopping_cart;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlist;
	
	@FindBy(partialLinkText = "Books")
	private WebElement books;

	@FindBy(partialLinkText = "Electronics")
	private WebElement electronics;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;

	
	public WebElement getRegister() {
		return register;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getShopping_cart() {
		return shopping_cart;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getBooks() {
		return books;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

}
