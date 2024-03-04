Feature: Scenario Outline

  Scenario Outline: Learning Scenario Outline
    Given  A user with name "<name>" and surname "<surname>"
    When the user is assigned and ID <id>
    And the user makes a purchase with <prise> dollars
    Then the system should save the user details with ID <user_id>
    And the purchase record should reflect a price of <salary> dollars
    Examples:
    |name|surname|id|prise|user_id|salary|
    |Aziza|Khudo |12|12.5 |11     |1000  |
    |Hamza|Gokce |11|11.5 |21     |2000  |
    |Hanna|Kvitko |12|10.5 |31    |5000000  |
    |Tetiana|Khudo |12|12.5 |41     |3000  |
