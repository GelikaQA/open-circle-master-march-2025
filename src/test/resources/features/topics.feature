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

  Scenario Outline: User creates topic with valid characters and length
    Given a user is logged into the account
    When they lick New Topic Plus Button
    And they enter "<Topic name>" in new topic name input field
    And they click on Create button on topic page
    Then success message "<Success message>" pops-up on Topic page

    Examples:
      | Topic name                                                          | Success message        |
      | qwertyQWERTY                                                        | Topic has been created |
      | qwerty_QWERTY                                                       | Topic has been created |
      | qwerty-Qwerty                                                       | Topic has been created |
      | TopicTopicTopicTopicTopicTopicTopicTopicTopicTopicTopicTopicTopicTo | Topic has been created |

  Scenario Outline: the user creates a topic without a unique name
    Given a user is logged into the account
    When they lick New Topic Plus Button
    And they enter "<Exists Topic name>" in topic name input field
    And they click on Create button on topic page
    Then they see a warning popup message "<Warning message>"

    Examples:
      | Exists Topic name          | Warning message             |
      | qwerty_QWERTY1752805336376 | Topic with this name exists |
      | qwerty-Qwerty1752805340732 | Topic with this name exists |
      | qwertyQWERTY1752805331988  | Topic with this name exists |
