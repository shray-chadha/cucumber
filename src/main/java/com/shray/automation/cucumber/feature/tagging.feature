@TaggedFeature
Feature: Learning the Tagging concept in Cucumber

  @SmokeTest @RegressionTest
  Scenario: This is the scenario One
    Given I am scenario One

  @RegressionTest
  Scenario: This is the scenario Two
    Given I am scenario Two

  @RegressionTest
  Scenario: This is the scenario Three
    Given I am scenario Three

  @RegressionTest @SmokeTest @E2E
  Scenario: This is the scenario Four
    Given I am scenario Four

  Scenario: This is the scenario Five
    Given I am scenario Five

  @E2E
  Scenario: This is the scenario Six
    Given I am scenario Six

  @RegressionTest @E2E
  Scenario: This is the scenario Seven
    Given I am scenario Seven

  @SmokeTest
  Scenario: This is the scenario Eight
    Given I am scenario Eight

  Scenario: This is the scenario Nine
    Given I am scenario Nine

  @E2E @RegressionTest
  Scenario: This is the scenario Ten
    Given I am scenario Ten

  @RegressionTest
  Scenario: This is the scenario Eleven
    Given I am scenario Eleven

  Scenario: This is the scenario Twelve
    Given I am scenario Twelve

  Scenario: This is the scenario Thirteen
    Given I am scenario Thirteen

  @E2E
  Scenario Outline: This is the scenario Fourteen
    Given I am scenario "<freeText>"

    Examples: 
      | freeText |
      | Hello    |
      | Hi       |
      | How      |
      | Are      |
      | You      |

  @First
  Scenario: This is first scenario of tagged hooks
    Given: I am the first scenario of tagged hooks


  @Second
  Scenario: This is second scenario of tagged hooks
    Given: I am the second scenario of tagged hooks


  @Third
  Scenario: This is third scenario of tagged hooks
    Given: I am the third scenario of tagged hooks

