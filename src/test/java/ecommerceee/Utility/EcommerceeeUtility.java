package ecommerceee.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class EcommerceeeUtility extends EcommerceeeBase{

public static long implicityWait=30;
public static long pageLoadTimeOut=30;
public static long example=30;
	

public static void takeMyScreenshot(WebDriver driver, String screenshot) {
	
	File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String correntdir = System.getProperty("user.dir");
	
	try {
		FileUtils.copyFile(srcfile, new File(correntdir+"/ecommerceeeScreenshots/"+screenshot+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
