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

  Scenario Outline: Pushing copy button to copy generated data in passcode field
    Given a user opens Create Circle page
    And they enter "<circle name>" in the Circle name field on the Create Circle page
    And they click the Generate button on the Create Circle page
    And they click copy button
    Then Input in first name field is the same as input in passcode field
    Examples:
      | circle name |
      | TestCircle5 |


  Scenario Outline:  Pushing copy button while passcode field is empty
      Given a user opens Create Circle page
      And they click copy button
      Then they see a warning popup message "<error popup>"
      Examples:
        | error popup               |
        | Generate PassCode firstly |


  @DeleteCircle
  Scenario: New circle is created, and user is logged into the newly created circle
    Given a user opens Create Circle page
    When they enter "TestCircle2025" in the Circle name field on the Create Circle page
    And they click the Generate button on the Create Circle page
    And they enter "FirstName" in the First Name field on the Create Circle Page
    And they enter "LastName" in the Last Name field on the Create Circle page
    And they enter a new email in the email field on the Create Circle page
    And they enter new password in the password field on the Create Circle page
    And they click the Create button on the Create Circle page
    Then they see a success popup message "You have successfully registered."
    And they enter new circle email in Email input field on Login page
    And they enter new circle password in Password input field on Login page
    And they click Sign In button on Login page
    And they verify that they are on Circle Home page