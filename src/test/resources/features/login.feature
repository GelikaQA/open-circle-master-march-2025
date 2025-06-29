Feature: login

  Scenario Outline: Successful login with valid credentials
     Given a user opens Login page
     When they enter "<valid_email>" in Email input field on Login page
     And they enter "<valid_password>" in Password input field on Login page
     And they click Sign In button on Login page
     Then they verify that they are on Circle Home page

    Examples:
      | valid_email      | valid_password |
      | ad1@testings.com | Test12345!     |

  Scenario Outline: Error message for invalid email format
      Given a user opens Login page
      When they enter "<invalid_email>" in Email input field on Login page
      And they enter "<valid_password>" in Password input field on Login page
      And they click Sign In button on Login page
      Then error message under the email field is displayed: 'Invalid email address, limited to 32 characters'

      Examples:
        | invalid_email                     | valid_password |
        | validemail.com                    | Test12345!     |
        | v@al                              | Test12345!     |
        | v@al.                             | Test12345!     |
        | v@a.l                             | Test12345!     |
        | va@alidemailmorethan32charact.ers | Test12345!     |
        | mail@identity.digital             | Test12345!     |
        | ad1@testings.com·                 | Test12345!     |

  Scenario: Error message displays for empty email field
    Given a user opens Login page
    When they clear email field
    And click Sign In button
    Then error message under the required email field is displayed: "This input is required."

  Scenario Outline: Error message for invalid password format
    Given a user opens Login page
    When they enter "<invalid_password>" in Password input field on Login page
    And click Sign In button
    Then error message under the password field is displayed: "Field should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20"

    Examples:
      | invalid_password |
      | 123              |
      | 123pppooo |
      | 123pppO  |
      | 123fourFiveSixSeven12 |

