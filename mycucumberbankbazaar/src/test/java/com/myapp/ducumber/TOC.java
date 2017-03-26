package com.myapp.ducumber;
//package com.myapp.cucumber;
//
//import java.util.concurrent.TimeUnit;
//
//import junit.framework.Assert;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//
//public class TOC {
//
//	public static void main(String[] args) {
//
//		System.setProperty("webdriver.chrome.driver", "D:\\libs\\chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://www.bankbazaar.com/");
//
//		LaunchPage launchpage =PageFactory.initElements(driver, LaunchPage.class);
//		LoginPage loginpage =  PageFactory.initElements(driver, LoginPage.class);
//		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
//		
//         launchpage.gettitlelogin().click();
//         loginpage.getuseremail().sendKeys("sanjay.badoni.mca@gmail.com");
//         loginpage.getpassword().sendKeys("hewitt01");
//         loginpage.getsignInNative().click();
//         
//         Assert.assertTrue(homepage.getcheckname());
//         
//         
//         
//
//	}
//	
//
//}
