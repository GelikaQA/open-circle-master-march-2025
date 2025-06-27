Feature: join_circle

  Scenario Outline: Show warning When Passcode is less than 6 digits
    Given a user opens Join Circle page
    When they enter "<circle name>" in the field Circle Name on the Join Circle page
    And they enters "<passcode>" in the Passcode field on the Join Circle page
    And they enters "<first name>" in the First Name field on the Join Circle page
    And they enters "<last name>" in the Last Name field on the Join Circle page
    And they enters "<email>" in the Email field on the Join Circle page
    And they enters "<password>" in the Password field on the Join Circle page
    And They press button 'Join' on the Join Circle page
    Then they are still on the Join Circle page as the registration was not completed
    And Warning message appears: "<error message>"

    Examples:
      | circle name | passcode | first name | last name | email         | password  | error message                        |  |
      | JoinCircle  | 55566    | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |  |
      | JoinCircle  | 5556666  | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |  |
      | JoinCircle  | ab66cd   | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |  |
      | JoinCircle  | 999999   | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |  |







