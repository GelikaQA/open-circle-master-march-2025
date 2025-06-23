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
    And click Create new album button on Albums page
    And they enter "Mew" unique Album name in the pop up field
    And they click Create button

    Then they verify that they confirmation msg "Success Album has been created"


#    And they delete the Album they just created
#    And they click Bucket Button "xpath=(//div[contains(@class, 'albums_card')]//div[contains(@class, 'albums_bucketIcon')])[last()]"
#    And new album with the given name appears and disappears on the page
