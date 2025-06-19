Feature: Cancels creating a new album

    Scenario: Cancels creating a new album
#    Given user is on Open Circle login page http://opencircle.us/login
        Given open page "http://opencircle.us/login"
#    When they enter valid existing email on Login page
        When they enter "ad1@testings.com" in "xpath=//input[@id='email']"
#    And they enter a valid corresponding password on Login pages
        And they enter "Test12345!" in "xpath=//input[@id='password']"
#    And they click Sign In button
        And they click "xpath=//button[@type='submit']"
#    Then they are on Circle Home page

#  Scenario: User cancels creating a new album
        And a user click Albums Buttom
#       And user open home page albums "xpath=//div[text()='Albums']"
        And they click create new Album button
#      And they click on the Create New button
       # And they click "xpath=//b[text()='Create new']"
        And they type name Album
#      And they enter unique name Album
        #And  they enter "Automate" in "xpath=//*[@id='form_in_modal_title']"
        And they click the Cancel button
        #And they click "xpath=//div[contains(@class, 'ant-modal-footer')]//button[1]"
#     Then there is no new album and return on Circle Home page
