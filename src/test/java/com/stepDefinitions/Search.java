package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@Given("I have google search open")
	public void i_have_google_search_open() {
	    System.out.println("I Open the googlesearch page");
	}

	@When("I search {string}")
	public void i_search(String string) {
	    System.out.println("I search"+ string + "in search box");
	}
	@When("I hit Enter button")
	public void i_hit_enter_button() {
	   System.out.println("I Hit Enter button in Keyboard");
	}
	@Then("{string} should be displayed")
	public void should_be_displayed(String string) {
	   System.out.println(string + "is displayed");
	}



}

