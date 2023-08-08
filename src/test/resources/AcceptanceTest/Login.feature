Feature: Login page

  Background:
    Given I launch Chrome browser
    Then I open the page "https://admin-demo.nopcommerce.com/login"

#  Scenario: Access to home page using valid credentials
#    Then I type my user as "admin@yourstore.com" and password as "admin"
#    Then I click LOGIN button
#    And I close the browser window
#
#  Scenario: Try to login with empty email field
#    Then I type my user as ""
#    Then I click LOGIN button
#    Then I validate the error wrong email message is displayed as: "Please enter your email"
#    And I close the browser window
#
#  Scenario Outline: Try to login using invalid email format
#    Then I type my user as "<usr>"
#    Then I click LOGIN button
#    Then I validate the error wrong email message is displayed as: "Wrong email"
#    And I close the browser window
#    Examples:
#      | usr                |
#      | Something@.com     |
#      | @invalid.com       |
#      | something@invalid. |

  Scenario Outline: Try to login using wrong credentials
      Then I type my user as "<usr>" and password as "<pwd>"
      Then I click LOGIN button
      Then I validate the unsuccessful login message is displayed as: "<mssg>"
      And I close the browser window
      Examples:
        | usr                  | pwd      | mssg                                   |
        | admin1@yourstore.com | admin    | No customer account found              |
        | admin@yourstore.com  | admin123 | The credentials provided are incorrect |

  

