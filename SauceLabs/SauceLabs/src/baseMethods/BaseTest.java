package baseMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageElements.LandingPage;

public class BaseTest {
	
	public WebDriver driver;
	
	
	public WebDriver InitializeBrowser() {
	       driver = new ChromeDriver();
		
    return driver; 
		
	}
	
    public LandingPage LaunchApplication() {
    	driver= InitializeBrowser();
    	LandingPage landingpage = new LandingPage(driver);
    	landingpage.GoTo();
    	return landingpage;
    	
    	
    		
    	
    }
}
