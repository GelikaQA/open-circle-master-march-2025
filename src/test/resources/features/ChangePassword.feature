Feature: Change Password

  Scenario Outline: Leaving the current password field empty triggers a warning message
    Given a user is logged into the account
    And they click Profile icon
    When they click Change password section
    And they enter "" in Current password input field
    And they enter "<password>" in New password input field
    And they click Save button
    Then assert message is displayed

    Examples:
      | password   |
      | Example123 |

  Scenario Outline:  Leaving the new password field empty triggers a warning message
    Given a user is logged into the account
    And they click Profile icon
    When they click Change password section
    And they enter "<valid password>" in Current password input field
    When they enter "" in New password input field
    And they click Save button
    Then assert message is displayed

    Examples:
      | valid password | warning message                                                                                                                                 |
      | Test12345!     | Field: newPassword; Error: Field should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20 |

  Scenario Outline: Submitting an invalid current password displays an error message
    Given a user is logged into the account
    And they click Profile icon
    When they click Change password section
    And they enter "<invalid password>" in Current password input field
    And they enter "<valid password>" in New password input field
    And they click Save button
    Then assert message is displayed

    Examples:
      | valid password | invalid password |
      | Example123     | theExample123    |