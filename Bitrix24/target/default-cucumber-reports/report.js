$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/ncl/features/Tasks.feature");
formatter.feature({
  "name": "Filters",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tasks"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "client is on the ncl home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TaskStepDefs.client_is_on_the_ncl_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Client filters cruises by destination and price",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tasks"
    }
  ]
});
formatter.step({
  "name": "a client searches for “Alaska Cruises” on “April, 2021”",
  "keyword": "Given "
});
formatter.match({
  "location": "TaskStepDefs.a_client_searches_for_alaska_cruises_on_april_2021()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sees a “Price From” on the first displayed cruise",
  "keyword": "And "
});
formatter.match({
  "location": "TaskStepDefs.sees_a_Price_From_on_the_first_displayed_cruise()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the client selects “View Cruise”",
  "keyword": "When "
});
formatter.match({
  "location": "TaskStepDefs.the_client_selects_View_Cruise()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigates to “Dates \u0026 Prices” section",
  "keyword": "And "
});
formatter.match({
  "location": "TaskStepDefs.navigates_to_Dates_Prices_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "at least one Category Meta price should match the advertised price",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskStepDefs.at_least_one_Category_Meta_cell_in_the_grid_price_should_match_the_advertised_price()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});