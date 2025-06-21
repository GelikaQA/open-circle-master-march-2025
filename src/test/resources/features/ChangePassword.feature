Feature: Change Password

  Scenario: Warning message is displayed with empty current password text field
    Given a user is logged into the account
    And they click Profile icon
    When they click Change password section
    And they enter "" in Current password input field
    And they enter "Example123" in New password input field
    And they click Save button on Change Password page
    Then assert Warning message empty current password input field is displayed


    Scenario Outline: Warning message pops up when New password input field left empty
      Given a user is logged into the account
      And they click Profile icon
      When they click Change password section
      And they enter valid password  "<password>" in the Current password field on Change Password page
      When they enter "" in New password input field
      And they click Save button on Change Password page
      Then assert Warning message empty New password input field is displayed

      Examples:
        | password   |
        | Test12345! |

