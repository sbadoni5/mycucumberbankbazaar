package com.myapp.ducumber;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class WebConnector {
	// initialize properties file
	// logging
	// selenium/webdriver layer -  selenium commands
	
	Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	Properties OR = null;
	public static Properties CONFIG=null;
	public WebDriver driver =null;
	WebDriver mozilla=null;
	WebDriver chrome=null;
	WebDriver ie=null;
	static WebConnector w=null;
	
	public WebConnector(){
		
		if(OR==null && w==null){
			try{
			  // initialize OR
				OR = new Properties();
				FileInputStream fs  = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\myapp\\ducumber\\config\\env.properties");
				OR.load(fs);
				
				// initialize CONFIG to corresponding env
				CONFIG= new Properties();
				fs  = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\myapp\\ducumber\\config\\"+OR.getProperty("testEnv")+"_config.properties");
				CONFIG.load(fs);
				
				//System.out.println(OR.getProperty("loginusername"));
				System.out.println(CONFIG.getProperty("browser"));
			//	openBrowser(CONFIG.getProperty("browser"));
				this.driver = DriverHandler.getInstance();
				
			}catch(Exception e){
				e.printStackTrace(); 
				System.out.println("Error on intializing properties files");
			}
			
			
			
		}
		
	}
	
	/// ****************Application Independent functions************************ ///

	// opening the browser
	public void openBrowser(String browserType){
		log("Opening browser "+browserType);
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
		// max
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	// navigates to a URL
	public void navigate(String URL){
		log("Naviating to "+CONFIG.getProperty(URL));
		driver.get(CONFIG.getProperty(URL));
	}
	// clicking on any object
	public void click(String objectName){
		log("Clicking on " + objectName);
		driver.findElement(By.xpath(OR.getProperty(objectName))).click();
	}
	public void click1(WebElement webelem){
		log("Clicking on " + webelem);
		webelem.click();
	}
	public void type(String text, String objectName){
		log("Typing in " + objectName);
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}
	public void type1(String text, WebElement webelem){
		log("Typing in " + text);
	   webelem.sendKeys(text);
	}
	
	public void select(String text, String objectName){
		log("Selecting from "+ objectName);
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}
	
	public boolean isElementPresent(String objectName){
		log("Checking object presence "+ objectName);
		int count = driver.findElements(By.xpath(OR.getProperty(objectName))).size();
		if(count==0)
			return false;
		else
			return true;
	}
	public boolean isElementPresent1(WebElement elem){
      
		if(elem.isDisplayed()){
			return true;
		}else
			return false;
	}
	
	public String getText(WebElement elem){
		
		return elem.getText();
	}

	
	
	
	/// ****************Application dependent functions************************ ///
	
	public boolean isLoggedIn(){
		
		if(isElementPresent("searchText"))
			return true;
		else
			return false;
	}
	
	public void doDefaultLogin(){
		navigate("loginURL");
		type(CONFIG.getProperty("defaultUsername"), "loginusername");
		type(CONFIG.getProperty("defaultPassword"), "loginpassword");
		click("loginButton");
	}
	
	
	/********Singleton**********/
	public static WebConnector getInstance(){
		System.out.println("w is " + w);
		if(w==null)
			w= new WebConnector();
		return w;
	}
	
	/**************Logging***************/
	public void log(String msg){
		APPLICATION_LOGS.debug(msg);
	}
	public void exitdriver(){
		driver.quit();
		w=null;
		OR=null;
		DriverHandler.driver=null;
		DriverHandler.chrome=null;
	}
	
}
