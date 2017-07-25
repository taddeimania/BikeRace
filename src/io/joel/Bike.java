package io.joel;

import java.util.Random;

public class Bike {
    private double location;
    private double speed;
    private Random rng;

    public Bike() {
        location = 0;
        speed = 0;
        rng = new Random();
    }

    public void accelerate() {
        speed++;
    }

    public void move() {
        location = location + speed;
    }

    public double getLocation() {
        return location;
    }

    public double getSpeed() {
        return speed;
    }

    public void report() {
        System.out.println(getLocation());
        System.out.println(getSpeed());
    }
}
