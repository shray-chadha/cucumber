Feature: ToolsQA Login Feature with Data Table using Maps

  # Data Driven - Using Data Table using Maps
  Scenario: ToolsQA Login Test Scenario with Data Table using Maps
    Given GoodUser is already on the account page
    Then GoodUser clicks on Login link
    Then GoodUser is on Login page
    Then GoodUser enters username and password
      | Username | Password |
      | sqa1     | Test@123 |
      | sqa1     | Test@123 |
      | sqa2     | Test@456 |
    And GoodUser clicks on the Login button
    Then GoodUser lands on the user own profile page
      | user |
      | sqa1 |
    And GoodUser logs out
    And GoodUser closes the browser
