Feature: To valid login functionality in the Facebook application

  Scenario: To valiate with invalid username and pasword
    Given User has to launch the browser and max the window
    When User has to lauch th fb appl in broswer
    When User has to pass invalid username in email field
    When User has to pass the invalid password in password field
    When User has to click the login button
    Then User has to close the broswer

  Scenario Outline: To valiate the fb appl with invalid username and invalid password
    When User has to launch the chrome broswer
    When User has launch the fb url
    When User has to pass invalid username"<emailfield>" in email field
    When User has to pass invalid password"<password field>" in password field
    When User has click the login button
    Then User has to close the broswer

    Examples: 
      | emailfield           | password field |
      | ramesh@gmail.com     | ram@123        |
      | ramani@gmail.com     | rama@123       |
      | shabadeesh@gmail.com | sha@123        |
      | yoshritha@gmail.com  | yos@123        |
