package ecommerceee.testrunner;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;


import ecommerceee.Utility.EcommerceeeBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/ecommerceeeAllFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "ecommerceeeStepDef",tags="@cart")

public class EcommerceeeTestRunner extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void EcommerceeeStartURL() {
		
		EcommerceeeBase Estart=new EcommerceeeBase();	
		Estart.EcommerceeeBrowserSetup();
		
		
		
		
		
		
	}
	@AfterTest
	public void EcommerceeeStopURL() {
		
		EcommerceeeBase Estart=new EcommerceeeBase();
		Estart.driver.quit();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
