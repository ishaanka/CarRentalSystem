package Store;

import Location.ILocation;
import Reservation.IReservation;
import VehicleManagement.IVehicleManagement;

import java.util.List;

public abstract class IStore {
    public ILocation location;
    public IVehicleManagement vehicleManager;
    public List<IReservation> reservationList;
}
