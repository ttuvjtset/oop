package kt2_2016.vehicle;

public class SeaVehicle extends GroundVehicle {
    private boolean isVehicleWithSail = false;

    public SeaVehicle(double vehiclePrice, int registrationYear, String manufactureName, boolean isVehicleWithSail) {
        super(vehiclePrice, registrationYear, manufactureName);
        this.isVehicleWithSail = isVehicleWithSail;
    }

    public boolean isVehicleWithSail() {
        return isVehicleWithSail;
    }

    @Override
    public String toString() {
        return "SeaVehicle{" +
                "vehiclePrice=" + super.getVehiclePrice() +
                ", registrationYear=" + super.getRegistrationYear() +
                ", manufactureName='" + super.getManufactureName() + '\'' +
                ", withSails='" + isVehicleWithSail + '\'' +
                '}';
    }
}
