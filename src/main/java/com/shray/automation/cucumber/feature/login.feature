Feature: ToolsQA Login Feature

#  Data Driven - Without using Examples keyword
#  Scenario: ToolsQA Login Test Scenario
#    Given User is already on the account page
#    Then User clicks on Login link
#    Then User is on Login page
#    Then User enters "sqa1" and "Test@123"
#    And User clicks on the Login button
#    Then User lands on the "sqa1" user profile page 
#    And User logs out
#    And User closes the browser

  
# Data Driven - Using Examples keyword & Scenario Keyword 
  Scenario Outline: ToolsQA Login Test Scenario
    Given User is already on the account page
    Then User clicks on Login link
    Then User is on Login page
    Then User enters "<username>" and "<password>"
    And User clicks on the Login button
    Then User lands on the "<user>" user profile page 
    And User logs out
    And User closes the browser
    
    Examples:
    |	username	|	password	|	user	|
    |	sqa1			|	Test@123	|	sqa1	|
    |	sqa1			|	Test@123	|	sqa1	|
