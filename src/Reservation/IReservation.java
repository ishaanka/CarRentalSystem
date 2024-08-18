package Reservation;

import Vehicle.IVehicle;

public abstract class IReservation {
    public String id;
    public IVehicle vehicle;
    public Long fromDate;
    public Long toDate;
    public ReservationStatus status;

    public abstract void updateStatus(ReservationStatus status);
}
