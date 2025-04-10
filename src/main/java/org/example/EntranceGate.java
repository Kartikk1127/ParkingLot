package org.example;

public class EntranceGate {
    // it has to find a parking space according to the vehicle type
    //this space is found by parking spot manager
    //but which manager two or four wheeler manager?
    //here comes in factory design pattern
    //also has a ticket object

    private ParkingManagerFactory factory;
    //we can get a manager from the above factory

    public ParkingSpot findParkingSpot(Vehicle vehicle){
        return null; //to be implemented
    }

    public void bookSpot(){
        //to be implemented
    }

    public Ticket generateTicket(){
        //to be implemented
        return null;
    }
}
