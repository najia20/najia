package ecommerceee.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EcommerceeeBase {
public static WebDriver driver;
public static Properties EcommerceeeProp;
public EcommerceeeBase() {
	try {
		FileInputStream EcommerceeeFile=new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\ecommerceee\\config\\EcommerceeeConfiguration.properties");
		EcommerceeeProp=new Properties();
		EcommerceeeProp.load(EcommerceeeFile);
	} catch (FileNotFoundException e) {
		System.out.println("Please fix your constructor");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void EcommerceeeBrowserSetup() {
	String EcommerceeeAllBrowser=EcommerceeeProp.getProperty("EcommerceeeBrowser1");
	
	if(EcommerceeeAllBrowser.equals("Chrome")) {
		System.setProperty("WebDriver.chrome.driver", "\\ecommerceeeDriver\\chromedriver.exe");
		ChromeOptions q=new ChromeOptions();
		q.addArguments("--allow-remote-origins=*");
		driver=new ChromeDriver();
		//driver.get("https://askomdch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(EcommerceeeUtility.implicityWait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(EcommerceeeUtility.pageLoadTimeOut));
		driver.manage().deleteAllCookies();
}
	
	else if (EcommerceeeAllBrowser.equals("IE")) {
	
	
}
	
}

public static void EcommerceeeURLSetup(String URL) {
	
	
	driver.get(EcommerceeeProp.getProperty("EcommerceeeURL"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
