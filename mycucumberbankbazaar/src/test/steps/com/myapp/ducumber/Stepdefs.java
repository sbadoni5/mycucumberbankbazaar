package com.myapp.ducumber;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.myapp.ducumber.HomePage;
import com.myapp.ducumber.LaunchPage;
import com.myapp.ducumber.LoginPage;
import com.myapp.ducumber.MyProfilePage;
import com.myapp.ducumber.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefs {
	WebDriver driver = null;
	WebConnector webconn ;
	LaunchPage launchpage;
	LoginPage loginpage ;
	HomePage homepage;
	MyProfilePage myProfilePage;    
	public Stepdefs(){
//	 webconn = WebConnector.getInstance(); //new WebConnector();
//	 driver = webconn.driver;
//	 launchpage =PageFactory.initElements(driver, LaunchPage.class);
//	 loginpage =  PageFactory.initElements(driver, LoginPage.class);
//	 homepage = PageFactory.initElements(driver, HomePage.class);
//	 myProfilePage = PageFactory.initElements(driver, MyProfilePage.class);
		webconn = WebConnector.getInstance();
		launchpage = new LaunchPage();
		loginpage = new LoginPage(); 
		homepage = new HomePage();
		myProfilePage = new MyProfilePage();
	}
	
	@Given("^that Every thing is initialized$")
	public void Everythingisinit(){
		new Stepdefs();
	}
	
	
	@Given("I go tos \"([^\"]*)\" on \"([^\"]*)\"")
	public void I_gos_Login(String URL,String browser){
	//	LoginTest lt =  new LoginTest();
		System.out.println("I am going to "+ URL +" on  "+ browser);
	//	webconn.openBrowser(webconn.CONFIG.getProperty("browser"));
		webconn.navigate(URL);  
	}
	
	@Given("I enter \"loginusername\" as \"<Username>\" and \"loginpassword\" as \"<Password>\"")
	public void I_enter_loginname_and_password() throws InterruptedException{
		webconn.click1(launchpage.gettitlelogin());
		webconn.type1(webconn.CONFIG.getProperty("defaultUsername"), loginpage.getuseremail()); 
		webconn.type1(webconn.CONFIG.getProperty("defaultPassword"), loginpage.getpassword()); 
		webconn.click1(loginpage.getsignInNative());
	}
	
	@And("^Login should be \"([^\"]*)\"$")
	public void Login_should_be(String str){
	boolean  count =	homepage.getcheckname();
	if(count ==true){
		System.out.println("Login succesfully");
	}else{
		System.out.println("Login failed");
	}
	}
	
	@Given("^that I have already login$")
	public void Already_login(){
		boolean  count =	homepage.getcheckname();
		if(count ==true){
			System.out.println("I have already login");
		}else{
			System.out.println("No Login");
		}
	}
	
	@Given("^I click on my profile$")
	public void I_click_on_my_profile() throws Throwable {
//      Actions action = new Actions(driver);	  
//      action.moveToElement(homepage.getchecknames()).click();
//      action.moveToElement(myProfilePage.getmyproflink()).click();
	//	webconn.click1(homepage.getchecknames());
	//	webconn.click1(myProfilePage.getmyproflink());
      Thread.sleep(5000);
      WebElement element =  homepage.getAccountlink();
      JavascriptExecutor js =(JavascriptExecutor)webconn.driver;
      System.out.println("element is " +element);
      js.executeScript("window.scrollTo(0,'element.getLocation().y+')");
    
      element.click();
      System.out.println("clciked");
      Thread.sleep(5000);
      webconn.click1(myProfilePage.getmyproflink());
	}
	@Then("^I update all About you info$")
	public void update_all_About_you_info(DataTable tabdata){
		List<List<String>>  data = tabdata.raw();
		
		webconn.click1(myProfilePage.getEditicon1());
		webconn.type1(data.get(0).get(0),myProfilePage.getfirstname());
		webconn.type1(data.get(0).get(1),myProfilePage.getmiddleName());
		webconn.type1(data.get(0).get(2),myProfilePage.getlastName());
		
		String strdate[] = data.get(0).get(3).split("-");
		
		webconn.type1(strdate[0],myProfilePage.getday());
		webconn.type1(strdate[1],myProfilePage.getmonth());
		webconn.type1(strdate[2],myProfilePage.getyear());
 
	//	webconn.click1(myProfilePage.getdegree()); 
		webconn.click1(myProfilePage.getmastdegree()); 
		webconn.click1(myProfilePage.getmale()); 
		webconn.click1(myProfilePage.getbtnsave()); 
	
	}
	
	@Given("^I verify page elements$")
	public void I_verify_page_elements() throws InterruptedException{
		
		Actions action = new Actions(webconn.driver);
		WebElement element = homepage.getLoanslink() ;
        action.moveToElement(element).build().perform();
		System.out.println("ran");
		Thread.sleep(5000);
	//	Assert.assertEquals("matching",webconn.isElementPresent1(homepage.getperonalloan()), true);
	//	Assert.assertEquals("matching",webconn.isElementPresent1(homepage.gethomeloan()), true);
	//	Assert.assertEquals("matching",webconn.isElementPresent1(homepage.getcarloan()), true);
	

	}
	
	@Then("^I verify search functionality$")
	public void verifysearchfunctionality() throws InterruptedException{
		webconn.click1(homepage.getleftfilter());
		Thread.sleep(2000);
		webconn.click1(homepage.getselectsecondone());
		webconn.click1(homepage.getrightfilter());
		webconn.click1(homepage.getselectsecondtwo());
		//Assert.assertEquals("not matching",webconn.isElementPresent1(homepage.getsearchcar()), true);
		
		
	}
	
	
	
	
	
	
	
	

	@Then("^I find my full name \"(.*)\"$")
	public void I_find_my_full_name(String str)  {
	String strname =	webconn.getText(myProfilePage.getmyfullname());
	if(strname.equals(str)){
		System.out.println("Test case passing");
	}else{
		System.out.println("Test case failing");
	}
	}
	
	

}
