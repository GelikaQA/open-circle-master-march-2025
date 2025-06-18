Feature: Change Password

  Scenario: Warning message is displayed with empty current password text field
    Given the user is signed in to Open Circle
    When they enter "jamesmusaev2@gmail.com" in Email input field on login page
    And they enter "Password123@" in Password input field on login page
    And they click Sign in button on login page
    And they click Profile icon
    And they click Change password section
    And they enter "" in Current password input field
    And they enter "Example123" in New password input field
    And they click Save button
    Then they verify that they see Warning message empty current password input field
