package cg.automation.cucumber.starter.gluecode;

import cg.automation.cucumber.starter.stepdefinitions.CreateCustomerSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Createcustomerstepdefinitions {
	@Steps
	CreateCustomerSteps createCustomerSteps;
	
	@Given("^I am in Add New Customer Page$")
    public void i_am_in_Add_New_Customer_Page() {
		createCustomerSteps.i_am_in_Add_New_Customer_Page();
		createCustomerSteps.i_click_on_New_Customer_Link();
	}

    @When("^I enter all customer data$")
    public void i_enter_all_customer_data() {
    	createCustomerSteps.i_enter_all_customer_data();
    }
    
    @When("^save the Customer$")
    public void save_the_Customer() {
    	createCustomerSteps.save_the_Customer();
    }

    @Then("^I should be able to see Customer Registered Successfully$")
    public void i_should_be_able_to_see_Customer_Registered_Successfully() {
    	createCustomerSteps.i_should_be_able_to_see_Customer_Registered_Successfully();
    }
}
