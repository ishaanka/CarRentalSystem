package Vehicle;

public class Vehicle extends IVehicle {
    public Vehicle(
       int vehicleNumber,
       int cc,
       int yearOld,
       int kmDriven,
       Status stock,
       String brandName,
       int price
    ) {
        this.vehicleNumber = vehicleNumber;
        this.cc = cc;
        this.yearOld = yearOld;
        this.kmDriven = kmDriven;
        this.stock = stock;
        this.brandName = brandName;
        this.price = price;
    }
}
