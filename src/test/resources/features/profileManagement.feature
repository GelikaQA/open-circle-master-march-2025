Feature: profileManagement

  Scenario: Deleting profile picture
#  Given user is on Open Circle login page http://opencircle.us/login
    Given open page "http://opencircle.us/login"
#  And they enter valid existing email on Login page
    And they enter "corinatiron.test@gmail.com" in "xpath=//input[@id='email']"
#    And they enter a valid corresponding password on Login pages
    And they enter "Class.qa.2025@" in "xpath=//input[@id='password']"
#  And they click Sign In button
    And they click "xpath=//button[@type='submit']"
# When they click on the Avatar icon
    And they click on the Avatar icon
# When they click on the Delete button
    And they click on the Delete button
# Then profile picture is removed
    Then they see the Upload button
