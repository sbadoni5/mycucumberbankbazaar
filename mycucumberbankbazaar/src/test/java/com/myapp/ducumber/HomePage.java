package com.myapp.ducumber;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myapp.ducumber.DriverHandler;

public class HomePage {
	
	 WebDriver driver = null;
	@FindBy(xpath="//*[contains(text(),'Hi SANJAY')]")
	private WebElement checkname ;
	
	@FindBy(xpath="//*[contains(text(),'Hi SANJAY')]/../img")
	private WebElement checknames ;
	
	@FindBy(xpath="//a[@title='Apply Loan Online']") private WebElement Loanslink;
	@FindBy(xpath="//li[@class='loans-menu']//li/a[text()='Personal Loan']") private WebElement peronalloan;
	@FindBy(xpath="//li[@class='loans-menu']//li/a[text()='Home Loan']") private WebElement homeloan;
	@FindBy(xpath="//li[@class='loans-menu']//li/a[text()='Car Loan']") private WebElement carloan;
	@FindBy(xpath="(//span[@class='filter-option pull-left'])[1]") private WebElement leftfilter;
	@FindBy(xpath="(//span[@class='filter-option pull-left'])[2]") private WebElement rightfilter;
	@FindBy(xpath="(//li[@rel='3'])[1]/a") private WebElement selectsecondone;
	@FindBy(xpath="(//li[@rel='3'])[2]/a") private WebElement selectsecondtwo;
	@FindBy(xpath="(//*[contains(text(),'Welcome back, SANJAY')])[2]") private WebElement searchcar;
	
	
	
	
	  
	public HomePage(){
		this.driver = DriverHandler.getInstance();
	    PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoanslink(){
		return Loanslink;
	}
	public boolean getcheckname(){
		
		return isElementPresent("//*[contains(text(),'Hi SANJAY')]");
	}
	
	public WebElement getAccountlink(){
	WebElement element = driver.findElement(By.id("my-account-link"));
	return element; 
	}
	
	public WebElement getchecknames(){
		return checknames;
	}
	
	public WebElement getperonalloan(){
		return peronalloan;
	}
	public WebElement gethomeloan(){
		return homeloan;
	}
	public WebElement getcarloan(){
		return carloan;
	}
	
	
	public WebElement getleftfilter(){
		return leftfilter;
	}
	
	public WebElement getrightfilter(){
		return rightfilter;
	}
	
	public WebElement getselectsecondone(){
		return selectsecondone;
	}
	
	public WebElement getselectsecondtwo(){
		return selectsecondtwo;
	}
	public WebElement getsearchcar(){
		return searchcar;
	}
	
	private  boolean isElementPresent(String str) {
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
