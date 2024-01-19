package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverviewPage {
	
	
	WebDriver driver;
	public CheckOutOverviewPage(WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements(driver ,this);
	}
	@FindBy(id="finish")
	WebElement FinishButton;
	
	public void CheckoutFinish() {
		FinishButton.click();
		}
	

}
