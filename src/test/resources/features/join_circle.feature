Feature: join_circle

  Scenario: Show warning When Passcode is less than 6 digits
    Given a user opens Join Circle page
    When they enter 'JoinCircle' in the field Circle Name on the Join Circle page
    And enters '55566' in the Passcode field on the Join Circle page
    And enters 'Victoria' in the First Name field on the Join Circle page
    And enters 'Palees' in the Last Name field on the Join Circle page
    And enters 'test@test.com' in the Email field on the Join Circle page
    And enters 'Password1' in the Password field on the Join Circle page
    And They press button 'Join' on the Join Circle page
    Then they are still on the Join Circle page as the registration was not completed
    And a warning message 'Incorrect Passcode. Please try again' is displayed under the Passcode field
