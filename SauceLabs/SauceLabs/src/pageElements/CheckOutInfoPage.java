package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInfoPage {

	WebDriver driver;
	public CheckOutInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id="first-name")
	    WebElement FirstNameTxtbox;
	    
	    @FindBy(id="last-name")
	    WebElement LastNameTxtbox;
	    
	    @FindBy(id="postal-code")
	    WebElement PostalCodeTxtbox;
	    
	    @FindBy(id="continue")
	    WebElement ContinueButton;
	
	    public CheckOutOverviewPage FillInfo() {
	    	FirstNameTxtbox.sendKeys("Bhuvnesh");
	    	LastNameTxtbox.sendKeys("Vaishnav");
	    	PostalCodeTxtbox.sendKeys("210356");
	        ContinueButton.click();
	        CheckOutOverviewPage chPage = new CheckOutOverviewPage(driver);
	        return chPage;

	
			
		}
}
