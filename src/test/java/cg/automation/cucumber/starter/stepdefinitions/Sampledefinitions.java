package cg.automation.cucumber.starter.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sampledefinitions {
	@Given("^I launched guru(\\d+)$")
	public void i_launched_guru(int arg1)  {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("Inside Given");
	}


	@When("^I enter mngr(\\d+) and Yrubyge$")
	public void i_enter_mngr_and_Yrubyge(int arg1) {
		System.out.println("Inside When");
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside When2");
	}

	@Then("^I should see the welcome screen$")
	public void i_should_see_the_welcome_screen() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Then");
	}
}
