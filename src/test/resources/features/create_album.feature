Feature: createAlbum

  Scenario: A user creates a photo album


    Given a user is logged into the account
    And they click the Albums button
    And click Create new album button on Albums page
    And they enter "Bew" unique Album name in the pop up field in create new album window
    And they click Create button in create new album window

    And they see confirmation pop up window with text "Album has been created"


#    And click Bucket Button on the Album they just created
#    And they click Bucket Button "xpath=(//div[contains(@class, 'albums_card')]//div[contains(@class, 'albums_bucketIcon')])[last()]"
#    And new album with the given name appears and disappears on the page
