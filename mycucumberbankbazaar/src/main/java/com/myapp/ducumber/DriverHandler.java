package com.myapp.ducumber;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHandler {

	static WebDriver driver = null;
	//static Properties CONFIG=null;
	static WebDriver mozilla=null;
	static WebDriver chrome=null;
	WebDriver ie=null;
	public static WebDriver getInstance(){
		if(driver==null){	
			String 	browserType = WebConnector.CONFIG.getProperty("browser");
			if(browserType.equals("Mozilla") && mozilla==null){
				driver = new FirefoxDriver();
				mozilla=driver;
			}else if(browserType.equals("Mozilla") && mozilla!=null){
				driver=mozilla;
			}else if(browserType.equals("Chrome") && chrome==null){
				System.setProperty("webdriver.chrome.driver", "D:\\libs\\chromedriver\\chromedriver.exe");
				driver=new ChromeDriver();
				chrome=driver;
			}else if(browserType.equals("Chrome") && chrome==null){
				driver=chrome;
			}
			else if(browserType.equals("IE")){
				// set the IE server exe path and initialize
			}
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return driver ;

	}
}
