package io.joel;

public class Main {

    public static void main(String[] args) {
        Bike bike = new Bike();
        Bike joelBike = new Bike();
        bike.accelerateAndMove(10000);
        bike.report();

        joelBike.accelerateAndMove(10000);
        joelBike.report();
    }
}
