@testBackground
Feature: Test login page
	
  Background: Check login page
    Given user is on login page
    When user enter name and password
    And click on login button
    Then check user home page
    
  Scenario: Check picture
  	When click picture
  	Then zoom picture
  	
  Scenario: Check video
  	When open video
  	Then play video