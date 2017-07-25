package io.joel;

import io.joel.AbstractClasses.BaseRandom;

public class Bike extends BaseRandom {
    private double location;
    private double speed;
    private double topSpeed;

    public Bike() {
        location = 0;
        speed = 0;
        topSpeed = GetRandomSpeed();
    }

    public void accelerateAndMove() {
        if (ShouldAccelerate()) {
            accelerate();
        }
        move();
    }

    public void accelerateAndMove(int count) {
        for (int i = 0; i < count; i++) {
            accelerateAndMove();
        }
    }
    public void accelerate() {
        double magnitude = GetAccelerationAmount();
        double newSpeed = speed + magnitude;
        if (newSpeed > 0 && newSpeed <= topSpeed) {
            speed = speed + magnitude;
        }
    }

    public void move() {
        location = location + speed;
    }

    public void move(int count) {
        for (int i = 0; i < count; i++) {
            move();
        }
    }

    public double getLocation() {
        return location;
    }

    public double getSpeed() {
        return speed;
    }

    public void report() {
        System.out.println("----------");
        System.out.println(getLocation());
        System.out.println(getSpeed());
    }
}
