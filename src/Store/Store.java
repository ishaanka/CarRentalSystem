package Store;

import Location.ILocation;
import VehicleManagement.IVehicleManagement;
import VehicleManagement.VehicleManagement;
import java.util.ArrayList;

public class Store extends IStore {
    public Store(ILocation location) {
       this.location = location;
       this.vehicleManager = new VehicleManagement();
       this.reservationList = new ArrayList<>();
    }

}
