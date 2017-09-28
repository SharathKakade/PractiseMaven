package com.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.kirwa.nxgreport.NXGReports;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
		if(GenericClass.getproperties("BROWSERNAME").equals("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Sharath\\Framework\\Omega\\Config.Properties\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(GenericClass.getproperties("URL"));
			driver.manage().window().maximize();
		
		}
		else if(GenericClass.getproperties("BROWSERNAME").equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(GenericClass.getproperties("URL"));
			driver.manage().window().maximize();
			
		}
		
		NXGReports.setWebDriver(driver);
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
	
	
	

}
