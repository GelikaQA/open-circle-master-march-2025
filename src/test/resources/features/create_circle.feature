Feature: Create Circle

  Scenario: Entering more characters than the set limit in the first name field

    Given a user opens Create Circle page
    When they enter "55^tX(A1zd32as2t5" in the Password field on the Create Circle page
    And they click the Submit button on the Admin page
    And they enter "TestCircleThree" in the Circle name field on the Create Circle page
    And they click the Generate button on the Create Circle page
    And they enter "TestFirstNameThatIsExtremelyLongF" in the First Name field on the Create Circle Page
    And they enter "TestLastName" in the Last Name field on the Create Circle page
    And they enter "testemail@test.com" in the email field on the Create Circle page
    And they enter "Password123" in the Password field on the Create Circle page
    And they click the Create button on the Create Circle page
    Then they are prompted by an error message