package io.joel;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.setFinishLine(1000);
        game.AddBike(5);
        game.StartRace();
        game.BikeReport();

    }
}
