Feature: login

  Scenario: Successful login with valid credentials
#    Given user is on Open Circle login page http://opencircle.us/login
     Given  a user opens Login page
#    When they enter valid existing email on Login page
     When a user enter "ad1@testings.com" in email input field on Login page
#    And they enter a valid corresponding password on Login pages
     And a user enter "Test12345!" in password input field on Login page
#    And they click Sign In button
     And a user click Sign In button on Login page
#    Then they verify that they see element "xpath=//div[contains(@class, 'profile_container')]"
     Then a user verify that they on circle Home page