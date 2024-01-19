package tests;

import org.testng.annotations.Test;
import baseMethods.BaseTest;
import pageElements.CartPage;
import pageElements.CheckOutInfoPage;
import pageElements.CheckOutOverviewPage;
import pageElements.HomePage;
import pageElements.LandingPage;

public class CreateOrder extends BaseTest{

	LandingPage lp;
	HomePage hp;
    CartPage cp;
	CheckOutInfoPage chinfopage;
	CheckOutOverviewPage checkoutOverviewpage;
	@Test
	public void OrderItem() {
		
		
		lp = LaunchApplication();
		
		hp = lp.Login("standard_user", "secret_sauce");
		
		hp.AddItemToCart();
		
		cp=hp.GoToCart();
		
		chinfopage = cp.Checkout();
		
		checkoutOverviewpage =chinfopage.FillInfo();
		
		checkoutOverviewpage.CheckoutFinish();
		
		
		
		
	}
}
