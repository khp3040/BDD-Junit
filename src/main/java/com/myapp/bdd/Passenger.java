package com.myapp.bdd;

import java.util.Objects;

public class Passenger {
	
	private String name;
	private boolean vip;
	public Passenger(String name, boolean vip) {
		super();
		this.name = name;
		this.vip = vip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, vip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Passenger))
			return false;
		Passenger other = (Passenger) obj;
		return Objects.equals(name, other.name) && vip == other.vip;
	}
	

}
