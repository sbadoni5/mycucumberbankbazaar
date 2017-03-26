package com.myapp.ducumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import com.myapp.ducumber.runner.*;

public class HooksDefined {

	LaunchPage	launchpage ;
	LoginPage	loginpage ;
	WebConnector	webconn ;
	@Before("@SmokeTest")
	public void doLogin(){
		launchpage = new LaunchPage();
		loginpage = new LoginPage(); 
		webconn = WebConnector.getInstance();
		webconn.navigate("loginURL");
		webconn.click1(launchpage.gettitlelogin());
		webconn.type1(webconn.CONFIG.getProperty("defaultUsername"), loginpage.getuseremail()); 
		webconn.type1(webconn.CONFIG.getProperty("defaultPassword"), loginpage.getpassword()); 
		webconn.click1(loginpage.getsignInNative());
	}

	@After
	public void exitTest(){
		webconn = WebConnector.getInstance();
		webconn.exitdriver();
	}



}
