package org.example;

import java.util.List;

//is a relationship
public class FourWheelerManager extends ParkingSpotManager{

    //will be responsible only for four wheelers
    public FourWheelerManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);
    }
}
