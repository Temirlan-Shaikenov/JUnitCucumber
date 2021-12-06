@SmokeFeature
Feature: Test login page
	
#	@SmokeTest
  #Scenario: Check login page
    #Given user is on login page
    #When user enter name and password
    #And click on login button
    #Then check user home page

  Scenario Outline: Check login page
    Given user is on login page
    When user enter <name> and <password>
    And click on login button
    Then check user home page

    Examples: 
      | name    | password |
      | nameOne | 12345  |
      | nameTwo | 12345  |
