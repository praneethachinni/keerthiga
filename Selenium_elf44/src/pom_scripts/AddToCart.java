package pom_scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pom.BasePage;

public class AddToCart extends LoginScript{
	@Test
	public void addToCart() throws InterruptedException {
		BasePage bp = new BasePage(driver);
		bp.getBooks().click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']/../../..//a[text()='Computing and Internet']"));
		bp.getShopping_cart().click();
	}

}
