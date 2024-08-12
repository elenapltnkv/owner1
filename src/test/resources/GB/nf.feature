Feature: Open duckduckgo main page

  Scenario Outline:
    Given I open duckduckgo
    When I input in search line text
    And click search '<text>'
    Then I see text '<text>'

    Examples:
      | text  |
      | book |
      | Gomer |
