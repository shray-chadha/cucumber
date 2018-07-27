@Hooks
Feature: Learning Hooks in Cucumber

  Scenario: This is First Scenario
    Given First Scenaio First Step
    Then First Scenaio Second Step
    Then First Scenaio Third Step

  Scenario: This is Second Scenario
    Given Second Scenaio First Step
    Then Second Scenaio Second Step
    Then Second Scenaio Third Step

  Scenario: This is Third Scenario
    Given Third Scenaio First Step
    Then Third Scenaio Second Step
    Then Third Scenaio Third Step

  Scenario Outline: This is the Fourth Scenario
    Given Just print this "<print>"

    Examples: 
      | print |
      | One   |
      | Two   |
      | Three |
