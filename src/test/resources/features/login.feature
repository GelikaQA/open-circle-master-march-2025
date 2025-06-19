Feature: login

  Scenario: Successful login with valid credentials
     Given  a user opens Login page
     When they enter "ad1@testings.com" in Email input field on Login page
     And they enter "Test12345!" in Password input field on Login page
     And they click Sign In button on Login page
     Then they verify that they are on Circle Home page