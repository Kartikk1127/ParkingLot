import vehicletype.Vehicle;
import vehicletype.VehicleType;

public class ParkingSpot {
    private final int spotNumber;
    private Vehicle parkedVehicle;
    private final VehicleType vehicleType;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.vehicleType=VehicleType.CAR;
    }

    public boolean isAvailable(){
        return parkedVehicle==null;
    }

    public void parkVehicle(Vehicle vehicle){
        if (isAvailable() && vehicle.getType()==vehicleType){
            parkedVehicle=vehicle;
        } else {
            throw new IllegalArgumentException("Invalid vehicle type or spot already occupied");
        }
    }

    public void unparkVehicle(){
        parkedVehicle=null;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

    public Vehicle getParkedVehicle(){
        return parkedVehicle;
    }

    public int getSpotNumber(){
        return spotNumber;
    }
}
