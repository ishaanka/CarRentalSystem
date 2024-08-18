package VehicleRentalSystem;

import Reservation.IReservation;
import Store.IStore;
import User.IUser;
import Vehicle.IVehicle;

import java.util.List;

public abstract class IVehicleRentalSystem {
    public List<IUser> users;
    public List<IStore> stores;

    public abstract void addUser(IUser user);
    public abstract void addStore(IStore store);

    public abstract String addReservation(IReservation reservation, IStore store);
    // Add more CRUD operations here
}
