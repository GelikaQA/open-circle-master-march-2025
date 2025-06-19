Feature: create a new topic

  Scenario: the user create topic using unique name
    Given a Circle User is on Sign In page
    When they enter "ell@testings.com" address
    And they enter "Testings01!"
    And click Sign In button
    And click New Topic Plus Button
 # And they enter unique topic name
    And they enter "June3" in "xpath=//input[@placeholder]"
# And they click create button
    And they click "xpath=//button[@type='button' and @class='ant-btn css-o2xhy3 ant-btn-primary']/child::span"
# Then they see success message "Topic has been created"
    Then they verify that they see element "xpath=//span[contains(text(), 'Topic has been created')]"
