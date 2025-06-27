Feature: Cancel creating a new album
  Scenario: User cancels the creation of a new album
    Given a user is logged into the account
    When the user clicks the Albums button
    And they click the Create New Album button
    And they enter a name for the album
    And they click the Cancel button
