import vehicletype.*;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1,100));
        parkingLot.addLevel(new Level(2,80));

        Vehicle car = new Car("ABC123", VehicleType.CAR);
        Vehicle truck = new Truck("ABC234", VehicleType.TRUCK);
        Vehicle motorcycle = new Motorcycle("ABC321", VehicleType.MOTORCYCLE);

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        parkingLot.displayAvailability();

        parkingLot.unparkVehicle(motorcycle);

        parkingLot.displayAvailability();
    }
}