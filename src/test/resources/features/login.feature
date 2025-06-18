Feature: login

  Scenario: Successful login with valid credentials
#    Given user is on Open Circle login page http://opencircle.us/login
    Given user open page "http://opencircle.us/login"
#    When they enter valid existing email on Login page
    When they enter "ad1@testings.com" in "xpath=//input[@id='email']"
#    And they enter a valid corresponding password on Login pages
    And they enter "Test12345!" in "xpath=//input[@id='password']"
#    And they click Sign In button
    And they click "xpath=//button[@type='submit']"
#    Then they are on Circle Home page
    Then they verify that they see element "xpath=//div[contains(@class, 'profile_container')]"