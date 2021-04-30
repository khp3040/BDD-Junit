package com.myapp.bdd;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PassengersSteps {
private Flight economyFlight;
private Flight businessFlight;
private Flight charteredFlight;
private Passenger ram;
private Passenger sham;


@Given("^There is an economy flight$")
public void there_is_an_economy_flight() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   economyFlight = new EconomyFlight("1");
}


@When("^we have a usual Passenger$")
public void we_have_a_usual_Passenger() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  sham = new Passenger("Sham", false);
}


@Then("^you can add and remove from an economy flight$")
public void you_can_add_and_remove_from_an_economy_flight() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

assertAll("Verify All Conditions for a usual passenger and an economy flight ",
() -> assertEquals("1", economyFlight.getId()),
() -> assertEquals(true, economyFlight.addPassenger(sham)),
() -> assertEquals(1, economyFlight.getList().size()),
() -> assertEquals("Sham", economyFlight.getList().get(0).getName()),
() -> assertEquals(true, economyFlight.removePassenger(sham)),
() -> assertEquals(0, economyFlight.getList().size())

);
   
}


@When("^we have a VIP Passenger$")
public void we_have_a_VIP_Passenger() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
ram = new Passenger("Ram", true);
}


@Then("^you can add but cannot remove from an economy flight$")
public void you_can_add_but_cannot_remove_from_an_economy_flight() throws Throwable {
assertAll("Verify All Conditions for a VIP passenger and an economy flight ",
() -> assertEquals("1", economyFlight.getId()),
() -> assertEquals(true, economyFlight.addPassenger(ram)),
() -> assertEquals(1, economyFlight.getList().size()),
() -> assertEquals("Ram", economyFlight.getList().get(0).getName()),
() -> assertEquals(false, economyFlight.removePassenger(ram)),
() -> assertEquals(1, economyFlight.getList().size())

);
}


@Given("^There is an business flight$")
public void there_is_an_business_flight() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   businessFlight = new BusinessFlight("2");
}


@Then("^you cannot add or remove from an business flight$")
public void you_cannot_add_or_remove_from_an_business_flight() throws Throwable {
assertAll("Verify All Conditions for a usual passenger and an business flight ",

() -> assertEquals(false, businessFlight.addPassenger(sham)),
() -> assertEquals(0, businessFlight.getList().size()),

() -> assertEquals(false, businessFlight.removePassenger(sham)),
() -> assertEquals(0, businessFlight.getList().size())

);
}


@Then("^you can add but cannot remove from an business flight$")
public void you_can_add_but_cannot_remove_from_an_business_flight() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
assertAll("Verify All Conditions for a vip passenger and an business flight ",

() -> assertEquals(true, businessFlight.addPassenger(ram)),
() -> assertEquals(1, businessFlight.getList().size()),

() -> assertEquals(false, businessFlight.removePassenger(ram)),
() -> assertEquals(1, businessFlight.getList().size())

);
}

@Given("There is an chartered flight")
public void there_is_an_chartered_flight() {
    // Write code here that turns the phrase above into concrete actions
   charteredFlight = new CharteredFlight("4");
}

@Then("you cannot add or remove from an chartered flight")
public void you_cannot_add_or_remove_from_an_chartered_flight() {
    // Write code here that turns the phrase above into concrete actions
	assertAll("Verify All Conditions for a usual passenger and an business flight ",

			() -> assertEquals(false, charteredFlight.addPassenger(sham)),
			() -> assertEquals(0, charteredFlight.getPassengersSet().size()),

			() -> assertEquals(false, charteredFlight.removePassenger(sham)),
			() -> assertEquals(0, charteredFlight.getPassengersSet().size())

			);
}

@Then("you can add and remove from an chartered flight")
public void you_can_add_and_remove_from_an_chartered_flight() {
    // Write code here that turns the phrase above into concrete actions
	assertAll("Verify All Conditions for a usual passenger and an business flight ",

			() -> assertEquals(true, charteredFlight.addPassenger(ram)),
			() -> assertEquals(1, charteredFlight.getPassengersSet().size()),

			() -> assertEquals(true, charteredFlight.removePassenger(ram)),
			() -> assertEquals(0, charteredFlight.getPassengersSet().size())

			);
}

@Then("you cannot add a VIP passenger to Chartered flight more than once")
public void you_cannot_add_a_vip_passenger_to_chartered_flight_more_than_once() {
    // Write code here that turns the phrase above into concrete actions
    for(int i=0;i<=10;i++) {
    	charteredFlight.addPassenger(ram);
    }
    assertAll("Verify a VIP passenger can be added to a chartered flight only once ",

			() -> assertEquals(1, charteredFlight.getPassengersSet().size()),
			

			() -> assertTrue( charteredFlight.getPassengersSet().contains(ram)),
			() -> assertTrue(new ArrayList<>(charteredFlight.getPassengersSet())
                    .get(0).getName().equals("Ram"))
			);
}



}