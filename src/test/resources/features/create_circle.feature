Feature: Create Circle


  Scenario Outline: First name field error message validation

    Given a user opens Create Circle page
    And they enter "<circle name>" in the Circle name field on the Create Circle page
    And they click the Generate button on the Create Circle page
    And they enter "<first name>" in the First Name field on the Create Circle Page
    And they enter "<last name>" in the Last Name field on the Create Circle page
    And they enter "<email>" in the email field on the Create Circle page
    And they enter "<user password>" in the password field on the Create Circle page
    And they click the Create button on the Create Circle page
    Then error message pops-up "<error message>" below First Name field on Create Circle page

    Examples:
      | circle name     | first name                        | last name    | email               | user password | error message                                                                                  |
      | TestCircleThree | TestFirstNameThatIsExtremelyLongF | TestLastName | testemail@test.com  | Password123   | Field accepts alphabetical char and digits, no special chars allowed, limited to 32 characters |
      | CircleTester    |                                   | TestLastName | testing123@test.com | Password123   | This input is required.                                                                        |
      | TestCircleThree | TestFirstName@                    | TestLastName | testemail@test.com  | Password123   | Field accepts alphabetical char and digits, no special chars allowed, limited to 32 characters |

  Scenario Outline: Attempting to enter input into passcode field
    Given a user opens Create Circle page
    And they enter "<passcode>" in Passcode field on Create Circle page
    Then Passcode field contains ""
    Examples:
      | passcode |
      | Abcd12@  |

  Scenario Outline:  Pushing copy button while passcode field is empty
      Given a user opens Create Circle page
      And they click copy button
      Then they see a warning popup message "<error popup>"
      Examples:
        | error popup               |
        | Generate PassCode firstly |