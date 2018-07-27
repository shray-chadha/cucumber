package com.shray.automation.cucumber.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HookStepDefinition {
	
/*	@Before(order=1)
	public void pre_condition() {
		System.out.println("Before Scenario");
	}

	
	@After(order=1)
	public void post_condition() {
		System.out.println("After Scenario");
	}
	*/
	
	@Given("^First Scenaio First Step$")
	public void first_Scenaio_First_Step() {
	    System.out.println("First Scenaio First Step");
	    
	}

	@Then("^First Scenaio Second Step$")
	public void first_Scenaio_Second_Step() {
	    System.out.println("First Scenaio Second Step");
	    
	}

	@Then("^First Scenaio Third Step$")
	public void first_Scenaio_Third_Step() {
	    System.out.println("First Scenaio Third Step");
	    
	}

	@Given("^Second Scenaio First Step$")
	public void second_Scenaio_First_Step() {
	    System.out.println("Second Scenaio First Step");
	    
	}

	@Then("^Second Scenaio Second Step$")
	public void second_Scenaio_Second_Step() {
	    System.out.println("Second Scenaio Second Step");
	    
	}

	@Then("^Second Scenaio Third Step$")
	public void second_Scenaio_Third_Step() {
	    System.out.println("Second Scenaio Third Step");
	}

	@Given("^Third Scenaio First Step$")
	public void third_Scenaio_First_Step() {
	    System.out.println("Third Scenaio First Step");
	    
	}

	@Then("^Third Scenaio Second Step$")
	public void third_Scenaio_Second_Step() {
	    System.out.println("Third Scenaio Second Step");
	    
	}

	@Then("^Third Scenaio Third Step$")
	public void third_Scenaio_Third_Step() {
	    System.out.println("Third Scenaio Third Step");
	    
	}
	
	@Given("^Just print this \"(.*)\"$")
	public void just_print_this(String print) {
		System.out.println(print);
	}
		
}
