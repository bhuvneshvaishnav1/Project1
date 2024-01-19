package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

		WebDriver driver;
		
		public LandingPage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void GoTo() {
			driver.get("https://www.saucedemo.com/");
		}
		
			@FindBy(id="user-name")
			WebElement usernameTxtbox;
			
			@FindBy(id="password")
			WebElement passwordButton;
			
			@FindBy(id="login-button")
			WebElement signInButton;
			
			
	    public HomePage Login(String uname,String password) {
	    	
			usernameTxtbox.sendKeys(uname);
			passwordButton.sendKeys(password);
      		signInButton.click();
      		
      		HomePage hp = new HomePage(driver);
			return hp;
      		
      	
      		
	    
		}
	

}

