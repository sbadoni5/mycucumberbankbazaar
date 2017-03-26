package com.myapp.ducumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
//@Cucumber.Options(format={"html:output1"},tags = {"@SmokeTest,@SmokeTest1,@SmokeTest2"})
@CucumberOptions(format={"json:target/Destination/cucumber.json"},tags ={"@SmokeTest"},
                        glue={"com.myapp.ducumber"}
		
		)  // {"@SmokeTest,@SmokeTest1,@SmokeTest2"})
public class RunnerTest {
  
}  



//@RunWith(Cucumber.class)    
//@CucumberOptions 
//(features = "src/test/java/testStep/",#Path for the Feature files Folder.Given you have 
//smoke.feature and login.feature files present in the Path#
//plugin ={"pretty","html:reports/test-report"},#Path for the Reports Html Folder#
//tags= {"@smoke,@login"})#Declaring multiple Feature names of files#