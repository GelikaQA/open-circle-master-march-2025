Feature: createAlbum

  Scenario Outline: A user creates a photo album
    Given a user is logged into the account
    And they click the Albums button
    And click Create new album button on Albums page
    And they enter "<album name>" unique Album name in the pop up field in create new album window
    And they click Create button in create new album window
    And they verify that Success Message appears
    Then they assert the album name "<album name>" presented on Album Page
    And they delete album named "<album name>" from Album Page

    Examples:
      | album name |
      | newAlbum   |