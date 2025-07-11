Feature: profile_management

  Scenario: Deleting profile picture
    Given a user is logged into the account
    And they click on the Avatar icon
    When they click on the Delete button
    Then the Upload button is present


  Scenario Outline: Updating last name containing number
    Given a user is logged into the account
    And they click on the Avatar icon
    When they clear Last name field on the Profile Page
    And they enter "<last name>" in Last name field on the Profile Page
    And they click the Save button
    Then Last name "<last name>" in Last Name field on Profile Page is present

    Examples:
      | last name |
      | Smith1    |


  Scenario Outline: First Name can be in lowercase letters
    Given a user is logged into the account
    And they click on the Avatar icon
    When they clear First name field on the Profile page
    And they enter "<first name>" in First name field on the Profile Page
    And they click the Save button
    Then First name on Profile page is updated to "<first name>"

    Examples:
      | first name |
      | mary       |