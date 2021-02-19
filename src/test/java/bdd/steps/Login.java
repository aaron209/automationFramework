package bdd.steps;

import org.junit.runner.RunWith;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Login {

	@Given("^user is on home page with login id \"([^\"]*)\"$")
	public void startApplication(String id) {
		System.out.println(id);
	}

	@Then("^user selects trip$")
	public void user_selects_trip() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user selects trip");
	}
}
