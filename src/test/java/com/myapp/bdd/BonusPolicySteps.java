
package com.myapp.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BonusPolicySteps {
	
	private Passenger sham;
	private Mileage mileage;
	
	@Given("we have a usual passenger with a mileage")
	public void we_have_a_usual_passenger_with_a_mileage() {
	    // Write code here that turns the phrase above into concrete actions
	    sham = new Passenger("sham", false);
	    mileage = new Mileage();
	}

	@When("the usual passenger travels {int} and {int} and {int}")
	public void the_usual_passenger_travels_and_and(Integer mileage1, Integer mileage2, Integer mileage3) {
	    // Write code here that turns the phrase above into concrete actions
	    mileage.addMileage(sham, mileage1);
	    mileage.addMileage(sham, mileage2);
	    mileage.addMileage(sham, mileage3);
	}

	@Then("the bonus points of the usual passenger should be {int}")
	public void the_bonus_points_of_the_usual_passenger_should_be(Integer points) {
	    // Write code here that turns the phrase above into concrete actions
	    mileage.calculateGivenPoints();
	    assertEquals(points, mileage.getPassengersPointMap().get(sham).intValue());
	}

	@Given("we have a VIP passenger with a mileage")
	public void we_have_a_vip_passenger_with_a_mileage() {
	    // Write code here that turns the phrase above into concrete actions
		 sham = new Passenger("sham", true);
		 mileage = new Mileage();
	}

	@When("the VIP passenger travels {int} and {int} and {int}")
	public void the_vip_passenger_travels_and_and(Integer mileage1, Integer mileage2, Integer mileage3) {
	    // Write code here that turns the phrase above into concrete actions
		mileage.addMileage(sham, mileage1);
	    mileage.addMileage(sham, mileage2);
	    mileage.addMileage(sham, mileage3);
	}

	@Then("the bonus points of the VIP passenger should be {int}")
	public void the_bonus_points_of_the_vip_passenger_should_be(Integer points) {
	    // Write code here that turns the phrase above into concrete actions
		 mileage.calculateGivenPoints();
		 assertEquals(points, mileage.getPassengersPointMap().get(sham).intValue());
	}


}