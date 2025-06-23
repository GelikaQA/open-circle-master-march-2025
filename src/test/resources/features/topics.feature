Feature: topics

  Scenario Outline: Success message displayed when user created new topic
    Given a user is logged into the account
    When they lick New Topic Plus Button
    And they enter "<Topic name>" in new topic name input field
    And they click on Create button on topic page
    Then success message "<Success message>" pops-up on Topic page

    Examples:
      | Topic name | Success message        |
      | LadyInRed  | Topic has been created |