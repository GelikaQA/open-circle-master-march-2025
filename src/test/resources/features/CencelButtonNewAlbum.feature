Feature: Cancels creating a new album

  Scenario: Cancels creating a new album
    Given open page "http://opencircle.us/login"
    When they enter "ad1@testings.com" in "xpath=//input[@id='email']"
    And they enter "Test12345!" in "xpath=//input[@id='password']"
    And they click "xpath=//button[@type='submit']"
    When a user click Albums Buttom
    And they click create new album bottom
    And they type name Album
    And they click the Cancel button
