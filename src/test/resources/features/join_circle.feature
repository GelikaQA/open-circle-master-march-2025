Feature: join_circle

  Scenario: Show warning When Passcode is less than 6 digits
    Given a user opens Join Circle page
    When they enter "JoinCircle" in the field Circle Name on the Join Circle page

#    And enters ""55566"" in the Passcode field on the Join Circle page
#    And they enter "55566" in "//input[@name='passCode']"
    And they enter "55566" in "name=passCode"
#    And enters ""Victoria"" in the First Name field on the Join Circle page
#    And they enter "Victoria" in "//input[@name='firstName']"
    And they enter "Victoria" in "name=firstName"
#    And enters ""Palees"" in the Last Name field on the Join Circle page
#    And they enter "Palees" in "//input[@name='lastName']"
    And they enter "Palees" in "name=lastName"
#    And enters ""test@test.com"" in the Email field on the Join Circle page
#    And they enter "test@test.com" in "//input[@name='email']"
    And they enter "test@test.com" in "name=email"
#    And enters ""Password1"" in the Password field on the Join Circle page
#    And they enter "Password1" in "//input[@name='password']"
    And they enter "Password1" in "name=password"
#    And They press button 'Join' on the Join Circle page
#    And they click "//button[@type='submit']//span[text()='Join']"
    And they click "xpath=//button[@type='submit']//span[text()='Join']"
#    Then they are still on the Join Circle page as the registration was not  completed
    Then they verify that they see element "xpath=//div[contains(@class,'login_auth_body')]//h1[text()='Join Circle']"
#    And a warning message 'Incorrect Passcode. Please try again' is displayed under the Passcode field
    And they verify that they see element "xpath=//div[@class='ant-notification-notice-description']//span[text()='Incorrect Passcode. Please try again']"