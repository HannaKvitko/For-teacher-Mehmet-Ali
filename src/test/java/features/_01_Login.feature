Feature:Us01 Login Functionality



@LoginTest
Scenario: TC01 Login with valid user name and password

  Given Navigate to Campus
  When Enter user name and password in the text boxes
  And  Click on the Login button
  Then User should be login successfully

