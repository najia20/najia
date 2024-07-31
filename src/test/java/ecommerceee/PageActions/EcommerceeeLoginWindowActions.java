package ecommerceee.PageActions;

import ecommerceee.PageLocator.EcommerceeeLoginWindowLocator;
import ecommerceee.Utility.EcommerceeeBase;

public class EcommerceeeLoginWindowActions extends EcommerceeeBase{
	EcommerceeeLoginWindowLocator ecommerceeeAccountPageLocator=new EcommerceeeLoginWindowLocator();
	
	
	public void clicklogin(String U,String P) throws Exception  {
		
				
		ecommerceeeAccountPageLocator.UserName.sendKeys(U);
		
		ecommerceeeAccountPageLocator.UserPassword.sendKeys(P);
		ecommerceeeAccountPageLocator.LoginButton.click();
		Thread.sleep(5000);
	}
		
		
		
	}

