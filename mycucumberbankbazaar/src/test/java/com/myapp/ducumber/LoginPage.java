package com.myapp.ducumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myapp.ducumber.DriverHandler;

public class LoginPage {

	WebDriver driver  = null;
	@FindBy(id="user.email")              
	private WebElement useremail ;
	
	@FindBy(id="user.password")
	private WebElement userpassword ;
	
	@FindBy(id="signInNative")  
	private WebElement signInNative ;
	   
	public LoginPage(){
		this.driver = DriverHandler.getInstance();
	    PageFactory.initElements(driver, this);
	}
	
	public WebElement getuseremail(){
		return useremail;
	}
	public WebElement getpassword(){
		return userpassword;
	}
	public WebElement getsignInNative(){
		return signInNative;
	}
	
	
		
}
