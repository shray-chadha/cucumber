Feature: ToolsQA Login Feature with Data Table
  
# Data Driven - Using Data Table
  Scenario: ToolsQA Login Test Scenario with Data Table
    Given MyUser is already on the account page
    Then MyUser clicks on Login link
    Then MyUser is on Login page
    Then MyUser enters username and password
    |	sqa1	| Test@123	|
    |	sqa1	|	Test@123	|
    |	sqa2	|	Test@456	|
    And MyUser clicks on the Login button
    Then MyUser lands on the user own profile page
    |	sqa1	|
    And MyUser logs out
    And MyUser closes the browser
