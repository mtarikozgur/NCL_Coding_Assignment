@tasks
Feature: Filters
#  Agile Story:
#  As a user I should be able to use the filter to compare prices.

  Background:
    Given client is on the ncl home page

  Scenario: Client filters cruises by destination and price
    Given a client searches for “Alaska Cruises” on “April, 2021”
    And sees a “Price From” on the first displayed cruise
    When the client selects “View Cruise”
    And navigates to “Dates & Prices” section
    Then at least one Category Meta price should match the advertised price


