package com.myapp.ducumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myapp.ducumber.DriverHandler;
import com.myapp.ducumber.WebConnector;

public class LaunchPage extends WebConnector{

	WebDriver driver =null ;
	@FindBy(xpath="//a[@title='Login']")
	private WebElement titlelogin ;
	

	public LaunchPage(){
		this.driver = DriverHandler.getInstance();
	    PageFactory.initElements(driver, this);
	}
	
	public WebElement gettitlelogin(){
		return titlelogin;
	}

}
