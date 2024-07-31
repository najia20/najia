package ecommerceee.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerceee.Utility.EcommerceeeBase;

public class EcommerceeeLoginWindowLocator extends EcommerceeeBase {
	public EcommerceeeLoginWindowLocator() {
		
		
		PageFactory.initElements(driver,this);
		
}
	
@FindBy(id="loginusername")
public WebElement UserName;


@FindBy(id="loginpassword")
public WebElement UserPassword;



@FindBy(xpath="//button[text()='Log in']")
public WebElement LoginButton;
	
@FindBy(id="reg_username")
public WebElement regUserName;




	
	
	
	
	
	

}
