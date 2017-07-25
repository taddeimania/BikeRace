package io.joel;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Bike> bikes = new ArrayList<>();

    public void AddBike() {
        Bike newBike = new Bike();
        bikes.add(newBike);
    }

    public void AddBike(int count) {
        for (int i = 0; i < count; i++) {
            AddBike();
        }
    }

    public void BikeReport() {
        for (Bike bike : bikes) {
            bike.report();
        }
    }

    public void moveBikes() {
        for (Bike bike: bikes) {
            bike.accelerateAndMove();
        }
    }

    public void moveBikes(int count) {
        for (Bike bike : bikes) {
            bike.accelerateAndMove(count);
        }
    }
}
