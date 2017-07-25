package io.joel.AbstractClasses;

import java.util.Random;

public abstract class BaseRandom {
    private Random rng = new Random();

    private double RandomRange(Double min, Double max) {
        Double random = rng.nextDouble();
        return min + (random * (max - min));
    }

    private double RandomRange(int min, int max) {
        return RandomRange((double) min, (double) max);
    }

    public double GetAccelerationAmount() {
        return RandomRange(-1, 2);
    }

    public boolean ShouldAccelerate() {
        return rng.nextBoolean();
    }

    public double GetRandomSpeed() {
        return RandomRange(15, 20);
    }
}
