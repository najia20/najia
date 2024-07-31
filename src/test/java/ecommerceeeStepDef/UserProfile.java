package ecommerceeeStepDef;


import ecommerceee.PageActions.EcommerceeeLoginWindowActions;
import ecommerceee.PageActions.EcommerceeeCartPageActions;
import ecommerceee.PageActions.EcommerceeeHomePageActions;
import ecommerceee.PageActions.EcommerceeeProductPageActions;
import ecommerceee.PageActions.EcommerceeeProfilePageActions;
import ecommerceee.Utility.EcommerceeeBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UserProfile extends EcommerceeeBase{
	
	EcommerceeeHomePageActions ecommerceeeHomePageActions=new EcommerceeeHomePageActions();
	
	EcommerceeeLoginWindowActions ecommerceeeAccountPageActions=new EcommerceeeLoginWindowActions();
	
	EcommerceeeProfilePageActions ecommerceeeProfilePageActions=new EcommerceeeProfilePageActions();
	
	EcommerceeeProductPageActions ecommerceeeProductPageActions=new EcommerceeeProductPageActions();
	EcommerceeeCartPageActions ecommerceeeCartPageActions=new EcommerceeeCartPageActions();
	
	
	@Given("Open demoblaze {string} application")
	public void open_demoblaze_application(String URL) {
		EcommerceeeURLSetup(URL);
	}

	@Then("click login link")
	public void click_login_link() {
		ecommerceeeHomePageActions.click_login_link();
	}

	@Then("Enter valid user name and password and click login")
	public void enter_valid_user_name_and_password_and_click_login() throws Exception  {
		ecommerceeeAccountPageActions.clicklogin(EcommerceeeProp.getProperty("EcommerceeeUserName1"),EcommerceeeProp.getProperty("EcommerceeePassword1") );
	}
												
	@Then("Verify username is displayed in the profile successfully")
	public void verify_username_is_displayed_in_the_profile_successfully() {
		ecommerceeeProfilePageActions.Verifyuserprofilenamesuccessfully();
	}
	@Then("user click product title")
	public void user_click_product_title() throws Exception {
		ecommerceeeProfilePageActions.clickproducttitle();
	}

	@Then("user verifies add to cart button is displayed")
	public void user_verifies_add_to_cart_button_is_displayed() {
		ecommerceeeProductPageActions.addtocartbuttonisdisplayed(); 
	}

	@Then("user click add to cart button and ok and cart link")
	public void user_click_add_to_cart_button_and_ok_and_cart_link() throws Exception {
		ecommerceeeProductPageActions.clickaddtocart();
		ecommerceeeProductPageActions.acceptalert();
		ecommerceeeProductPageActions.clickcart();
		
	}



	@Then("user verifies place order button is displayed")
	public void user_verifies_place_order_button_is_displayed() {
		ecommerceeeCartPageActions.verifyplaceorderbuttonisdisplayed();
	}

}
