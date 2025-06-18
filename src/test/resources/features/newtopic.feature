Feature: create a new topic

  Scenario: the user create topic using unique name
 # Given the user is signed in http://opencircle.us
    Given a Circle User is on Sign In page
 # And they enter valid existing email on Login page
    And they enter "ell@testings.com" in "xpath=//input[@id='email']"
 #  And they enter a valid corresponding password in login page
    And they enter "Testings01!" in "xpath=//input[@id='password']"
 # And they click  Sign In button
    When they click "xpath=//button[@type='submit']"
# And they click on topic creation button "+"
    And click New Topic Plus Button
 # And they enter unique topic name
    And they enter "June3" in "xpath=//input[@placeholder]"
# And they click create button
    And they click "xpath=//button[@type='button' and @class='ant-btn css-o2xhy3 ant-btn-primary']/child::span"
# Then they see success message "Topic has been created"
    Then they verify that they see element "xpath=//span[contains(text(), 'Topic has been created')]"
