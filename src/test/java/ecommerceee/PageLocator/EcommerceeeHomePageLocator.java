package ecommerceee.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerceee.Utility.EcommerceeeBase;

public class EcommerceeeHomePageLocator extends EcommerceeeBase {

	
public EcommerceeeHomePageLocator() {
		
		
		PageFactory.initElements(driver,this);
		
}
	
@FindBy(linkText="Log in")
public WebElement Login;


	
}
