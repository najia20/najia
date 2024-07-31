package ecommerceee.PageActions;


import ecommerceee.PageLocator.EcommerceeeProfilePageLocator;

import ecommerceee.Utility.EcommerceeeBase;

//import java.io.IOException;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//import ecommerceee.PageLocator.EcommerceeeProfilePageLocator;
//import ecommerceee.Utility.EcommerceeeBase;

public class EcommerceeeProfilePageActions extends EcommerceeeBase {
	EcommerceeeProfilePageLocator ecommerceeeProfilePageLocator=new EcommerceeeProfilePageLocator();
	
	
	
	public void Verifyuserprofilenamesuccessfully() {
		
		boolean profileverification=ecommerceeeProfilePageLocator.MyProfile.isDisplayed();	
Assert.assertTrue(profileverification);
	}
	public void clickproducttitle() throws Exception {
		
		ecommerceeeProfilePageLocator.producttitle.click();
		Thread.sleep(5000);
		
		
		
		
		
		
	

		
		
		
		
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	

