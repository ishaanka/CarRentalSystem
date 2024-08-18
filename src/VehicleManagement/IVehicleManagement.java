package VehicleManagement;

import Vehicle.IVehicle;

import java.util.List;

public abstract class IVehicleManagement {
    List<IVehicle> vehicles;
    public abstract void addVehicle(IVehicle vehicle);
    public abstract void removeVehicle(IVehicle vehicle);
    public abstract void updateVehicle(IVehicle vehicle);

}
