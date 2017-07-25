package io.joel;

import io.joel.AbstractClasses.BaseRandom;

public class Bike extends BaseRandom {
    private double location;
    private double speed;

    public Bike() {
        location = 0;
        speed = 0;
    }

    public void accelerate() {
        double magnitude = GetAccelerationAmount();
        if ((speed + magnitude) > 0) {
            speed = speed + magnitude;
        }
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
