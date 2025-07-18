Feature: delete Album

  Scenario Outline: Deleting the album that user created
    Given a user is logged into the account
    And they create new album with the name "<album name>"
    And they see a success popup message "Album has been created"
    And they assert the album name "<album name>" presented on Album Page
    And they delete album named "<album name>" from Album Page
    Then they do not see the album name "<album name>" on Album Page

    Examples:
      | album name |
      | name       |

  Scenario Outline: User cannot delete album that they didn't create
    Given a user is logged into the account
    And they create new album with the name "<album name>"
    And they see a success popup message "Album has been created"
    And a user is logged out of the account
    And another user 2 is logged into the account
    And they click the Albums button
    And they assert delete icon for the album "<album name>" is not displayed
    And a user is logged out of the account
    And another user 1 is logged into the account
    And they click the Albums button
    And they assert delete icon for the album "<album name>" is displayed
    And they delete album named "<album name>" from Album Page
    Then they do not see the album name "<album name>" on Album Page

Examples:
  | album name |
  | album      |