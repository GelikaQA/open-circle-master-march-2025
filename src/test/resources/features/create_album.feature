Feature: createAlbum

  Scenario: A user creates a photo album
#    Given they are registered and joined the Circle
    Given open page "http://opencircle.us/login"
#    When they enter valid existing email on Login page
    When they enter "arkadiy.popovtest@gmail.com" in "xpath=//input[@id='email']"
#    And they enter a valid corresponding password on Login pages
    And they enter "1234Qwer" in "xpath=//input[@id='password']"
#    And they click Sign In button
    And they click "xpath=//button[@type='submit']"


    And they click the Albums button
#    And they click "xpath=//div[text()='Albums']"
#    And click Create new album button on Albums page
    And click Create new album button on Albums page
#    And they click "xpath=//b[text()='Create new']"
#    And they enter a new unique Album name????
    And they enter "Old" in "xpath=//input[@id='form_in_modal_title']"
#    And click Create button on Create New Album modal
    And they click "xpath=//span[text()='Create']"
#    Then a confirmation message appears "Success Album has been created"
    Then they verify that they see element "xpath=//div[@class='ant-notification-notice-with-icon']"
#    And delete created Album
    And they click "xpath=(//div[contains(@class, 'albums_bucketIcon')])[1]"
#    And new album with the given name appears and disappears on the page
