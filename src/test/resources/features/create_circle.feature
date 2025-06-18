Feature: Create Circle

  Scenario Outline: Entering more characters than the set limit in the first name field

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
    Then they are prompted by an error message

    Examples:
      | admin password    | circle name     | first name                        | last name    | email              | user password |
      | 55^tX(A1zd32as2t5 | TestCircleThree | TestFirstNameThatIsExtremelyLongF | TestLastName | testemail@test.com | Password123   |