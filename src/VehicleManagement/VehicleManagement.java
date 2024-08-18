package VehicleManagement;

import Vehicle.IVehicle;

import java.util.ArrayList;

public class VehicleManagement extends IVehicleManagement {
    public VehicleManagement() {
        this.vehicles = new ArrayList<IVehicle>();
    }

    @Override
    public void addVehicle(IVehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    @Override
    public void removeVehicle(IVehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    @Override
    public void updateVehicle(IVehicle vehicle) {
        this.vehicles.set(vehicles.indexOf(vehicle), vehicle);
    }
}
