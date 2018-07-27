package com.shray.automation.cucumber.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class TaggingStepDefinition {

	
	@Given("^I am scenario One$")
	public void i_am_scenario_One() {
	    
	    System.out.println("I am the scenario one ");
	}

	@Given("^I am scenario Two$")
	public void i_am_scenario_Two() {
	    
	    System.out.println("I am the scenario two");
	}

	@Given("^I am scenario Three$")
	public void i_am_scenario_Three() {
	    
	    System.out.println("I am the scenario three");
	}

	@Given("^I am scenario Four$")
	public void i_am_scenario_Four() {
	    
	    System.out.println("I am the scenario four");
	}

	@Given("^I am scenario Five$")
	public void i_am_scenario_Five() {
	    
	    System.out.println("I am the scenario five");
	}

	@Given("^I am scenario Six$")
	public void i_am_scenario_Six() {
	    
	    System.out.println("I am the scenario six");
	}

	@Given("^I am scenario Seven$")
	public void i_am_scenario_Seven() {
	    
	    System.out.println("I am the scenario seven");
	}

	@Given("^I am scenario Eight$")
	public void i_am_scenario_Eight() {
	    
	    System.out.println("I am the scenario eight");
	}

	@Given("^I am scenario Nine$")
	public void i_am_scenario_Nine() {
	    
	    System.out.println("I am the scenario nine");
	}

	@Given("^I am scenario Ten$")
	public void i_am_scenario_Ten() {
	    
	    System.out.println("I am the scenario ten");
	}

	@Given("^I am scenario Eleven$")
	public void i_am_scenario_Eleven() {
	    
	    System.out.println("I am the scenario eleven");
	}

	@Given("^I am scenario Twelve$")
	public void i_am_scenario_Twelve() {
	    
	    System.out.println("I am the scenario twelve");
	}

	@Given("^I am scenario Thirteen$")
	public void i_am_scenario_Thirteen() {
	    
	    System.out.println("I am the scenario thirteen");
	}

	@Given("^I am scenario \"(.*)\"$")
	public void i_am_scenario_Fourteen(String text) {
	    
	    System.out.println("I am the scenario "+text+".");
	}
	
	@Given("^I am the first scenario of tagged hooks$")
	public void i_am_the_first_scenario_of_tagged_hooks() {
		System.out.println("Hello, I am the first scenario of tagged hooks");
	}
	
	@Given("^I am the second scenario of tagged hooks$")
	public void i_am_the_second_scenario_of_tagged_hooks() {
		System.out.println("Hello, I am the second scenario of tagged hooks");
	}
	
	@Given("^I am the third scenario of tagged hooks$")
	public void i_am_the_third_scenario_of_tagged_hooks() {
		System.out.println("Hello, I am the third scenario of tagged hooks");	 
	}
	
	@Before("@First")
	public void before() {
		System.out.println("This is the step before 1st scenario");
	}
	

	@Before("@Second")
	public void anotherBefore() {
		System.out.println("This is the step before 2nd scenario");
	}
	
	@After("@First")
	public void after() {
		System.out.println("This is the step after 1st scenario");
	}
	

	@After("@Second")
	public void anotherAfter() {
		System.out.println("This is the step after 2nd scenario");
	}
	
	
	@Before()
	public void setUp() {
		System.out.println("This is the general before function");
	}
	
	
	@After()
	public void tearDown() {
		System.out.println("This is the general after scenario");
	}
	
	
	
	
	
	
	
	
	
}
