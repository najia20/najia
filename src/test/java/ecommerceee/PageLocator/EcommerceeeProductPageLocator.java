package ecommerceee.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerceee.Utility.EcommerceeeBase;

public class EcommerceeeProductPageLocator extends EcommerceeeBase {
	public EcommerceeeProductPageLocator() {
	PageFactory.initElements(driver,this);
}
@FindBy(linkText="Add to cart")	
public WebElement addtocartbutton;
	
	
@FindBy(linkText="Cart")	
public WebElement cart;
	
	
	
	
}
