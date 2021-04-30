Feature: Passengers Policy
  The Company follows a policy of adding and removing passengers, depending on the passenger type
  and on the flight type

  
  Scenario: Economy Flight, usual passenger
    Given There is an economy flight
    When we have a usual Passenger
    Then you can add and remove from an economy flight
    
  Scenario: Economy Flight, VIP passenger
    Given There is an economy flight
    When we have a VIP Passenger
    Then you can add but cannot remove from an economy flight
  
	Scenario: Business Flight, usual passenger
    Given There is an business flight
    When we have a usual Passenger
    Then you cannot add or remove from an business flight
      
  Scenario: Business Flight, VIP passenger
    Given There is an business flight
    When we have a VIP Passenger
    Then you can add but cannot remove from an business flight
    
