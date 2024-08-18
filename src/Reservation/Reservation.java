package Reservation;

import Vehicle.IVehicle;

public class Reservation extends IReservation {
    public Reservation(
            IVehicle vehicle,
            Long fromDate,
            Long toDate
    ) {
         this.vehicle = vehicle;
         this.fromDate = fromDate;
         this.toDate = toDate;
         this.status = ReservationStatus.Pending;
    }

    @Override
    public void updateStatus(ReservationStatus status) {
        this.status = status;
    }
}
