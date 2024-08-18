package Billing;

import Reservation.IReservation;
import Payment.IPayment;


public class Billing extends IBilling {
    public Billing(IReservation reservation, IPayment payment) {
        this.reservation = reservation;
        this.payment = payment;
    }

    @Override
    public void calculateBill() {
        //Logic for calulating bill from reservation * price of car
    }

    @Override
    public void completeBill() {
        payment.makePayment();
    }
}
