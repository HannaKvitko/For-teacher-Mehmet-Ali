Feature: Campus Citizenship Addition

  Scenario: Adding a new citizenship successfully

    Given Navigate to Campus
    When Enter user name and password in the text boxes
    And  Click on the Login button
    Then User should be login successfully
    When Click the Setup button
    And Click the Parameters button
    And I click the Citizenship button
    And I click add the citizenship icon
    And I enter "Hanna" in the name text box
    And I enter "hanna123" in shortname  text box
    And I click on the save button
    Then I should see message "New Citizenship is created"