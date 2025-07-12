Feature: join_circle

  Scenario Outline: Successful registration with valid space, passcode, and new email
  Given a user opens Join Circle page
  When they enter "<circle name>" in the field Circle Name on the Join Circle page
  And they enter "<passcode>" in the Passcode field on the Join Circle page
  And they enter "<first name>" in the First Name field on the Join Circle page
  And they enter "<last name>" in the Last Name field on the Join Circle page
  And they enter "<email>" in the Email field on the Join Circle page
  And they enter "<password>" in the Password field on the Join Circle page
  And They press button Join on the Join Circle page
  Then a confirmation message "Success! You have successfully registered" should be displayed
  And the user is redirected to "<circle name>"

  Examples:
    | circle name  |  | passcode | first name | last name | email                | password  |
    | Bootcamp2025 |  | bnqveD   | Iryna      | Martyniuk | test1234567@test.com | Qweasd123 |


  Scenario Outline: Show warning When Passcode is less than 6 digits
    Given a user opens Join Circle page
    When they enter "<circle name>" in the field Circle Name on the Join Circle page
    And they enter "<passcode>" in the Passcode field on the Join Circle page
    And they enter "<first name>" in the First Name field on the Join Circle page
    And they enter "<last name>" in the Last Name field on the Join Circle page
    And they enter "<email>" in the Email field on the Join Circle page
    And they enter "<password>" in the Password field on the Join Circle page
    And They press button Join on the Join Circle page
    Then they are still on the Join Circle page as the registration was not completed
    And Warning message appears: "<error message>"

    Examples:
      | circle name | passcode | first name | last name | email         | password  | error message                        |  |
      | JoinCircle  | 55566    | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |  |
      | JoinCircle  | 5556666  | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |  |
      | JoinCircle  | ab66cd   | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |  |
      | JoinCircle  | 999999   | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |  |


  Scenario Outline: Show warning When First Name exceeds 32 characters
    Given a user opens Join Circle page
    When they enter "<circle name>" in the field Circle Name on the Join Circle page
    And they enter "<passcode>" in the Passcode field on the Join Circle page
    And they enter "<first name>" in the First Name field on the Join Circle page
    And they enter "<last name>" in the Last Name field on the Join Circle page
    And they enter "<email>" in the Email field on the Join Circle page
    And they enter "<password>" in the Password field on the Join Circle page
    And They press button Join on the Join Circle page
    Then they are still on the Join Circle page as the registration was not completed
    And Warning message is displayed: "<error message>"

    Examples:
      |  | circle name | passcode | first name                               | last name | email         | password  | error message                                                                                 |
      |  | JoinCircle  | 55566    | VictoriaVictoriaVictoriaVictoriaVictoria | Palees    | test@test.com | Password1 | Field accepts alphabetical char and digits, no special chars allowed, limited to 32 character |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |
      |  |             |          |                                          |           |               |           |                                                                                               |