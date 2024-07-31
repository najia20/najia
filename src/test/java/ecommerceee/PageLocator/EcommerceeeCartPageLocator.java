package ecommerceee.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerceee.Utility.EcommerceeeBase;

public class EcommerceeeCartPageLocator extends EcommerceeeBase{

	public EcommerceeeCartPageLocator() {
		
		PageFactory.initElements(driver,this);
		
		
}
	
	@FindBy(xpath="//button[text()='Place Order']")
	public WebElement placeorderbutton;
	
	@FindBy(xpath="//td[text()='Samsung galaxy s6']")
	public WebElement producttitleincart;
	
	@FindBy(linkText = "Delete")
	public WebElement delete;
	
}
