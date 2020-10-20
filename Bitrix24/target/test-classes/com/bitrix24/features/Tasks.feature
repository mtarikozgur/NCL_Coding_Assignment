@tasks
Feature: Filters
#  Agile Story:
#  As a user I should be able to use the filter to compare prices.

  Background:
    Given client is on the ncl home page

#  Scenario: Create new task
#    And I click on the tasks tab plus symbol
#    And I write in the things to do title box
#    And I write in the box below the things to do title box
#    And I click add task
#    Then Our task should appear on the tasks page


  Scenario: Client filters cruises by destination and price
    Given a client searches for “Alaska Cruises” on “April, 2021”
    And sees a “Price From” on the first displayed cruise
    When the client selects “View Cruise”
    And navigates to “Dates & Prices” section
    Then at least one Category Meta price should match the advertised price


























































#  Scenario: Upload a file
#    And I click on the tasks tab plus symbol
#    And I click on the upload files tab
#    And I click the upload images and files box
#    And I upload an image
#    And I click on the link tab
#    And I input the link text
#    And I input the link url
#    And I click save
#    And I click Checklist
#    And I input text in the checklist box
#    And I click the checkmark
#    Then Our task should contain a checklist
#    And Our task should contain a hyperlink
#    And Our task should contain a file/image
#
#
#  Scenario: Set up a deadline
#    And I click on the tasks tab
#    And I select the top task
#    And I click the select action menu
#    And I click set deadline
#    And I choose a date from the input box
#    And I click apply
#    And I click continue
#    Then I should see the specified deadline in the deadline column













#  Feature: Login
#  Agile story: As a user, when I enter in valid credentials I should be able to see the login page
#
#  Scenario: Login as driver
#    Given I am on the login page
#    When I login as a driver
#    Then I should be able to see the dashboard page
#
#
#  Scenario: Login as sales manager
#    Given I am on the login page
#    When I login as a sales manager
#    Then I should be able to see the dashboard page