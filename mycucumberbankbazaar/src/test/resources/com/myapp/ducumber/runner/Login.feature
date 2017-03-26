Feature: Login into bankbazaar site

Background: Initialize all variables
      Given that Every thing is initialized

@SmokeTest5
Scenario Outline: Login into bankbazaar site 
  
	Given I go tos "loginURL" on "<Browser>" 
	And I enter "loginusername" as "<Username>" and "loginpassword" as "<Password>"
	Then Login should be "<Expected_Result>"
	Examples: 
		|loginURL|Browser|Expected_Result|
		|https://www.bankbazaar.com/|chrome|pass|
		
@SmokeTest		
Scenario: Verify my profile page
    Given that I have already login
    And I click on my profile
    ##Then I find my full name "SANJAY BADONI"
    Then I update all About you info	
	  |SANJAY|PRASAD|BADONI|23-03-1990|MALE|MARRIED|Masters Degree|Indian|
	 
	#test case of entire profile filling   # not needed
	# test case for My investment   # not needed
	# test cases for all links in home page
	# test case for search func on other feature file
	
  #	today target 
  # upload on git
  # use jenkins
  # sauce labs
	
