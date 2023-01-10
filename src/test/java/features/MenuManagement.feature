Feature: Menu Management

  @SmokeTest
  Scenario: Add a menu item
    Given i have a menu item with name "cucumber" and price 20
    When i add that menu item
    Then menu item with name "cucumber" should be added

@RegularTest
Scenario: Add another menu item
  Given i have a menu item with name "salad" and price 10
  When i add that menu item
  Then menu item with name "salad" should be added

  @NightlyBuildTest @RegularTest
  Scenario: Add third menu item
    Given i have a menu item with name "scone" and price 30
    When i add that menu item
    Then menu item with name "scone" should be added