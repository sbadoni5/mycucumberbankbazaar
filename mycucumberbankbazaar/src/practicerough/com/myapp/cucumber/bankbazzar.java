package com.myapp.cucumber;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bankbazzar {

	static WebDriver driver ;
	public static void main(String[] args) {
		
		//a[@title='Login']
		System.setProperty("webdriver.chrome.driver", "D:\\libs\\chromedriver\\chromedriver.exe");
	    driver  = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bankbazaar.com/");
		driver.findElement(By.xpath("//a[@title='Login']")).click();
        driver.findElement(By.id("user.email")).sendKeys("sanjay.badoni.mca@gmail.com"); 
        driver.findElement(By.id("user.password")).sendKeys("hewitt01");
        driver.findElement(By.id("signInNative")).click();
        Assert.assertTrue(isElementPresent("//*[text()='Hi Sanjay']"));
	}

	private static boolean isElementPresent(String str) {
     int  size =	driver.findElements(By.xpath(str)).size();
       if(size > 0){
    	   System.out.println("passed");
		return true;
       }
       else  {
    	   System.out.println("failed");
        return false;  
        
       }
	}

}
