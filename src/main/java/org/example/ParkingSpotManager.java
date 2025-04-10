package org.example;

import java.util.List;

//has a relationship with parking spot
public class ParkingSpotManager {
    //will be having list of parking spot
    List<ParkingSpot> parkingSpots;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    //help in finding the parking space
    public ParkingSpot findParkingSpot(){
        //to be implemented
        return null;
    }

    public void addParkingSpace(){
        //to be implemented
    }

    public void removeParkingSpace(){
        //to be implemented
    }

    public void parkVehicle(Vehicle vehicle){
        //to be implemented
    }

    public void removeVehicle(){
        //to be implemented
    }
}
