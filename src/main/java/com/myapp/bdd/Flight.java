package com.myapp.bdd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public abstract class Flight {
    
    private String id;
    
    private List<Passenger> list = new ArrayList<>();
    
    private Set<Passenger> PassengersSet = new HashSet<>(list);
    
    private int distance;
    
    public Flight(String id) {
        this.id = id;
        
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<Passenger> getList() {
        return list;
    }
   public void setList(List<Passenger> list) {
        this.list = list;
    }
    
    
    
    public Set<Passenger> getPassengersSet() {
	return PassengersSet;
}
public void setPassengersSet(Set<Passenger> passengersSet) {
	PassengersSet = passengersSet;
}
	public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public abstract boolean addPassenger(Passenger passenger) ;
            
    public abstract boolean removePassenger(Passenger passenger) ;
//        switch (flightType) {
//        case "Economy":
//            
//            if(passenger.isVip()) {
//                return false;
//            }
//        case "Business":
//             return false;
//
//        default:
//            throw new RuntimeException("Unknown Flight Type "+flightType);
//    }
    
}
