Feature: Login
  In order to test Login functionality of the application
  	As a Registered user
  	I want to Login into the Application successfully

  Background: 
    Given user is navigated to the cms URL
    When user enters <username>, <password> and selects <language>
    And user clicks on Login Button

  @regression_positive @wip
  Scenario Outline: Verification of Login Function
    Then user lands on HomePage

    Examples: 
      | username | password | language |
      | admin10  | admin10  | en       |
      | author15 | author15 | es       |
      | editor05 | editor05 | fr       |

  @regression_negative @wip
  Scenario Outline: Unsuccessful login with wrong username or password
    Then user gets Error Message "Incorrect username or password. Please try again."

    Examples: 
      | username | password | language |
      | admin    | admin10  | en       |
      | author   | author15 | es       |
      | editor   | editor05 | fr       |
