Feature: login

  Scenario: Successful login with valid credentials
#    Given user is on Open Circle login page http://opencircle.us/login
#    Given open page "http://opencircle.us/login"
     Given  a user opens Login page
#    When they enter valid existing email on Login page
#    When they enter "ad1@testings.com" in "xpath=//input[@id='email']"
     When a user enter "ad1@testings.com" in email input field on Login page
#    And they enter a valid corresponding password on Login pages
#    And they enter "Test12345!" in "xpath=//input[@id='password']"
     And a user enter "Test12345!" in password input field on Login page
#    And they click Sign In button
#    And they click "xpath=//button[@type='submit']"
     And a user click click Sign In button on Login page
#    Then they are on Circle Home page
#    Then they verify that they see element "xpath=//div[contains(@class, 'profile_container')]"
     Then a user verify that they on circle Home page