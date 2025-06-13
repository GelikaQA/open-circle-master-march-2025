Feature: join_circle

  Scenario: ID 2, Show warning When Passcode is less than 6 digits
    Given user is on the page "http://opencircle.us/join"
    When they enter "JoinCircle" in "//input[@name='circleId']"
    And they enter "55566" in "//input[@name='passCode']"
    And they enter "Victoria" in "//input[@name='firstName']"
    And they enter "Palees" in "//input[@name='lastName']"
    And they enter "test@test.com" in "//input[@name='email']"
    And they enter "Password1" in "//input[@name='password']"
    And they click "//button[@type='submit']"
#    Then they are still on the Join Circle page as the registration was not  completed
#    And a warning message 'Incorrect Passcode. Please try again' is displayed under the Passcode field
    Then they verify that they see element "//div[@class='ant-notification-notice-description']//span[text()='Incorrect Passcode. Please try again']"