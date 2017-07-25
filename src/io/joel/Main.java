package io.joel;

public class Main {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.report();

        bike.accelerate();
        bike.move();
        bike.move();
        bike.move();
        bike.move();
        bike.report();

    }
}
