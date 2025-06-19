Feature: login

  Scenario: Successful login with valid credentials
     Given  a user opens Login page
     When they enter "ad1@testings.com" in Email input field on Login page
     And they enter "Test12345!" in Password input field on Login page
     And they click Sign In button on Login page
     Then they verify that they are on Circle Home page


  Scenario Outline: Error message for invalid email format

      Given a user opens Login page
      When they enter "<invalid email>" in Email input field on Login page
      And they enter "Test12345!" in Password input field on Login page
      And they click Sign In button on Login page
      Then error message under the email field is displayed: 'Invalid email address, limited to 32 characters'

      Examples:
        | invalid email  |
        | validemail.com |
        |v@al|
        |v@al.|
        |v@a.l|
        |va@alidemailmorethan32charact.ers|
        |mail@identity.digital|
#        |"ad1@testings.com " | We have to test trailing space, however the system, truncate space and we have to return to it later as told Angelina

