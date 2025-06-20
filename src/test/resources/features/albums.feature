Feature: albums

  Scenario: Any user can create a photo album
 #   DELETE album "uniqueAlbumName" before running the test
    Given a user is logged into the account
    And a user opens Albums Page
    And they click Create New on Album Page
    And they wait for Create New Album Window is visible
    And they enter title "uniqueAlbumName" in Create New Album Window
    And they click Create Button in Create New Album Window
    And they verify that they see Successful Creation Message
    Then they assert the album name "uniqueAlbumName" presented on Album Page
    # to delete created album with the specific name: (xpath doesn't work )
    # And they click "xpath=//div[contains(@class,'albums_text')]/descendant::b[text()='uniqueAlbumName']/../../div/div[2]"