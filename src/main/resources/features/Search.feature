#Author: your.email@your.domain.com
#Feature: List of scenarios.


Feature: Search Funtionality
  Given I am on home page

  Scenario: Search for valid article
    When user search for article "Chemistry"
    Then article links should be displayed in result section

  Scenario: Search for invalid article
    When user search for article "dufheuhgeknjdk"
    Then article links should not be displayed in result section
    When user clicks NewSearch button
    Then Searchbox text should be empty

  Scenario: Suggestion text is shown in search box
    When user search for article "Chem"
    Then Suggestion text should be displayed
    When user selects option from suggested text
    Then Selected text is displayed in search box
    Then article links should be displayed in result section
