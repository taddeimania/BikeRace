package io.joel.AbstractClasses;

import java.util.Random;

public abstract class BaseRandom {
    private Random rng = new Random();

    private double RandomRange(Double min, Double max) {
        Double random = rng.nextDouble();
        return min + (random * (max - min));
    }

    public double GetAccelerationAmount() {
        return RandomRange(-1.0, 2.0);
    }
}
