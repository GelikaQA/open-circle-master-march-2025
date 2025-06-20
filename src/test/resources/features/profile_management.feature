Feature: profile_management

  Scenario: Deleting profile picture
    Given a user is logged into the account
# When they click on the Avatar icon
    And they click on the Avatar icon
# When they click on the Delete button
    And they click on the Delete button
# Then profile picture is removed
    Then they see the Upload button

  Scenario Outline: Updating last name containing number
    Given a user is logged into the account
    And they click on the Avatar icon
    When they clear Last name field on the Profile Page
    And they enter "<last name>" in Last name field on the Profile Page
    And they click the Save button
    Then Last name "<last name>" presented in Last name field

    Examples:
      | last name |
      | Smith1 |