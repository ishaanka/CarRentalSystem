package VehicleRentalSystem;

import Reservation.IReservation;
import Store.IStore;
import User.IUser;

import java.util.ArrayList;

public class VehicleRentalSystem extends IVehicleRentalSystem {
    public VehicleRentalSystem() {
        this.users = new ArrayList<>();
        this.stores = new ArrayList<>();
    }

    @Override
    public void addStore(IStore store) {
        stores.add(store);
    }

    @Override
    public void addUser(IUser user) {
        users.add(user);
    }

    @Override
    public String addReservation(IReservation reservation, IStore store) {
        store.reservationList.add(reservation);
        return reservation.id;
    }

}
