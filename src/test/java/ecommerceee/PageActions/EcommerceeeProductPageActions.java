package ecommerceee.PageActions;

import org.testng.Assert;

import ecommerceee.PageLocator.EcommerceeeProductPageLocator;
import ecommerceee.Utility.EcommerceeeBase;

public class EcommerceeeProductPageActions extends EcommerceeeBase{

	EcommerceeeProductPageLocator ecommerceeeProductPageLocator=new EcommerceeeProductPageLocator();
	
public void addtocartbuttonisdisplayed() {
	
	
	boolean addtocartverification=ecommerceeeProductPageLocator.addtocartbutton.isDisplayed();
	
	Assert.assertTrue(addtocartverification);
	
	
	
}	
public void clickaddtocart() throws Exception {
	
	
	ecommerceeeProductPageLocator.addtocartbutton.click();
	Thread.sleep(5000);

}	
	public void acceptalert() {
		driver.switchTo().alert().accept();
	}
	public void clickcart() throws Exception {
		
		ecommerceeeProductPageLocator.cart.click();	
		Thread.sleep(5000);
	}
	
}
