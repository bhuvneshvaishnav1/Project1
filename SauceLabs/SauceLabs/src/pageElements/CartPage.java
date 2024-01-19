package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="checkout")
	WebElement CheckoutButton;
	
	public CheckOutInfoPage Checkout() {
		CheckoutButton.click();
		CheckOutInfoPage cp = new CheckOutInfoPage(driver);
		return cp;
		
	
		
	}
	
}
