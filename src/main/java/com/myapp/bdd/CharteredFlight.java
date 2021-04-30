package com.myapp.bdd;

public class CharteredFlight extends Flight {

	public CharteredFlight(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addPassenger (Passenger passenger) {
		if(passenger.isVip()) {
			return getPassengersSet().add(passenger);
		}
		return false;
	}
	
	@Override
	public boolean removePassenger (Passenger passenger) {
		if(passenger.isVip()) {
			return getPassengersSet().remove(passenger);
		}
		return false;
	}
}
