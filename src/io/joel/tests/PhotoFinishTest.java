package io.joel.tests;

import static org.junit.Assert.*;

import io.joel.Bike;
import io.joel.Game;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PhotoFinishTest {

    @Test
    public void PhotoFinishReturnsBikeWithHighestLocation() {
        Bike one = new Bike();
        Bike two = new Bike();
        Bike three = new Bike();

        one.accelerateAndMove(1000);
        two.accelerateAndMove(100);
        three.accelerateAndMove(1);

        List<Bike> finishers = new ArrayList<>();
        finishers.add(one);
        finishers.add(two);
        finishers.add(three);

        Bike winner = Game.photoFinish(finishers);
        assertEquals(winner, one);
    }

    @Test
    public void PhotoFinishReturnsBikeWithHighestLocationUnordered() {
        Bike one = new Bike();
        Bike two = new Bike();
        Bike three = new Bike();

        one.accelerateAndMove(1000);
        two.accelerateAndMove(100);
        three.accelerateAndMove(1);

        List<Bike> finishers = new ArrayList<>();
        finishers.add(two);
        finishers.add(one);
        finishers.add(three);

        Bike winner = Game.photoFinish(finishers);
        assertEquals(winner, one);
    }
}
