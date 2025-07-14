Feature: join_circle

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
      | circle name | passcode | first name | last name | email         | password  | error message                        |
      | JoinCircle  | 55566    | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |
      | JoinCircle  | 5556666  | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |
      | JoinCircle  | ab66cd   | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |
      | JoinCircle  | 999999   | Victoria   | Palees    | test@test.com | Password1 | Incorrect Passcode. Please try again |

  Scenario Outline: Show warning When First Name exceeds 32 characters or if less than 1 character long
    Given a user opens Join Circle page
    When they enter "<circle name>" in the field Circle Name on the Join Circle page
    And they enter "<passcode>" in the Passcode field on the Join Circle page
    And they enter "<first name>" in the First Name field on the Join Circle page
    And they enter "<last name>" in the Last Name field on the Join Circle page
    And they enter "<email>" in the Email field on the Join Circle page
    And they enter "<password>" in the Password field on the Join Circle page
    And They press button Join on the Join Circle page
    Then they are still on the Join Circle page as the registration was not completed
    And under the field First Name the Warning message is displayed: "<error message>"


    Examples:
      | circle name | passcode | first name                               | last name | email         | password  | error message                                                                                 |
      | JoinCircle  | 55566    | VictoriaVictoriaVictoriaVictoriaVictoria | Palees    | test@test.com | Password1 | Field accepts alphabetical char and digits, no special chars allowed, limited to 32 character |
      | JoinCircle  | 55566    |                                          | Palees    | test@test.com | Password1 | This input is required                                                                        |

  Scenario Outline: the password should not be copied from context menu

    Given a user opens Join Circle page
    When they enter "<password>" in the Password field on the Join Circle page
    And they selected and copy entered password on the Join Circle page
    Then The password is not copied into clipboard

    Examples:
      | password |
      | 123456z  |

  Scenario: The password is masked

    Given a user opens Join Circle page
    Then The password is masked on Join Circle Page

#  Scenario Outline: the password should not be copied from context menu
#
#    Given a user opens Join Circle page
#    When they enter "<password>" in the Password field on the Join Circle page
#    And they selected entered password on the Join Circle page
#    And they activated context menu on the Join Circle page
#    And they copy password from the context menu on the Join Circle page
#    Then The password is not copied into clipboard
#
#    Examples:
#      | password |
#      | 123456z  |