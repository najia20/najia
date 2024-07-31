package ecommerceee.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerceee.Utility.EcommerceeeBase;

public class EcommerceeeProfilePageLocator extends EcommerceeeBase {

	
public EcommerceeeProfilePageLocator() {
		
		
		PageFactory.initElements(driver,this);
		
}
	
@FindBy(linkText="Welcome najia")
public WebElement MyProfile;
	
	
	

	
@FindBy(linkText="Samsung galaxy s6")
public WebElement producttitle;
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
