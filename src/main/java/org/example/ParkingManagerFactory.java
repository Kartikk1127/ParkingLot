package org.example;

import java.util.ArrayList;

public class ParkingManagerFactory {

    public ParkingSpotManager getParkingManager(VehicleType vehicleType){
        return switch (vehicleType){
            case TWO_WHEELER -> new TwoWheelerManager(new ArrayList<>());
            case FOUR_WHEELER -> new FourWheelerManager(new ArrayList<>());
            default -> null;
        };
    }
}
