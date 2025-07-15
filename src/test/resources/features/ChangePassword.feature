Feature: Change Password

  Scenario Outline: Leaving the current password field empty triggers a warning message
    Given a user is logged into the account
    And they click Profile icon
    When they click Change password section
    And they enter "" in Current password input field on Change password page
    And they enter "<password>" in New password input field on Change password page
    And they click Save button on Change password page
    Then assert warning message pops-up "<warning message>"

    Examples:
      | password   | warning message                                                                                                                                 |
      | Example123 | Field: oldPassword; Error: Field should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20|

  Scenario Outline:  Leaving the new password field empty triggers a warning message
    Given a user is logged into the account
    And they click Profile icon
    When they click Change password section
    And they enter "<valid password>" in Current password input field on Change password page
    When they enter "" in New password input field on Change password page
    And they click Save button on Change password page
    Then assert warning message pops-up "<warning message>"


    Examples:
      | valid password | warning message                                                                                                                                 |
      | Test12345!     | Field: newPassword; Error: Field should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20 |

  Scenario Outline: Submitting an invalid current password displays an error message
    Given a user is logged into the account
    And they click Profile icon
    When they click Change password section
    And they enter "<invalid password>" in Current password input field on Change password page
    And they enter "<valid password>" in New password input field on Change password page
    And they click Save button on Change password page
    Then assert warning message pops-up "<warning message>"

    Examples:
      | valid password | invalid password | warning message    |
      | Example123     | theExample123    | Incorrect password |


  @changePassword
  Scenario Outline: Success message is displayed on clicking Save with valid current password
    Given a user is logged into the account
    And they click Profile icon
    When they click Change password section
    And they enter current valid password in Current password input field on Change password page
    And they enter "<new password>" in New password input field on Change password page
    And they click Save button on Change password page
    Then success message password has been changed displayed

    Examples:
      | new password |
      | Example122   |