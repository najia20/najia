package ecommerceee.PageActions;

import org.testng.Assert;

import ecommerceee.PageLocator.EcommerceeeCartPageLocator;
import ecommerceee.Utility.EcommerceeeBase;

public class EcommerceeeCartPageActions extends EcommerceeeBase{

	EcommerceeeCartPageLocator ecommerceeeCartPageLocator=new EcommerceeeCartPageLocator();	
	
	public void verifyplaceorderbuttonisdisplayed() {
		
			
		boolean placeorderverification=ecommerceeeCartPageLocator.placeorderbutton.isDisplayed();	
		Assert.assertTrue(placeorderverification);
		
		
		
		
	}
	public void verifyproductisadded() {
		
	boolean producttitleincartverification=ecommerceeeCartPageLocator.producttitleincart.isDisplayed();	
	Assert.assertTrue(producttitleincartverification);	
	}
	public void clickdelete()
	{
	ecommerceeeCartPageLocator.delete.click();
	}
	public void verifydelete() {
		
		boolean deleteverification=ecommerceeeCartPageLocator.producttitleincart.isDisplayed();
		Assert.assertFalse(deleteverification);
	}
	
}
	
