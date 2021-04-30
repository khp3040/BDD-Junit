Feature: Passengers Policy
  The Company follows a policy of adding and removing passengers, depending on the passenger type
  and on the flight type
  
  
  
   
  Scenario: Chartered Flight, usual passenger
    Given There is an chartered flight
    When we have a usual Passenger
    Then you cannot add or remove from an chartered flight 
    
    
    
  Scenario: Chartered Flight, VIP passenger
    Given There is an chartered flight
    When we have a VIP Passenger
    Then you can add and remove from an chartered flight  
    And you cannot add a VIP passenger to Chartered flight more than once  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    