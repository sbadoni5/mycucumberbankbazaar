Feature: Search page 

Background: Initialize all variables
      Given that Every thing is initialized
      
@SmokeTest2
Scenario: Verify search functionality
        Given I go tos "loginURL" on "Browser" 
        Then I verify search functionality       