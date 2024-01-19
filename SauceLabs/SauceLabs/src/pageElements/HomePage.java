package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement backPackButton;
	
	@FindBy(className="shopping_cart_link")
	WebElement GoToCartButton;
	

	public void AddItemToCart() {
		backPackButton.click();
	}
	
	public CartPage GoToCart() {
		GoToCartButton.click();
		CartPage cp = new CartPage(driver);
		return cp;
		
	}

		
	

}
