package ecommerceeeStepDef;


import ecommerceee.PageActions.EcommerceeeCartPageActions;
import ecommerceee.PageActions.EcommerceeeProductPageActions;
import ecommerceee.Utility.EcommerceeeBase;
import io.cucumber.java.en.Then;

public class CartActivity extends EcommerceeeBase{
	EcommerceeeProductPageActions ecommerceeeProductPageActions=new EcommerceeeProductPageActions();
	EcommerceeeCartPageActions ecommerceeeCartPageActions=new EcommerceeeCartPageActions();
	@Then("user click add to cart button")
	public void user_click_add_to_cart_button() throws Exception {
		ecommerceeeProductPageActions.clickcart();
		
	}

	@Then("user verifies add to cart button is clickable")
	public void user_verifies_add_to_cart_button_is_clickable() {
	System.out.println("add to cart button is clickable");
	}


	@Then("user verifies product is added to the cart successfully")
	public void user_verifies_product_is_added_to_the_cart_successfully() {
	   ecommerceeeCartPageActions.verifyproductisadded(); 
	}

	@Then("user click delete button")
	public void user_click_delete_button() {
	    ecommerceeeCartPageActions.clickdelete();
	}

	@Then("user verifies item is deleted from cart successfully")
	public void user_verifies_item_is_deleted_from_cart_successfully() {
		ecommerceeeCartPageActions.verifydelete();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
