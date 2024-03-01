import java.util.Scanner;

public enum TransportType {
    CAR(0.1),
    BUS(0.5),
    TRUCK(0.2);
    private double price;

    TransportType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateTravelCost( double distance) {
        return distance*this.price;

    }
}



