package Billing;

import Payment.IPayment;
import Reservation.IReservation;

public abstract class IBilling {
    public IReservation reservation;
    public IPayment payment;

    public abstract void calculateBill();
    public abstract void completeBill();
}
