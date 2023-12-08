Feature: Login page

  Background:
    Given I launch Chrome browser
    Then I open the page "https://www.santanderbank.com"


  Scenario: Search a branch by zip code
    Then I click in find a branch Link
    And I validate the link Credit Cards is displayed
    And I validate the link Personal Loans is displayed
    And I validate the link Investing is displayed
    And I validate the link Resources is displayed
    Then I search the zip code "12345"
    Then I validate the location list has "20" elements
    And I close the browser window

  Scenario: validate the right checking redirection page
    Then I click the "Choose the right checking account" button
    Then I validate the Box Santander Select Checking is displayed
    Then I validate the Box simply Right Checking is displayed
    Then I validate the Box Santander essential Checking is displayed
    And I close the browser window

