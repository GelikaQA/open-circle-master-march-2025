Feature: Change Password

  Scenario: Warning message is displayed with empty current password text field
    Given they click Profile icon
    When they click Change password section
    And they enter "" in Current password input field
    And they enter "Example123" in New password input field
    And they click Save button
    Then assert Warning message empty current password input field is displayed

