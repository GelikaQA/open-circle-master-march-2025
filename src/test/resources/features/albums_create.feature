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

  Scenario Outline: User can not create a photo album without a unique name
    Given a user is logged into the account
    And they create new album with the name "<duplicate name>"
    And they verify that Success Message appears
    And they create new album with the name "<duplicate name>"
    And they verify that Warning Message appears
    And they click Cancel button on Create New Button Window
    And they delete album named "<duplicate name>" from Album Page

    Examples:
      | duplicate name |
      | TEST123        |