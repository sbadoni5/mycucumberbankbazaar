package com.myapp.ducumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myapp.ducumber.DriverHandler;

public class MyProfilePage {

	WebDriver driver =null;

	@FindBy(xpath="//span[@class='nametrim']/following-sibling::i")
	private WebElement downarrow ;
	
//	@FindBy(xpath="//ul[@class='child-main-menu']/li/a[@title='Profile']")
	@FindBy(xpath="//a[@id='profileTab']")
	private WebElement  myproflink;
	
	
	@FindBy(xpath="//div[@class='profile-name font-md']")	private WebElement myfullname;
	
	@FindBy(xpath="(//span[@class='edit-icon'])[1]") private WebElement Editicon1 ;
	@FindBy(xpath="//input[@name='personalInfo.applicantDetail.firstName']") private WebElement firstname ;
	@FindBy(xpath="//input[@name='personalInfo.applicantDetail.middleName']") private WebElement middleName;
	@FindBy(xpath="//input[@name='personalInfo.applicantDetail.lastName']") private WebElement lastName;
	@FindBy(name="persoanalDob.day") private WebElement day;
	@FindBy(name="persoanalDob.month") private WebElement month;
	@FindBy(name="persoanalDob.year") private WebElement year;
	@FindBy(xpath="//option[text()='EDUCATIONAL QUALIFICATION']/../*[text()='Masters Degree']")
	private WebElement mastdegree ;
	@FindBy(xpath="//span[text()=' GENDER']/../label[@for='newAppForm_personalInfo_applicantDetail_genderMale']")
	private WebElement male ;
	@FindBy(xpath="//button[text()='Save']") private WebElement btnsave;
	@FindBy(name="personalInfo.applicantDetail.highestEducationalQualification") private WebElement degree;

	public MyProfilePage(){
		this.driver = DriverHandler.getInstance();
	    PageFactory.initElements(driver, this);
	}

   public  WebElement getdownarrow(){
	return downarrow;
   }
   public  WebElement getmyproflink(){
		return myproflink;
	   }
   public  WebElement getmyfullname(){
		return myfullname;
	   }

   public WebElement getEditicon1(){	   return Editicon1;   }
   public WebElement getfirstname(){	   return firstname;   }
   public WebElement getmiddleName(){	   return middleName;   }
   public WebElement getlastName(){	      return lastName;   }
   public WebElement getday(){	   return day;   }
   public WebElement getmonth(){	   return month;   }
   public WebElement getyear(){	   return year;   }
   public WebElement getmastdegree(){	   return mastdegree;   }
   public WebElement getmale(){	   return male;   }
   public WebElement getbtnsave(){	   return btnsave;   } 
   public WebElement getdegree(){	   return degree;   } 
   
   
   
   
}
