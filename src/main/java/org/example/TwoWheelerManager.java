package org.example;

import java.util.List;

//is a relationship
public class TwoWheelerManager extends ParkingSpotManager{

    //will manage only two wheelers
    public TwoWheelerManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);
    }
}
