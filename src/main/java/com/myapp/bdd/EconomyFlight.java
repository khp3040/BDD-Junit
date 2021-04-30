package com.myapp.bdd;

public class EconomyFlight extends Flight {

	public EconomyFlight(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return getList().add(passenger);
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		if(!passenger.isVip()) {
		return getList().remove(passenger);
	 }
	return false;
}
}
