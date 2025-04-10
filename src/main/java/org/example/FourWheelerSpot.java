package org.example;

//is a relationship
public class FourWheelerSpot extends ParkingSpot{
    public FourWheelerSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        super(id, isEmpty, vehicle, price);
    }

    @Override
    public int getPrice(){
        return 20;
    }
}
