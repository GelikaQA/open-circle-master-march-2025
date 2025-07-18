Feature: Create Circle


  Scenario Outline: First name field error message validation

    Given a user opens Create Circle page
    When they enter "<admin password>" in the Password field on the Create Circle page
    And they click the Submit button on the Admin page
    And they enter "<circle name>" in the Circle name field on the Create Circle page
    And they click the Generate button on the Create Circle page
    And they enter "<first name>" in the First Name field on the Create Circle Page
    And they enter "<last name>" in the Last Name field on the Create Circle page
    And they enter "<email>" in the email field on the Create Circle page
    And they enter "<user password>" in the Password field on the Create Circle page
    And they click the Create button on the Create Circle page
    Then error message pops-up "<error message>" below First Name field on Create Circle page

    Examples:
      | admin password    | circle name     | first name                        | last name    | email               | user password | error message                                                                                  |
      | 55^tX(A1zd32as2t5 | TestCircleThree | TestFirstNameThatIsExtremelyLongF | TestLastName | testemail@test.com  | Password123   | Field accepts alphabetical char and digits, no special chars allowed, limited to 32 characters |
      | 55^tX(A1zd32as2t5 | CircleTester    |                                   | TestLastName | testing123@test.com | Password123   | This input is required.                                                                        |
      | 55^tX(A1zd32as2t5 | TestCircleThree | TestFirstName@                    | TestLastName | testemail@test.com  | Password123   | Field accepts alphabetical char and digits, no special chars allowed, limited to 32 characters |