package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	//public static FileReader fr;
	
	@BeforeMethod
	public void setup() throws IOException {
		
		if(driver==null) {
			
		FileReader fr=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
		FileReader fr1=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\locators.properties");	
		//want to load property
	 // t value being pass in order to propertie file if broswe value is chrome then we will institatated chrome
		
	if(prop.getProperty("browser").equals("chrome")) {
		
		WebDriverManager.chromedriver().setup();// base thing which will not change across of test cases 
		 driver= new ChromeDriver();// same as above
	//	driver.get("https://www.zoho.com/"); // properties instead pass url do below 
		driver.get(prop.getProperty("testurl"));
		
	}else
	if(prop.getProperty("browser").equals("firefox")) {
		
		WebDriverManager.chromedriver().setup();// base thing which will not change across of test cases 
		WebDriver driver=new FirefoxDriver();// same as above
	//	driver.get("https://www.zoho.com/"); // properties instead pass url do below 
		driver.get(prop.getProperty("testurl"));
		
	}}}
	
	
	

	@AfterMethod
	public void tearDown() {
		
		driver.close();
		System.out.println("teardown successfully");
		
		
		
		
	}
}
