package io.joel;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Bike> bikes = new ArrayList<>();
    private int finishLine = 100;

    public void AddBike() {
        Bike newBike = new Bike();
        bikes.add(newBike);
    }

    public void StartRace() {
        boolean raceActive = true;
        List<Bike> finishers = new ArrayList<>();
        while (raceActive) {
            moveBikes();
            for (Bike bike : bikes) {
                if (bike.getLocation() >= finishLine){
                    finishers.add(bike);
                    raceActive = false;
                }
            }
        }
        System.out.println("WE HAVE A WINNNNNNER!");
        if (finishers.size() > 1) {
            // Photo Finish
        } else {
            finishers.get(0).report();
        }
    }

    public void setFinishLine(int newLocation) {
        finishLine = newLocation;
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
