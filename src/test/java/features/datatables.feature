Feature: Data Tables

  @ListofStrings
  Scenario: Bill Amount Generation
    Given I placed an order for the following items
    |cucumber|2|20|
    When I generate the bill
    Then a bill for $40 should be generated

  @ListofListofStrings
  Scenario: Bill Amount Generation
    Given I placed an order for the following items
      |cucumber|2|20|
      |scone|3|25|
    When I generate the bill
    Then a bill for $115 should be generated

  @ListofMaps
  Scenario: Bill Amount Generation
    Given I placed an order for the following items
      |ItemName|Units|UnitPrice|
      |cucumber|2    |20       |
      |scone   |3    |25       |
    When I generate the bill
    Then a bill for $115 should be generated